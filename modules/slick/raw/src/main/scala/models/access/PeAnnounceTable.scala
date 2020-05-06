package models.access
// AUTO-GENERATED Slick data model for table PeAnnounce
trait PeAnnounceTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeAnnounce
   *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param title Database column Title SqlType(VARCHAR), Length(255,true)
   *  @param content Database column Content SqlType(VARCHAR), Length(16777216,true)
   *  @param author Database column Author SqlType(VARCHAR), Length(50,true)
   *  @param dateandtime Database column DateAndTime SqlType(TIMESTAMP)
   *  @param isselected Database column IsSelected SqlType(BOOLEAN)
   *  @param channelid Database column ChannelID SqlType(INTEGER)
   *  @param showtype Database column ShowType SqlType(INTEGER)
   *  @param outtime Database column OutTime SqlType(INTEGER), Default(Some(0)) */
  case class PeAnnounceRow(id: Int, title: Option[String], content: Option[String], author: Option[String], dateandtime: Option[java.sql.Timestamp], isselected: Boolean, channelid: Option[Int], showtype: Option[Int], outtime: Option[Int] = Some(0))
  /** GetResult implicit for fetching PeAnnounceRow objects using plain SQL queries */

  /** Table description of table PE_Announce. Objects of this class serve as prototypes for rows in queries. */
  class PeAnnounce(_tableTag: Tag) extends profile.api.Table[PeAnnounceRow](_tableTag, "PE_Announce") {
    def * = (id :: title :: content :: author :: dateandtime :: isselected :: channelid :: showtype :: outtime :: HNil).mapTo[PeAnnounceRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)
    /** Database column Title SqlType(VARCHAR), Length(255,true) */
    val title: Rep[Option[String]] = column[Option[String]]("Title", O.Length(255,varying=true))
    /** Database column Content SqlType(VARCHAR), Length(16777216,true) */
    val content: Rep[Option[String]] = column[Option[String]]("Content", O.Length(16777216,varying=true))
    /** Database column Author SqlType(VARCHAR), Length(50,true) */
    val author: Rep[Option[String]] = column[Option[String]]("Author", O.Length(50,varying=true))
    /** Database column DateAndTime SqlType(TIMESTAMP) */
    val dateandtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("DateAndTime")
    /** Database column IsSelected SqlType(BOOLEAN) */
    val isselected: Rep[Boolean] = column[Boolean]("IsSelected")
    /** Database column ChannelID SqlType(INTEGER) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID")
    /** Database column ShowType SqlType(INTEGER) */
    val showtype: Rep[Option[Int]] = column[Option[Int]]("ShowType")
    /** Database column OutTime SqlType(INTEGER), Default(Some(0)) */
    val outtime: Rep[Option[Int]] = column[Option[Int]]("OutTime", O.Default(Some(0)))

    /** Index over (channelid) (database name PE_ANNOUNCE_CHANNELID) */
    val index1 = index("PE_ANNOUNCE_CHANNELID", channelid :: HNil)
  }
  /** Collection-like TableQuery object for table PeAnnounce */
  lazy val PeAnnounce = new TableQuery(tag => new PeAnnounce(tag))
}
