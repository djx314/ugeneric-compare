package models.access
// AUTO-GENERATED Slick data model for table PeFavorite
trait PeFavoriteTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeFavorite
   *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param userid Database column UserID SqlType(INTEGER), Default(Some(0))
   *  @param channelid Database column ChannelID SqlType(INTEGER), Default(Some(0))
   *  @param infoid Database column InfoID SqlType(INTEGER), Default(Some(0))
   *  @param dateandtime Database column DateAndTime SqlType(TIMESTAMP) */
  case class PeFavoriteRow(id: Int, userid: Option[Int] = Some(0), channelid: Option[Int] = Some(0), infoid: Option[Int] = Some(0), dateandtime: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching PeFavoriteRow objects using plain SQL queries */

  /** Table description of table PE_Favorite. Objects of this class serve as prototypes for rows in queries. */
  class PeFavorite(_tableTag: Tag) extends profile.api.Table[PeFavoriteRow](_tableTag, "PE_Favorite") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)
    /** Database column UserID SqlType(INTEGER), Default(Some(0)) */
    val userid: Rep[Option[Int]] = column[Option[Int]]("UserID", O.Default(Some(0)))
    /** Database column ChannelID SqlType(INTEGER), Default(Some(0)) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID", O.Default(Some(0)))
    /** Database column InfoID SqlType(INTEGER), Default(Some(0)) */
    val infoid: Rep[Option[Int]] = column[Option[Int]]("InfoID", O.Default(Some(0)))
    /** Database column DateAndTime SqlType(TIMESTAMP) */
    val dateandtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("DateAndTime")

    /** Index over (channelid) (database name PE_FAVORITE_CHANNELID) */
    val index1 = index("PE_FAVORITE_CHANNELID", channelid)
    /** Index over (infoid) (database name PE_FAVORITE_INFOID) */
    val index2 = index("PE_FAVORITE_INFOID", infoid)
    /** Index over (userid) (database name PE_FAVORITE_USERID) */
    val index3 = index("PE_FAVORITE_USERID", userid)
  }
  /** Collection-like TableQuery object for table PeFavorite */
  lazy val PeFavorite = new TableQuery(tag => new PeFavorite(tag))
}
