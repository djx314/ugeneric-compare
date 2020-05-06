package models.access
// AUTO-GENERATED Slick data model for table PeKeylink
trait PeKeylinkTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeKeylink
   *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param channelid Database column ChannelID SqlType(SMALLINT)
   *  @param source Database column Source SqlType(VARCHAR), Length(255,true)
   *  @param replacetext Database column ReplaceText SqlType(VARCHAR), Length(255,true)
   *  @param isuse Database column isUse SqlType(SMALLINT), Default(Some(1))
   *  @param linktype Database column LinkType SqlType(SMALLINT), Default(Some(0))
   *  @param opentype Database column OpenType SqlType(SMALLINT), Default(Some(0))
   *  @param replacetype Database column ReplaceType SqlType(SMALLINT), Default(Some(0))
   *  @param priority Database column Priority SqlType(SMALLINT), Default(Some(1)) */
  case class PeKeylinkRow(id: Int, channelid: Option[Short], source: Option[String], replacetext: Option[String], isuse: Option[Short] = Some(1), linktype: Option[Short] = Some(0), opentype: Option[Short] = Some(0), replacetype: Option[Short] = Some(0), priority: Option[Short] = Some(1))
  /** GetResult implicit for fetching PeKeylinkRow objects using plain SQL queries */

  /** Table description of table PE_KeyLink. Objects of this class serve as prototypes for rows in queries. */
  class PeKeylink(_tableTag: Tag) extends profile.api.Table[PeKeylinkRow](_tableTag, "PE_KeyLink") {
    def * = (id :: channelid :: source :: replacetext :: isuse :: linktype :: opentype :: replacetype :: priority :: HNil).mapTo[PeKeylinkRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)
    /** Database column ChannelID SqlType(SMALLINT) */
    val channelid: Rep[Option[Short]] = column[Option[Short]]("ChannelID")
    /** Database column Source SqlType(VARCHAR), Length(255,true) */
    val source: Rep[Option[String]] = column[Option[String]]("Source", O.Length(255,varying=true))
    /** Database column ReplaceText SqlType(VARCHAR), Length(255,true) */
    val replacetext: Rep[Option[String]] = column[Option[String]]("ReplaceText", O.Length(255,varying=true))
    /** Database column isUse SqlType(SMALLINT), Default(Some(1)) */
    val isuse: Rep[Option[Short]] = column[Option[Short]]("isUse", O.Default(Some(1)))
    /** Database column LinkType SqlType(SMALLINT), Default(Some(0)) */
    val linktype: Rep[Option[Short]] = column[Option[Short]]("LinkType", O.Default(Some(0)))
    /** Database column OpenType SqlType(SMALLINT), Default(Some(0)) */
    val opentype: Rep[Option[Short]] = column[Option[Short]]("OpenType", O.Default(Some(0)))
    /** Database column ReplaceType SqlType(SMALLINT), Default(Some(0)) */
    val replacetype: Rep[Option[Short]] = column[Option[Short]]("ReplaceType", O.Default(Some(0)))
    /** Database column Priority SqlType(SMALLINT), Default(Some(1)) */
    val priority: Rep[Option[Short]] = column[Option[Short]]("Priority", O.Default(Some(1)))

    /** Index over (channelid) (database name PE_KEYLINK_CHANNELID) */
    val index1 = index("PE_KEYLINK_CHANNELID", channelid :: HNil)
    /** Index over (replacetype) (database name PE_KEYLINK_REPLACENUM) */
    val index2 = index("PE_KEYLINK_REPLACENUM", replacetype :: HNil)
  }
  /** Collection-like TableQuery object for table PeKeylink */
  lazy val PeKeylink = new TableQuery(tag => new PeKeylink(tag))
}
