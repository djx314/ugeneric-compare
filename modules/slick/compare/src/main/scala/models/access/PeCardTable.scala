package models.access
// AUTO-GENERATED Slick data model for table PeCard
trait PeCardTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeCard
    *  @param cardid Database column CardID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param cardtype Database column CardType SqlType(INTEGER), Default(Some(0))
    *  @param productid Database column ProductID SqlType(INTEGER), Default(Some(0))
    *  @param cardnum Database column CardNum SqlType(VARCHAR), Length(30,true)
    *  @param password Database column Password SqlType(VARCHAR), Length(50,true)
    *  @param agentname Database column AgentName SqlType(VARCHAR), Length(100,true)
    *  @param money Database column Money SqlType(DECIMAL), Default(Some(0))
    *  @param validnum Database column ValidNum SqlType(INTEGER), Default(Some(0))
    *  @param validunit Database column ValidUnit SqlType(INTEGER), Default(Some(0))
    *  @param enddate Database column EndDate SqlType(TIMESTAMP)
    *  @param username Database column UserName SqlType(VARCHAR), Length(50,true)
    *  @param usetime Database column UseTime SqlType(TIMESTAMP)
    *  @param createtime Database column CreateTime SqlType(TIMESTAMP)
    *  @param orderformitemid Database column OrderFormItemID SqlType(INTEGER), Default(Some(0)) */
  case class PeCardRow(
    cardid: Int,
    cardtype: Option[Int] = Some(0),
    productid: Option[Int] = Some(0),
    cardnum: Option[String],
    password: Option[String],
    agentname: Option[String],
    money: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    validnum: Option[Int] = Some(0),
    validunit: Option[Int] = Some(0),
    enddate: Option[java.sql.Timestamp],
    username: Option[String],
    usetime: Option[java.sql.Timestamp],
    createtime: Option[java.sql.Timestamp],
    orderformitemid: Option[Int] = Some(0)
  )

  /** GetResult implicit for fetching PeCardRow objects using plain SQL queries */
  /** Table description of table PE_Card. Objects of this class serve as prototypes for rows in queries. */
  class PeCard(_tableTag: Tag) extends profile.api.Table[PeCardRow](_tableTag, "PE_Card") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column CardID SqlType(INTEGER), AutoInc, PrimaryKey */
    val cardid: Rep[Int] = column[Int]("CardID", O.AutoInc, O.PrimaryKey)

    /** Database column CardType SqlType(INTEGER), Default(Some(0)) */
    val cardtype: Rep[Option[Int]] = column[Option[Int]]("CardType", O.Default(Some(0)))

    /** Database column ProductID SqlType(INTEGER), Default(Some(0)) */
    val productid: Rep[Option[Int]] = column[Option[Int]]("ProductID", O.Default(Some(0)))

    /** Database column CardNum SqlType(VARCHAR), Length(30,true) */
    val cardnum: Rep[Option[String]] = column[Option[String]]("CardNum", O.Length(30, varying = true))

    /** Database column Password SqlType(VARCHAR), Length(50,true) */
    val password: Rep[Option[String]] = column[Option[String]]("Password", O.Length(50, varying = true))

    /** Database column AgentName SqlType(VARCHAR), Length(100,true) */
    val agentname: Rep[Option[String]] = column[Option[String]]("AgentName", O.Length(100, varying = true))

    /** Database column Money SqlType(DECIMAL), Default(Some(0)) */
    val money: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Money", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column ValidNum SqlType(INTEGER), Default(Some(0)) */
    val validnum: Rep[Option[Int]] = column[Option[Int]]("ValidNum", O.Default(Some(0)))

    /** Database column ValidUnit SqlType(INTEGER), Default(Some(0)) */
    val validunit: Rep[Option[Int]] = column[Option[Int]]("ValidUnit", O.Default(Some(0)))

    /** Database column EndDate SqlType(TIMESTAMP) */
    val enddate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EndDate")

    /** Database column UserName SqlType(VARCHAR), Length(50,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(50, varying = true))

    /** Database column UseTime SqlType(TIMESTAMP) */
    val usetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UseTime")

    /** Database column CreateTime SqlType(TIMESTAMP) */
    val createtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CreateTime")

    /** Database column OrderFormItemID SqlType(INTEGER), Default(Some(0)) */
    val orderformitemid: Rep[Option[Int]] = column[Option[Int]]("OrderFormItemID", O.Default(Some(0)))

    /** Index over (cardnum) (database name PE_CARD_CARDNUM) */
    val index1 = index("PE_CARD_CARDNUM", cardnum)

    /** Index over (password) (database name PE_CARD_CARDPASSWORD) */
    val index2 = index("PE_CARD_CARDPASSWORD", password)

    /** Index over (cardtype) (database name PE_CARD_CARDTYPE) */
    val index3 = index("PE_CARD_CARDTYPE", cardtype)

    /** Index over (orderformitemid) (database name PE_CARD_ORDERFORMITEMID) */
    val index4 = index("PE_CARD_ORDERFORMITEMID", orderformitemid)

    /** Index over (productid) (database name PE_CARD_PRODUCTID) */
    val index5 = index("PE_CARD_PRODUCTID", productid)

    /** Index over (validnum) (database name PE_CARD_VALIDNUM) */
    val index6 = index("PE_CARD_VALIDNUM", validnum)
  }

  /** Collection-like TableQuery object for table PeCard */
  lazy val PeCard = new TableQuery(tag => new PeCard(tag))
}
