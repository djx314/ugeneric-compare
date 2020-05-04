package models.access
// AUTO-GENERATED Slick data model for table PePageclass
trait PePageclassTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PePageclass
   *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param classname Database column ClassName SqlType(VARCHAR), Length(160,true)
   *  @param classintro Database column ClassIntro SqlType(VARCHAR), Length(255,true)
   *  @param classtype Database column ClassType SqlType(SMALLINT), Default(Some(0)) */
  case class PePageclassRow(id: Int, classname: String, classintro: String, classtype: Option[Short] = Some(0))
  /** GetResult implicit for fetching PePageclassRow objects using plain SQL queries */

  /** Table description of table PE_PageClass. Objects of this class serve as prototypes for rows in queries. */
  class PePageclass(_tableTag: Tag) extends profile.api.Table[PePageclassRow](_tableTag, "PE_PageClass") {
    def * = (id :: classname :: classintro :: classtype :: HNil).mapTo[PePageclassRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)
    /** Database column ClassName SqlType(VARCHAR), Length(160,true) */
    val classname: Rep[String] = column[String]("ClassName", O.Length(160,varying=true))
    /** Database column ClassIntro SqlType(VARCHAR), Length(255,true) */
    val classintro: Rep[String] = column[String]("ClassIntro", O.Length(255,varying=true))
    /** Database column ClassType SqlType(SMALLINT), Default(Some(0)) */
    val classtype: Rep[Option[Short]] = column[Option[Short]]("ClassType", O.Default(Some(0)))
  }
  /** Collection-like TableQuery object for table PePageclass */
  lazy val PePageclass = new TableQuery(tag => new PePageclass(tag))
}
