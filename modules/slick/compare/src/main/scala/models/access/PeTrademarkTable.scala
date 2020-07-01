package models.access
// AUTO-GENERATED Slick data model for table PeTrademark
trait PeTrademarkTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeTrademark
   *  @param trademarkid Database column TrademarkID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param channelid Database column ChannelID SqlType(INTEGER), Default(Some(0))
   *  @param producerid Database column ProducerID SqlType(INTEGER), Default(Some(0))
   *  @param trademarkname Database column TrademarkName SqlType(VARCHAR), Length(50,true)
   *  @param trademarkphoto Database column TrademarkPhoto SqlType(VARCHAR), Length(255,true)
   *  @param trademarkintro Database column TrademarkIntro SqlType(VARCHAR), Length(16777216,true)
   *  @param trademarktype Database column TrademarkType SqlType(SMALLINT), Default(Some(0))
   *  @param passed Database column Passed SqlType(BOOLEAN)
   *  @param ontop Database column onTop SqlType(BOOLEAN)
   *  @param iselite Database column IsElite SqlType(BOOLEAN)
   *  @param hits Database column Hits SqlType(INTEGER), Default(Some(0)) */
  case class PeTrademarkRow(trademarkid: Int, channelid: Option[Int] = Some(0), producerid: Option[Int] = Some(0), trademarkname: Option[String], trademarkphoto: Option[String], trademarkintro: Option[String], trademarktype: Option[Short] = Some(0), passed: Option[Boolean], ontop: Option[Boolean], iselite: Option[Boolean], hits: Option[Int] = Some(0))
  /** GetResult implicit for fetching PeTrademarkRow objects using plain SQL queries */

  /** Table description of table PE_Trademark. Objects of this class serve as prototypes for rows in queries. */
  class PeTrademark(_tableTag: Tag) extends profile.api.Table[PeTrademarkRow](_tableTag, "PE_Trademark") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(implicit e => _.mapWithTable(this))
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column TrademarkID SqlType(INTEGER), AutoInc, PrimaryKey */
    val trademarkid: Rep[Int] = column[Int]("TrademarkID", O.AutoInc, O.PrimaryKey)
    /** Database column ChannelID SqlType(INTEGER), Default(Some(0)) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID", O.Default(Some(0)))
    /** Database column ProducerID SqlType(INTEGER), Default(Some(0)) */
    val producerid: Rep[Option[Int]] = column[Option[Int]]("ProducerID", O.Default(Some(0)))
    /** Database column TrademarkName SqlType(VARCHAR), Length(50,true) */
    val trademarkname: Rep[Option[String]] = column[Option[String]]("TrademarkName", O.Length(50,varying=true))
    /** Database column TrademarkPhoto SqlType(VARCHAR), Length(255,true) */
    val trademarkphoto: Rep[Option[String]] = column[Option[String]]("TrademarkPhoto", O.Length(255,varying=true))
    /** Database column TrademarkIntro SqlType(VARCHAR), Length(16777216,true) */
    val trademarkintro: Rep[Option[String]] = column[Option[String]]("TrademarkIntro", O.Length(16777216,varying=true))
    /** Database column TrademarkType SqlType(SMALLINT), Default(Some(0)) */
    val trademarktype: Rep[Option[Short]] = column[Option[Short]]("TrademarkType", O.Default(Some(0)))
    /** Database column Passed SqlType(BOOLEAN) */
    val passed: Rep[Option[Boolean]] = column[Option[Boolean]]("Passed")
    /** Database column onTop SqlType(BOOLEAN) */
    val ontop: Rep[Option[Boolean]] = column[Option[Boolean]]("onTop")
    /** Database column IsElite SqlType(BOOLEAN) */
    val iselite: Rep[Option[Boolean]] = column[Option[Boolean]]("IsElite")
    /** Database column Hits SqlType(INTEGER), Default(Some(0)) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits", O.Default(Some(0)))

    /** Index over (channelid) (database name PE_TRADEMARK_CHANNELID) */
    val index1 = index("PE_TRADEMARK_CHANNELID", channelid)
    /** Index over (producerid) (database name PE_TRADEMARK_PRODUCERID) */
    val index2 = index("PE_TRADEMARK_PRODUCERID", producerid)
  }
  /** Collection-like TableQuery object for table PeTrademark */
  lazy val PeTrademark = new TableQuery(tag => new PeTrademark(tag))
}
