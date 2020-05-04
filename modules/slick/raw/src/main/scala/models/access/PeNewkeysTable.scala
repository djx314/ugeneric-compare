package models.access
// AUTO-GENERATED Slick data model for table PeNewkeys
trait PeNewkeysTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeNewkeys
    *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param channelid Database column ChannelID SqlType(SMALLINT), Default(Some(0))
    *  @param keytext Database column KeyText SqlType(VARCHAR), Length(100,true)
    *  @param hits Database column Hits SqlType(INTEGER), Default(Some(0))
    *  @param lastusetime Database column LastUseTime SqlType(TIMESTAMP) */
  case class PeNewkeysRow(id: Int, channelid: Option[Short] = Some(0), keytext: Option[String], hits: Option[Int] = Some(0), lastusetime: Option[java.sql.Timestamp])

  /** GetResult implicit for fetching PeNewkeysRow objects using plain SQL queries */
  /** Table description of table PE_NewKeys. Objects of this class serve as prototypes for rows in queries. */
  class PeNewkeys(_tableTag: Tag) extends profile.api.Table[PeNewkeysRow](_tableTag, "PE_NewKeys") {
    def * = (id :: channelid :: keytext :: hits :: lastusetime :: HNil).mapTo[PeNewkeysRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)

    /** Database column ChannelID SqlType(SMALLINT), Default(Some(0)) */
    val channelid: Rep[Option[Short]] = column[Option[Short]]("ChannelID", O.Default(Some(0)))

    /** Database column KeyText SqlType(VARCHAR), Length(100,true) */
    val keytext: Rep[Option[String]] = column[Option[String]]("KeyText", O.Length(100, varying = true))

    /** Database column Hits SqlType(INTEGER), Default(Some(0)) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits", O.Default(Some(0)))

    /** Database column LastUseTime SqlType(TIMESTAMP) */
    val lastusetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastUseTime")

    /** Index over (channelid) (database name PE_NEWKEYS_CHANNELID) */
    val index1 = index("PE_NEWKEYS_CHANNELID", channelid :: HNil)

    /** Index over (keytext) (database name PE_NEWKEYS_KEYTEXT) */
    val index2 = index("PE_NEWKEYS_KEYTEXT", keytext :: HNil)
  }

  /** Collection-like TableQuery object for table PeNewkeys */
  lazy val PeNewkeys = new TableQuery(tag => new PeNewkeys(tag))
}
