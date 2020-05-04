package models.access
// AUTO-GENERATED Slick data model for table PeItem
trait PeItemTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeItem
    *  @param itemid Database column ItemID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param itemname Database column ItemName SqlType(VARCHAR), Length(50,true)
    *  @param channelid Database column ChannelID SqlType(INTEGER), Default(Some(0))
    *  @param classid Database column ClassID SqlType(INTEGER), Default(Some(0))
    *  @param specialid Database column SpecialID SqlType(VARCHAR), Length(150,true)
    *  @param webname Database column WebName SqlType(VARCHAR), Length(50,true)
    *  @param weburl Database column WebUrl SqlType(VARCHAR), Length(200,true)
    *  @param logintype Database column LoginType SqlType(INTEGER), Default(Some(0))
    *  @param loginurl Database column LoginUrl SqlType(VARCHAR), Length(200,true)
    *  @param loginposturl Database column LoginPostUrl SqlType(VARCHAR), Length(200,true)
    *  @param loginuser Database column LoginUser SqlType(VARCHAR), Length(50,true)
    *  @param loginpass Database column LoginPass SqlType(VARCHAR), Length(50,true)
    *  @param loginfalse Database column LoginFalse SqlType(VARCHAR), Length(150,true)
    *  @param itemdoem Database column ItemDoem SqlType(VARCHAR), Length(200,true)
    *  @param liststr Database column ListStr SqlType(VARCHAR), Length(200,true)
    *  @param lsstring Database column LsString SqlType(VARCHAR), Length(16777216,true)
    *  @param lostring Database column LoString SqlType(VARCHAR), Length(16777216,true)
    *  @param listpaingtype Database column ListPaingType SqlType(INTEGER), Default(Some(0))
    *  @param lpsstring Database column LPsString SqlType(VARCHAR), Length(200,true)
    *  @param lpostring Database column LPoString SqlType(VARCHAR), Length(200,true)
    *  @param listpaingstr1 Database column ListPaingStr1 SqlType(VARCHAR), Length(200,true)
    *  @param listpaingstr2 Database column ListPaingStr2 SqlType(VARCHAR), Length(200,true)
    *  @param listpaingid1 Database column ListPaingID1 SqlType(INTEGER), Default(Some(0))
    *  @param listpaingid2 Database column ListPaingID2 SqlType(INTEGER), Default(Some(0))
    *  @param listpaingstr3 Database column ListPaingStr3 SqlType(VARCHAR), Length(16777216,true)
    *  @param hsstring Database column HsString SqlType(VARCHAR), Length(16777216,true)
    *  @param hostring Database column HoString SqlType(VARCHAR), Length(16777216,true)
    *  @param httpurltype Database column HttpUrlType SqlType(INTEGER), Default(Some(0))
    *  @param httpurlstr Database column HttpUrlStr SqlType(VARCHAR), Length(200,true)
    *  @param thumbnailtype Database column ThumbnailType SqlType(INTEGER), Default(Some(0))
    *  @param thsstring Database column ThsString SqlType(VARCHAR), Length(16777216,true)
    *  @param thostring Database column ThoString SqlType(VARCHAR), Length(16777216,true)
    *  @param tsstring Database column TsString SqlType(VARCHAR), Length(16777216,true)
    *  @param tostring Database column ToString SqlType(VARCHAR), Length(16777216,true)
    *  @param csstring Database column CsString SqlType(VARCHAR), Length(16777216,true)
    *  @param costring Database column CoString SqlType(VARCHAR), Length(16777216,true)
    *  @param authortype Database column AuthorType SqlType(INTEGER), Default(Some(0))
    *  @param authorstr Database column AuthorStr SqlType(VARCHAR), Length(200,true)
    *  @param asstring Database column AsString SqlType(VARCHAR), Length(16777216,true)
    *  @param aostring Database column AoString SqlType(VARCHAR), Length(16777216,true)
    *  @param copyfromtype Database column CopyFromType SqlType(INTEGER), Default(Some(0))
    *  @param fsstring Database column FsString SqlType(VARCHAR), Length(16777216,true)
    *  @param fostring Database column FoString SqlType(VARCHAR), Length(16777216,true)
    *  @param copyfromstr Database column CopyFromStr SqlType(VARCHAR), Length(200,true)
    *  @param keytype Database column KeyType SqlType(INTEGER), Default(Some(0))
    *  @param ksstring Database column KsString SqlType(VARCHAR), Length(16777216,true)
    *  @param kostring Database column KoString SqlType(VARCHAR), Length(16777216,true)
    *  @param keystr Database column KeyStr SqlType(VARCHAR), Length(100,true)
    *  @param keyscatternum Database column KeyScatterNum SqlType(INTEGER), Default(Some(2))
    *  @param newspaingtype Database column NewsPaingType SqlType(INTEGER), Default(Some(0))
    *  @param npsstring Database column NpsString SqlType(VARCHAR), Length(16777216,true)
    *  @param npostring Database column NpoString SqlType(VARCHAR), Length(16777216,true)
    *  @param newspaingstr1 Database column NewsPaingStr1 SqlType(VARCHAR), Length(200,true)
    *  @param newspaingstr2 Database column NewsPaingStr2 SqlType(VARCHAR), Length(16777216,true)
    *  @param flag Database column Flag SqlType(BOOLEAN)
    *  @param paginationtype Database column PaginationType SqlType(INTEGER), Default(Some(0))
    *  @param maxcharperpage Database column MaxCharPerPage SqlType(INTEGER), Default(Some(0))
    *  @param infopoint Database column InfoPoint SqlType(INTEGER), Default(Some(0))
    *  @param ontop Database column OnTop SqlType(BOOLEAN)
    *  @param hot Database column Hot SqlType(BOOLEAN)
    *  @param elite Database column Elite SqlType(BOOLEAN)
    *  @param hits Database column Hits SqlType(INTEGER), Default(0)
    *  @param stars Database column Stars SqlType(INTEGER), Default(Some(0))
    *  @param updatetime Database column UpdateTime SqlType(TIMESTAMP)
    *  @param skinid Database column SkinID SqlType(INTEGER), Default(Some(0))
    *  @param templateid Database column TemplateID SqlType(INTEGER), Default(Some(0))
    *  @param scriptIframe Database column Script_IFRAME SqlType(BOOLEAN)
    *  @param scriptObject Database column Script_OBJECT SqlType(BOOLEAN)
    *  @param scriptScript Database column Script_SCRIPT SqlType(BOOLEAN)
    *  @param scriptDiv Database column Script_Div SqlType(BOOLEAN)
    *  @param scriptClass Database column Script_CLASS SqlType(BOOLEAN)
    *  @param scriptSpan Database column Script_Span SqlType(BOOLEAN)
    *  @param scriptImg Database column Script_IMG SqlType(BOOLEAN)
    *  @param scriptFont Database column Script_FONT SqlType(BOOLEAN)
    *  @param scriptA Database column Script_A SqlType(BOOLEAN)
    *  @param scriptHtml Database column Script_HTML SqlType(BOOLEAN)
    *  @param savefiles Database column SaveFiles SqlType(BOOLEAN)
    *  @param addthumb Database column AddThumb SqlType(BOOLEAN)
    *  @param addwatermark Database column AddWatermark SqlType(BOOLEAN)
    *  @param collecorder Database column CollecOrder SqlType(INTEGER), Default(Some(0))
    *  @param status Database column Status SqlType(INTEGER), Default(Some(0))
    *  @param createimmediate Database column CreateImmediate SqlType(BOOLEAN)
    *  @param includepicyn Database column IncludePicYn SqlType(BOOLEAN)
    *  @param defaultpicyn Database column DefaultPicYn SqlType(BOOLEAN)
    *  @param newscollecdate Database column NewsCollecDate SqlType(TIMESTAMP)
    *  @param collectionnum Database column CollectionNum SqlType(VARCHAR), Length(50,true)
    *  @param collectiontype Database column CollectionType SqlType(INTEGER), Default(Some(0))
    *  @param updatetype Database column UpDateType SqlType(INTEGER)
    *  @param datetype Database column DateType SqlType(INTEGER)
    *  @param dsstring Database column DsString SqlType(VARCHAR), Length(16777216,true)
    *  @param dostring Database column DoString SqlType(VARCHAR), Length(16777216,true)
    *  @param showcommentlink Database column ShowCommentLink SqlType(BOOLEAN)
    *  @param scriptTable Database column Script_Table SqlType(BOOLEAN)
    *  @param scriptTr Database column Script_Tr SqlType(BOOLEAN)
    *  @param scriptTd Database column Script_Td SqlType(BOOLEAN)
    *  @param psstring Database column PsString SqlType(VARCHAR), Length(16777216,true)
    *  @param postring Database column PoString SqlType(VARCHAR), Length(16777216,true)
    *  @param phsstring Database column PhsString SqlType(VARCHAR), Length(16777216,true)
    *  @param phostring Database column PhoString SqlType(VARCHAR), Length(16777216,true)
    *  @param introtype Database column IntroType SqlType(INTEGER), Default(Some(0))
    *  @param isstring Database column IsString SqlType(VARCHAR), Length(16777216,true)
    *  @param iostring Database column IoString SqlType(VARCHAR), Length(16777216,true)
    *  @param introstr Database column IntroStr SqlType(VARCHAR), Length(16777216,true)
    *  @param intronum Database column IntroNum SqlType(INTEGER), Default(Some(0))
    *  @param isfield Database column IsField SqlType(INTEGER), Default(Some(0))
    *  @param field Database column Field SqlType(VARCHAR), Length(16777216,true)
    *  @param infopurview Database column InfoPurview SqlType(INTEGER), Default(Some(0))
    *  @param arrgroupid Database column arrGroupID SqlType(VARCHAR), Length(255,true)
    *  @param chargetype Database column ChargeType SqlType(INTEGER), Default(Some(0))
    *  @param pitchtime Database column PitchTime SqlType(INTEGER), Default(Some(0))
    *  @param readtimes Database column ReadTimes SqlType(INTEGER), Default(Some(0))
    *  @param dividepercent Database column DividePercent SqlType(INTEGER), Default(Some(0))
    *  @param saveflashurltofile Database column SaveFlashUrlToFile SqlType(BOOLEAN) */
  case class PeItemRow(
    itemid: Int,
    itemname: Option[String],
    channelid: Option[Int] = Some(0),
    classid: Option[Int] = Some(0),
    specialid: Option[String],
    webname: Option[String],
    weburl: Option[String],
    logintype: Option[Int] = Some(0),
    loginurl: Option[String],
    loginposturl: Option[String],
    loginuser: Option[String],
    loginpass: Option[String],
    loginfalse: Option[String],
    itemdoem: Option[String],
    liststr: Option[String],
    lsstring: Option[String],
    lostring: Option[String],
    listpaingtype: Option[Int] = Some(0),
    lpsstring: Option[String],
    lpostring: Option[String],
    listpaingstr1: Option[String],
    listpaingstr2: Option[String],
    listpaingid1: Option[Int] = Some(0),
    listpaingid2: Option[Int] = Some(0),
    listpaingstr3: Option[String],
    hsstring: Option[String],
    hostring: Option[String],
    httpurltype: Option[Int] = Some(0),
    httpurlstr: Option[String],
    thumbnailtype: Option[Int] = Some(0),
    thsstring: Option[String],
    thostring: Option[String],
    tsstring: Option[String],
    tostring: Option[String],
    csstring: Option[String],
    costring: Option[String],
    authortype: Option[Int] = Some(0),
    authorstr: Option[String],
    asstring: Option[String],
    aostring: Option[String],
    copyfromtype: Option[Int] = Some(0),
    fsstring: Option[String],
    fostring: Option[String],
    copyfromstr: Option[String],
    keytype: Option[Int] = Some(0),
    ksstring: Option[String],
    kostring: Option[String],
    keystr: Option[String],
    keyscatternum: Option[Int] = Some(2),
    newspaingtype: Option[Int] = Some(0),
    npsstring: Option[String],
    npostring: Option[String],
    newspaingstr1: Option[String],
    newspaingstr2: Option[String],
    flag: Option[Boolean],
    paginationtype: Option[Int] = Some(0),
    maxcharperpage: Option[Int] = Some(0),
    infopoint: Option[Int] = Some(0),
    ontop: Option[Boolean],
    hot: Option[Boolean],
    elite: Option[Boolean],
    hits: Int = 0,
    stars: Option[Int] = Some(0),
    updatetime: java.sql.Timestamp,
    skinid: Option[Int] = Some(0),
    templateid: Option[Int] = Some(0),
    scriptIframe: Option[Boolean],
    scriptObject: Option[Boolean],
    scriptScript: Option[Boolean],
    scriptDiv: Option[Boolean],
    scriptClass: Option[Boolean],
    scriptSpan: Option[Boolean],
    scriptImg: Option[Boolean],
    scriptFont: Option[Boolean],
    scriptA: Option[Boolean],
    scriptHtml: Option[Boolean],
    savefiles: Option[Boolean],
    addthumb: Option[Boolean],
    addwatermark: Option[Boolean],
    collecorder: Option[Int] = Some(0),
    status: Option[Int] = Some(0),
    createimmediate: Option[Boolean],
    includepicyn: Option[Boolean],
    defaultpicyn: Option[Boolean],
    newscollecdate: Option[java.sql.Timestamp],
    collectionnum: Option[String],
    collectiontype: Option[Int] = Some(0),
    updatetype: Option[Int],
    datetype: Option[Int],
    dsstring: Option[String],
    dostring: Option[String],
    showcommentlink: Option[Boolean],
    scriptTable: Option[Boolean],
    scriptTr: Option[Boolean],
    scriptTd: Option[Boolean],
    psstring: Option[String],
    postring: Option[String],
    phsstring: Option[String],
    phostring: Option[String],
    introtype: Option[Int] = Some(0),
    isstring: Option[String],
    iostring: Option[String],
    introstr: Option[String],
    intronum: Option[Int] = Some(0),
    isfield: Option[Int] = Some(0),
    field: Option[String],
    infopurview: Option[Int] = Some(0),
    arrgroupid: Option[String],
    chargetype: Option[Int] = Some(0),
    pitchtime: Option[Int] = Some(0),
    readtimes: Option[Int] = Some(0),
    dividepercent: Option[Int] = Some(0),
    saveflashurltofile: Option[Boolean]
  )

  /** GetResult implicit for fetching PeItemRow objects using plain SQL queries */
  /** Table description of table PE_Item. Objects of this class serve as prototypes for rows in queries. */
  class PeItem(_tableTag: Tag) extends profile.api.Table[PeItemRow](_tableTag, "PE_Item") {
    def * =
      (itemid :: itemname :: channelid :: classid :: specialid :: webname :: weburl :: logintype :: loginurl :: loginposturl :: loginuser :: loginpass :: loginfalse :: itemdoem :: liststr :: lsstring :: lostring :: listpaingtype :: lpsstring :: lpostring :: listpaingstr1 :: listpaingstr2 :: listpaingid1 :: listpaingid2 :: listpaingstr3 :: hsstring :: hostring :: httpurltype :: httpurlstr :: thumbnailtype :: thsstring :: thostring :: tsstring :: tostring :: csstring :: costring :: authortype :: authorstr :: asstring :: aostring :: copyfromtype :: fsstring :: fostring :: copyfromstr :: keytype :: ksstring :: kostring :: keystr :: keyscatternum :: newspaingtype :: npsstring :: npostring :: newspaingstr1 :: newspaingstr2 :: flag :: paginationtype :: maxcharperpage :: infopoint :: ontop :: hot :: elite :: hits :: stars :: updatetime :: skinid :: templateid :: scriptIframe :: scriptObject :: scriptScript :: scriptDiv :: scriptClass :: scriptSpan :: scriptImg :: scriptFont :: scriptA :: scriptHtml :: savefiles :: addthumb :: addwatermark :: collecorder :: status :: createimmediate :: includepicyn :: defaultpicyn :: newscollecdate :: collectionnum :: collectiontype :: updatetype :: datetype :: dsstring :: dostring :: showcommentlink :: scriptTable :: scriptTr :: scriptTd :: psstring :: postring :: phsstring :: phostring :: introtype :: isstring :: iostring :: introstr :: intronum :: isfield :: field :: infopurview :: arrgroupid :: chargetype :: pitchtime :: readtimes :: dividepercent :: saveflashurltofile :: HNil)
        .mapTo[PeItemRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ItemID SqlType(INTEGER), AutoInc, PrimaryKey */
    val itemid: Rep[Int] = column[Int]("ItemID", O.AutoInc, O.PrimaryKey)

    /** Database column ItemName SqlType(VARCHAR), Length(50,true) */
    val itemname: Rep[Option[String]] = column[Option[String]]("ItemName", O.Length(50, varying = true))

    /** Database column ChannelID SqlType(INTEGER), Default(Some(0)) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID", O.Default(Some(0)))

    /** Database column ClassID SqlType(INTEGER), Default(Some(0)) */
    val classid: Rep[Option[Int]] = column[Option[Int]]("ClassID", O.Default(Some(0)))

    /** Database column SpecialID SqlType(VARCHAR), Length(150,true) */
    val specialid: Rep[Option[String]] = column[Option[String]]("SpecialID", O.Length(150, varying = true))

    /** Database column WebName SqlType(VARCHAR), Length(50,true) */
    val webname: Rep[Option[String]] = column[Option[String]]("WebName", O.Length(50, varying = true))

    /** Database column WebUrl SqlType(VARCHAR), Length(200,true) */
    val weburl: Rep[Option[String]] = column[Option[String]]("WebUrl", O.Length(200, varying = true))

    /** Database column LoginType SqlType(INTEGER), Default(Some(0)) */
    val logintype: Rep[Option[Int]] = column[Option[Int]]("LoginType", O.Default(Some(0)))

    /** Database column LoginUrl SqlType(VARCHAR), Length(200,true) */
    val loginurl: Rep[Option[String]] = column[Option[String]]("LoginUrl", O.Length(200, varying = true))

    /** Database column LoginPostUrl SqlType(VARCHAR), Length(200,true) */
    val loginposturl: Rep[Option[String]] = column[Option[String]]("LoginPostUrl", O.Length(200, varying = true))

    /** Database column LoginUser SqlType(VARCHAR), Length(50,true) */
    val loginuser: Rep[Option[String]] = column[Option[String]]("LoginUser", O.Length(50, varying = true))

    /** Database column LoginPass SqlType(VARCHAR), Length(50,true) */
    val loginpass: Rep[Option[String]] = column[Option[String]]("LoginPass", O.Length(50, varying = true))

    /** Database column LoginFalse SqlType(VARCHAR), Length(150,true) */
    val loginfalse: Rep[Option[String]] = column[Option[String]]("LoginFalse", O.Length(150, varying = true))

    /** Database column ItemDoem SqlType(VARCHAR), Length(200,true) */
    val itemdoem: Rep[Option[String]] = column[Option[String]]("ItemDoem", O.Length(200, varying = true))

    /** Database column ListStr SqlType(VARCHAR), Length(200,true) */
    val liststr: Rep[Option[String]] = column[Option[String]]("ListStr", O.Length(200, varying = true))

    /** Database column LsString SqlType(VARCHAR), Length(16777216,true) */
    val lsstring: Rep[Option[String]] = column[Option[String]]("LsString", O.Length(16777216, varying = true))

    /** Database column LoString SqlType(VARCHAR), Length(16777216,true) */
    val lostring: Rep[Option[String]] = column[Option[String]]("LoString", O.Length(16777216, varying = true))

    /** Database column ListPaingType SqlType(INTEGER), Default(Some(0)) */
    val listpaingtype: Rep[Option[Int]] = column[Option[Int]]("ListPaingType", O.Default(Some(0)))

    /** Database column LPsString SqlType(VARCHAR), Length(200,true) */
    val lpsstring: Rep[Option[String]] = column[Option[String]]("LPsString", O.Length(200, varying = true))

    /** Database column LPoString SqlType(VARCHAR), Length(200,true) */
    val lpostring: Rep[Option[String]] = column[Option[String]]("LPoString", O.Length(200, varying = true))

    /** Database column ListPaingStr1 SqlType(VARCHAR), Length(200,true) */
    val listpaingstr1: Rep[Option[String]] = column[Option[String]]("ListPaingStr1", O.Length(200, varying = true))

    /** Database column ListPaingStr2 SqlType(VARCHAR), Length(200,true) */
    val listpaingstr2: Rep[Option[String]] = column[Option[String]]("ListPaingStr2", O.Length(200, varying = true))

    /** Database column ListPaingID1 SqlType(INTEGER), Default(Some(0)) */
    val listpaingid1: Rep[Option[Int]] = column[Option[Int]]("ListPaingID1", O.Default(Some(0)))

    /** Database column ListPaingID2 SqlType(INTEGER), Default(Some(0)) */
    val listpaingid2: Rep[Option[Int]] = column[Option[Int]]("ListPaingID2", O.Default(Some(0)))

    /** Database column ListPaingStr3 SqlType(VARCHAR), Length(16777216,true) */
    val listpaingstr3: Rep[Option[String]] = column[Option[String]]("ListPaingStr3", O.Length(16777216, varying = true))

    /** Database column HsString SqlType(VARCHAR), Length(16777216,true) */
    val hsstring: Rep[Option[String]] = column[Option[String]]("HsString", O.Length(16777216, varying = true))

    /** Database column HoString SqlType(VARCHAR), Length(16777216,true) */
    val hostring: Rep[Option[String]] = column[Option[String]]("HoString", O.Length(16777216, varying = true))

    /** Database column HttpUrlType SqlType(INTEGER), Default(Some(0)) */
    val httpurltype: Rep[Option[Int]] = column[Option[Int]]("HttpUrlType", O.Default(Some(0)))

    /** Database column HttpUrlStr SqlType(VARCHAR), Length(200,true) */
    val httpurlstr: Rep[Option[String]] = column[Option[String]]("HttpUrlStr", O.Length(200, varying = true))

    /** Database column ThumbnailType SqlType(INTEGER), Default(Some(0)) */
    val thumbnailtype: Rep[Option[Int]] = column[Option[Int]]("ThumbnailType", O.Default(Some(0)))

    /** Database column ThsString SqlType(VARCHAR), Length(16777216,true) */
    val thsstring: Rep[Option[String]] = column[Option[String]]("ThsString", O.Length(16777216, varying = true))

    /** Database column ThoString SqlType(VARCHAR), Length(16777216,true) */
    val thostring: Rep[Option[String]] = column[Option[String]]("ThoString", O.Length(16777216, varying = true))

    /** Database column TsString SqlType(VARCHAR), Length(16777216,true) */
    val tsstring: Rep[Option[String]] = column[Option[String]]("TsString", O.Length(16777216, varying = true))

    /** Database column ToString SqlType(VARCHAR), Length(16777216,true) */
    val tostring: Rep[Option[String]] = column[Option[String]]("ToString", O.Length(16777216, varying = true))

    /** Database column CsString SqlType(VARCHAR), Length(16777216,true) */
    val csstring: Rep[Option[String]] = column[Option[String]]("CsString", O.Length(16777216, varying = true))

    /** Database column CoString SqlType(VARCHAR), Length(16777216,true) */
    val costring: Rep[Option[String]] = column[Option[String]]("CoString", O.Length(16777216, varying = true))

    /** Database column AuthorType SqlType(INTEGER), Default(Some(0)) */
    val authortype: Rep[Option[Int]] = column[Option[Int]]("AuthorType", O.Default(Some(0)))

    /** Database column AuthorStr SqlType(VARCHAR), Length(200,true) */
    val authorstr: Rep[Option[String]] = column[Option[String]]("AuthorStr", O.Length(200, varying = true))

    /** Database column AsString SqlType(VARCHAR), Length(16777216,true) */
    val asstring: Rep[Option[String]] = column[Option[String]]("AsString", O.Length(16777216, varying = true))

    /** Database column AoString SqlType(VARCHAR), Length(16777216,true) */
    val aostring: Rep[Option[String]] = column[Option[String]]("AoString", O.Length(16777216, varying = true))

    /** Database column CopyFromType SqlType(INTEGER), Default(Some(0)) */
    val copyfromtype: Rep[Option[Int]] = column[Option[Int]]("CopyFromType", O.Default(Some(0)))

    /** Database column FsString SqlType(VARCHAR), Length(16777216,true) */
    val fsstring: Rep[Option[String]] = column[Option[String]]("FsString", O.Length(16777216, varying = true))

    /** Database column FoString SqlType(VARCHAR), Length(16777216,true) */
    val fostring: Rep[Option[String]] = column[Option[String]]("FoString", O.Length(16777216, varying = true))

    /** Database column CopyFromStr SqlType(VARCHAR), Length(200,true) */
    val copyfromstr: Rep[Option[String]] = column[Option[String]]("CopyFromStr", O.Length(200, varying = true))

    /** Database column KeyType SqlType(INTEGER), Default(Some(0)) */
    val keytype: Rep[Option[Int]] = column[Option[Int]]("KeyType", O.Default(Some(0)))

    /** Database column KsString SqlType(VARCHAR), Length(16777216,true) */
    val ksstring: Rep[Option[String]] = column[Option[String]]("KsString", O.Length(16777216, varying = true))

    /** Database column KoString SqlType(VARCHAR), Length(16777216,true) */
    val kostring: Rep[Option[String]] = column[Option[String]]("KoString", O.Length(16777216, varying = true))

    /** Database column KeyStr SqlType(VARCHAR), Length(100,true) */
    val keystr: Rep[Option[String]] = column[Option[String]]("KeyStr", O.Length(100, varying = true))

    /** Database column KeyScatterNum SqlType(INTEGER), Default(Some(2)) */
    val keyscatternum: Rep[Option[Int]] = column[Option[Int]]("KeyScatterNum", O.Default(Some(2)))

    /** Database column NewsPaingType SqlType(INTEGER), Default(Some(0)) */
    val newspaingtype: Rep[Option[Int]] = column[Option[Int]]("NewsPaingType", O.Default(Some(0)))

    /** Database column NpsString SqlType(VARCHAR), Length(16777216,true) */
    val npsstring: Rep[Option[String]] = column[Option[String]]("NpsString", O.Length(16777216, varying = true))

    /** Database column NpoString SqlType(VARCHAR), Length(16777216,true) */
    val npostring: Rep[Option[String]] = column[Option[String]]("NpoString", O.Length(16777216, varying = true))

    /** Database column NewsPaingStr1 SqlType(VARCHAR), Length(200,true) */
    val newspaingstr1: Rep[Option[String]] = column[Option[String]]("NewsPaingStr1", O.Length(200, varying = true))

    /** Database column NewsPaingStr2 SqlType(VARCHAR), Length(16777216,true) */
    val newspaingstr2: Rep[Option[String]] = column[Option[String]]("NewsPaingStr2", O.Length(16777216, varying = true))

    /** Database column Flag SqlType(BOOLEAN) */
    val flag: Rep[Option[Boolean]] = column[Option[Boolean]]("Flag")

    /** Database column PaginationType SqlType(INTEGER), Default(Some(0)) */
    val paginationtype: Rep[Option[Int]] = column[Option[Int]]("PaginationType", O.Default(Some(0)))

    /** Database column MaxCharPerPage SqlType(INTEGER), Default(Some(0)) */
    val maxcharperpage: Rep[Option[Int]] = column[Option[Int]]("MaxCharPerPage", O.Default(Some(0)))

    /** Database column InfoPoint SqlType(INTEGER), Default(Some(0)) */
    val infopoint: Rep[Option[Int]] = column[Option[Int]]("InfoPoint", O.Default(Some(0)))

    /** Database column OnTop SqlType(BOOLEAN) */
    val ontop: Rep[Option[Boolean]] = column[Option[Boolean]]("OnTop")

    /** Database column Hot SqlType(BOOLEAN) */
    val hot: Rep[Option[Boolean]] = column[Option[Boolean]]("Hot")

    /** Database column Elite SqlType(BOOLEAN) */
    val elite: Rep[Option[Boolean]] = column[Option[Boolean]]("Elite")

    /** Database column Hits SqlType(INTEGER), Default(0) */
    val hits: Rep[Int] = column[Int]("Hits", O.Default(0))

    /** Database column Stars SqlType(INTEGER), Default(Some(0)) */
    val stars: Rep[Option[Int]] = column[Option[Int]]("Stars", O.Default(Some(0)))

    /** Database column UpdateTime SqlType(TIMESTAMP) */
    val updatetime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("UpdateTime")

    /** Database column SkinID SqlType(INTEGER), Default(Some(0)) */
    val skinid: Rep[Option[Int]] = column[Option[Int]]("SkinID", O.Default(Some(0)))

    /** Database column TemplateID SqlType(INTEGER), Default(Some(0)) */
    val templateid: Rep[Option[Int]] = column[Option[Int]]("TemplateID", O.Default(Some(0)))

    /** Database column Script_IFRAME SqlType(BOOLEAN) */
    val scriptIframe: Rep[Option[Boolean]] = column[Option[Boolean]]("Script_IFRAME")

    /** Database column Script_OBJECT SqlType(BOOLEAN) */
    val scriptObject: Rep[Option[Boolean]] = column[Option[Boolean]]("Script_OBJECT")

    /** Database column Script_SCRIPT SqlType(BOOLEAN) */
    val scriptScript: Rep[Option[Boolean]] = column[Option[Boolean]]("Script_SCRIPT")

    /** Database column Script_Div SqlType(BOOLEAN) */
    val scriptDiv: Rep[Option[Boolean]] = column[Option[Boolean]]("Script_Div")

    /** Database column Script_CLASS SqlType(BOOLEAN) */
    val scriptClass: Rep[Option[Boolean]] = column[Option[Boolean]]("Script_CLASS")

    /** Database column Script_Span SqlType(BOOLEAN) */
    val scriptSpan: Rep[Option[Boolean]] = column[Option[Boolean]]("Script_Span")

    /** Database column Script_IMG SqlType(BOOLEAN) */
    val scriptImg: Rep[Option[Boolean]] = column[Option[Boolean]]("Script_IMG")

    /** Database column Script_FONT SqlType(BOOLEAN) */
    val scriptFont: Rep[Option[Boolean]] = column[Option[Boolean]]("Script_FONT")

    /** Database column Script_A SqlType(BOOLEAN) */
    val scriptA: Rep[Option[Boolean]] = column[Option[Boolean]]("Script_A")

    /** Database column Script_HTML SqlType(BOOLEAN) */
    val scriptHtml: Rep[Option[Boolean]] = column[Option[Boolean]]("Script_HTML")

    /** Database column SaveFiles SqlType(BOOLEAN) */
    val savefiles: Rep[Option[Boolean]] = column[Option[Boolean]]("SaveFiles")

    /** Database column AddThumb SqlType(BOOLEAN) */
    val addthumb: Rep[Option[Boolean]] = column[Option[Boolean]]("AddThumb")

    /** Database column AddWatermark SqlType(BOOLEAN) */
    val addwatermark: Rep[Option[Boolean]] = column[Option[Boolean]]("AddWatermark")

    /** Database column CollecOrder SqlType(INTEGER), Default(Some(0)) */
    val collecorder: Rep[Option[Int]] = column[Option[Int]]("CollecOrder", O.Default(Some(0)))

    /** Database column Status SqlType(INTEGER), Default(Some(0)) */
    val status: Rep[Option[Int]] = column[Option[Int]]("Status", O.Default(Some(0)))

    /** Database column CreateImmediate SqlType(BOOLEAN) */
    val createimmediate: Rep[Option[Boolean]] = column[Option[Boolean]]("CreateImmediate")

    /** Database column IncludePicYn SqlType(BOOLEAN) */
    val includepicyn: Rep[Option[Boolean]] = column[Option[Boolean]]("IncludePicYn")

    /** Database column DefaultPicYn SqlType(BOOLEAN) */
    val defaultpicyn: Rep[Option[Boolean]] = column[Option[Boolean]]("DefaultPicYn")

    /** Database column NewsCollecDate SqlType(TIMESTAMP) */
    val newscollecdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("NewsCollecDate")

    /** Database column CollectionNum SqlType(VARCHAR), Length(50,true) */
    val collectionnum: Rep[Option[String]] = column[Option[String]]("CollectionNum", O.Length(50, varying = true))

    /** Database column CollectionType SqlType(INTEGER), Default(Some(0)) */
    val collectiontype: Rep[Option[Int]] = column[Option[Int]]("CollectionType", O.Default(Some(0)))

    /** Database column UpDateType SqlType(INTEGER) */
    val updatetype: Rep[Option[Int]] = column[Option[Int]]("UpDateType")

    /** Database column DateType SqlType(INTEGER) */
    val datetype: Rep[Option[Int]] = column[Option[Int]]("DateType")

    /** Database column DsString SqlType(VARCHAR), Length(16777216,true) */
    val dsstring: Rep[Option[String]] = column[Option[String]]("DsString", O.Length(16777216, varying = true))

    /** Database column DoString SqlType(VARCHAR), Length(16777216,true) */
    val dostring: Rep[Option[String]] = column[Option[String]]("DoString", O.Length(16777216, varying = true))

    /** Database column ShowCommentLink SqlType(BOOLEAN) */
    val showcommentlink: Rep[Option[Boolean]] = column[Option[Boolean]]("ShowCommentLink")

    /** Database column Script_Table SqlType(BOOLEAN) */
    val scriptTable: Rep[Option[Boolean]] = column[Option[Boolean]]("Script_Table")

    /** Database column Script_Tr SqlType(BOOLEAN) */
    val scriptTr: Rep[Option[Boolean]] = column[Option[Boolean]]("Script_Tr")

    /** Database column Script_Td SqlType(BOOLEAN) */
    val scriptTd: Rep[Option[Boolean]] = column[Option[Boolean]]("Script_Td")

    /** Database column PsString SqlType(VARCHAR), Length(16777216,true) */
    val psstring: Rep[Option[String]] = column[Option[String]]("PsString", O.Length(16777216, varying = true))

    /** Database column PoString SqlType(VARCHAR), Length(16777216,true) */
    val postring: Rep[Option[String]] = column[Option[String]]("PoString", O.Length(16777216, varying = true))

    /** Database column PhsString SqlType(VARCHAR), Length(16777216,true) */
    val phsstring: Rep[Option[String]] = column[Option[String]]("PhsString", O.Length(16777216, varying = true))

    /** Database column PhoString SqlType(VARCHAR), Length(16777216,true) */
    val phostring: Rep[Option[String]] = column[Option[String]]("PhoString", O.Length(16777216, varying = true))

    /** Database column IntroType SqlType(INTEGER), Default(Some(0)) */
    val introtype: Rep[Option[Int]] = column[Option[Int]]("IntroType", O.Default(Some(0)))

    /** Database column IsString SqlType(VARCHAR), Length(16777216,true) */
    val isstring: Rep[Option[String]] = column[Option[String]]("IsString", O.Length(16777216, varying = true))

    /** Database column IoString SqlType(VARCHAR), Length(16777216,true) */
    val iostring: Rep[Option[String]] = column[Option[String]]("IoString", O.Length(16777216, varying = true))

    /** Database column IntroStr SqlType(VARCHAR), Length(16777216,true) */
    val introstr: Rep[Option[String]] = column[Option[String]]("IntroStr", O.Length(16777216, varying = true))

    /** Database column IntroNum SqlType(INTEGER), Default(Some(0)) */
    val intronum: Rep[Option[Int]] = column[Option[Int]]("IntroNum", O.Default(Some(0)))

    /** Database column IsField SqlType(INTEGER), Default(Some(0)) */
    val isfield: Rep[Option[Int]] = column[Option[Int]]("IsField", O.Default(Some(0)))

    /** Database column Field SqlType(VARCHAR), Length(16777216,true) */
    val field: Rep[Option[String]] = column[Option[String]]("Field", O.Length(16777216, varying = true))

    /** Database column InfoPurview SqlType(INTEGER), Default(Some(0)) */
    val infopurview: Rep[Option[Int]] = column[Option[Int]]("InfoPurview", O.Default(Some(0)))

    /** Database column arrGroupID SqlType(VARCHAR), Length(255,true) */
    val arrgroupid: Rep[Option[String]] = column[Option[String]]("arrGroupID", O.Length(255, varying = true))

    /** Database column ChargeType SqlType(INTEGER), Default(Some(0)) */
    val chargetype: Rep[Option[Int]] = column[Option[Int]]("ChargeType", O.Default(Some(0)))

    /** Database column PitchTime SqlType(INTEGER), Default(Some(0)) */
    val pitchtime: Rep[Option[Int]] = column[Option[Int]]("PitchTime", O.Default(Some(0)))

    /** Database column ReadTimes SqlType(INTEGER), Default(Some(0)) */
    val readtimes: Rep[Option[Int]] = column[Option[Int]]("ReadTimes", O.Default(Some(0)))

    /** Database column DividePercent SqlType(INTEGER), Default(Some(0)) */
    val dividepercent: Rep[Option[Int]] = column[Option[Int]]("DividePercent", O.Default(Some(0)))

    /** Database column SaveFlashUrlToFile SqlType(BOOLEAN) */
    val saveflashurltofile: Rep[Option[Boolean]] = column[Option[Boolean]]("SaveFlashUrlToFile")

    /** Index over (channelid) (database name PE_ITEM_CHANNELID) */
    val index1 = index("PE_ITEM_CHANNELID", channelid :: HNil)

    /** Index over (classid) (database name PE_ITEM_CLASSID) */
    val index2 = index("PE_ITEM_CLASSID", classid :: HNil)

    /** Index over (skinid) (database name PE_ITEM_SKINID) */
    val index3 = index("PE_ITEM_SKINID", skinid :: HNil)

    /** Index over (specialid) (database name PE_ITEM_SPECIALID) */
    val index4 = index("PE_ITEM_SPECIALID", specialid :: HNil)

    /** Index over (templateid) (database name PE_ITEM_TEMPLATEID) */
    val index5 = index("PE_ITEM_TEMPLATEID", templateid :: HNil)

    /** Index over (updatetime) (database name PE_ITEM_UPDATETIME) */
    val index6 = index("PE_ITEM_UPDATETIME", updatetime :: HNil)
  }

  /** Collection-like TableQuery object for table PeItem */
  lazy val PeItem = new TableQuery(tag => new PeItem(tag))
}
