package models.access
// AUTO-GENERATED Slick data model for table PeSpacecomment
trait PeSpacecommentTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeSpacecomment
    *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param blogid Database column BlogID SqlType(INTEGER), Default(Some(0))
    *  @param itemid Database column ItemID SqlType(INTEGER), Default(Some(0))
    *  @param `type` Database column Type SqlType(SMALLINT), Default(Some(0))
    *  @param uname Database column Uname SqlType(VARCHAR), Length(50,true)
    *  @param title Database column Title SqlType(VARCHAR), Length(50,true)
    *  @param content Database column Content SqlType(VARCHAR), Length(16777216,true)
    *  @param datetime Database column Datetime SqlType(TIMESTAMP) */
  case class PeSpacecommentRow(
    id: Int,
    blogid: Option[Int] = Some(0),
    itemid: Option[Int] = Some(0),
    `type`: Option[Short] = Some(0),
    uname: Option[String],
    title: String,
    content: Option[String],
    datetime: java.sql.Timestamp
  )

  /** GetResult implicit for fetching PeSpacecommentRow objects using plain SQL queries */
  /** Table description of table PE_SpaceComment. Objects of this class serve as prototypes for rows in queries.
    *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class PeSpacecomment(_tableTag: Tag) extends profile.api.Table[PeSpacecommentRow](_tableTag, "PE_SpaceComment") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)

    /** Database column BlogID SqlType(INTEGER), Default(Some(0)) */
    val blogid: Rep[Option[Int]] = column[Option[Int]]("BlogID", O.Default(Some(0)))

    /** Database column ItemID SqlType(INTEGER), Default(Some(0)) */
    val itemid: Rep[Option[Int]] = column[Option[Int]]("ItemID", O.Default(Some(0)))

    /** Database column Type SqlType(SMALLINT), Default(Some(0))
      *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Option[Short]] = column[Option[Short]]("Type", O.Default(Some(0)))

    /** Database column Uname SqlType(VARCHAR), Length(50,true) */
    val uname: Rep[Option[String]] = column[Option[String]]("Uname", O.Length(50, varying = true))

    /** Database column Title SqlType(VARCHAR), Length(50,true) */
    val title: Rep[String] = column[String]("Title", O.Length(50, varying = true))

    /** Database column Content SqlType(VARCHAR), Length(16777216,true) */
    val content: Rep[Option[String]] = column[Option[String]]("Content", O.Length(16777216, varying = true))

    /** Database column Datetime SqlType(TIMESTAMP) */
    val datetime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("Datetime")

    /** Index over (blogid) (database name PE_SPACECOMMENT_ITEMID) */
    val index1 = index("PE_SPACECOMMENT_ITEMID", blogid)

    /** Index over (`type`) (database name PE_SPACECOMMENT_TYPEID) */
    val index2 = index("PE_SPACECOMMENT_TYPEID", `type`)

    /** Index over (itemid) (database name PE_SPACECOMMENT_USERID1) */
    val index3 = index("PE_SPACECOMMENT_USERID1", itemid)
  }

  /** Collection-like TableQuery object for table PeSpacecomment */
  lazy val PeSpacecomment = new TableQuery(tag => new PeSpacecomment(tag))
}
