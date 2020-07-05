package models.access
// AUTO-GENERATED Slick data model for table PeRechargelog
trait PeRechargelogTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeRechargelog
   *  @param logid Database column LogID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param username Database column UserName SqlType(VARCHAR), Length(50,true)
   *  @param validnum Database column ValidNum SqlType(INTEGER), Default(Some(0))
   *  @param validunit Database column ValidUnit SqlType(INTEGER), Default(Some(0))
   *  @param incomePayout Database column Income_Payout SqlType(INTEGER), Default(Some(0))
   *  @param logtime Database column LogTime SqlType(TIMESTAMP)
   *  @param remark Database column Remark SqlType(VARCHAR), Length(255,true)
   *  @param ip Database column IP SqlType(VARCHAR), Length(20,true)
   *  @param inputer Database column Inputer SqlType(VARCHAR), Length(50,true) */
  case class PeRechargelogRow(logid: Int, username: Option[String], validnum: Option[Int] = Some(0), validunit: Option[Int] = Some(0), incomePayout: Option[Int] = Some(0), logtime: Option[java.sql.Timestamp], remark: Option[String], ip: Option[String], inputer: Option[String])
  /** GetResult implicit for fetching PeRechargelogRow objects using plain SQL queries */

  /** Table description of table PE_RechargeLog. Objects of this class serve as prototypes for rows in queries. */
  class PeRechargelog(_tableTag: Tag) extends profile.api.Table[PeRechargelogRow](_tableTag, "PE_RechargeLog") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column LogID SqlType(INTEGER), AutoInc, PrimaryKey */
    val logid: Rep[Int] = column[Int]("LogID", O.AutoInc, O.PrimaryKey)
    /** Database column UserName SqlType(VARCHAR), Length(50,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(50,varying=true))
    /** Database column ValidNum SqlType(INTEGER), Default(Some(0)) */
    val validnum: Rep[Option[Int]] = column[Option[Int]]("ValidNum", O.Default(Some(0)))
    /** Database column ValidUnit SqlType(INTEGER), Default(Some(0)) */
    val validunit: Rep[Option[Int]] = column[Option[Int]]("ValidUnit", O.Default(Some(0)))
    /** Database column Income_Payout SqlType(INTEGER), Default(Some(0)) */
    val incomePayout: Rep[Option[Int]] = column[Option[Int]]("Income_Payout", O.Default(Some(0)))
    /** Database column LogTime SqlType(TIMESTAMP) */
    val logtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LogTime")
    /** Database column Remark SqlType(VARCHAR), Length(255,true) */
    val remark: Rep[Option[String]] = column[Option[String]]("Remark", O.Length(255,varying=true))
    /** Database column IP SqlType(VARCHAR), Length(20,true) */
    val ip: Rep[Option[String]] = column[Option[String]]("IP", O.Length(20,varying=true))
    /** Database column Inputer SqlType(VARCHAR), Length(50,true) */
    val inputer: Rep[Option[String]] = column[Option[String]]("Inputer", O.Length(50,varying=true))

    /** Index over (username) (database name PE_RECHARGELOG_USERNAME) */
    val index1 = index("PE_RECHARGELOG_USERNAME", username)
    /** Index over (validnum) (database name PE_RECHARGELOG_VALIDNUM) */
    val index2 = index("PE_RECHARGELOG_VALIDNUM", validnum)
  }
  /** Collection-like TableQuery object for table PeRechargelog */
  lazy val PeRechargelog = new TableQuery(tag => new PeRechargelog(tag))
}
