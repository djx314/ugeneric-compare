package models.access
// AUTO-GENERATED Slick data model for table PeFriend
trait PeFriendTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeFriend
    *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param username Database column UserName SqlType(VARCHAR), Length(20,true)
    *  @param friendname Database column FriendName SqlType(VARCHAR), Length(20,true)
    *  @param addtime Database column AddTime SqlType(TIMESTAMP)
    *  @param groupid Database column GroupID SqlType(SMALLINT), Default(Some(0)) */
  case class PeFriendRow(id: Int, username: Option[String], friendname: Option[String], addtime: Option[java.sql.Timestamp], groupid: Option[Short] = Some(0))

  /** GetResult implicit for fetching PeFriendRow objects using plain SQL queries */
  /** Table description of table PE_Friend. Objects of this class serve as prototypes for rows in queries. */
  class PeFriend(_tableTag: Tag) extends profile.api.Table[PeFriendRow](_tableTag, "PE_Friend") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)

    /** Database column UserName SqlType(VARCHAR), Length(20,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(20, varying = true))

    /** Database column FriendName SqlType(VARCHAR), Length(20,true) */
    val friendname: Rep[Option[String]] = column[Option[String]]("FriendName", O.Length(20, varying = true))

    /** Database column AddTime SqlType(TIMESTAMP) */
    val addtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("AddTime")

    /** Database column GroupID SqlType(SMALLINT), Default(Some(0)) */
    val groupid: Rep[Option[Short]] = column[Option[Short]]("GroupID", O.Default(Some(0)))

    /** Index over (groupid) (database name PE_FRIEND_GROUPID) */
    val index1 = index("PE_FRIEND_GROUPID", groupid)

    /** Index over (addtime) (database name PE_FRIEND_ORDERID) */
    val index2 = index("PE_FRIEND_ORDERID", addtime)
  }

  /** Collection-like TableQuery object for table PeFriend */
  lazy val PeFriend = new TableQuery(tag => new PeFriend(tag))
}
