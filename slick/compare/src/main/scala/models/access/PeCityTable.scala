package models.access
// AUTO-GENERATED Slick data model for table PeCity
trait PeCityTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeCity
   *  @param areaid Database column AreaID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param country Database column Country SqlType(VARCHAR), Length(20,true)
   *  @param province Database column Province SqlType(VARCHAR), Length(25,true)
   *  @param city Database column City SqlType(VARCHAR), Length(30,true)
   *  @param area Database column Area SqlType(VARCHAR), Length(25,true)
   *  @param postcode Database column PostCode SqlType(VARCHAR), Length(15,true)
   *  @param areacode Database column AreaCode SqlType(VARCHAR), Length(8,true) */
  case class PeCityRow(areaid: Int, country: Option[String], province: Option[String], city: Option[String], area: Option[String], postcode: Option[String], areacode: Option[String])
  /** GetResult implicit for fetching PeCityRow objects using plain SQL queries */

  /** Table description of table PE_City. Objects of this class serve as prototypes for rows in queries. */
  class PeCity(_tableTag: Tag) extends profile.api.Table[PeCityRow](_tableTag, "PE_City") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column AreaID SqlType(INTEGER), AutoInc, PrimaryKey */
    val areaid: Rep[Int] = column[Int]("AreaID", O.AutoInc, O.PrimaryKey)
    /** Database column Country SqlType(VARCHAR), Length(20,true) */
    val country: Rep[Option[String]] = column[Option[String]]("Country", O.Length(20,varying=true))
    /** Database column Province SqlType(VARCHAR), Length(25,true) */
    val province: Rep[Option[String]] = column[Option[String]]("Province", O.Length(25,varying=true))
    /** Database column City SqlType(VARCHAR), Length(30,true) */
    val city: Rep[Option[String]] = column[Option[String]]("City", O.Length(30,varying=true))
    /** Database column Area SqlType(VARCHAR), Length(25,true) */
    val area: Rep[Option[String]] = column[Option[String]]("Area", O.Length(25,varying=true))
    /** Database column PostCode SqlType(VARCHAR), Length(15,true) */
    val postcode: Rep[Option[String]] = column[Option[String]]("PostCode", O.Length(15,varying=true))
    /** Database column AreaCode SqlType(VARCHAR), Length(8,true) */
    val areacode: Rep[Option[String]] = column[Option[String]]("AreaCode", O.Length(8,varying=true))

    /** Index over (areacode) (database name PE_CITY_AREACODE) */
    val index1 = index("PE_CITY_AREACODE", areacode)
    /** Index over (postcode) (database name PE_CITY_POSTCODE) */
    val index2 = index("PE_CITY_POSTCODE", postcode)
  }
  /** Collection-like TableQuery object for table PeCity */
  lazy val PeCity = new TableQuery(tag => new PeCity(tag))
}
