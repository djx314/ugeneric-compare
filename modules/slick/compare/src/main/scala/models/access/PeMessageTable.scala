package models.access
// AUTO-GENERATED Slick data model for table PeMessage
trait PeMessageTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeMessage
    *  @param id Database column id SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param sender Database column sender SqlType(VARCHAR), Length(50,true)
    *  @param incept Database column incept SqlType(VARCHAR), Length(50,true)
    *  @param title Database column title SqlType(VARCHAR), Length(100,true)
    *  @param content Database column content SqlType(VARCHAR), Length(16777216,true)
    *  @param flag Database column flag SqlType(INTEGER), Default(Some(0))
    *  @param sendtime Database column sendtime SqlType(TIMESTAMP)
    *  @param delr Database column delR SqlType(INTEGER), Default(0)
    *  @param dels Database column delS SqlType(INTEGER), Default(0)
    *  @param issend Database column isSend SqlType(INTEGER), Default(Some(0)) */
  case class PeMessageRow(
    id: Int,
    sender: Option[String],
    incept: Option[String],
    title: Option[String],
    content: Option[String],
    flag: Option[Int] = Some(0),
    sendtime: Option[java.sql.Timestamp],
    delr: Int = 0,
    dels: Int = 0,
    issend: Option[Int] = Some(0)
  )

  /** GetResult implicit for fetching PeMessageRow objects using plain SQL queries */
  /** Table description of table PE_Message. Objects of this class serve as prototypes for rows in queries. */
  class PeMessage(_tableTag: Tag) extends profile.api.Table[PeMessageRow](_tableTag, "PE_Message") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column id SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)

    /** Database column sender SqlType(VARCHAR), Length(50,true) */
    val sender: Rep[Option[String]] = column[Option[String]]("sender", O.Length(50, varying = true))

    /** Database column incept SqlType(VARCHAR), Length(50,true) */
    val incept: Rep[Option[String]] = column[Option[String]]("incept", O.Length(50, varying = true))

    /** Database column title SqlType(VARCHAR), Length(100,true) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Length(100, varying = true))

    /** Database column content SqlType(VARCHAR), Length(16777216,true) */
    val content: Rep[Option[String]] = column[Option[String]]("content", O.Length(16777216, varying = true))

    /** Database column flag SqlType(INTEGER), Default(Some(0)) */
    val flag: Rep[Option[Int]] = column[Option[Int]]("flag", O.Default(Some(0)))

    /** Database column sendtime SqlType(TIMESTAMP) */
    val sendtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("sendtime")

    /** Database column delR SqlType(INTEGER), Default(0) */
    val delr: Rep[Int] = column[Int]("delR", O.Default(0))

    /** Database column delS SqlType(INTEGER), Default(0) */
    val dels: Rep[Int] = column[Int]("delS", O.Default(0))

    /** Database column isSend SqlType(INTEGER), Default(Some(0)) */
    val issend: Rep[Option[Int]] = column[Option[Int]]("isSend", O.Default(Some(0)))
  }

  /** Collection-like TableQuery object for table PeMessage */
  lazy val PeMessage = new TableQuery(tag => new PeMessage(tag))
}
