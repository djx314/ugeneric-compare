package models.access
// AUTO-GENERATED Slick data model for table PeHouseconfig
trait PeHouseconfigTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeHouseconfig
    *  @param classid Database column ClassID SqlType(INTEGER), PrimaryKey
    *  @param channelid Database column ChannelID SqlType(INTEGER)
    *  @param classname Database column ClassName SqlType(VARCHAR), Length(50,true)
    *  @param opentype Database column OpenType SqlType(INTEGER)
    *  @param classdir Database column ClassDir SqlType(VARCHAR), Length(50,true)
    *  @param skinid Database column SkinID SqlType(INTEGER)
    *  @param templateid Database column TemplateID SqlType(INTEGER)
    *  @param showontop Database column ShowOnTop SqlType(BOOLEAN)
    *  @param maxperpage Database column MaxPerPage SqlType(INTEGER)
    *  @param releasedeductpoint Database column ReleaseDeductPoint SqlType(INTEGER), Default(Some(0))
    *  @param commendclasspoint Database column CommendClassPoint SqlType(DOUBLE), Default(Some(0.0))
    *  @param defaultitemtemplate Database column DefaultItemTemplate SqlType(INTEGER)
    *  @param defaultitemskin Database column DefaultItemSkin SqlType(INTEGER)
    *  @param itemopentype Database column ItemOpenType SqlType(INTEGER)
    *  @param itemcount Database column ItemCount SqlType(INTEGER)
    *  @param upgradepoint Database column UpgradePoint SqlType(INTEGER), Default(Some(0))
    *  @param metaKeywords Database column Meta_Keywords SqlType(VARCHAR), Length(255,true)
    *  @param metaDescription Database column Meta_Description SqlType(VARCHAR), Length(255,true) */
  case class PeHouseconfigRow(
    classid: Int,
    channelid: Int,
    classname: String,
    opentype: Int,
    classdir: Option[String],
    skinid: Option[Int],
    templateid: Option[Int],
    showontop: Boolean,
    maxperpage: Option[Int],
    releasedeductpoint: Option[Int] = Some(0),
    commendclasspoint: Option[Double] = Some(0.0),
    defaultitemtemplate: Option[Int],
    defaultitemskin: Option[Int],
    itemopentype: Option[Int],
    itemcount: Option[Int],
    upgradepoint: Option[Int] = Some(0),
    metaKeywords: Option[String],
    metaDescription: Option[String]
  )

  /** GetResult implicit for fetching PeHouseconfigRow objects using plain SQL queries */
  /** Table description of table PE_HouseConfig. Objects of this class serve as prototypes for rows in queries. */
  class PeHouseconfig(_tableTag: Tag) extends profile.api.Table[PeHouseconfigRow](_tableTag, "PE_HouseConfig") {
    def * =
      (classid :: channelid :: classname :: opentype :: classdir :: skinid :: templateid :: showontop :: maxperpage :: releasedeductpoint :: commendclasspoint :: defaultitemtemplate :: defaultitemskin :: itemopentype :: itemcount :: upgradepoint :: metaKeywords :: metaDescription :: HNil)
        .mapTo[PeHouseconfigRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ClassID SqlType(INTEGER), PrimaryKey */
    val classid: Rep[Int] = column[Int]("ClassID", O.PrimaryKey)

    /** Database column ChannelID SqlType(INTEGER) */
    val channelid: Rep[Int] = column[Int]("ChannelID")

    /** Database column ClassName SqlType(VARCHAR), Length(50,true) */
    val classname: Rep[String] = column[String]("ClassName", O.Length(50, varying = true))

    /** Database column OpenType SqlType(INTEGER) */
    val opentype: Rep[Int] = column[Int]("OpenType")

    /** Database column ClassDir SqlType(VARCHAR), Length(50,true) */
    val classdir: Rep[Option[String]] = column[Option[String]]("ClassDir", O.Length(50, varying = true))

    /** Database column SkinID SqlType(INTEGER) */
    val skinid: Rep[Option[Int]] = column[Option[Int]]("SkinID")

    /** Database column TemplateID SqlType(INTEGER) */
    val templateid: Rep[Option[Int]] = column[Option[Int]]("TemplateID")

    /** Database column ShowOnTop SqlType(BOOLEAN) */
    val showontop: Rep[Boolean] = column[Boolean]("ShowOnTop")

    /** Database column MaxPerPage SqlType(INTEGER) */
    val maxperpage: Rep[Option[Int]] = column[Option[Int]]("MaxPerPage")

    /** Database column ReleaseDeductPoint SqlType(INTEGER), Default(Some(0)) */
    val releasedeductpoint: Rep[Option[Int]] = column[Option[Int]]("ReleaseDeductPoint", O.Default(Some(0)))

    /** Database column CommendClassPoint SqlType(DOUBLE), Default(Some(0.0)) */
    val commendclasspoint: Rep[Option[Double]] = column[Option[Double]]("CommendClassPoint", O.Default(Some(0.0)))

    /** Database column DefaultItemTemplate SqlType(INTEGER) */
    val defaultitemtemplate: Rep[Option[Int]] = column[Option[Int]]("DefaultItemTemplate")

    /** Database column DefaultItemSkin SqlType(INTEGER) */
    val defaultitemskin: Rep[Option[Int]] = column[Option[Int]]("DefaultItemSkin")

    /** Database column ItemOpenType SqlType(INTEGER) */
    val itemopentype: Rep[Option[Int]] = column[Option[Int]]("ItemOpenType")

    /** Database column ItemCount SqlType(INTEGER) */
    val itemcount: Rep[Option[Int]] = column[Option[Int]]("ItemCount")

    /** Database column UpgradePoint SqlType(INTEGER), Default(Some(0)) */
    val upgradepoint: Rep[Option[Int]] = column[Option[Int]]("UpgradePoint", O.Default(Some(0)))

    /** Database column Meta_Keywords SqlType(VARCHAR), Length(255,true) */
    val metaKeywords: Rep[Option[String]] = column[Option[String]]("Meta_Keywords", O.Length(255, varying = true))

    /** Database column Meta_Description SqlType(VARCHAR), Length(255,true) */
    val metaDescription: Rep[Option[String]] = column[Option[String]]("Meta_Description", O.Length(255, varying = true))

    /** Index over (channelid) (database name PE_HOUSECONFIG_CHANNELID) */
    val index1 = index("PE_HOUSECONFIG_CHANNELID", channelid :: HNil)

    /** Index over (skinid) (database name PE_HOUSECONFIG_SKINID) */
    val index2 = index("PE_HOUSECONFIG_SKINID", skinid :: HNil)

    /** Index over (templateid) (database name PE_HOUSECONFIG_TEMPLATEID) */
    val index3 = index("PE_HOUSECONFIG_TEMPLATEID", templateid :: HNil)
  }

  /** Collection-like TableQuery object for table PeHouseconfig */
  lazy val PeHouseconfig = new TableQuery(tag => new PeHouseconfig(tag))
}
