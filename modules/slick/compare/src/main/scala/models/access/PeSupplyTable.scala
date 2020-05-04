package models.access
// AUTO-GENERATED Slick data model for table PeSupply
trait PeSupplyTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeSupply
    *  @param supplyid Database column SupplyId SqlType(INTEGER), PrimaryKey
    *  @param channelid Database column ChannelId SqlType(INTEGER)
    *  @param classid Database column ClassId SqlType(INTEGER)
    *  @param specialid Database column SpecialId SqlType(INTEGER)
    *  @param supplyname Database column SupplyName SqlType(VARCHAR), Length(255,true)
    *  @param supplytype Database column SupplyType SqlType(INTEGER)
    *  @param supplytitle Database column SupplyTitle SqlType(VARCHAR), Length(255,true)
    *  @param supplyintro Database column SupplyIntro SqlType(VARCHAR), Length(16777216,true)
    *  @param supplyperiod Database column SupplyPeriod SqlType(INTEGER)
    *  @param tradetype Database column TradeType SqlType(INTEGER)
    *  @param priceintro Database column PriceIntro SqlType(VARCHAR), Length(255,true)
    *  @param supplypicurl Database column SupplyPicUrl SqlType(VARCHAR), Length(255,true)
    *  @param templateid Database column TemplateId SqlType(INTEGER)
    *  @param skinid Database column SkinId SqlType(INTEGER)
    *  @param status Database column Status SqlType(INTEGER)
    *  @param username Database column UserName SqlType(VARCHAR), Length(50,true)
    *  @param hits Database column Hits SqlType(INTEGER)
    *  @param updatetime Database column UpdateTime SqlType(TIMESTAMP)
    *  @param deleted Database column Deleted SqlType(BOOLEAN)
    *  @param commandtype Database column CommandType SqlType(INTEGER)
    *  @param commandchanneldays Database column CommandChannelDays SqlType(INTEGER)
    *  @param commandclassdays Database column CommandClassDays SqlType(INTEGER) */
  case class PeSupplyRow(
    supplyid: Int,
    channelid: Int,
    classid: Int,
    specialid: Option[Int],
    supplyname: Option[String],
    supplytype: Option[Int],
    supplytitle: String,
    supplyintro: Option[String],
    supplyperiod: Option[Int],
    tradetype: Option[Int],
    priceintro: Option[String],
    supplypicurl: Option[String],
    templateid: Option[Int],
    skinid: Option[Int],
    status: Option[Int],
    username: String,
    hits: Option[Int],
    updatetime: Option[java.sql.Timestamp],
    deleted: Option[Boolean],
    commandtype: Option[Int],
    commandchanneldays: Option[Int],
    commandclassdays: Option[Int]
  )

  /** GetResult implicit for fetching PeSupplyRow objects using plain SQL queries */
  /** Table description of table PE_Supply. Objects of this class serve as prototypes for rows in queries. */
  class PeSupply(_tableTag: Tag) extends profile.api.Table[PeSupplyRow](_tableTag, "PE_Supply") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column SupplyId SqlType(INTEGER), PrimaryKey */
    val supplyid: Rep[Int] = column[Int]("SupplyId", O.PrimaryKey)

    /** Database column ChannelId SqlType(INTEGER) */
    val channelid: Rep[Int] = column[Int]("ChannelId")

    /** Database column ClassId SqlType(INTEGER) */
    val classid: Rep[Int] = column[Int]("ClassId")

    /** Database column SpecialId SqlType(INTEGER) */
    val specialid: Rep[Option[Int]] = column[Option[Int]]("SpecialId")

    /** Database column SupplyName SqlType(VARCHAR), Length(255,true) */
    val supplyname: Rep[Option[String]] = column[Option[String]]("SupplyName", O.Length(255, varying = true))

    /** Database column SupplyType SqlType(INTEGER) */
    val supplytype: Rep[Option[Int]] = column[Option[Int]]("SupplyType")

    /** Database column SupplyTitle SqlType(VARCHAR), Length(255,true) */
    val supplytitle: Rep[String] = column[String]("SupplyTitle", O.Length(255, varying = true))

    /** Database column SupplyIntro SqlType(VARCHAR), Length(16777216,true) */
    val supplyintro: Rep[Option[String]] = column[Option[String]]("SupplyIntro", O.Length(16777216, varying = true))

    /** Database column SupplyPeriod SqlType(INTEGER) */
    val supplyperiod: Rep[Option[Int]] = column[Option[Int]]("SupplyPeriod")

    /** Database column TradeType SqlType(INTEGER) */
    val tradetype: Rep[Option[Int]] = column[Option[Int]]("TradeType")

    /** Database column PriceIntro SqlType(VARCHAR), Length(255,true) */
    val priceintro: Rep[Option[String]] = column[Option[String]]("PriceIntro", O.Length(255, varying = true))

    /** Database column SupplyPicUrl SqlType(VARCHAR), Length(255,true) */
    val supplypicurl: Rep[Option[String]] = column[Option[String]]("SupplyPicUrl", O.Length(255, varying = true))

    /** Database column TemplateId SqlType(INTEGER) */
    val templateid: Rep[Option[Int]] = column[Option[Int]]("TemplateId")

    /** Database column SkinId SqlType(INTEGER) */
    val skinid: Rep[Option[Int]] = column[Option[Int]]("SkinId")

    /** Database column Status SqlType(INTEGER) */
    val status: Rep[Option[Int]] = column[Option[Int]]("Status")

    /** Database column UserName SqlType(VARCHAR), Length(50,true) */
    val username: Rep[String] = column[String]("UserName", O.Length(50, varying = true))

    /** Database column Hits SqlType(INTEGER) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits")

    /** Database column UpdateTime SqlType(TIMESTAMP) */
    val updatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UpdateTime")

    /** Database column Deleted SqlType(BOOLEAN) */
    val deleted: Rep[Option[Boolean]] = column[Option[Boolean]]("Deleted")

    /** Database column CommandType SqlType(INTEGER) */
    val commandtype: Rep[Option[Int]] = column[Option[Int]]("CommandType")

    /** Database column CommandChannelDays SqlType(INTEGER) */
    val commandchanneldays: Rep[Option[Int]] = column[Option[Int]]("CommandChannelDays")

    /** Database column CommandClassDays SqlType(INTEGER) */
    val commandclassdays: Rep[Option[Int]] = column[Option[Int]]("CommandClassDays")

    /** Index over (channelid) (database name PE_SUPPLY_CHANNELID) */
    val index1 = index("PE_SUPPLY_CHANNELID", channelid)

    /** Index over (classid) (database name PE_SUPPLY_CLASSID) */
    val index2 = index("PE_SUPPLY_CLASSID", classid)

    /** Index over (skinid) (database name PE_SUPPLY_SKINID) */
    val index3 = index("PE_SUPPLY_SKINID", skinid)

    /** Index over (specialid) (database name PE_SUPPLY_SPECIALID) */
    val index4 = index("PE_SUPPLY_SPECIALID", specialid)

    /** Index over (templateid) (database name PE_SUPPLY_TEMPLATEID) */
    val index5 = index("PE_SUPPLY_TEMPLATEID", templateid)
  }

  /** Collection-like TableQuery object for table PeSupply */
  lazy val PeSupply = new TableQuery(tag => new PeSupply(tag))
}
