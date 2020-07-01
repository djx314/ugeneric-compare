package models.access
// AUTO-GENERATED Slick data model for table PePresentproject
trait PePresentprojectTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PePresentproject
   *  @param projectid Database column ProjectID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param projectname Database column ProjectName SqlType(VARCHAR), Length(50,true)
   *  @param begindate Database column BeginDate SqlType(TIMESTAMP)
   *  @param enddate Database column EndDate SqlType(TIMESTAMP)
   *  @param minmoney Database column MinMoney SqlType(DECIMAL), Default(Some(0))
   *  @param maxmoney Database column MaxMoney SqlType(DECIMAL), Default(Some(0))
   *  @param presentcontent Database column PresentContent SqlType(VARCHAR), Length(50,true)
   *  @param price Database column Price SqlType(DECIMAL), Default(Some(0))
   *  @param presentid Database column PresentID SqlType(VARCHAR), Length(16777216,true)
   *  @param cash Database column Cash SqlType(DECIMAL), Default(Some(0))
   *  @param presentexp Database column PresentExp SqlType(INTEGER), Default(Some(0))
   *  @param presentpoint Database column PresentPoint SqlType(INTEGER), Default(Some(0)) */
  case class PePresentprojectRow(projectid: Int, projectname: Option[String], begindate: Option[java.sql.Timestamp], enddate: Option[java.sql.Timestamp], minmoney: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), maxmoney: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), presentcontent: Option[String], price: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), presentid: Option[String], cash: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), presentexp: Option[Int] = Some(0), presentpoint: Option[Int] = Some(0))
  /** GetResult implicit for fetching PePresentprojectRow objects using plain SQL queries */

  /** Table description of table PE_PresentProject. Objects of this class serve as prototypes for rows in queries. */
  class PePresentproject(_tableTag: Tag) extends profile.api.Table[PePresentprojectRow](_tableTag, "PE_PresentProject") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(implicit e => _.mapWithTable(this))
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ProjectID SqlType(INTEGER), AutoInc, PrimaryKey */
    val projectid: Rep[Int] = column[Int]("ProjectID", O.AutoInc, O.PrimaryKey)
    /** Database column ProjectName SqlType(VARCHAR), Length(50,true) */
    val projectname: Rep[Option[String]] = column[Option[String]]("ProjectName", O.Length(50,varying=true))
    /** Database column BeginDate SqlType(TIMESTAMP) */
    val begindate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("BeginDate")
    /** Database column EndDate SqlType(TIMESTAMP) */
    val enddate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EndDate")
    /** Database column MinMoney SqlType(DECIMAL), Default(Some(0)) */
    val minmoney: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MinMoney", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column MaxMoney SqlType(DECIMAL), Default(Some(0)) */
    val maxmoney: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MaxMoney", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column PresentContent SqlType(VARCHAR), Length(50,true) */
    val presentcontent: Rep[Option[String]] = column[Option[String]]("PresentContent", O.Length(50,varying=true))
    /** Database column Price SqlType(DECIMAL), Default(Some(0)) */
    val price: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Price", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column PresentID SqlType(VARCHAR), Length(16777216,true) */
    val presentid: Rep[Option[String]] = column[Option[String]]("PresentID", O.Length(16777216,varying=true))
    /** Database column Cash SqlType(DECIMAL), Default(Some(0)) */
    val cash: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Cash", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column PresentExp SqlType(INTEGER), Default(Some(0)) */
    val presentexp: Rep[Option[Int]] = column[Option[Int]]("PresentExp", O.Default(Some(0)))
    /** Database column PresentPoint SqlType(INTEGER), Default(Some(0)) */
    val presentpoint: Rep[Option[Int]] = column[Option[Int]]("PresentPoint", O.Default(Some(0)))

    /** Index over (begindate) (database name PE_PRESENTPROJECT_BEGINDATE) */
    val index1 = index("PE_PRESENTPROJECT_BEGINDATE", begindate)
    /** Index over (enddate) (database name PE_PRESENTPROJECT_ENDDATE) */
    val index2 = index("PE_PRESENTPROJECT_ENDDATE", enddate)
    /** Index over (maxmoney) (database name PE_PRESENTPROJECT_MAXMONEY) */
    val index3 = index("PE_PRESENTPROJECT_MAXMONEY", maxmoney)
    /** Index over (minmoney) (database name PE_PRESENTPROJECT_MINMONEY) */
    val index4 = index("PE_PRESENTPROJECT_MINMONEY", minmoney)
  }
  /** Collection-like TableQuery object for table PePresentproject */
  lazy val PePresentproject = new TableQuery(tag => new PePresentproject(tag))
}
