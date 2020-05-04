package models.access
// AUTO-GENERATED Slick data model for table PeClass
trait PeClassTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeClass
    *  @param classid Database column ClassID SqlType(INTEGER), PrimaryKey
    *  @param channelid Database column ChannelID SqlType(INTEGER)
    *  @param classname Database column ClassName SqlType(VARCHAR), Length(50,true)
    *  @param classtype Database column ClassType SqlType(INTEGER)
    *  @param opentype Database column OpenType SqlType(INTEGER)
    *  @param parentid Database column ParentID SqlType(INTEGER)
    *  @param parentpath Database column ParentPath SqlType(VARCHAR), Length(50,true)
    *  @param depth Database column Depth SqlType(INTEGER)
    *  @param rootid Database column RootID SqlType(INTEGER)
    *  @param child Database column Child SqlType(INTEGER)
    *  @param arrchildid Database column arrChildID SqlType(VARCHAR), Length(16777216,true)
    *  @param previd Database column PrevID SqlType(INTEGER)
    *  @param nextid Database column NextID SqlType(INTEGER)
    *  @param orderid Database column OrderID SqlType(INTEGER)
    *  @param tips Database column Tips SqlType(VARCHAR), Length(255,true)
    *  @param readme Database column Readme SqlType(VARCHAR), Length(16777216,true)
    *  @param metaKeywords Database column Meta_Keywords SqlType(VARCHAR), Length(255,true)
    *  @param metaDescription Database column Meta_Description SqlType(VARCHAR), Length(255,true)
    *  @param linkurl Database column LinkUrl SqlType(VARCHAR), Length(255,true)
    *  @param classpicurl Database column ClassPicUrl SqlType(VARCHAR), Length(255,true)
    *  @param classdir Database column ClassDir SqlType(VARCHAR), Length(50,true)
    *  @param parentdir Database column ParentDir SqlType(VARCHAR), Length(16777216,true)
    *  @param skinid Database column SkinID SqlType(INTEGER)
    *  @param templateid Database column TemplateID SqlType(INTEGER)
    *  @param showontop Database column ShowOnTop SqlType(BOOLEAN)
    *  @param showonindex Database column ShowOnIndex SqlType(BOOLEAN)
    *  @param iselite Database column IsElite SqlType(BOOLEAN)
    *  @param enableadd Database column EnableAdd SqlType(BOOLEAN)
    *  @param enableprotect Database column EnableProtect SqlType(BOOLEAN)
    *  @param maxperpage Database column MaxPerPage SqlType(INTEGER)
    *  @param defaultitemtemplate Database column DefaultItemTemplate SqlType(INTEGER)
    *  @param defaultitemskin Database column DefaultItemSkin SqlType(INTEGER)
    *  @param itemlistordertype Database column ItemListOrderType SqlType(INTEGER)
    *  @param itemopentype Database column ItemOpenType SqlType(INTEGER)
    *  @param itemcount Database column ItemCount SqlType(INTEGER)
    *  @param classpurview Database column ClassPurview SqlType(SMALLINT), Default(Some(0))
    *  @param enablecomment Database column EnableComment SqlType(BOOLEAN)
    *  @param checkcomment Database column CheckComment SqlType(BOOLEAN)
    *  @param presentexp Database column PresentExp SqlType(DOUBLE), Default(Some(0.0))
    *  @param defaultitempoint Database column DefaultItemPoint SqlType(DOUBLE), Default(Some(0.0))
    *  @param defaultitemchargetype Database column DefaultItemChargeType SqlType(INTEGER), Default(Some(0))
    *  @param defaultitempitchtime Database column DefaultItemPitchTime SqlType(INTEGER), Default(Some(0))
    *  @param defaultitemreadtimes Database column DefaultItemReadTimes SqlType(INTEGER), Default(Some(0))
    *  @param defaultitemdividepercent Database column DefaultItemDividePercent SqlType(INTEGER), Default(Some(0))
    *  @param customContent Database column Custom_Content SqlType(VARCHAR), Length(16777216,true)
    *  @param commandclasspoint Database column CommandClassPoint SqlType(INTEGER)
    *  @param releaseclasspoint Database column ReleaseClassPoint SqlType(INTEGER) */
  case class PeClassRow(
    classid: Int,
    channelid: Int,
    classname: String,
    classtype: Int,
    opentype: Int,
    parentid: Int,
    parentpath: String,
    depth: Int,
    rootid: Int,
    child: Int,
    arrchildid: Option[String],
    previd: Int,
    nextid: Int,
    orderid: Int,
    tips: Option[String],
    readme: Option[String],
    metaKeywords: Option[String],
    metaDescription: Option[String],
    linkurl: Option[String],
    classpicurl: Option[String],
    classdir: Option[String],
    parentdir: Option[String],
    skinid: Option[Int],
    templateid: Option[Int],
    showontop: Boolean,
    showonindex: Boolean,
    iselite: Boolean,
    enableadd: Boolean,
    enableprotect: Boolean,
    maxperpage: Option[Int],
    defaultitemtemplate: Option[Int],
    defaultitemskin: Option[Int],
    itemlistordertype: Option[Int],
    itemopentype: Option[Int],
    itemcount: Option[Int],
    classpurview: Option[Short] = Some(0),
    enablecomment: Option[Boolean],
    checkcomment: Option[Boolean],
    presentexp: Option[Double] = Some(0.0),
    defaultitempoint: Option[Double] = Some(0.0),
    defaultitemchargetype: Option[Int] = Some(0),
    defaultitempitchtime: Option[Int] = Some(0),
    defaultitemreadtimes: Option[Int] = Some(0),
    defaultitemdividepercent: Option[Int] = Some(0),
    customContent: Option[String],
    commandclasspoint: Option[Int],
    releaseclasspoint: Option[Int]
  )

  /** GetResult implicit for fetching PeClassRow objects using plain SQL queries */
  /** Table description of table PE_Class. Objects of this class serve as prototypes for rows in queries. */
  class PeClass(_tableTag: Tag) extends profile.api.Table[PeClassRow](_tableTag, "PE_Class") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ClassID SqlType(INTEGER), PrimaryKey */
    val classid: Rep[Int] = column[Int]("ClassID", O.PrimaryKey)

    /** Database column ChannelID SqlType(INTEGER) */
    val channelid: Rep[Int] = column[Int]("ChannelID")

    /** Database column ClassName SqlType(VARCHAR), Length(50,true) */
    val classname: Rep[String] = column[String]("ClassName", O.Length(50, varying = true))

    /** Database column ClassType SqlType(INTEGER) */
    val classtype: Rep[Int] = column[Int]("ClassType")

    /** Database column OpenType SqlType(INTEGER) */
    val opentype: Rep[Int] = column[Int]("OpenType")

    /** Database column ParentID SqlType(INTEGER) */
    val parentid: Rep[Int] = column[Int]("ParentID")

    /** Database column ParentPath SqlType(VARCHAR), Length(50,true) */
    val parentpath: Rep[String] = column[String]("ParentPath", O.Length(50, varying = true))

    /** Database column Depth SqlType(INTEGER) */
    val depth: Rep[Int] = column[Int]("Depth")

    /** Database column RootID SqlType(INTEGER) */
    val rootid: Rep[Int] = column[Int]("RootID")

    /** Database column Child SqlType(INTEGER) */
    val child: Rep[Int] = column[Int]("Child")

    /** Database column arrChildID SqlType(VARCHAR), Length(16777216,true) */
    val arrchildid: Rep[Option[String]] = column[Option[String]]("arrChildID", O.Length(16777216, varying = true))

    /** Database column PrevID SqlType(INTEGER) */
    val previd: Rep[Int] = column[Int]("PrevID")

    /** Database column NextID SqlType(INTEGER) */
    val nextid: Rep[Int] = column[Int]("NextID")

    /** Database column OrderID SqlType(INTEGER) */
    val orderid: Rep[Int] = column[Int]("OrderID")

    /** Database column Tips SqlType(VARCHAR), Length(255,true) */
    val tips: Rep[Option[String]] = column[Option[String]]("Tips", O.Length(255, varying = true))

    /** Database column Readme SqlType(VARCHAR), Length(16777216,true) */
    val readme: Rep[Option[String]] = column[Option[String]]("Readme", O.Length(16777216, varying = true))

    /** Database column Meta_Keywords SqlType(VARCHAR), Length(255,true) */
    val metaKeywords: Rep[Option[String]] = column[Option[String]]("Meta_Keywords", O.Length(255, varying = true))

    /** Database column Meta_Description SqlType(VARCHAR), Length(255,true) */
    val metaDescription: Rep[Option[String]] = column[Option[String]]("Meta_Description", O.Length(255, varying = true))

    /** Database column LinkUrl SqlType(VARCHAR), Length(255,true) */
    val linkurl: Rep[Option[String]] = column[Option[String]]("LinkUrl", O.Length(255, varying = true))

    /** Database column ClassPicUrl SqlType(VARCHAR), Length(255,true) */
    val classpicurl: Rep[Option[String]] = column[Option[String]]("ClassPicUrl", O.Length(255, varying = true))

    /** Database column ClassDir SqlType(VARCHAR), Length(50,true) */
    val classdir: Rep[Option[String]] = column[Option[String]]("ClassDir", O.Length(50, varying = true))

    /** Database column ParentDir SqlType(VARCHAR), Length(16777216,true) */
    val parentdir: Rep[Option[String]] = column[Option[String]]("ParentDir", O.Length(16777216, varying = true))

    /** Database column SkinID SqlType(INTEGER) */
    val skinid: Rep[Option[Int]] = column[Option[Int]]("SkinID")

    /** Database column TemplateID SqlType(INTEGER) */
    val templateid: Rep[Option[Int]] = column[Option[Int]]("TemplateID")

    /** Database column ShowOnTop SqlType(BOOLEAN) */
    val showontop: Rep[Boolean] = column[Boolean]("ShowOnTop")

    /** Database column ShowOnIndex SqlType(BOOLEAN) */
    val showonindex: Rep[Boolean] = column[Boolean]("ShowOnIndex")

    /** Database column IsElite SqlType(BOOLEAN) */
    val iselite: Rep[Boolean] = column[Boolean]("IsElite")

    /** Database column EnableAdd SqlType(BOOLEAN) */
    val enableadd: Rep[Boolean] = column[Boolean]("EnableAdd")

    /** Database column EnableProtect SqlType(BOOLEAN) */
    val enableprotect: Rep[Boolean] = column[Boolean]("EnableProtect")

    /** Database column MaxPerPage SqlType(INTEGER) */
    val maxperpage: Rep[Option[Int]] = column[Option[Int]]("MaxPerPage")

    /** Database column DefaultItemTemplate SqlType(INTEGER) */
    val defaultitemtemplate: Rep[Option[Int]] = column[Option[Int]]("DefaultItemTemplate")

    /** Database column DefaultItemSkin SqlType(INTEGER) */
    val defaultitemskin: Rep[Option[Int]] = column[Option[Int]]("DefaultItemSkin")

    /** Database column ItemListOrderType SqlType(INTEGER) */
    val itemlistordertype: Rep[Option[Int]] = column[Option[Int]]("ItemListOrderType")

    /** Database column ItemOpenType SqlType(INTEGER) */
    val itemopentype: Rep[Option[Int]] = column[Option[Int]]("ItemOpenType")

    /** Database column ItemCount SqlType(INTEGER) */
    val itemcount: Rep[Option[Int]] = column[Option[Int]]("ItemCount")

    /** Database column ClassPurview SqlType(SMALLINT), Default(Some(0)) */
    val classpurview: Rep[Option[Short]] = column[Option[Short]]("ClassPurview", O.Default(Some(0)))

    /** Database column EnableComment SqlType(BOOLEAN) */
    val enablecomment: Rep[Option[Boolean]] = column[Option[Boolean]]("EnableComment")

    /** Database column CheckComment SqlType(BOOLEAN) */
    val checkcomment: Rep[Option[Boolean]] = column[Option[Boolean]]("CheckComment")

    /** Database column PresentExp SqlType(DOUBLE), Default(Some(0.0)) */
    val presentexp: Rep[Option[Double]] = column[Option[Double]]("PresentExp", O.Default(Some(0.0)))

    /** Database column DefaultItemPoint SqlType(DOUBLE), Default(Some(0.0)) */
    val defaultitempoint: Rep[Option[Double]] = column[Option[Double]]("DefaultItemPoint", O.Default(Some(0.0)))

    /** Database column DefaultItemChargeType SqlType(INTEGER), Default(Some(0)) */
    val defaultitemchargetype: Rep[Option[Int]] = column[Option[Int]]("DefaultItemChargeType", O.Default(Some(0)))

    /** Database column DefaultItemPitchTime SqlType(INTEGER), Default(Some(0)) */
    val defaultitempitchtime: Rep[Option[Int]] = column[Option[Int]]("DefaultItemPitchTime", O.Default(Some(0)))

    /** Database column DefaultItemReadTimes SqlType(INTEGER), Default(Some(0)) */
    val defaultitemreadtimes: Rep[Option[Int]] = column[Option[Int]]("DefaultItemReadTimes", O.Default(Some(0)))

    /** Database column DefaultItemDividePercent SqlType(INTEGER), Default(Some(0)) */
    val defaultitemdividepercent: Rep[Option[Int]] = column[Option[Int]]("DefaultItemDividePercent", O.Default(Some(0)))

    /** Database column Custom_Content SqlType(VARCHAR), Length(16777216,true) */
    val customContent: Rep[Option[String]] = column[Option[String]]("Custom_Content", O.Length(16777216, varying = true))

    /** Database column CommandClassPoint SqlType(INTEGER) */
    val commandclasspoint: Rep[Option[Int]] = column[Option[Int]]("CommandClassPoint")

    /** Database column ReleaseClassPoint SqlType(INTEGER) */
    val releaseclasspoint: Rep[Option[Int]] = column[Option[Int]]("ReleaseClassPoint")

    /** Index over (channelid) (database name PE_CLASS_CHANNELID) */
    val index1 = index("PE_CLASS_CHANNELID", channelid)

    /** Index over (classtype) (database name PE_CLASS_CLASSTYPE) */
    val index2 = index("PE_CLASS_CLASSTYPE", classtype)

    /** Index over (nextid) (database name PE_CLASS_NEXTID) */
    val index3 = index("PE_CLASS_NEXTID", nextid)

    /** Index over (orderid) (database name PE_CLASS_ORDERID) */
    val index4 = index("PE_CLASS_ORDERID", orderid)

    /** Index over (parentid) (database name PE_CLASS_PARENTID) */
    val index5 = index("PE_CLASS_PARENTID", parentid)

    /** Index over (previd) (database name PE_CLASS_PREVID) */
    val index6 = index("PE_CLASS_PREVID", previd)

    /** Index over (rootid) (database name PE_CLASS_ROOTID) */
    val index7 = index("PE_CLASS_ROOTID", rootid)

    /** Index over (skinid) (database name PE_CLASS_SKINID) */
    val index8 = index("PE_CLASS_SKINID", skinid)

    /** Index over (templateid) (database name PE_CLASS_TEMPLATEID) */
    val index9 = index("PE_CLASS_TEMPLATEID", templateid)
  }

  /** Collection-like TableQuery object for table PeClass */
  lazy val PeClass = new TableQuery(tag => new PeClass(tag))
}
