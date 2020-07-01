package models.access
// AUTO-GENERATED Slick data model for table PeLog
trait PeLogTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeLog
   *  @param logid Database column LogID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param logtype Database column LogType SqlType(INTEGER), Default(Some(0))
   *  @param channelid Database column ChannelID SqlType(INTEGER), Default(Some(0))
   *  @param logtime Database column LogTime SqlType(TIMESTAMP)
   *  @param username Database column UserName SqlType(VARCHAR), Length(50,true)
   *  @param userip Database column UserIP SqlType(VARCHAR), Length(15,true)
   *  @param logcontent Database column LogContent SqlType(VARCHAR), Length(255,true)
   *  @param scriptname Database column ScriptName SqlType(VARCHAR), Length(255,true)
   *  @param poststring Database column PostString SqlType(VARCHAR), Length(16777216,true) */
  case class PeLogRow(logid: Int, logtype: Option[Int] = Some(0), channelid: Option[Int] = Some(0), logtime: Option[java.sql.Timestamp], username: Option[String], userip: Option[String], logcontent: Option[String], scriptname: Option[String], poststring: Option[String])
  /** GetResult implicit for fetching PeLogRow objects using plain SQL queries */

  /** Table description of table PE_Log. Objects of this class serve as prototypes for rows in queries. */
  class PeLog(_tableTag: Tag) extends profile.api.Table[PeLogRow](_tableTag, "PE_Log") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(implicit e => _.mapWithTable(this))
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column LogID SqlType(INTEGER), AutoInc, PrimaryKey */
    val logid: Rep[Int] = column[Int]("LogID", O.AutoInc, O.PrimaryKey)
    /** Database column LogType SqlType(INTEGER), Default(Some(0)) */
    val logtype: Rep[Option[Int]] = column[Option[Int]]("LogType", O.Default(Some(0)))
    /** Database column ChannelID SqlType(INTEGER), Default(Some(0)) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID", O.Default(Some(0)))
    /** Database column LogTime SqlType(TIMESTAMP) */
    val logtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LogTime")
    /** Database column UserName SqlType(VARCHAR), Length(50,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(50,varying=true))
    /** Database column UserIP SqlType(VARCHAR), Length(15,true) */
    val userip: Rep[Option[String]] = column[Option[String]]("UserIP", O.Length(15,varying=true))
    /** Database column LogContent SqlType(VARCHAR), Length(255,true) */
    val logcontent: Rep[Option[String]] = column[Option[String]]("LogContent", O.Length(255,varying=true))
    /** Database column ScriptName SqlType(VARCHAR), Length(255,true) */
    val scriptname: Rep[Option[String]] = column[Option[String]]("ScriptName", O.Length(255,varying=true))
    /** Database column PostString SqlType(VARCHAR), Length(16777216,true) */
    val poststring: Rep[Option[String]] = column[Option[String]]("PostString", O.Length(16777216,varying=true))

    /** Index over (channelid) (database name PE_LOG_CHANNELID) */
    val index1 = index("PE_LOG_CHANNELID", channelid)
  }
  /** Collection-like TableQuery object for table PeLog */
  lazy val PeLog = new TableQuery(tag => new PeLog(tag))
}
