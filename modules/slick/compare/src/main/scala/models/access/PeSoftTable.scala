package models.access
// AUTO-GENERATED Slick data model for table PeSoft
trait PeSoftTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeSoft
    *  @param softid Database column SoftID SqlType(INTEGER), PrimaryKey
    *  @param channelid Database column ChannelID SqlType(INTEGER)
    *  @param classid Database column ClassID SqlType(INTEGER)
    *  @param softname Database column SoftName SqlType(VARCHAR), Length(255,true)
    *  @param softversion Database column SoftVersion SqlType(VARCHAR), Length(100,true)
    *  @param author Database column Author SqlType(VARCHAR), Length(30,true)
    *  @param copyfrom Database column CopyFrom SqlType(VARCHAR), Length(255,true)
    *  @param demourl Database column DemoUrl SqlType(VARCHAR), Length(200,true)
    *  @param inputer Database column Inputer SqlType(VARCHAR), Length(20,true)
    *  @param editor Database column Editor SqlType(VARCHAR), Length(20,true)
    *  @param keyword Database column Keyword SqlType(VARCHAR), Length(255,true)
    *  @param hits Database column Hits SqlType(INTEGER)
    *  @param dayhits Database column DayHits SqlType(INTEGER)
    *  @param weekhits Database column WeekHits SqlType(INTEGER)
    *  @param monthhits Database column MonthHits SqlType(INTEGER)
    *  @param commentcount Database column CommentCount SqlType(INTEGER), Default(Some(0))
    *  @param updatetime Database column UpdateTime SqlType(TIMESTAMP)
    *  @param createtime Database column CreateTime SqlType(TIMESTAMP)
    *  @param operatingsystem Database column OperatingSystem SqlType(VARCHAR), Length(100,true)
    *  @param softtype Database column SoftType SqlType(VARCHAR), Length(50,true)
    *  @param softlanguage Database column SoftLanguage SqlType(VARCHAR), Length(50,true)
    *  @param copyrighttype Database column CopyrightType SqlType(VARCHAR), Length(50,true)
    *  @param softsize Database column SoftSize SqlType(INTEGER)
    *  @param regurl Database column RegUrl SqlType(VARCHAR), Length(200,true)
    *  @param ontop Database column OnTop SqlType(BOOLEAN)
    *  @param elite Database column Elite SqlType(BOOLEAN)
    *  @param status Database column Status SqlType(INTEGER), Default(0)
    *  @param softintro Database column SoftIntro SqlType(VARCHAR), Length(16777216,true)
    *  @param softpicurl Database column SoftPicUrl SqlType(VARCHAR), Length(255,true)
    *  @param downloadurl Database column DownloadUrl SqlType(VARCHAR), Length(16777216,true)
    *  @param infopoint Database column InfoPoint SqlType(INTEGER)
    *  @param deleted Database column Deleted SqlType(BOOLEAN)
    *  @param stars Database column Stars SqlType(INTEGER)
    *  @param decompresspassword Database column DecompressPassword SqlType(VARCHAR), Length(50,true)
    *  @param lasthittime Database column LastHitTime SqlType(TIMESTAMP)
    *  @param templateid Database column TemplateID SqlType(INTEGER)
    *  @param skinid Database column SkinID SqlType(INTEGER)
    *  @param errortimes Database column ErrorTimes SqlType(INTEGER), Default(Some(0))
    *  @param voteid Database column VoteID SqlType(INTEGER), Default(Some(0))
    *  @param presentexp Database column PresentExp SqlType(DOUBLE), Default(Some(0.0))
    *  @param browsetimes Database column BrowseTimes SqlType(INTEGER), Default(Some(0))
    *  @param infopurview Database column InfoPurview SqlType(INTEGER), Default(Some(0))
    *  @param arrgroupid Database column arrGroupID SqlType(VARCHAR), Length(255,true)
    *  @param chargetype Database column ChargeType SqlType(INTEGER), Default(Some(0))
    *  @param pitchtime Database column PitchTime SqlType(INTEGER), Default(Some(0))
    *  @param readtimes Database column ReadTimes SqlType(INTEGER), Default(Some(0))
    *  @param dividepercent Database column DividePercent SqlType(INTEGER), Default(Some(0))
    *  @param blogid Database column BlogID SqlType(INTEGER), Default(Some(0)) */
  case class PeSoftRow(
    softid: Int,
    channelid: Int,
    classid: Int,
    softname: String,
    softversion: Option[String],
    author: Option[String],
    copyfrom: Option[String],
    demourl: Option[String],
    inputer: Option[String],
    editor: Option[String],
    keyword: String,
    hits: Option[Int],
    dayhits: Option[Int],
    weekhits: Option[Int],
    monthhits: Option[Int],
    commentcount: Option[Int] = Some(0),
    updatetime: Option[java.sql.Timestamp],
    createtime: Option[java.sql.Timestamp],
    operatingsystem: Option[String],
    softtype: Option[String],
    softlanguage: Option[String],
    copyrighttype: Option[String],
    softsize: Option[Int],
    regurl: Option[String],
    ontop: Boolean,
    elite: Boolean,
    status: Int = 0,
    softintro: Option[String],
    softpicurl: Option[String],
    downloadurl: Option[String],
    infopoint: Option[Int],
    deleted: Boolean,
    stars: Option[Int],
    decompresspassword: Option[String],
    lasthittime: Option[java.sql.Timestamp],
    templateid: Option[Int],
    skinid: Option[Int],
    errortimes: Option[Int] = Some(0),
    voteid: Option[Int] = Some(0),
    presentexp: Option[Double] = Some(0.0),
    browsetimes: Option[Int] = Some(0),
    infopurview: Option[Int] = Some(0),
    arrgroupid: Option[String],
    chargetype: Option[Int] = Some(0),
    pitchtime: Option[Int] = Some(0),
    readtimes: Option[Int] = Some(0),
    dividepercent: Option[Int] = Some(0),
    blogid: Option[Int] = Some(0)
  )

  /** GetResult implicit for fetching PeSoftRow objects using plain SQL queries */
  /** Table description of table PE_Soft. Objects of this class serve as prototypes for rows in queries. */
  class PeSoft(_tableTag: Tag) extends profile.api.Table[PeSoftRow](_tableTag, "PE_Soft") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column SoftID SqlType(INTEGER), PrimaryKey */
    val softid: Rep[Int] = column[Int]("SoftID", O.PrimaryKey)

    /** Database column ChannelID SqlType(INTEGER) */
    val channelid: Rep[Int] = column[Int]("ChannelID")

    /** Database column ClassID SqlType(INTEGER) */
    val classid: Rep[Int] = column[Int]("ClassID")

    /** Database column SoftName SqlType(VARCHAR), Length(255,true) */
    val softname: Rep[String] = column[String]("SoftName", O.Length(255, varying = true))

    /** Database column SoftVersion SqlType(VARCHAR), Length(100,true) */
    val softversion: Rep[Option[String]] = column[Option[String]]("SoftVersion", O.Length(100, varying = true))

    /** Database column Author SqlType(VARCHAR), Length(30,true) */
    val author: Rep[Option[String]] = column[Option[String]]("Author", O.Length(30, varying = true))

    /** Database column CopyFrom SqlType(VARCHAR), Length(255,true) */
    val copyfrom: Rep[Option[String]] = column[Option[String]]("CopyFrom", O.Length(255, varying = true))

    /** Database column DemoUrl SqlType(VARCHAR), Length(200,true) */
    val demourl: Rep[Option[String]] = column[Option[String]]("DemoUrl", O.Length(200, varying = true))

    /** Database column Inputer SqlType(VARCHAR), Length(20,true) */
    val inputer: Rep[Option[String]] = column[Option[String]]("Inputer", O.Length(20, varying = true))

    /** Database column Editor SqlType(VARCHAR), Length(20,true) */
    val editor: Rep[Option[String]] = column[Option[String]]("Editor", O.Length(20, varying = true))

    /** Database column Keyword SqlType(VARCHAR), Length(255,true) */
    val keyword: Rep[String] = column[String]("Keyword", O.Length(255, varying = true))

    /** Database column Hits SqlType(INTEGER) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits")

    /** Database column DayHits SqlType(INTEGER) */
    val dayhits: Rep[Option[Int]] = column[Option[Int]]("DayHits")

    /** Database column WeekHits SqlType(INTEGER) */
    val weekhits: Rep[Option[Int]] = column[Option[Int]]("WeekHits")

    /** Database column MonthHits SqlType(INTEGER) */
    val monthhits: Rep[Option[Int]] = column[Option[Int]]("MonthHits")

    /** Database column CommentCount SqlType(INTEGER), Default(Some(0)) */
    val commentcount: Rep[Option[Int]] = column[Option[Int]]("CommentCount", O.Default(Some(0)))

    /** Database column UpdateTime SqlType(TIMESTAMP) */
    val updatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UpdateTime")

    /** Database column CreateTime SqlType(TIMESTAMP) */
    val createtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CreateTime")

    /** Database column OperatingSystem SqlType(VARCHAR), Length(100,true) */
    val operatingsystem: Rep[Option[String]] = column[Option[String]]("OperatingSystem", O.Length(100, varying = true))

    /** Database column SoftType SqlType(VARCHAR), Length(50,true) */
    val softtype: Rep[Option[String]] = column[Option[String]]("SoftType", O.Length(50, varying = true))

    /** Database column SoftLanguage SqlType(VARCHAR), Length(50,true) */
    val softlanguage: Rep[Option[String]] = column[Option[String]]("SoftLanguage", O.Length(50, varying = true))

    /** Database column CopyrightType SqlType(VARCHAR), Length(50,true) */
    val copyrighttype: Rep[Option[String]] = column[Option[String]]("CopyrightType", O.Length(50, varying = true))

    /** Database column SoftSize SqlType(INTEGER) */
    val softsize: Rep[Option[Int]] = column[Option[Int]]("SoftSize")

    /** Database column RegUrl SqlType(VARCHAR), Length(200,true) */
    val regurl: Rep[Option[String]] = column[Option[String]]("RegUrl", O.Length(200, varying = true))

    /** Database column OnTop SqlType(BOOLEAN) */
    val ontop: Rep[Boolean] = column[Boolean]("OnTop")

    /** Database column Elite SqlType(BOOLEAN) */
    val elite: Rep[Boolean] = column[Boolean]("Elite")

    /** Database column Status SqlType(INTEGER), Default(0) */
    val status: Rep[Int] = column[Int]("Status", O.Default(0))

    /** Database column SoftIntro SqlType(VARCHAR), Length(16777216,true) */
    val softintro: Rep[Option[String]] = column[Option[String]]("SoftIntro", O.Length(16777216, varying = true))

    /** Database column SoftPicUrl SqlType(VARCHAR), Length(255,true) */
    val softpicurl: Rep[Option[String]] = column[Option[String]]("SoftPicUrl", O.Length(255, varying = true))

    /** Database column DownloadUrl SqlType(VARCHAR), Length(16777216,true) */
    val downloadurl: Rep[Option[String]] = column[Option[String]]("DownloadUrl", O.Length(16777216, varying = true))

    /** Database column InfoPoint SqlType(INTEGER) */
    val infopoint: Rep[Option[Int]] = column[Option[Int]]("InfoPoint")

    /** Database column Deleted SqlType(BOOLEAN) */
    val deleted: Rep[Boolean] = column[Boolean]("Deleted")

    /** Database column Stars SqlType(INTEGER) */
    val stars: Rep[Option[Int]] = column[Option[Int]]("Stars")

    /** Database column DecompressPassword SqlType(VARCHAR), Length(50,true) */
    val decompresspassword: Rep[Option[String]] = column[Option[String]]("DecompressPassword", O.Length(50, varying = true))

    /** Database column LastHitTime SqlType(TIMESTAMP) */
    val lasthittime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastHitTime")

    /** Database column TemplateID SqlType(INTEGER) */
    val templateid: Rep[Option[Int]] = column[Option[Int]]("TemplateID")

    /** Database column SkinID SqlType(INTEGER) */
    val skinid: Rep[Option[Int]] = column[Option[Int]]("SkinID")

    /** Database column ErrorTimes SqlType(INTEGER), Default(Some(0)) */
    val errortimes: Rep[Option[Int]] = column[Option[Int]]("ErrorTimes", O.Default(Some(0)))

    /** Database column VoteID SqlType(INTEGER), Default(Some(0)) */
    val voteid: Rep[Option[Int]] = column[Option[Int]]("VoteID", O.Default(Some(0)))

    /** Database column PresentExp SqlType(DOUBLE), Default(Some(0.0)) */
    val presentexp: Rep[Option[Double]] = column[Option[Double]]("PresentExp", O.Default(Some(0.0)))

    /** Database column BrowseTimes SqlType(INTEGER), Default(Some(0)) */
    val browsetimes: Rep[Option[Int]] = column[Option[Int]]("BrowseTimes", O.Default(Some(0)))

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

    /** Database column BlogID SqlType(INTEGER), Default(Some(0)) */
    val blogid: Rep[Option[Int]] = column[Option[Int]]("BlogID", O.Default(Some(0)))

    /** Index over (author) (database name PE_SOFT_AUTHOR) */
    val index1 = index("PE_SOFT_AUTHOR", author)

    /** Index over (channelid) (database name PE_SOFT_CHANNELID) */
    val index2 = index("PE_SOFT_CHANNELID", channelid)

    /** Index over (classid) (database name PE_SOFT_CLASSID) */
    val index3 = index("PE_SOFT_CLASSID", classid)

    /** Index over (inputer) (database name PE_SOFT_INPUTER) */
    val index4 = index("PE_SOFT_INPUTER", inputer)

    /** Index over (keyword) (database name PE_SOFT_KEYWORD) */
    val index5 = index("PE_SOFT_KEYWORD", keyword)

    /** Index over (skinid) (database name PE_SOFT_SKINID) */
    val index6 = index("PE_SOFT_SKINID", skinid)

    /** Index over (status) (database name PE_SOFT_STATUS) */
    val index7 = index("PE_SOFT_STATUS", status)

    /** Index over (templateid) (database name PE_SOFT_TEMPLATEID) */
    val index8 = index("PE_SOFT_TEMPLATEID", templateid)

    /** Index over (updatetime) (database name PE_SOFT_UPDATETIME) */
    val index9 = index("PE_SOFT_UPDATETIME", updatetime)
  }

  /** Collection-like TableQuery object for table PeSoft */
  lazy val PeSoft = new TableQuery(tag => new PeSoft(tag))
}
