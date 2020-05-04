package models.access
// AUTO-GENERATED Slick data model for table PeDownerror
trait PeDownerrorTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeDownerror
    *  @param errorid Database column ErrorID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param channelid Database column ChannelID SqlType(INTEGER), Default(Some(0))
    *  @param infoid Database column InfoID SqlType(INTEGER), Default(Some(0))
    *  @param urlid Database column UrlID SqlType(INTEGER), Default(Some(0))
    *  @param errortimes Database column ErrorTimes SqlType(INTEGER), Default(Some(0)) */
  case class PeDownerrorRow(
    errorid: Int = 0,
    channelid: Option[Int] = Some(0),
    infoid: Option[Int] = Some(0),
    urlid: Option[Int] = Some(0),
    errortimes: Option[Int] = Some(0)
  )

  /** GetResult implicit for fetching PeDownerrorRow objects using plain SQL queries */
  /** Table description of table PE_DownError. Objects of this class serve as prototypes for rows in queries. */
  class PeDownerror(_tableTag: Tag) extends profile.api.Table[PeDownerrorRow](_tableTag, "PE_DownError") {
    def * = (errorid :: channelid :: infoid :: urlid :: errortimes :: HNil).mapTo[PeDownerrorRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ErrorID SqlType(INTEGER), PrimaryKey, Default(0) */
    val errorid: Rep[Int] = column[Int]("ErrorID", O.PrimaryKey, O.Default(0))

    /** Database column ChannelID SqlType(INTEGER), Default(Some(0)) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID", O.Default(Some(0)))

    /** Database column InfoID SqlType(INTEGER), Default(Some(0)) */
    val infoid: Rep[Option[Int]] = column[Option[Int]]("InfoID", O.Default(Some(0)))

    /** Database column UrlID SqlType(INTEGER), Default(Some(0)) */
    val urlid: Rep[Option[Int]] = column[Option[Int]]("UrlID", O.Default(Some(0)))

    /** Database column ErrorTimes SqlType(INTEGER), Default(Some(0)) */
    val errortimes: Rep[Option[Int]] = column[Option[Int]]("ErrorTimes", O.Default(Some(0)))

    /** Index over (channelid) (database name PE_DOWNERROR_CHANNELID) */
    val index1 = index("PE_DOWNERROR_CHANNELID", channelid :: HNil)

    /** Index over (infoid) (database name PE_DOWNERROR_INFOID) */
    val index2 = index("PE_DOWNERROR_INFOID", infoid :: HNil)

    /** Index over (urlid) (database name PE_DOWNERROR_URLID) */
    val index3 = index("PE_DOWNERROR_URLID", urlid :: HNil)
  }

  /** Collection-like TableQuery object for table PeDownerror */
  lazy val PeDownerror = new TableQuery(tag => new PeDownerror(tag))
}
