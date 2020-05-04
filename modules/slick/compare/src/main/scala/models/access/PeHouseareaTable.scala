package models.access
// AUTO-GENERATED Slick data model for table PeHousearea
trait PeHouseareaTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeHousearea
    *  @param areaid Database column AreaID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param areaname Database column AreaName SqlType(VARCHAR), Length(50,true)
    *  @param province Database column Province SqlType(VARCHAR), Length(50,true) */
  case class PeHouseareaRow(areaid: Int = 0, areaname: Option[String], province: Option[String])

  /** GetResult implicit for fetching PeHouseareaRow objects using plain SQL queries */
  /** Table description of table PE_HouseArea. Objects of this class serve as prototypes for rows in queries. */
  class PeHousearea(_tableTag: Tag) extends profile.api.Table[PeHouseareaRow](_tableTag, "PE_HouseArea") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column AreaID SqlType(INTEGER), PrimaryKey, Default(0) */
    val areaid: Rep[Int] = column[Int]("AreaID", O.PrimaryKey, O.Default(0))

    /** Database column AreaName SqlType(VARCHAR), Length(50,true) */
    val areaname: Rep[Option[String]] = column[Option[String]]("AreaName", O.Length(50, varying = true))

    /** Database column Province SqlType(VARCHAR), Length(50,true) */
    val province: Rep[Option[String]] = column[Option[String]]("Province", O.Length(50, varying = true))
  }

  /** Collection-like TableQuery object for table PeHousearea */
  lazy val PeHousearea = new TableQuery(tag => new PeHousearea(tag))
}
