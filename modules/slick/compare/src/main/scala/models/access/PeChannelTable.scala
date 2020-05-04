package models.access
// AUTO-GENERATED Slick data model for table PeChannel
trait PeChannelTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeChannel
    *  @param channelid Database column ChannelID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param channelname Database column ChannelName SqlType(VARCHAR), Length(20,true)
    *  @param channelshortname Database column ChannelShortName SqlType(VARCHAR), Length(20,true)
    *  @param channelitemunit Database column ChannelItemUnit SqlType(VARCHAR), Length(20,true)
    *  @param readme Database column ReadMe SqlType(VARCHAR), Length(255,true)
    *  @param metaKeywords Database column Meta_Keywords SqlType(VARCHAR), Length(255,true)
    *  @param metaDescription Database column Meta_Description SqlType(VARCHAR), Length(255,true)
    *  @param channelpicurl Database column ChannelPicUrl SqlType(VARCHAR), Length(50,true)
    *  @param orderid Database column OrderID SqlType(INTEGER)
    *  @param opentype Database column OpenType SqlType(INTEGER)
    *  @param channeltype Database column ChannelType SqlType(INTEGER)
    *  @param linkurl Database column LinkUrl SqlType(VARCHAR), Length(200,true)
    *  @param channeldir Database column ChannelDir SqlType(VARCHAR), Length(50,true)
    *  @param moduletype Database column ModuleType SqlType(INTEGER)
    *  @param disabled Database column Disabled SqlType(BOOLEAN)
    *  @param showname Database column ShowName SqlType(BOOLEAN)
    *  @param shownameonpath Database column ShowNameOnPath SqlType(BOOLEAN)
    *  @param showclasstreeguide Database column ShowClassTreeGuide SqlType(BOOLEAN)
    *  @param showsuspensionpoints Database column ShowSuspensionPoints SqlType(BOOLEAN)
    *  @param checklevel Database column CheckLevel SqlType(INTEGER), Default(0)
    *  @param enableuploadfile Database column EnableUploadFile SqlType(BOOLEAN)
    *  @param uploaddir Database column UploadDir SqlType(VARCHAR), Length(50,true)
    *  @param maxfilesize Database column MaxFileSize SqlType(INTEGER)
    *  @param hitsofhot Database column HitsOfHot SqlType(INTEGER)
    *  @param daysofnew Database column DaysOfNew SqlType(INTEGER)
    *  @param maxperline Database column MaxPerLine SqlType(INTEGER)
    *  @param upfiletype Database column UpFileType SqlType(VARCHAR), Length(255,true)
    *  @param defaultskinid Database column DefaultSkinID SqlType(INTEGER)
    *  @param templateIndex Database column Template_Index SqlType(INTEGER)
    *  @param topmenutype Database column TopMenuType SqlType(INTEGER)
    *  @param classguidetype Database column ClassGuideType SqlType(INTEGER)
    *  @param usecreatehtml Database column UseCreateHTML SqlType(INTEGER), Default(0)
    *  @param itemcount Database column ItemCount SqlType(INTEGER)
    *  @param itemchecked Database column ItemChecked SqlType(INTEGER)
    *  @param commentcount Database column CommentCount SqlType(INTEGER)
    *  @param specialcount Database column SpecialCount SqlType(INTEGER)
    *  @param hitscount Database column HitsCount SqlType(INTEGER)
    *  @param structuretype Database column StructureType SqlType(INTEGER), Default(Some(0))
    *  @param listfiletype Database column ListFileType SqlType(INTEGER), Default(Some(0))
    *  @param filenametype Database column FileNameType SqlType(INTEGER), Default(Some(0))
    *  @param autocreatetype Database column AutoCreateType SqlType(INTEGER), Default(Some(0))
    *  @param fileextIndex Database column FileExt_Index SqlType(INTEGER), Default(Some(0))
    *  @param fileextList Database column FileExt_List SqlType(INTEGER), Default(Some(0))
    *  @param fileextItem Database column FileExt_Item SqlType(INTEGER), Default(Some(0))
    *  @param updatepages Database column UpdatePages SqlType(INTEGER), Default(Some(0))
    *  @param channelpurview Database column ChannelPurview SqlType(INTEGER), Default(Some(0))
    *  @param arrgroupid Database column arrGroupID SqlType(VARCHAR), Length(255,true)
    *  @param jsSpecialnum Database column JS_SpecialNum SqlType(INTEGER), Default(Some(0))
    *  @param authorinfolen Database column AuthorInfoLen SqlType(INTEGER), Default(Some(0))
    *  @param maxperpageIndex Database column MaxPerPage_Index SqlType(INTEGER), Default(Some(0))
    *  @param maxperpageSearchresult Database column MaxPerPage_SearchResult SqlType(INTEGER), Default(Some(0))
    *  @param maxperpageNew Database column MaxPerPage_New SqlType(INTEGER), Default(Some(0))
    *  @param maxperpageHot Database column MaxPerPage_Hot SqlType(INTEGER), Default(Some(0))
    *  @param maxperpageElite Database column MaxPerPage_Elite SqlType(INTEGER), Default(Some(0))
    *  @param maxperpageSpeciallist Database column MaxPerPage_SpecialList SqlType(INTEGER), Default(Some(0))
    *  @param moneyperkw Database column MoneyPerKw SqlType(DECIMAL), Default(Some(0))
    *  @param timingcreatesetting Database column TimingCreateSetting SqlType(VARCHAR), Length(16777216,true)
    *  @param emailofreject Database column EmailOfReject SqlType(VARCHAR), Length(16777216,true)
    *  @param emailofpassed Database column EmailOfPassed SqlType(VARCHAR), Length(16777216,true)
    *  @param customContent Database column Custom_Content SqlType(VARCHAR), Length(16777216,true)
    *  @param arrenabledtabs Database column arrEnabledTabs SqlType(VARCHAR), Length(200,true)
    *  @param commandchannelpoint Database column CommandChannelPoint SqlType(INTEGER)
    *  @param fieldsOptions Database column Fields_Options SqlType(VARCHAR), Length(16777216,true)
    *  @param enablecomment Database column EnableComment SqlType(BOOLEAN)
    *  @param checkcomment Database column CheckComment SqlType(BOOLEAN) */
  case class PeChannelRow(
    channelid: Int = 0,
    channelname: String,
    channelshortname: Option[String],
    channelitemunit: Option[String],
    readme: Option[String],
    metaKeywords: Option[String],
    metaDescription: Option[String],
    channelpicurl: Option[String],
    orderid: Int,
    opentype: Int,
    channeltype: Int,
    linkurl: Option[String],
    channeldir: Option[String],
    moduletype: Option[Int],
    disabled: Boolean,
    showname: Boolean,
    shownameonpath: Option[Boolean],
    showclasstreeguide: Boolean,
    showsuspensionpoints: Option[Boolean],
    checklevel: Int = 0,
    enableuploadfile: Boolean,
    uploaddir: Option[String],
    maxfilesize: Option[Int],
    hitsofhot: Option[Int],
    daysofnew: Option[Int],
    maxperline: Option[Int],
    upfiletype: Option[String],
    defaultskinid: Option[Int],
    templateIndex: Option[Int],
    topmenutype: Option[Int],
    classguidetype: Option[Int],
    usecreatehtml: Int = 0,
    itemcount: Option[Int],
    itemchecked: Option[Int],
    commentcount: Option[Int],
    specialcount: Option[Int],
    hitscount: Option[Int],
    structuretype: Option[Int] = Some(0),
    listfiletype: Option[Int] = Some(0),
    filenametype: Option[Int] = Some(0),
    autocreatetype: Option[Int] = Some(0),
    fileextIndex: Option[Int] = Some(0),
    fileextList: Option[Int] = Some(0),
    fileextItem: Option[Int] = Some(0),
    updatepages: Option[Int] = Some(0),
    channelpurview: Option[Int] = Some(0),
    arrgroupid: Option[String],
    jsSpecialnum: Option[Int] = Some(0),
    authorinfolen: Option[Int] = Some(0),
    maxperpageIndex: Option[Int] = Some(0),
    maxperpageSearchresult: Option[Int] = Some(0),
    maxperpageNew: Option[Int] = Some(0),
    maxperpageHot: Option[Int] = Some(0),
    maxperpageElite: Option[Int] = Some(0),
    maxperpageSpeciallist: Option[Int] = Some(0),
    moneyperkw: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    timingcreatesetting: Option[String],
    emailofreject: Option[String],
    emailofpassed: Option[String],
    customContent: Option[String],
    arrenabledtabs: Option[String],
    commandchannelpoint: Option[Int],
    fieldsOptions: Option[String],
    enablecomment: Option[Boolean],
    checkcomment: Option[Boolean]
  )

  /** GetResult implicit for fetching PeChannelRow objects using plain SQL queries */
  /** Table description of table PE_Channel. Objects of this class serve as prototypes for rows in queries. */
  class PeChannel(_tableTag: Tag) extends profile.api.Table[PeChannelRow](_tableTag, "PE_Channel") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ChannelID SqlType(INTEGER), PrimaryKey, Default(0) */
    val channelid: Rep[Int] = column[Int]("ChannelID", O.PrimaryKey, O.Default(0))

    /** Database column ChannelName SqlType(VARCHAR), Length(20,true) */
    val channelname: Rep[String] = column[String]("ChannelName", O.Length(20, varying = true))

    /** Database column ChannelShortName SqlType(VARCHAR), Length(20,true) */
    val channelshortname: Rep[Option[String]] = column[Option[String]]("ChannelShortName", O.Length(20, varying = true))

    /** Database column ChannelItemUnit SqlType(VARCHAR), Length(20,true) */
    val channelitemunit: Rep[Option[String]] = column[Option[String]]("ChannelItemUnit", O.Length(20, varying = true))

    /** Database column ReadMe SqlType(VARCHAR), Length(255,true) */
    val readme: Rep[Option[String]] = column[Option[String]]("ReadMe", O.Length(255, varying = true))

    /** Database column Meta_Keywords SqlType(VARCHAR), Length(255,true) */
    val metaKeywords: Rep[Option[String]] = column[Option[String]]("Meta_Keywords", O.Length(255, varying = true))

    /** Database column Meta_Description SqlType(VARCHAR), Length(255,true) */
    val metaDescription: Rep[Option[String]] = column[Option[String]]("Meta_Description", O.Length(255, varying = true))

    /** Database column ChannelPicUrl SqlType(VARCHAR), Length(50,true) */
    val channelpicurl: Rep[Option[String]] = column[Option[String]]("ChannelPicUrl", O.Length(50, varying = true))

    /** Database column OrderID SqlType(INTEGER) */
    val orderid: Rep[Int] = column[Int]("OrderID")

    /** Database column OpenType SqlType(INTEGER) */
    val opentype: Rep[Int] = column[Int]("OpenType")

    /** Database column ChannelType SqlType(INTEGER) */
    val channeltype: Rep[Int] = column[Int]("ChannelType")

    /** Database column LinkUrl SqlType(VARCHAR), Length(200,true) */
    val linkurl: Rep[Option[String]] = column[Option[String]]("LinkUrl", O.Length(200, varying = true))

    /** Database column ChannelDir SqlType(VARCHAR), Length(50,true) */
    val channeldir: Rep[Option[String]] = column[Option[String]]("ChannelDir", O.Length(50, varying = true))

    /** Database column ModuleType SqlType(INTEGER) */
    val moduletype: Rep[Option[Int]] = column[Option[Int]]("ModuleType")

    /** Database column Disabled SqlType(BOOLEAN) */
    val disabled: Rep[Boolean] = column[Boolean]("Disabled")

    /** Database column ShowName SqlType(BOOLEAN) */
    val showname: Rep[Boolean] = column[Boolean]("ShowName")

    /** Database column ShowNameOnPath SqlType(BOOLEAN) */
    val shownameonpath: Rep[Option[Boolean]] = column[Option[Boolean]]("ShowNameOnPath")

    /** Database column ShowClassTreeGuide SqlType(BOOLEAN) */
    val showclasstreeguide: Rep[Boolean] = column[Boolean]("ShowClassTreeGuide")

    /** Database column ShowSuspensionPoints SqlType(BOOLEAN) */
    val showsuspensionpoints: Rep[Option[Boolean]] = column[Option[Boolean]]("ShowSuspensionPoints")

    /** Database column CheckLevel SqlType(INTEGER), Default(0) */
    val checklevel: Rep[Int] = column[Int]("CheckLevel", O.Default(0))

    /** Database column EnableUploadFile SqlType(BOOLEAN) */
    val enableuploadfile: Rep[Boolean] = column[Boolean]("EnableUploadFile")

    /** Database column UploadDir SqlType(VARCHAR), Length(50,true) */
    val uploaddir: Rep[Option[String]] = column[Option[String]]("UploadDir", O.Length(50, varying = true))

    /** Database column MaxFileSize SqlType(INTEGER) */
    val maxfilesize: Rep[Option[Int]] = column[Option[Int]]("MaxFileSize")

    /** Database column HitsOfHot SqlType(INTEGER) */
    val hitsofhot: Rep[Option[Int]] = column[Option[Int]]("HitsOfHot")

    /** Database column DaysOfNew SqlType(INTEGER) */
    val daysofnew: Rep[Option[Int]] = column[Option[Int]]("DaysOfNew")

    /** Database column MaxPerLine SqlType(INTEGER) */
    val maxperline: Rep[Option[Int]] = column[Option[Int]]("MaxPerLine")

    /** Database column UpFileType SqlType(VARCHAR), Length(255,true) */
    val upfiletype: Rep[Option[String]] = column[Option[String]]("UpFileType", O.Length(255, varying = true))

    /** Database column DefaultSkinID SqlType(INTEGER) */
    val defaultskinid: Rep[Option[Int]] = column[Option[Int]]("DefaultSkinID")

    /** Database column Template_Index SqlType(INTEGER) */
    val templateIndex: Rep[Option[Int]] = column[Option[Int]]("Template_Index")

    /** Database column TopMenuType SqlType(INTEGER) */
    val topmenutype: Rep[Option[Int]] = column[Option[Int]]("TopMenuType")

    /** Database column ClassGuideType SqlType(INTEGER) */
    val classguidetype: Rep[Option[Int]] = column[Option[Int]]("ClassGuideType")

    /** Database column UseCreateHTML SqlType(INTEGER), Default(0) */
    val usecreatehtml: Rep[Int] = column[Int]("UseCreateHTML", O.Default(0))

    /** Database column ItemCount SqlType(INTEGER) */
    val itemcount: Rep[Option[Int]] = column[Option[Int]]("ItemCount")

    /** Database column ItemChecked SqlType(INTEGER) */
    val itemchecked: Rep[Option[Int]] = column[Option[Int]]("ItemChecked")

    /** Database column CommentCount SqlType(INTEGER) */
    val commentcount: Rep[Option[Int]] = column[Option[Int]]("CommentCount")

    /** Database column SpecialCount SqlType(INTEGER) */
    val specialcount: Rep[Option[Int]] = column[Option[Int]]("SpecialCount")

    /** Database column HitsCount SqlType(INTEGER) */
    val hitscount: Rep[Option[Int]] = column[Option[Int]]("HitsCount")

    /** Database column StructureType SqlType(INTEGER), Default(Some(0)) */
    val structuretype: Rep[Option[Int]] = column[Option[Int]]("StructureType", O.Default(Some(0)))

    /** Database column ListFileType SqlType(INTEGER), Default(Some(0)) */
    val listfiletype: Rep[Option[Int]] = column[Option[Int]]("ListFileType", O.Default(Some(0)))

    /** Database column FileNameType SqlType(INTEGER), Default(Some(0)) */
    val filenametype: Rep[Option[Int]] = column[Option[Int]]("FileNameType", O.Default(Some(0)))

    /** Database column AutoCreateType SqlType(INTEGER), Default(Some(0)) */
    val autocreatetype: Rep[Option[Int]] = column[Option[Int]]("AutoCreateType", O.Default(Some(0)))

    /** Database column FileExt_Index SqlType(INTEGER), Default(Some(0)) */
    val fileextIndex: Rep[Option[Int]] = column[Option[Int]]("FileExt_Index", O.Default(Some(0)))

    /** Database column FileExt_List SqlType(INTEGER), Default(Some(0)) */
    val fileextList: Rep[Option[Int]] = column[Option[Int]]("FileExt_List", O.Default(Some(0)))

    /** Database column FileExt_Item SqlType(INTEGER), Default(Some(0)) */
    val fileextItem: Rep[Option[Int]] = column[Option[Int]]("FileExt_Item", O.Default(Some(0)))

    /** Database column UpdatePages SqlType(INTEGER), Default(Some(0)) */
    val updatepages: Rep[Option[Int]] = column[Option[Int]]("UpdatePages", O.Default(Some(0)))

    /** Database column ChannelPurview SqlType(INTEGER), Default(Some(0)) */
    val channelpurview: Rep[Option[Int]] = column[Option[Int]]("ChannelPurview", O.Default(Some(0)))

    /** Database column arrGroupID SqlType(VARCHAR), Length(255,true) */
    val arrgroupid: Rep[Option[String]] = column[Option[String]]("arrGroupID", O.Length(255, varying = true))

    /** Database column JS_SpecialNum SqlType(INTEGER), Default(Some(0)) */
    val jsSpecialnum: Rep[Option[Int]] = column[Option[Int]]("JS_SpecialNum", O.Default(Some(0)))

    /** Database column AuthorInfoLen SqlType(INTEGER), Default(Some(0)) */
    val authorinfolen: Rep[Option[Int]] = column[Option[Int]]("AuthorInfoLen", O.Default(Some(0)))

    /** Database column MaxPerPage_Index SqlType(INTEGER), Default(Some(0)) */
    val maxperpageIndex: Rep[Option[Int]] = column[Option[Int]]("MaxPerPage_Index", O.Default(Some(0)))

    /** Database column MaxPerPage_SearchResult SqlType(INTEGER), Default(Some(0)) */
    val maxperpageSearchresult: Rep[Option[Int]] = column[Option[Int]]("MaxPerPage_SearchResult", O.Default(Some(0)))

    /** Database column MaxPerPage_New SqlType(INTEGER), Default(Some(0)) */
    val maxperpageNew: Rep[Option[Int]] = column[Option[Int]]("MaxPerPage_New", O.Default(Some(0)))

    /** Database column MaxPerPage_Hot SqlType(INTEGER), Default(Some(0)) */
    val maxperpageHot: Rep[Option[Int]] = column[Option[Int]]("MaxPerPage_Hot", O.Default(Some(0)))

    /** Database column MaxPerPage_Elite SqlType(INTEGER), Default(Some(0)) */
    val maxperpageElite: Rep[Option[Int]] = column[Option[Int]]("MaxPerPage_Elite", O.Default(Some(0)))

    /** Database column MaxPerPage_SpecialList SqlType(INTEGER), Default(Some(0)) */
    val maxperpageSpeciallist: Rep[Option[Int]] = column[Option[Int]]("MaxPerPage_SpecialList", O.Default(Some(0)))

    /** Database column MoneyPerKw SqlType(DECIMAL), Default(Some(0)) */
    val moneyperkw: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MoneyPerKw", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column TimingCreateSetting SqlType(VARCHAR), Length(16777216,true) */
    val timingcreatesetting: Rep[Option[String]] = column[Option[String]]("TimingCreateSetting", O.Length(16777216, varying = true))

    /** Database column EmailOfReject SqlType(VARCHAR), Length(16777216,true) */
    val emailofreject: Rep[Option[String]] = column[Option[String]]("EmailOfReject", O.Length(16777216, varying = true))

    /** Database column EmailOfPassed SqlType(VARCHAR), Length(16777216,true) */
    val emailofpassed: Rep[Option[String]] = column[Option[String]]("EmailOfPassed", O.Length(16777216, varying = true))

    /** Database column Custom_Content SqlType(VARCHAR), Length(16777216,true) */
    val customContent: Rep[Option[String]] = column[Option[String]]("Custom_Content", O.Length(16777216, varying = true))

    /** Database column arrEnabledTabs SqlType(VARCHAR), Length(200,true) */
    val arrenabledtabs: Rep[Option[String]] = column[Option[String]]("arrEnabledTabs", O.Length(200, varying = true))

    /** Database column CommandChannelPoint SqlType(INTEGER) */
    val commandchannelpoint: Rep[Option[Int]] = column[Option[Int]]("CommandChannelPoint")

    /** Database column Fields_Options SqlType(VARCHAR), Length(16777216,true) */
    val fieldsOptions: Rep[Option[String]] = column[Option[String]]("Fields_Options", O.Length(16777216, varying = true))

    /** Database column EnableComment SqlType(BOOLEAN) */
    val enablecomment: Rep[Option[Boolean]] = column[Option[Boolean]]("EnableComment")

    /** Database column CheckComment SqlType(BOOLEAN) */
    val checkcomment: Rep[Option[Boolean]] = column[Option[Boolean]]("CheckComment")

    /** Index over (arrgroupid) (database name PE_CHANNEL_ARRGROUPID) */
    val index1 = index("PE_CHANNEL_ARRGROUPID", arrgroupid)

    /** Index over (defaultskinid) (database name PE_CHANNEL_DEFAULTSKINID) */
    val index2 = index("PE_CHANNEL_DEFAULTSKINID", defaultskinid)

    /** Index over (disabled) (database name PE_CHANNEL_DISABLED) */
    val index3 = index("PE_CHANNEL_DISABLED", disabled)

    /** Index over (orderid) (database name PE_CHANNEL_ORDERID) */
    val index4 = index("PE_CHANNEL_ORDERID", orderid)
  }

  /** Collection-like TableQuery object for table PeChannel */
  lazy val PeChannel = new TableQuery(tag => new PeChannel(tag))
}
