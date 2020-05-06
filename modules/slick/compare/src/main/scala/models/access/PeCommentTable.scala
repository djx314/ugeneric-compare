package models.access
// AUTO-GENERATED Slick data model for table PeComment
trait PeCommentTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeComment
   *  @param commentid Database column CommentID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param moduletype Database column ModuleType SqlType(INTEGER)
   *  @param infoid Database column InfoID SqlType(INTEGER)
   *  @param usertype Database column UserType SqlType(INTEGER)
   *  @param username Database column UserName SqlType(VARCHAR), Length(20,true)
   *  @param sex Database column Sex SqlType(VARCHAR), Length(10,true)
   *  @param oicq Database column OICQ SqlType(VARCHAR), Length(20,true)
   *  @param msn Database column MSN SqlType(VARCHAR), Length(100,true)
   *  @param icq Database column ICQ SqlType(VARCHAR), Length(20,true)
   *  @param email Database column Email SqlType(VARCHAR), Length(100,true)
   *  @param homepage Database column Homepage SqlType(VARCHAR), Length(200,true)
   *  @param ip Database column IP SqlType(VARCHAR), Length(15,true)
   *  @param writetime Database column WriteTime SqlType(TIMESTAMP)
   *  @param score Database column Score SqlType(VARCHAR), Length(255,true)
   *  @param content Database column Content SqlType(VARCHAR), Length(16777216,true)
   *  @param replyname Database column ReplyName SqlType(VARCHAR), Length(20,true)
   *  @param replycontent Database column ReplyContent SqlType(VARCHAR), Length(16777216,true)
   *  @param replytime Database column ReplyTime SqlType(TIMESTAMP)
   *  @param passed Database column Passed SqlType(BOOLEAN)
   *  @param support Database column Support SqlType(INTEGER)
   *  @param opposed Database column Opposed SqlType(INTEGER) */
  case class PeCommentRow(commentid: Int, moduletype: Option[Int], infoid: Int, usertype: Option[Int], username: String, sex: Option[String], oicq: Option[String], msn: Option[String], icq: Option[String], email: Option[String], homepage: Option[String], ip: Option[String], writetime: java.sql.Timestamp, score: String, content: Option[String], replyname: Option[String], replycontent: Option[String], replytime: Option[java.sql.Timestamp], passed: Boolean, support: Option[Int], opposed: Option[Int])
  /** GetResult implicit for fetching PeCommentRow objects using plain SQL queries */

  /** Table description of table PE_Comment. Objects of this class serve as prototypes for rows in queries. */
  class PeComment(_tableTag: Tag) extends profile.api.Table[PeCommentRow](_tableTag, "PE_Comment") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column CommentID SqlType(INTEGER), AutoInc, PrimaryKey */
    val commentid: Rep[Int] = column[Int]("CommentID", O.AutoInc, O.PrimaryKey)
    /** Database column ModuleType SqlType(INTEGER) */
    val moduletype: Rep[Option[Int]] = column[Option[Int]]("ModuleType")
    /** Database column InfoID SqlType(INTEGER) */
    val infoid: Rep[Int] = column[Int]("InfoID")
    /** Database column UserType SqlType(INTEGER) */
    val usertype: Rep[Option[Int]] = column[Option[Int]]("UserType")
    /** Database column UserName SqlType(VARCHAR), Length(20,true) */
    val username: Rep[String] = column[String]("UserName", O.Length(20,varying=true))
    /** Database column Sex SqlType(VARCHAR), Length(10,true) */
    val sex: Rep[Option[String]] = column[Option[String]]("Sex", O.Length(10,varying=true))
    /** Database column OICQ SqlType(VARCHAR), Length(20,true) */
    val oicq: Rep[Option[String]] = column[Option[String]]("OICQ", O.Length(20,varying=true))
    /** Database column MSN SqlType(VARCHAR), Length(100,true) */
    val msn: Rep[Option[String]] = column[Option[String]]("MSN", O.Length(100,varying=true))
    /** Database column ICQ SqlType(VARCHAR), Length(20,true) */
    val icq: Rep[Option[String]] = column[Option[String]]("ICQ", O.Length(20,varying=true))
    /** Database column Email SqlType(VARCHAR), Length(100,true) */
    val email: Rep[Option[String]] = column[Option[String]]("Email", O.Length(100,varying=true))
    /** Database column Homepage SqlType(VARCHAR), Length(200,true) */
    val homepage: Rep[Option[String]] = column[Option[String]]("Homepage", O.Length(200,varying=true))
    /** Database column IP SqlType(VARCHAR), Length(15,true) */
    val ip: Rep[Option[String]] = column[Option[String]]("IP", O.Length(15,varying=true))
    /** Database column WriteTime SqlType(TIMESTAMP) */
    val writetime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("WriteTime")
    /** Database column Score SqlType(VARCHAR), Length(255,true) */
    val score: Rep[String] = column[String]("Score", O.Length(255,varying=true))
    /** Database column Content SqlType(VARCHAR), Length(16777216,true) */
    val content: Rep[Option[String]] = column[Option[String]]("Content", O.Length(16777216,varying=true))
    /** Database column ReplyName SqlType(VARCHAR), Length(20,true) */
    val replyname: Rep[Option[String]] = column[Option[String]]("ReplyName", O.Length(20,varying=true))
    /** Database column ReplyContent SqlType(VARCHAR), Length(16777216,true) */
    val replycontent: Rep[Option[String]] = column[Option[String]]("ReplyContent", O.Length(16777216,varying=true))
    /** Database column ReplyTime SqlType(TIMESTAMP) */
    val replytime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("ReplyTime")
    /** Database column Passed SqlType(BOOLEAN) */
    val passed: Rep[Boolean] = column[Boolean]("Passed")
    /** Database column Support SqlType(INTEGER) */
    val support: Rep[Option[Int]] = column[Option[Int]]("Support")
    /** Database column Opposed SqlType(INTEGER) */
    val opposed: Rep[Option[Int]] = column[Option[Int]]("Opposed")

    /** Index over (infoid) (database name PE_COMMENT_INFOID) */
    val index1 = index("PE_COMMENT_INFOID", infoid)
    /** Index over (moduletype) (database name PE_COMMENT_MODULETYPE) */
    val index2 = index("PE_COMMENT_MODULETYPE", moduletype)
    /** Index over (passed) (database name PE_COMMENT_PASSED) */
    val index3 = index("PE_COMMENT_PASSED", passed)
  }
  /** Collection-like TableQuery object for table PeComment */
  lazy val PeComment = new TableQuery(tag => new PeComment(tag))
}
