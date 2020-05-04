package models.access
// AUTO-GENERATED Slick data model for table PeConsumelog
trait PeConsumelogTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeConsumelog
    *  @param logid Database column LogID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param username Database column UserName SqlType(VARCHAR), Length(50,true)
    *  @param moduletype Database column ModuleType SqlType(INTEGER)
    *  @param infoid Database column InfoID SqlType(INTEGER), Default(Some(0))
    *  @param point Database column Point SqlType(NUMERIC), Default(Some(0))
    *  @param logtime Database column LogTime SqlType(TIMESTAMP)
    *  @param times Database column Times SqlType(INTEGER), Default(Some(0))
    *  @param incomePayout Database column Income_PayOut SqlType(INTEGER), Default(Some(0))
    *  @param remark Database column Remark SqlType(VARCHAR), Length(255,true)
    *  @param ip Database column IP SqlType(VARCHAR), Length(50,true)
    *  @param inputer Database column Inputer SqlType(VARCHAR), Length(50,true) */
  case class PeConsumelogRow(
    logid: Int,
    username: Option[String],
    moduletype: Option[Int],
    infoid: Option[Int] = Some(0),
    point: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    logtime: Option[java.sql.Timestamp],
    times: Option[Int] = Some(0),
    incomePayout: Option[Int] = Some(0),
    remark: Option[String],
    ip: Option[String],
    inputer: Option[String]
  )

  /** GetResult implicit for fetching PeConsumelogRow objects using plain SQL queries */
  /** Table description of table PE_ConsumeLog. Objects of this class serve as prototypes for rows in queries. */
  class PeConsumelog(_tableTag: Tag) extends profile.api.Table[PeConsumelogRow](_tableTag, "PE_ConsumeLog") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column LogID SqlType(INTEGER), AutoInc, PrimaryKey */
    val logid: Rep[Int] = column[Int]("LogID", O.AutoInc, O.PrimaryKey)

    /** Database column UserName SqlType(VARCHAR), Length(50,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(50, varying = true))

    /** Database column ModuleType SqlType(INTEGER) */
    val moduletype: Rep[Option[Int]] = column[Option[Int]]("ModuleType")

    /** Database column InfoID SqlType(INTEGER), Default(Some(0)) */
    val infoid: Rep[Option[Int]] = column[Option[Int]]("InfoID", O.Default(Some(0)))

    /** Database column Point SqlType(NUMERIC), Default(Some(0)) */
    val point: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Point", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column LogTime SqlType(TIMESTAMP) */
    val logtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LogTime")

    /** Database column Times SqlType(INTEGER), Default(Some(0)) */
    val times: Rep[Option[Int]] = column[Option[Int]]("Times", O.Default(Some(0)))

    /** Database column Income_PayOut SqlType(INTEGER), Default(Some(0)) */
    val incomePayout: Rep[Option[Int]] = column[Option[Int]]("Income_PayOut", O.Default(Some(0)))

    /** Database column Remark SqlType(VARCHAR), Length(255,true) */
    val remark: Rep[Option[String]] = column[Option[String]]("Remark", O.Length(255, varying = true))

    /** Database column IP SqlType(VARCHAR), Length(50,true) */
    val ip: Rep[Option[String]] = column[Option[String]]("IP", O.Length(50, varying = true))

    /** Database column Inputer SqlType(VARCHAR), Length(50,true) */
    val inputer: Rep[Option[String]] = column[Option[String]]("Inputer", O.Length(50, varying = true))

    /** Index over (incomePayout) (database name PE_CONSUMELOG_INCOME_PAYOUT) */
    val index1 = index("PE_CONSUMELOG_INCOME_PAYOUT", incomePayout)

    /** Index over (infoid) (database name PE_CONSUMELOG_INFOID) */
    val index2 = index("PE_CONSUMELOG_INFOID", infoid)

    /** Index over (logtime) (database name PE_CONSUMELOG_LOGTIME) */
    val index3 = index("PE_CONSUMELOG_LOGTIME", logtime)

    /** Index over (moduletype) (database name PE_CONSUMELOG_MODULETYPE) */
    val index4 = index("PE_CONSUMELOG_MODULETYPE", moduletype)

    /** Index over (username) (database name PE_CONSUMELOG_USERNAME) */
    val index5 = index("PE_CONSUMELOG_USERNAME", username)
  }

  /** Collection-like TableQuery object for table PeConsumelog */
  lazy val PeConsumelog = new TableQuery(tag => new PeConsumelog(tag))
}
