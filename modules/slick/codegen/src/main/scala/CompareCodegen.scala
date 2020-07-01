import scala.concurrent.Await
import scala.concurrent.duration._
import scala.language.postfixOps

import scala.concurrent.ExecutionContext.Implicits.global
import utils.slick.UCanAccessDriver.api._
import slick.sql.SqlProfile.ColumnOption

object CompareCodegen {

  def main(i: Array[String]): Unit = {
    val url = "jdbc:ucanaccess://./modules/slick/SiteWeaver.mdb;ignorecase=true"
    val db  = Database.forURL(url, driver = "net.ucanaccess.jdbc.UcanaccessDriver", user = "root", password = "root")

    //val included = Seq("COFFEE","SUPPLIER","COFFEE_INVENTORY")
    lazy val codegen = db
      .run {
        slickProfile.defaultTables //.map(_.filter(t => included contains t.name.name.toUpperCase))
          .flatMap(slickProfile.createModelBuilder(_, ignoreInvalidDefaults = true).buildModel)
      }
      .map { model =>
        new slick.codegen.SourceCodeGenerator(model) {

          override def codePerTable: Map[String, String] = {
            tables
              .map(table => {
                val before = "import slick.model.ForeignKeyAction\n" +
                  (if (table.PlainSqlMapper.enabled) {
                     "// NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.\n" +
                       "import slick.jdbc.{GetResult => GR}\n"
                   } else "")

                (table.TableValue.name, table.code.mkString(before, "\n", ""))
              })
              .toMap
          }

          override def Table = new Table(_) {
            table =>
            override def Column = new Column(_) {
              column =>
              // customize db type -> scala type mapping, pls adjust it according to your environment
              override def rawType: String = {
                model.options
                  .find(_.isInstanceOf[ColumnOption.SqlType])
                  .flatMap { tpe =>
                    tpe.asInstanceOf[ColumnOption.SqlType].typeName match {
                      case "hstore"                                      => Option("Map[String, String]")
                      case "_text" | "text[]" | "_varchar" | "varchar[]" => Option("List[String]")
                      case "geometry"                                    => Option("com.vividsolutions.jts.geom.Geometry")
                      case "_int8" | "int8[]"                            => Option("List[Long]")
                      case "_int4" | "int4[]"                            => Option("List[Int]")
                      case "_int2" | "int2[]"                            => Option("List[Short]")
                      case _                                             => None
                    }
                  }
                  .getOrElse {
                    model.tpe match {
                      //case "java.sql.Date"      => "java.time.LocalDate"
                      //case "java.sql.Time"      => "java.time.LocalTime"
                      //case "java.sql.Timestamp" => "java.time.LocalDateTime"
                      case _ =>
                        super.rawType
                    }
                  }
              }
            }

            override def PlainSqlMapper = new PlainSqlMapper {
              plan =>
              override def code: String = ""
            }

            override def compoundValue(values: Seq[String]): String = {
              if (values.size == 1) values.head
              else if (values.size <= 22) s"""(${values.mkString(", ")})"""
              else throw new Exception("Cannot generate tuple for > 22 columns, please set hlistEnable=true or override compound.")
            }

            override def hlistEnabled = false

            override def TableClass = new TableClassDef {
              override def option: String = ""
              override def star: String   = "def * = org.scalax.ugeneric.slick.USlick.mapWithTable(implicit e => _.mapWithTable(this))"
            }

          }

        }
      }

    Await.result(
      codegen.map(
        _.writeToMultipleFiles(
          "utils.slick.UCanAccessDriver", // use our customized postgres driver
          "./modules/slick/compare/src/main/scala",
          "models.access",
          "Tables"
        )
      ),
      20.seconds
    )
    db.close()
  }

}
