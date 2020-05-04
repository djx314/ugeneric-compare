package models.access
// AUTO-GENERATED Slick data model for table PeAdzone
trait PeAdzoneTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeAdzone
    *  @param zoneid Database column ZoneID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param channelid Database column ChannelID SqlType(INTEGER), Default(Some(0))
    *  @param includeadid Database column IncludeADID SqlType(VARCHAR), Length(16777216,true)
    *  @param zonename Database column ZoneName SqlType(VARCHAR), Length(100,true)
    *  @param zonejsname Database column ZoneJSName SqlType(VARCHAR), Length(100,true)
    *  @param zoneintro Database column ZoneIntro SqlType(VARCHAR), Length(255,true)
    *  @param zonetype Database column ZoneType SqlType(INTEGER), Default(Some(0))
    *  @param defaultsetting Database column DefaultSetting SqlType(BOOLEAN)
    *  @param zonesetting Database column ZoneSetting SqlType(VARCHAR), Length(16777216,true)
    *  @param zonewidth Database column ZoneWidth SqlType(INTEGER), Default(Some(0))
    *  @param zoneheight Database column ZoneHeight SqlType(INTEGER), Default(Some(0))
    *  @param active Database column Active SqlType(BOOLEAN)
    *  @param showtype Database column ShowType SqlType(INTEGER), Default(Some(0))
    *  @param updatetime Database column UpdateTime SqlType(TIMESTAMP) */
  case class PeAdzoneRow(
    zoneid: Int = 0,
    channelid: Option[Int] = Some(0),
    includeadid: Option[String],
    zonename: Option[String],
    zonejsname: Option[String],
    zoneintro: Option[String],
    zonetype: Option[Int] = Some(0),
    defaultsetting: Option[Boolean],
    zonesetting: Option[String],
    zonewidth: Option[Int] = Some(0),
    zoneheight: Option[Int] = Some(0),
    active: Option[Boolean],
    showtype: Option[Int] = Some(0),
    updatetime: java.sql.Timestamp
  )

  /** GetResult implicit for fetching PeAdzoneRow objects using plain SQL queries */
  /** Table description of table PE_AdZone. Objects of this class serve as prototypes for rows in queries. */
  class PeAdzone(_tableTag: Tag) extends profile.api.Table[PeAdzoneRow](_tableTag, "PE_AdZone") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ZoneID SqlType(INTEGER), PrimaryKey, Default(0) */
    val zoneid: Rep[Int] = column[Int]("ZoneID", O.PrimaryKey, O.Default(0))

    /** Database column ChannelID SqlType(INTEGER), Default(Some(0)) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID", O.Default(Some(0)))

    /** Database column IncludeADID SqlType(VARCHAR), Length(16777216,true) */
    val includeadid: Rep[Option[String]] = column[Option[String]]("IncludeADID", O.Length(16777216, varying = true))

    /** Database column ZoneName SqlType(VARCHAR), Length(100,true) */
    val zonename: Rep[Option[String]] = column[Option[String]]("ZoneName", O.Length(100, varying = true))

    /** Database column ZoneJSName SqlType(VARCHAR), Length(100,true) */
    val zonejsname: Rep[Option[String]] = column[Option[String]]("ZoneJSName", O.Length(100, varying = true))

    /** Database column ZoneIntro SqlType(VARCHAR), Length(255,true) */
    val zoneintro: Rep[Option[String]] = column[Option[String]]("ZoneIntro", O.Length(255, varying = true))

    /** Database column ZoneType SqlType(INTEGER), Default(Some(0)) */
    val zonetype: Rep[Option[Int]] = column[Option[Int]]("ZoneType", O.Default(Some(0)))

    /** Database column DefaultSetting SqlType(BOOLEAN) */
    val defaultsetting: Rep[Option[Boolean]] = column[Option[Boolean]]("DefaultSetting")

    /** Database column ZoneSetting SqlType(VARCHAR), Length(16777216,true) */
    val zonesetting: Rep[Option[String]] = column[Option[String]]("ZoneSetting", O.Length(16777216, varying = true))

    /** Database column ZoneWidth SqlType(INTEGER), Default(Some(0)) */
    val zonewidth: Rep[Option[Int]] = column[Option[Int]]("ZoneWidth", O.Default(Some(0)))

    /** Database column ZoneHeight SqlType(INTEGER), Default(Some(0)) */
    val zoneheight: Rep[Option[Int]] = column[Option[Int]]("ZoneHeight", O.Default(Some(0)))

    /** Database column Active SqlType(BOOLEAN) */
    val active: Rep[Option[Boolean]] = column[Option[Boolean]]("Active")

    /** Database column ShowType SqlType(INTEGER), Default(Some(0)) */
    val showtype: Rep[Option[Int]] = column[Option[Int]]("ShowType", O.Default(Some(0)))

    /** Database column UpdateTime SqlType(TIMESTAMP) */
    val updatetime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("UpdateTime")

    /** Index over (channelid) (database name PE_ADZONE_CHANNELID) */
    val index1 = index("PE_ADZONE_CHANNELID", channelid)

    /** Index over (zonetype) (database name PE_ADZONE_ZONETYPE) */
    val index2 = index("PE_ADZONE_ZONETYPE", zonetype)
  }

  /** Collection-like TableQuery object for table PeAdzone */
  lazy val PeAdzone = new TableQuery(tag => new PeAdzone(tag))
}
