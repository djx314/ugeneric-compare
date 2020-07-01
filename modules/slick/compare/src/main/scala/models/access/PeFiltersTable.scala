package models.access
// AUTO-GENERATED Slick data model for table PeFilters
trait PeFiltersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeFilters
   *  @param filterid Database column FilterID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param itemid Database column ItemID SqlType(INTEGER), Default(Some(0))
   *  @param filtername Database column FilterName SqlType(VARCHAR), Length(50,true)
   *  @param filterobject Database column FilterObject SqlType(INTEGER), Default(Some(2))
   *  @param filtertype Database column FilterType SqlType(INTEGER), Default(Some(1))
   *  @param filtercontent Database column FilterContent SqlType(VARCHAR), Length(50,true)
   *  @param fisstring Database column FisString SqlType(VARCHAR), Length(16777216,true)
   *  @param fiostring Database column FioString SqlType(VARCHAR), Length(16777216,true)
   *  @param filterrep Database column FilterRep SqlType(VARCHAR), Length(16777216,true)
   *  @param flag Database column Flag SqlType(BOOLEAN) */
  case class PeFiltersRow(filterid: Int, itemid: Option[Int] = Some(0), filtername: Option[String], filterobject: Option[Int] = Some(2), filtertype: Option[Int] = Some(1), filtercontent: Option[String], fisstring: Option[String], fiostring: Option[String], filterrep: Option[String], flag: Option[Boolean])
  /** GetResult implicit for fetching PeFiltersRow objects using plain SQL queries */

  /** Table description of table PE_Filters. Objects of this class serve as prototypes for rows in queries. */
  class PeFilters(_tableTag: Tag) extends profile.api.Table[PeFiltersRow](_tableTag, "PE_Filters") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(implicit e => _.mapWithTable(this))
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column FilterID SqlType(INTEGER), AutoInc, PrimaryKey */
    val filterid: Rep[Int] = column[Int]("FilterID", O.AutoInc, O.PrimaryKey)
    /** Database column ItemID SqlType(INTEGER), Default(Some(0)) */
    val itemid: Rep[Option[Int]] = column[Option[Int]]("ItemID", O.Default(Some(0)))
    /** Database column FilterName SqlType(VARCHAR), Length(50,true) */
    val filtername: Rep[Option[String]] = column[Option[String]]("FilterName", O.Length(50,varying=true))
    /** Database column FilterObject SqlType(INTEGER), Default(Some(2)) */
    val filterobject: Rep[Option[Int]] = column[Option[Int]]("FilterObject", O.Default(Some(2)))
    /** Database column FilterType SqlType(INTEGER), Default(Some(1)) */
    val filtertype: Rep[Option[Int]] = column[Option[Int]]("FilterType", O.Default(Some(1)))
    /** Database column FilterContent SqlType(VARCHAR), Length(50,true) */
    val filtercontent: Rep[Option[String]] = column[Option[String]]("FilterContent", O.Length(50,varying=true))
    /** Database column FisString SqlType(VARCHAR), Length(16777216,true) */
    val fisstring: Rep[Option[String]] = column[Option[String]]("FisString", O.Length(16777216,varying=true))
    /** Database column FioString SqlType(VARCHAR), Length(16777216,true) */
    val fiostring: Rep[Option[String]] = column[Option[String]]("FioString", O.Length(16777216,varying=true))
    /** Database column FilterRep SqlType(VARCHAR), Length(16777216,true) */
    val filterrep: Rep[Option[String]] = column[Option[String]]("FilterRep", O.Length(16777216,varying=true))
    /** Database column Flag SqlType(BOOLEAN) */
    val flag: Rep[Option[Boolean]] = column[Option[Boolean]]("Flag")

    /** Index over (itemid) (database name PE_FILTERS_ITEMID) */
    val index1 = index("PE_FILTERS_ITEMID", itemid)
  }
  /** Collection-like TableQuery object for table PeFilters */
  lazy val PeFilters = new TableQuery(tag => new PeFilters(tag))
}
