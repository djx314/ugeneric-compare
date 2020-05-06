package models.access
// AUTO-GENERATED Slick data model for table PeArticle
trait PeArticleTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeArticle
   *  @param articleid Database column ArticleID SqlType(INTEGER), PrimaryKey
   *  @param channelid Database column ChannelID SqlType(INTEGER)
   *  @param classid Database column ClassID SqlType(INTEGER)
   *  @param title Database column Title SqlType(VARCHAR), Length(255,true)
   *  @param titleintact Database column TitleIntact SqlType(VARCHAR), Length(255,true)
   *  @param subheading Database column Subheading SqlType(VARCHAR), Length(255,true)
   *  @param author Database column Author SqlType(VARCHAR), Length(255,true)
   *  @param copyfrom Database column CopyFrom SqlType(VARCHAR), Length(255,true)
   *  @param inputer Database column Inputer SqlType(VARCHAR), Length(20,true)
   *  @param linkurl Database column LinkUrl SqlType(VARCHAR), Length(255,true)
   *  @param editor Database column Editor SqlType(VARCHAR), Length(20,true)
   *  @param keyword Database column Keyword SqlType(VARCHAR), Length(255,true)
   *  @param hits Database column Hits SqlType(INTEGER)
   *  @param commentcount Database column CommentCount SqlType(INTEGER), Default(Some(0))
   *  @param updatetime Database column UpdateTime SqlType(TIMESTAMP)
   *  @param createtime Database column CreateTime SqlType(TIMESTAMP)
   *  @param ontop Database column OnTop SqlType(BOOLEAN)
   *  @param elite Database column Elite SqlType(BOOLEAN)
   *  @param status Database column Status SqlType(INTEGER), Default(0)
   *  @param content Database column Content SqlType(VARCHAR), Length(16777216,true)
   *  @param includepic Database column IncludePic SqlType(INTEGER), Default(0)
   *  @param defaultpicurl Database column DefaultPicUrl SqlType(VARCHAR), Length(255,true)
   *  @param uploadfiles Database column UploadFiles SqlType(VARCHAR), Length(16777216,true)
   *  @param infopoint Database column InfoPoint SqlType(INTEGER)
   *  @param paginationtype Database column PaginationType SqlType(INTEGER)
   *  @param deleted Database column Deleted SqlType(BOOLEAN)
   *  @param skinid Database column SkinID SqlType(INTEGER)
   *  @param templateid Database column TemplateID SqlType(INTEGER)
   *  @param stars Database column Stars SqlType(INTEGER)
   *  @param titlefontcolor Database column TitleFontColor SqlType(VARCHAR), Length(7,true)
   *  @param titlefonttype Database column TitleFontType SqlType(INTEGER)
   *  @param maxcharperpage Database column MaxCharPerPage SqlType(INTEGER)
   *  @param showcommentlink Database column ShowCommentLink SqlType(BOOLEAN)
   *  @param receive Database column Receive SqlType(BOOLEAN)
   *  @param receiveuser Database column ReceiveUser SqlType(VARCHAR), Length(16777216,true)
   *  @param received Database column Received SqlType(VARCHAR), Length(16777216,true)
   *  @param autoreceivetime Database column AutoReceiveTime SqlType(INTEGER), Default(Some(0))
   *  @param receivetype Database column ReceiveType SqlType(INTEGER), Default(Some(0))
   *  @param intro Database column Intro SqlType(VARCHAR), Length(16777216,true)
   *  @param presentexp Database column PresentExp SqlType(DOUBLE), Default(Some(0.0))
   *  @param copymoney Database column Copymoney SqlType(DECIMAL), Default(Some(0))
   *  @param ispayed Database column IsPayed SqlType(BOOLEAN)
   *  @param beneficiary Database column Beneficiary SqlType(VARCHAR), Length(200,true)
   *  @param paydate Database column PayDate SqlType(TIMESTAMP)
   *  @param voteid Database column VoteID SqlType(INTEGER), Default(Some(0))
   *  @param infopurview Database column InfoPurview SqlType(INTEGER), Default(Some(0))
   *  @param arrgroupid Database column arrGroupID SqlType(VARCHAR), Length(255,true)
   *  @param chargetype Database column ChargeType SqlType(INTEGER), Default(Some(0))
   *  @param pitchtime Database column PitchTime SqlType(INTEGER), Default(Some(0))
   *  @param readtimes Database column ReadTimes SqlType(INTEGER), Default(Some(0))
   *  @param dividepercent Database column DividePercent SqlType(INTEGER), Default(Some(0))
   *  @param blogid Database column BlogID SqlType(INTEGER), Default(Some(0)) */
  case class PeArticleRow(articleid: Int, channelid: Int, classid: Int, title: String, titleintact: Option[String], subheading: Option[String], author: Option[String], copyfrom: Option[String], inputer: Option[String], linkurl: Option[String], editor: String, keyword: String, hits: Int, commentcount: Option[Int] = Some(0), updatetime: java.sql.Timestamp, createtime: Option[java.sql.Timestamp], ontop: Boolean, elite: Boolean, status: Int = 0, content: String, includepic: Int = 0, defaultpicurl: Option[String], uploadfiles: Option[String], infopoint: Option[Int], paginationtype: Option[Int], deleted: Boolean, skinid: Option[Int], templateid: Option[Int], stars: Option[Int], titlefontcolor: Option[String], titlefonttype: Option[Int], maxcharperpage: Option[Int], showcommentlink: Boolean, receive: Option[Boolean], receiveuser: Option[String], received: Option[String], autoreceivetime: Option[Int] = Some(0), receivetype: Option[Int] = Some(0), intro: Option[String], presentexp: Option[Double] = Some(0.0), copymoney: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), ispayed: Option[Boolean], beneficiary: Option[String], paydate: Option[java.sql.Timestamp], voteid: Option[Int] = Some(0), infopurview: Option[Int] = Some(0), arrgroupid: Option[String], chargetype: Option[Int] = Some(0), pitchtime: Option[Int] = Some(0), readtimes: Option[Int] = Some(0), dividepercent: Option[Int] = Some(0), blogid: Option[Int] = Some(0))
  /** GetResult implicit for fetching PeArticleRow objects using plain SQL queries */

  /** Table description of table PE_Article. Objects of this class serve as prototypes for rows in queries. */
  class PeArticle(_tableTag: Tag) extends profile.api.Table[PeArticleRow](_tableTag, "PE_Article") {
    def * = (articleid :: channelid :: classid :: title :: titleintact :: subheading :: author :: copyfrom :: inputer :: linkurl :: editor :: keyword :: hits :: commentcount :: updatetime :: createtime :: ontop :: elite :: status :: content :: includepic :: defaultpicurl :: uploadfiles :: infopoint :: paginationtype :: deleted :: skinid :: templateid :: stars :: titlefontcolor :: titlefonttype :: maxcharperpage :: showcommentlink :: receive :: receiveuser :: received :: autoreceivetime :: receivetype :: intro :: presentexp :: copymoney :: ispayed :: beneficiary :: paydate :: voteid :: infopurview :: arrgroupid :: chargetype :: pitchtime :: readtimes :: dividepercent :: blogid :: HNil).mapTo[PeArticleRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ArticleID SqlType(INTEGER), PrimaryKey */
    val articleid: Rep[Int] = column[Int]("ArticleID", O.PrimaryKey)
    /** Database column ChannelID SqlType(INTEGER) */
    val channelid: Rep[Int] = column[Int]("ChannelID")
    /** Database column ClassID SqlType(INTEGER) */
    val classid: Rep[Int] = column[Int]("ClassID")
    /** Database column Title SqlType(VARCHAR), Length(255,true) */
    val title: Rep[String] = column[String]("Title", O.Length(255,varying=true))
    /** Database column TitleIntact SqlType(VARCHAR), Length(255,true) */
    val titleintact: Rep[Option[String]] = column[Option[String]]("TitleIntact", O.Length(255,varying=true))
    /** Database column Subheading SqlType(VARCHAR), Length(255,true) */
    val subheading: Rep[Option[String]] = column[Option[String]]("Subheading", O.Length(255,varying=true))
    /** Database column Author SqlType(VARCHAR), Length(255,true) */
    val author: Rep[Option[String]] = column[Option[String]]("Author", O.Length(255,varying=true))
    /** Database column CopyFrom SqlType(VARCHAR), Length(255,true) */
    val copyfrom: Rep[Option[String]] = column[Option[String]]("CopyFrom", O.Length(255,varying=true))
    /** Database column Inputer SqlType(VARCHAR), Length(20,true) */
    val inputer: Rep[Option[String]] = column[Option[String]]("Inputer", O.Length(20,varying=true))
    /** Database column LinkUrl SqlType(VARCHAR), Length(255,true) */
    val linkurl: Rep[Option[String]] = column[Option[String]]("LinkUrl", O.Length(255,varying=true))
    /** Database column Editor SqlType(VARCHAR), Length(20,true) */
    val editor: Rep[String] = column[String]("Editor", O.Length(20,varying=true))
    /** Database column Keyword SqlType(VARCHAR), Length(255,true) */
    val keyword: Rep[String] = column[String]("Keyword", O.Length(255,varying=true))
    /** Database column Hits SqlType(INTEGER) */
    val hits: Rep[Int] = column[Int]("Hits")
    /** Database column CommentCount SqlType(INTEGER), Default(Some(0)) */
    val commentcount: Rep[Option[Int]] = column[Option[Int]]("CommentCount", O.Default(Some(0)))
    /** Database column UpdateTime SqlType(TIMESTAMP) */
    val updatetime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("UpdateTime")
    /** Database column CreateTime SqlType(TIMESTAMP) */
    val createtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CreateTime")
    /** Database column OnTop SqlType(BOOLEAN) */
    val ontop: Rep[Boolean] = column[Boolean]("OnTop")
    /** Database column Elite SqlType(BOOLEAN) */
    val elite: Rep[Boolean] = column[Boolean]("Elite")
    /** Database column Status SqlType(INTEGER), Default(0) */
    val status: Rep[Int] = column[Int]("Status", O.Default(0))
    /** Database column Content SqlType(VARCHAR), Length(16777216,true) */
    val content: Rep[String] = column[String]("Content", O.Length(16777216,varying=true))
    /** Database column IncludePic SqlType(INTEGER), Default(0) */
    val includepic: Rep[Int] = column[Int]("IncludePic", O.Default(0))
    /** Database column DefaultPicUrl SqlType(VARCHAR), Length(255,true) */
    val defaultpicurl: Rep[Option[String]] = column[Option[String]]("DefaultPicUrl", O.Length(255,varying=true))
    /** Database column UploadFiles SqlType(VARCHAR), Length(16777216,true) */
    val uploadfiles: Rep[Option[String]] = column[Option[String]]("UploadFiles", O.Length(16777216,varying=true))
    /** Database column InfoPoint SqlType(INTEGER) */
    val infopoint: Rep[Option[Int]] = column[Option[Int]]("InfoPoint")
    /** Database column PaginationType SqlType(INTEGER) */
    val paginationtype: Rep[Option[Int]] = column[Option[Int]]("PaginationType")
    /** Database column Deleted SqlType(BOOLEAN) */
    val deleted: Rep[Boolean] = column[Boolean]("Deleted")
    /** Database column SkinID SqlType(INTEGER) */
    val skinid: Rep[Option[Int]] = column[Option[Int]]("SkinID")
    /** Database column TemplateID SqlType(INTEGER) */
    val templateid: Rep[Option[Int]] = column[Option[Int]]("TemplateID")
    /** Database column Stars SqlType(INTEGER) */
    val stars: Rep[Option[Int]] = column[Option[Int]]("Stars")
    /** Database column TitleFontColor SqlType(VARCHAR), Length(7,true) */
    val titlefontcolor: Rep[Option[String]] = column[Option[String]]("TitleFontColor", O.Length(7,varying=true))
    /** Database column TitleFontType SqlType(INTEGER) */
    val titlefonttype: Rep[Option[Int]] = column[Option[Int]]("TitleFontType")
    /** Database column MaxCharPerPage SqlType(INTEGER) */
    val maxcharperpage: Rep[Option[Int]] = column[Option[Int]]("MaxCharPerPage")
    /** Database column ShowCommentLink SqlType(BOOLEAN) */
    val showcommentlink: Rep[Boolean] = column[Boolean]("ShowCommentLink")
    /** Database column Receive SqlType(BOOLEAN) */
    val receive: Rep[Option[Boolean]] = column[Option[Boolean]]("Receive")
    /** Database column ReceiveUser SqlType(VARCHAR), Length(16777216,true) */
    val receiveuser: Rep[Option[String]] = column[Option[String]]("ReceiveUser", O.Length(16777216,varying=true))
    /** Database column Received SqlType(VARCHAR), Length(16777216,true) */
    val received: Rep[Option[String]] = column[Option[String]]("Received", O.Length(16777216,varying=true))
    /** Database column AutoReceiveTime SqlType(INTEGER), Default(Some(0)) */
    val autoreceivetime: Rep[Option[Int]] = column[Option[Int]]("AutoReceiveTime", O.Default(Some(0)))
    /** Database column ReceiveType SqlType(INTEGER), Default(Some(0)) */
    val receivetype: Rep[Option[Int]] = column[Option[Int]]("ReceiveType", O.Default(Some(0)))
    /** Database column Intro SqlType(VARCHAR), Length(16777216,true) */
    val intro: Rep[Option[String]] = column[Option[String]]("Intro", O.Length(16777216,varying=true))
    /** Database column PresentExp SqlType(DOUBLE), Default(Some(0.0)) */
    val presentexp: Rep[Option[Double]] = column[Option[Double]]("PresentExp", O.Default(Some(0.0)))
    /** Database column Copymoney SqlType(DECIMAL), Default(Some(0)) */
    val copymoney: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Copymoney", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column IsPayed SqlType(BOOLEAN) */
    val ispayed: Rep[Option[Boolean]] = column[Option[Boolean]]("IsPayed")
    /** Database column Beneficiary SqlType(VARCHAR), Length(200,true) */
    val beneficiary: Rep[Option[String]] = column[Option[String]]("Beneficiary", O.Length(200,varying=true))
    /** Database column PayDate SqlType(TIMESTAMP) */
    val paydate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PayDate")
    /** Database column VoteID SqlType(INTEGER), Default(Some(0)) */
    val voteid: Rep[Option[Int]] = column[Option[Int]]("VoteID", O.Default(Some(0)))
    /** Database column InfoPurview SqlType(INTEGER), Default(Some(0)) */
    val infopurview: Rep[Option[Int]] = column[Option[Int]]("InfoPurview", O.Default(Some(0)))
    /** Database column arrGroupID SqlType(VARCHAR), Length(255,true) */
    val arrgroupid: Rep[Option[String]] = column[Option[String]]("arrGroupID", O.Length(255,varying=true))
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

    /** Index over (author) (database name PE_ARTICLE_AUTHOR) */
    val index1 = index("PE_ARTICLE_AUTHOR", author :: HNil)
    /** Index over (channelid) (database name PE_ARTICLE_CHANNELID) */
    val index2 = index("PE_ARTICLE_CHANNELID", channelid :: HNil)
    /** Index over (classid) (database name PE_ARTICLE_CLASSID) */
    val index3 = index("PE_ARTICLE_CLASSID", classid :: HNil)
    /** Index over (inputer) (database name PE_ARTICLE_INPUTER) */
    val index4 = index("PE_ARTICLE_INPUTER", inputer :: HNil)
    /** Index over (keyword) (database name PE_ARTICLE_KEYWORD) */
    val index5 = index("PE_ARTICLE_KEYWORD", keyword :: HNil)
    /** Index over (skinid) (database name PE_ARTICLE_SKINID) */
    val index6 = index("PE_ARTICLE_SKINID", skinid :: HNil)
    /** Index over (status) (database name PE_ARTICLE_STATUS) */
    val index7 = index("PE_ARTICLE_STATUS", status :: HNil)
    /** Index over (templateid) (database name PE_ARTICLE_TEMPLATEID) */
    val index8 = index("PE_ARTICLE_TEMPLATEID", templateid :: HNil)
    /** Index over (updatetime) (database name PE_ARTICLE_UPDATETIME) */
    val index9 = index("PE_ARTICLE_UPDATETIME", updatetime :: HNil)
  }
  /** Collection-like TableQuery object for table PeArticle */
  lazy val PeArticle = new TableQuery(tag => new PeArticle(tag))
}
