package models.access
// AUTO-GENERATED Slick data model for table PeProvince
trait PeProvinceTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeProvince
    *  @param provinceid Database column ProvinceID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param province Database column Province SqlType(VARCHAR), Length(50,true)
    *  @param country Database column Country SqlType(VARCHAR), Length(50,true) */
  case class PeProvinceRow(provinceid: Int, province: Option[String], country: Option[String])

  /** GetResult implicit for fetching PeProvinceRow objects using plain SQL queries */
  /** Table description of table PE_Province. Objects of this class serve as prototypes for rows in queries. */
  class PeProvince(_tableTag: Tag) extends profile.api.Table[PeProvinceRow](_tableTag, "PE_Province") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ProvinceID SqlType(INTEGER), AutoInc, PrimaryKey */
    val provinceid: Rep[Int] = column[Int]("ProvinceID", O.AutoInc, O.PrimaryKey)

    /** Database column Province SqlType(VARCHAR), Length(50,true) */
    val province: Rep[Option[String]] = column[Option[String]]("Province", O.Length(50, varying = true))

    /** Database column Country SqlType(VARCHAR), Length(50,true) */
    val country: Rep[Option[String]] = column[Option[String]]("Country", O.Length(50, varying = true))

    /** Index over (country) (database name PE_PROVINCE_COUNTRYID) */
    val index1 = index("PE_PROVINCE_COUNTRYID", country)
  }

  /** Collection-like TableQuery object for table PeProvince */
  lazy val PeProvince = new TableQuery(tag => new PeProvince(tag))
}
