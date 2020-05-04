package models.access
// AUTO-GENERATED Slick data model for table PeAdvertisement
trait PeAdvertisementTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeAdvertisement
    *  @param adid Database column ADID SqlType(INTEGER), PrimaryKey
    *  @param userid Database column UserID SqlType(INTEGER), Default(Some(0))
    *  @param zoneid Database column ZoneID SqlType(VARCHAR), Length(16777216,true)
    *  @param adtype Database column ADType SqlType(INTEGER), Default(Some(0))
    *  @param adname Database column ADName SqlType(VARCHAR), Length(100,true)
    *  @param imgurl Database column ImgUrl SqlType(VARCHAR), Length(255,true)
    *  @param imgwidth Database column ImgWidth SqlType(INTEGER)
    *  @param imgheight Database column ImgHeight SqlType(INTEGER)
    *  @param flashwmode Database column FlashWmode SqlType(INTEGER), Default(Some(0))
    *  @param adintro Database column ADIntro SqlType(VARCHAR), Length(16777216,true)
    *  @param linkurl Database column LinkUrl SqlType(VARCHAR), Length(255,true)
    *  @param linktarget Database column LinkTarget SqlType(INTEGER), Default(Some(0))
    *  @param linkalt Database column LinkAlt SqlType(VARCHAR), Length(255,true)
    *  @param priority Database column Priority SqlType(VARCHAR), Length(50,true)
    *  @param setting Database column Setting SqlType(VARCHAR), Length(16777216,true)
    *  @param countview Database column CountView SqlType(BOOLEAN)
    *  @param views Database column Views SqlType(INTEGER), Default(Some(0))
    *  @param countclick Database column CountClick SqlType(BOOLEAN)
    *  @param clicks Database column Clicks SqlType(INTEGER), Default(Some(0))
    *  @param passed Database column Passed SqlType(BOOLEAN) */
  case class PeAdvertisementRow(
    adid: Int,
    userid: Option[Int] = Some(0),
    zoneid: Option[String],
    adtype: Option[Int] = Some(0),
    adname: Option[String],
    imgurl: Option[String],
    imgwidth: Option[Int],
    imgheight: Option[Int],
    flashwmode: Option[Int] = Some(0),
    adintro: Option[String],
    linkurl: Option[String],
    linktarget: Option[Int] = Some(0),
    linkalt: Option[String],
    priority: Option[String],
    setting: Option[String],
    countview: Option[Boolean],
    views: Option[Int] = Some(0),
    countclick: Option[Boolean],
    clicks: Option[Int] = Some(0),
    passed: Option[Boolean]
  )

  /** GetResult implicit for fetching PeAdvertisementRow objects using plain SQL queries */
  /** Table description of table PE_Advertisement. Objects of this class serve as prototypes for rows in queries. */
  class PeAdvertisement(_tableTag: Tag) extends profile.api.Table[PeAdvertisementRow](_tableTag, "PE_Advertisement") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ADID SqlType(INTEGER), PrimaryKey */
    val adid: Rep[Int] = column[Int]("ADID", O.PrimaryKey)

    /** Database column UserID SqlType(INTEGER), Default(Some(0)) */
    val userid: Rep[Option[Int]] = column[Option[Int]]("UserID", O.Default(Some(0)))

    /** Database column ZoneID SqlType(VARCHAR), Length(16777216,true) */
    val zoneid: Rep[Option[String]] = column[Option[String]]("ZoneID", O.Length(16777216, varying = true))

    /** Database column ADType SqlType(INTEGER), Default(Some(0)) */
    val adtype: Rep[Option[Int]] = column[Option[Int]]("ADType", O.Default(Some(0)))

    /** Database column ADName SqlType(VARCHAR), Length(100,true) */
    val adname: Rep[Option[String]] = column[Option[String]]("ADName", O.Length(100, varying = true))

    /** Database column ImgUrl SqlType(VARCHAR), Length(255,true) */
    val imgurl: Rep[Option[String]] = column[Option[String]]("ImgUrl", O.Length(255, varying = true))

    /** Database column ImgWidth SqlType(INTEGER) */
    val imgwidth: Rep[Option[Int]] = column[Option[Int]]("ImgWidth")

    /** Database column ImgHeight SqlType(INTEGER) */
    val imgheight: Rep[Option[Int]] = column[Option[Int]]("ImgHeight")

    /** Database column FlashWmode SqlType(INTEGER), Default(Some(0)) */
    val flashwmode: Rep[Option[Int]] = column[Option[Int]]("FlashWmode", O.Default(Some(0)))

    /** Database column ADIntro SqlType(VARCHAR), Length(16777216,true) */
    val adintro: Rep[Option[String]] = column[Option[String]]("ADIntro", O.Length(16777216, varying = true))

    /** Database column LinkUrl SqlType(VARCHAR), Length(255,true) */
    val linkurl: Rep[Option[String]] = column[Option[String]]("LinkUrl", O.Length(255, varying = true))

    /** Database column LinkTarget SqlType(INTEGER), Default(Some(0)) */
    val linktarget: Rep[Option[Int]] = column[Option[Int]]("LinkTarget", O.Default(Some(0)))

    /** Database column LinkAlt SqlType(VARCHAR), Length(255,true) */
    val linkalt: Rep[Option[String]] = column[Option[String]]("LinkAlt", O.Length(255, varying = true))

    /** Database column Priority SqlType(VARCHAR), Length(50,true) */
    val priority: Rep[Option[String]] = column[Option[String]]("Priority", O.Length(50, varying = true))

    /** Database column Setting SqlType(VARCHAR), Length(16777216,true) */
    val setting: Rep[Option[String]] = column[Option[String]]("Setting", O.Length(16777216, varying = true))

    /** Database column CountView SqlType(BOOLEAN) */
    val countview: Rep[Option[Boolean]] = column[Option[Boolean]]("CountView")

    /** Database column Views SqlType(INTEGER), Default(Some(0)) */
    val views: Rep[Option[Int]] = column[Option[Int]]("Views", O.Default(Some(0)))

    /** Database column CountClick SqlType(BOOLEAN) */
    val countclick: Rep[Option[Boolean]] = column[Option[Boolean]]("CountClick")

    /** Database column Clicks SqlType(INTEGER), Default(Some(0)) */
    val clicks: Rep[Option[Int]] = column[Option[Int]]("Clicks", O.Default(Some(0)))

    /** Database column Passed SqlType(BOOLEAN) */
    val passed: Rep[Option[Boolean]] = column[Option[Boolean]]("Passed")

    /** Index over (adtype) (database name PE_ADVERTISEMENT_ADTYPE) */
    val index1 = index("PE_ADVERTISEMENT_ADTYPE", adtype)
  }

  /** Collection-like TableQuery object for table PeAdvertisement */
  lazy val PeAdvertisement = new TableQuery(tag => new PeAdvertisement(tag))
}
