package models.access
// AUTO-GENERATED Slick data model for table PeHistrolynews
trait PeHistrolynewsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeHistrolynews
   *  @param histrolynewsid Database column HistrolyNewsID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param itemid Database column ItemID SqlType(INTEGER), Default(Some(0))
   *  @param channelid Database column ChannelID SqlType(INTEGER), Default(Some(0))
   *  @param classid Database column ClassID SqlType(INTEGER), Default(Some(0))
   *  @param articleid Database column ArticleID SqlType(INTEGER), Default(Some(0))
   *  @param title Database column Title SqlType(VARCHAR), Length(200,true)
   *  @param newscollecdate Database column NewsCollecDate SqlType(TIMESTAMP)
   *  @param newsurl Database column NewsUrl SqlType(VARCHAR), Length(16777216,true)
   *  @param result Database column Result SqlType(BOOLEAN) */
  case class PeHistrolynewsRow(histrolynewsid: Int, itemid: Option[Int] = Some(0), channelid: Option[Int] = Some(0), classid: Option[Int] = Some(0), articleid: Option[Int] = Some(0), title: Option[String], newscollecdate: Option[java.sql.Timestamp], newsurl: Option[String], result: Option[Boolean])
  /** GetResult implicit for fetching PeHistrolynewsRow objects using plain SQL queries */

  /** Table description of table PE_HistrolyNews. Objects of this class serve as prototypes for rows in queries. */
  class PeHistrolynews(_tableTag: Tag) extends profile.api.Table[PeHistrolynewsRow](_tableTag, "PE_HistrolyNews") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(implicit e => _.mapWithTable(this))
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column HistrolyNewsID SqlType(INTEGER), AutoInc, PrimaryKey */
    val histrolynewsid: Rep[Int] = column[Int]("HistrolyNewsID", O.AutoInc, O.PrimaryKey)
    /** Database column ItemID SqlType(INTEGER), Default(Some(0)) */
    val itemid: Rep[Option[Int]] = column[Option[Int]]("ItemID", O.Default(Some(0)))
    /** Database column ChannelID SqlType(INTEGER), Default(Some(0)) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID", O.Default(Some(0)))
    /** Database column ClassID SqlType(INTEGER), Default(Some(0)) */
    val classid: Rep[Option[Int]] = column[Option[Int]]("ClassID", O.Default(Some(0)))
    /** Database column ArticleID SqlType(INTEGER), Default(Some(0)) */
    val articleid: Rep[Option[Int]] = column[Option[Int]]("ArticleID", O.Default(Some(0)))
    /** Database column Title SqlType(VARCHAR), Length(200,true) */
    val title: Rep[Option[String]] = column[Option[String]]("Title", O.Length(200,varying=true))
    /** Database column NewsCollecDate SqlType(TIMESTAMP) */
    val newscollecdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("NewsCollecDate")
    /** Database column NewsUrl SqlType(VARCHAR), Length(16777216,true) */
    val newsurl: Rep[Option[String]] = column[Option[String]]("NewsUrl", O.Length(16777216,varying=true))
    /** Database column Result SqlType(BOOLEAN) */
    val result: Rep[Option[Boolean]] = column[Option[Boolean]]("Result")

    /** Index over (articleid) (database name PE_HISTROLYNEWS_ARTICLEID) */
    val index1 = index("PE_HISTROLYNEWS_ARTICLEID", articleid)
    /** Index over (channelid) (database name PE_HISTROLYNEWS_CHANNELID) */
    val index2 = index("PE_HISTROLYNEWS_CHANNELID", channelid)
    /** Index over (classid) (database name PE_HISTROLYNEWS_CLASSID) */
    val index3 = index("PE_HISTROLYNEWS_CLASSID", classid)
    /** Index over (itemid) (database name PE_HISTROLYNEWS_ITEMID1) */
    val index4 = index("PE_HISTROLYNEWS_ITEMID1", itemid)
  }
  /** Collection-like TableQuery object for table PeHistrolynews */
  lazy val PeHistrolynews = new TableQuery(tag => new PeHistrolynews(tag))
}
