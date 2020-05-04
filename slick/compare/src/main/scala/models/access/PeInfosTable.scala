package models.access
// AUTO-GENERATED Slick data model for table PeInfos
trait PeInfosTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeInfos
   *  @param infoid Database column InfoID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param itemid Database column ItemID SqlType(INTEGER), Default(Some(0))
   *  @param specialid Database column SpecialID SqlType(INTEGER), Default(Some(0))
   *  @param moduletype Database column ModuleType SqlType(INTEGER) */
  case class PeInfosRow(infoid: Int, itemid: Option[Int] = Some(0), specialid: Option[Int] = Some(0), moduletype: Option[Int])
  /** GetResult implicit for fetching PeInfosRow objects using plain SQL queries */

  /** Table description of table PE_InfoS. Objects of this class serve as prototypes for rows in queries. */
  class PeInfos(_tableTag: Tag) extends profile.api.Table[PeInfosRow](_tableTag, "PE_InfoS") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column InfoID SqlType(INTEGER), AutoInc, PrimaryKey */
    val infoid: Rep[Int] = column[Int]("InfoID", O.AutoInc, O.PrimaryKey)
    /** Database column ItemID SqlType(INTEGER), Default(Some(0)) */
    val itemid: Rep[Option[Int]] = column[Option[Int]]("ItemID", O.Default(Some(0)))
    /** Database column SpecialID SqlType(INTEGER), Default(Some(0)) */
    val specialid: Rep[Option[Int]] = column[Option[Int]]("SpecialID", O.Default(Some(0)))
    /** Database column ModuleType SqlType(INTEGER) */
    val moduletype: Rep[Option[Int]] = column[Option[Int]]("ModuleType")

    /** Index over (itemid) (database name PE_INFOS_ITEMID) */
    val index1 = index("PE_INFOS_ITEMID", itemid)
    /** Index over (specialid) (database name PE_INFOS_SPECIALID) */
    val index2 = index("PE_INFOS_SPECIALID", specialid)
  }
  /** Collection-like TableQuery object for table PeInfos */
  lazy val PeInfos = new TableQuery(tag => new PeInfos(tag))
}
