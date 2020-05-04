package models.access
// AUTO-GENERATED Slick data model for table PeDownserver
trait PeDownserverTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeDownserver
    *  @param serverid Database column ServerID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param channelid Database column ChannelID SqlType(INTEGER), Default(Some(0))
    *  @param servername Database column ServerName SqlType(VARCHAR), Length(50,true)
    *  @param serverurl Database column ServerUrl SqlType(VARCHAR), Length(50,true)
    *  @param serverlogo Database column ServerLogo SqlType(VARCHAR), Length(255,true)
    *  @param orderid Database column OrderID SqlType(INTEGER), Default(Some(0))
    *  @param showtype Database column ShowType SqlType(INTEGER), Default(Some(0))
    *  @param infopoint Database column InfoPoint SqlType(INTEGER)
    *  @param infopurview Database column InfoPurview SqlType(INTEGER), Default(Some(0))
    *  @param arrgroupid Database column arrGroupID SqlType(VARCHAR), Length(255,true)
    *  @param chargetype Database column ChargeType SqlType(INTEGER), Default(Some(0))
    *  @param pitchtime Database column PitchTime SqlType(INTEGER), Default(Some(0))
    *  @param readtimes Database column ReadTimes SqlType(INTEGER), Default(Some(0))
    *  @param dividepercent Database column DividePercent SqlType(INTEGER), Default(Some(0)) */
  case class PeDownserverRow(
    serverid: Int,
    channelid: Option[Int] = Some(0),
    servername: Option[String],
    serverurl: Option[String],
    serverlogo: Option[String],
    orderid: Option[Int] = Some(0),
    showtype: Option[Int] = Some(0),
    infopoint: Option[Int],
    infopurview: Option[Int] = Some(0),
    arrgroupid: Option[String],
    chargetype: Option[Int] = Some(0),
    pitchtime: Option[Int] = Some(0),
    readtimes: Option[Int] = Some(0),
    dividepercent: Option[Int] = Some(0)
  )

  /** GetResult implicit for fetching PeDownserverRow objects using plain SQL queries */
  /** Table description of table PE_DownServer. Objects of this class serve as prototypes for rows in queries. */
  class PeDownserver(_tableTag: Tag) extends profile.api.Table[PeDownserverRow](_tableTag, "PE_DownServer") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ServerID SqlType(INTEGER), AutoInc, PrimaryKey */
    val serverid: Rep[Int] = column[Int]("ServerID", O.AutoInc, O.PrimaryKey)

    /** Database column ChannelID SqlType(INTEGER), Default(Some(0)) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID", O.Default(Some(0)))

    /** Database column ServerName SqlType(VARCHAR), Length(50,true) */
    val servername: Rep[Option[String]] = column[Option[String]]("ServerName", O.Length(50, varying = true))

    /** Database column ServerUrl SqlType(VARCHAR), Length(50,true) */
    val serverurl: Rep[Option[String]] = column[Option[String]]("ServerUrl", O.Length(50, varying = true))

    /** Database column ServerLogo SqlType(VARCHAR), Length(255,true) */
    val serverlogo: Rep[Option[String]] = column[Option[String]]("ServerLogo", O.Length(255, varying = true))

    /** Database column OrderID SqlType(INTEGER), Default(Some(0)) */
    val orderid: Rep[Option[Int]] = column[Option[Int]]("OrderID", O.Default(Some(0)))

    /** Database column ShowType SqlType(INTEGER), Default(Some(0)) */
    val showtype: Rep[Option[Int]] = column[Option[Int]]("ShowType", O.Default(Some(0)))

    /** Database column InfoPoint SqlType(INTEGER) */
    val infopoint: Rep[Option[Int]] = column[Option[Int]]("InfoPoint")

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

    /** Index over (arrgroupid) (database name PE_DOWNSERVER_ARRGROUPID) */
    val index1 = index("PE_DOWNSERVER_ARRGROUPID", arrgroupid)

    /** Index over (channelid) (database name PE_DOWNSERVER_CHANNELID) */
    val index2 = index("PE_DOWNSERVER_CHANNELID", channelid)

    /** Index over (orderid) (database name PE_DOWNSERVER_ORDERID) */
    val index3 = index("PE_DOWNSERVER_ORDERID", orderid)
  }

  /** Collection-like TableQuery object for table PeDownserver */
  lazy val PeDownserver = new TableQuery(tag => new PeDownserver(tag))
}
