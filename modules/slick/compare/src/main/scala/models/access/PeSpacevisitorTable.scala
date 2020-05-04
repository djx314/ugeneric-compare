package models.access
// AUTO-GENERATED Slick data model for table PeSpacevisitor
trait PeSpacevisitorTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeSpacevisitor
    *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param blogid Database column BlogID SqlType(INTEGER), Default(Some(0))
    *  @param userid Database column UserID SqlType(INTEGER), Default(0)
    *  @param username Database column UserName SqlType(VARCHAR), Length(255,true)
    *  @param datetime Database column Datetime SqlType(TIMESTAMP)
    *  @param num Database column num SqlType(INTEGER), Default(Some(0)) */
  case class PeSpacevisitorRow(
    id: Int,
    blogid: Option[Int] = Some(0),
    userid: Int = 0,
    username: Option[String],
    datetime: java.sql.Timestamp,
    num: Option[Int] = Some(0)
  )

  /** GetResult implicit for fetching PeSpacevisitorRow objects using plain SQL queries */
  /** Table description of table PE_SpaceVisitor. Objects of this class serve as prototypes for rows in queries. */
  class PeSpacevisitor(_tableTag: Tag) extends profile.api.Table[PeSpacevisitorRow](_tableTag, "PE_SpaceVisitor") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)

    /** Database column BlogID SqlType(INTEGER), Default(Some(0)) */
    val blogid: Rep[Option[Int]] = column[Option[Int]]("BlogID", O.Default(Some(0)))

    /** Database column UserID SqlType(INTEGER), Default(0) */
    val userid: Rep[Int] = column[Int]("UserID", O.Default(0))

    /** Database column UserName SqlType(VARCHAR), Length(255,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(255, varying = true))

    /** Database column Datetime SqlType(TIMESTAMP) */
    val datetime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("Datetime")

    /** Database column num SqlType(INTEGER), Default(Some(0)) */
    val num: Rep[Option[Int]] = column[Option[Int]]("num", O.Default(Some(0)))

    /** Index over (blogid) (database name PE_SPACEVISITOR_BLOGID) */
    val index1 = index("PE_SPACEVISITOR_BLOGID", blogid)

    /** Index over (num) (database name PE_SPACEVISITOR_NUM) */
    val index2 = index("PE_SPACEVISITOR_NUM", num)

    /** Index over (userid) (database name PE_SPACEVISITOR_USERID) */
    val index3 = index("PE_SPACEVISITOR_USERID", userid)

    /** Index over (username) (database name PE_SPACEVISITOR_USERID1) */
    val index4 = index("PE_SPACEVISITOR_USERID1", username)
  }

  /** Collection-like TableQuery object for table PeSpacevisitor */
  lazy val PeSpacevisitor = new TableQuery(tag => new PeSpacevisitor(tag))
}
