package models.access
// AUTO-GENERATED Slick data model for table PePhoto
trait PePhotoTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PePhoto
   *  @param photoid Database column PhotoID SqlType(INTEGER), PrimaryKey
   *  @param channelid Database column ChannelID SqlType(INTEGER)
   *  @param classid Database column ClassID SqlType(INTEGER)
   *  @param photoname Database column PhotoName SqlType(VARCHAR), Length(255,true)
   *  @param author Database column Author SqlType(VARCHAR), Length(30,true)
   *  @param copyfrom Database column CopyFrom SqlType(VARCHAR), Length(255,true)
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
   *  @param photothumb Database column PhotoThumb SqlType(VARCHAR), Length(200,true)
   *  @param photourl Database column PhotoUrl SqlType(VARCHAR), Length(16777216,true)
   *  @param photosize Database column PhotoSize SqlType(INTEGER)
   *  @param ontop Database column OnTop SqlType(BOOLEAN)
   *  @param elite Database column Elite SqlType(BOOLEAN)
   *  @param status Database column Status SqlType(INTEGER), Default(0)
   *  @param photointro Database column PhotoIntro SqlType(VARCHAR), Length(16777216,true)
   *  @param infopoint Database column InfoPoint SqlType(INTEGER)
   *  @param deleted Database column Deleted SqlType(BOOLEAN)
   *  @param stars Database column Stars SqlType(INTEGER)
   *  @param lasthittime Database column LastHitTime SqlType(TIMESTAMP)
   *  @param templateid Database column TemplateID SqlType(INTEGER)
   *  @param skinid Database column SkinID SqlType(INTEGER)
   *  @param voteid Database column VoteID SqlType(INTEGER), Default(Some(0))
   *  @param presentexp Database column PresentExp SqlType(DOUBLE), Default(Some(0.0))
   *  @param infopurview Database column InfoPurview SqlType(INTEGER), Default(Some(0))
   *  @param arrgroupid Database column arrGroupID SqlType(VARCHAR), Length(255,true)
   *  @param chargetype Database column ChargeType SqlType(INTEGER), Default(Some(0))
   *  @param pitchtime Database column PitchTime SqlType(INTEGER), Default(Some(0))
   *  @param readtimes Database column ReadTimes SqlType(INTEGER), Default(Some(0))
   *  @param dividepercent Database column DividePercent SqlType(INTEGER), Default(Some(0))
   *  @param blogid Database column BlogID SqlType(INTEGER), Default(Some(0)) */
  case class PePhotoRow(photoid: Int, channelid: Int, classid: Int, photoname: String, author: Option[String], copyfrom: Option[String], inputer: Option[String], editor: Option[String], keyword: String, hits: Option[Int], dayhits: Option[Int], weekhits: Option[Int], monthhits: Option[Int], commentcount: Option[Int] = Some(0), updatetime: Option[java.sql.Timestamp], createtime: Option[java.sql.Timestamp], photothumb: Option[String], photourl: Option[String], photosize: Option[Int], ontop: Boolean, elite: Boolean, status: Int = 0, photointro: Option[String], infopoint: Option[Int], deleted: Boolean, stars: Option[Int], lasthittime: Option[java.sql.Timestamp], templateid: Option[Int], skinid: Option[Int], voteid: Option[Int] = Some(0), presentexp: Option[Double] = Some(0.0), infopurview: Option[Int] = Some(0), arrgroupid: Option[String], chargetype: Option[Int] = Some(0), pitchtime: Option[Int] = Some(0), readtimes: Option[Int] = Some(0), dividepercent: Option[Int] = Some(0), blogid: Option[Int] = Some(0))
  /** GetResult implicit for fetching PePhotoRow objects using plain SQL queries */

  /** Table description of table PE_Photo. Objects of this class serve as prototypes for rows in queries. */
  class PePhoto(_tableTag: Tag) extends profile.api.Table[PePhotoRow](_tableTag, "PE_Photo") {
    def * = (photoid :: channelid :: classid :: photoname :: author :: copyfrom :: inputer :: editor :: keyword :: hits :: dayhits :: weekhits :: monthhits :: commentcount :: updatetime :: createtime :: photothumb :: photourl :: photosize :: ontop :: elite :: status :: photointro :: infopoint :: deleted :: stars :: lasthittime :: templateid :: skinid :: voteid :: presentexp :: infopurview :: arrgroupid :: chargetype :: pitchtime :: readtimes :: dividepercent :: blogid :: HNil).mapTo[PePhotoRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column PhotoID SqlType(INTEGER), PrimaryKey */
    val photoid: Rep[Int] = column[Int]("PhotoID", O.PrimaryKey)
    /** Database column ChannelID SqlType(INTEGER) */
    val channelid: Rep[Int] = column[Int]("ChannelID")
    /** Database column ClassID SqlType(INTEGER) */
    val classid: Rep[Int] = column[Int]("ClassID")
    /** Database column PhotoName SqlType(VARCHAR), Length(255,true) */
    val photoname: Rep[String] = column[String]("PhotoName", O.Length(255,varying=true))
    /** Database column Author SqlType(VARCHAR), Length(30,true) */
    val author: Rep[Option[String]] = column[Option[String]]("Author", O.Length(30,varying=true))
    /** Database column CopyFrom SqlType(VARCHAR), Length(255,true) */
    val copyfrom: Rep[Option[String]] = column[Option[String]]("CopyFrom", O.Length(255,varying=true))
    /** Database column Inputer SqlType(VARCHAR), Length(20,true) */
    val inputer: Rep[Option[String]] = column[Option[String]]("Inputer", O.Length(20,varying=true))
    /** Database column Editor SqlType(VARCHAR), Length(20,true) */
    val editor: Rep[Option[String]] = column[Option[String]]("Editor", O.Length(20,varying=true))
    /** Database column Keyword SqlType(VARCHAR), Length(255,true) */
    val keyword: Rep[String] = column[String]("Keyword", O.Length(255,varying=true))
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
    /** Database column PhotoThumb SqlType(VARCHAR), Length(200,true) */
    val photothumb: Rep[Option[String]] = column[Option[String]]("PhotoThumb", O.Length(200,varying=true))
    /** Database column PhotoUrl SqlType(VARCHAR), Length(16777216,true) */
    val photourl: Rep[Option[String]] = column[Option[String]]("PhotoUrl", O.Length(16777216,varying=true))
    /** Database column PhotoSize SqlType(INTEGER) */
    val photosize: Rep[Option[Int]] = column[Option[Int]]("PhotoSize")
    /** Database column OnTop SqlType(BOOLEAN) */
    val ontop: Rep[Boolean] = column[Boolean]("OnTop")
    /** Database column Elite SqlType(BOOLEAN) */
    val elite: Rep[Boolean] = column[Boolean]("Elite")
    /** Database column Status SqlType(INTEGER), Default(0) */
    val status: Rep[Int] = column[Int]("Status", O.Default(0))
    /** Database column PhotoIntro SqlType(VARCHAR), Length(16777216,true) */
    val photointro: Rep[Option[String]] = column[Option[String]]("PhotoIntro", O.Length(16777216,varying=true))
    /** Database column InfoPoint SqlType(INTEGER) */
    val infopoint: Rep[Option[Int]] = column[Option[Int]]("InfoPoint")
    /** Database column Deleted SqlType(BOOLEAN) */
    val deleted: Rep[Boolean] = column[Boolean]("Deleted")
    /** Database column Stars SqlType(INTEGER) */
    val stars: Rep[Option[Int]] = column[Option[Int]]("Stars")
    /** Database column LastHitTime SqlType(TIMESTAMP) */
    val lasthittime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastHitTime")
    /** Database column TemplateID SqlType(INTEGER) */
    val templateid: Rep[Option[Int]] = column[Option[Int]]("TemplateID")
    /** Database column SkinID SqlType(INTEGER) */
    val skinid: Rep[Option[Int]] = column[Option[Int]]("SkinID")
    /** Database column VoteID SqlType(INTEGER), Default(Some(0)) */
    val voteid: Rep[Option[Int]] = column[Option[Int]]("VoteID", O.Default(Some(0)))
    /** Database column PresentExp SqlType(DOUBLE), Default(Some(0.0)) */
    val presentexp: Rep[Option[Double]] = column[Option[Double]]("PresentExp", O.Default(Some(0.0)))
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

    /** Index over (author) (database name PE_PHOTO_AUTHOR) */
    val index1 = index("PE_PHOTO_AUTHOR", author :: HNil)
    /** Index over (channelid) (database name PE_PHOTO_CHANNELID) */
    val index2 = index("PE_PHOTO_CHANNELID", channelid :: HNil)
    /** Index over (classid) (database name PE_PHOTO_CLASSID) */
    val index3 = index("PE_PHOTO_CLASSID", classid :: HNil)
    /** Index over (inputer) (database name PE_PHOTO_INPUTER) */
    val index4 = index("PE_PHOTO_INPUTER", inputer :: HNil)
    /** Index over (keyword) (database name PE_PHOTO_KEYWORD) */
    val index5 = index("PE_PHOTO_KEYWORD", keyword :: HNil)
    /** Index over (skinid) (database name PE_PHOTO_SKINID) */
    val index6 = index("PE_PHOTO_SKINID", skinid :: HNil)
    /** Index over (status) (database name PE_PHOTO_STATUS) */
    val index7 = index("PE_PHOTO_STATUS", status :: HNil)
    /** Index over (templateid) (database name PE_PHOTO_TEMPLATEID) */
    val index8 = index("PE_PHOTO_TEMPLATEID", templateid :: HNil)
  }
  /** Collection-like TableQuery object for table PePhoto */
  lazy val PePhoto = new TableQuery(tag => new PePhoto(tag))
}
