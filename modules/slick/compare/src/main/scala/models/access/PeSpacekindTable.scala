package models.access
// AUTO-GENERATED Slick data model for table PeSpacekind
trait PeSpacekindTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeSpacekind
   *  @param kindid Database column KindID SqlType(INTEGER), PrimaryKey
   *  @param kindname Database column KindName SqlType(VARCHAR), Length(50,true)
   *  @param readme Database column ReadMe SqlType(VARCHAR), Length(255,true)
   *  @param orderid Database column OrderID SqlType(INTEGER), Default(Some(0)) */
  case class PeSpacekindRow(kindid: Int, kindname: String, readme: Option[String], orderid: Option[Int] = Some(0))
  /** GetResult implicit for fetching PeSpacekindRow objects using plain SQL queries */

  /** Table description of table PE_SpaceKind. Objects of this class serve as prototypes for rows in queries. */
  class PeSpacekind(_tableTag: Tag) extends profile.api.Table[PeSpacekindRow](_tableTag, "PE_SpaceKind") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column KindID SqlType(INTEGER), PrimaryKey */
    val kindid: Rep[Int] = column[Int]("KindID", O.PrimaryKey)
    /** Database column KindName SqlType(VARCHAR), Length(50,true) */
    val kindname: Rep[String] = column[String]("KindName", O.Length(50,varying=true))
    /** Database column ReadMe SqlType(VARCHAR), Length(255,true) */
    val readme: Rep[Option[String]] = column[Option[String]]("ReadMe", O.Length(255,varying=true))
    /** Database column OrderID SqlType(INTEGER), Default(Some(0)) */
    val orderid: Rep[Option[Int]] = column[Option[Int]]("OrderID", O.Default(Some(0)))

    /** Index over (orderid) (database name PE_SPACEKIND_ORDERID) */
    val index1 = index("PE_SPACEKIND_ORDERID", orderid)
  }
  /** Collection-like TableQuery object for table PeSpacekind */
  lazy val PeSpacekind = new TableQuery(tag => new PeSpacekind(tag))
}
