package models.access
// AUTO-GENERATED Slick data model for table PeMailchannel
trait PeMailchannelTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeMailchannel
    *  @param channelid Database column ChannelID SqlType(INTEGER), PrimaryKey
    *  @param userid Database column UserID SqlType(VARCHAR), Length(255,true)
    *  @param arrclass Database column arrClass SqlType(VARCHAR), Length(255,true)
    *  @param sendnum Database column SendNum SqlType(INTEGER)
    *  @param isuse Database column IsUse SqlType(BOOLEAN) */
  case class PeMailchannelRow(channelid: Int, userid: Option[String], arrclass: Option[String], sendnum: Option[Int], isuse: Option[Boolean])

  /** GetResult implicit for fetching PeMailchannelRow objects using plain SQL queries */
  /** Table description of table PE_MailChannel. Objects of this class serve as prototypes for rows in queries. */
  class PeMailchannel(_tableTag: Tag) extends profile.api.Table[PeMailchannelRow](_tableTag, "PE_MailChannel") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ChannelID SqlType(INTEGER), PrimaryKey */
    val channelid: Rep[Int] = column[Int]("ChannelID", O.PrimaryKey)

    /** Database column UserID SqlType(VARCHAR), Length(255,true) */
    val userid: Rep[Option[String]] = column[Option[String]]("UserID", O.Length(255, varying = true))

    /** Database column arrClass SqlType(VARCHAR), Length(255,true) */
    val arrclass: Rep[Option[String]] = column[Option[String]]("arrClass", O.Length(255, varying = true))

    /** Database column SendNum SqlType(INTEGER) */
    val sendnum: Rep[Option[Int]] = column[Option[Int]]("SendNum")

    /** Database column IsUse SqlType(BOOLEAN) */
    val isuse: Rep[Option[Boolean]] = column[Option[Boolean]]("IsUse")
  }

  /** Collection-like TableQuery object for table PeMailchannel */
  lazy val PeMailchannel = new TableQuery(tag => new PeMailchannel(tag))
}
