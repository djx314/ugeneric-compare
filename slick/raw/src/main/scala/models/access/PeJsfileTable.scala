package models.access
// AUTO-GENERATED Slick data model for table PeJsfile
trait PeJsfileTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeJsfile
   *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param channelid Database column ChannelID SqlType(INTEGER)
   *  @param jsname Database column JsName SqlType(VARCHAR), Length(50,true)
   *  @param jsreadme Database column JsReadme SqlType(VARCHAR), Length(200,true)
   *  @param jstype Database column JsType SqlType(INTEGER)
   *  @param contenttype Database column ContentType SqlType(INTEGER), Default(Some(0))
   *  @param jsfilename Database column JsFileName SqlType(VARCHAR), Length(50,true)
   *  @param config Database column Config SqlType(VARCHAR), Length(16777216,true) */
  case class PeJsfileRow(id: Int, channelid: Option[Int], jsname: Option[String], jsreadme: Option[String], jstype: Option[Int], contenttype: Option[Int] = Some(0), jsfilename: Option[String], config: Option[String])
  /** GetResult implicit for fetching PeJsfileRow objects using plain SQL queries */

  /** Table description of table PE_JsFile. Objects of this class serve as prototypes for rows in queries. */
  class PeJsfile(_tableTag: Tag) extends profile.api.Table[PeJsfileRow](_tableTag, "PE_JsFile") {
    def * = (id :: channelid :: jsname :: jsreadme :: jstype :: contenttype :: jsfilename :: config :: HNil).mapTo[PeJsfileRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)
    /** Database column ChannelID SqlType(INTEGER) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID")
    /** Database column JsName SqlType(VARCHAR), Length(50,true) */
    val jsname: Rep[Option[String]] = column[Option[String]]("JsName", O.Length(50,varying=true))
    /** Database column JsReadme SqlType(VARCHAR), Length(200,true) */
    val jsreadme: Rep[Option[String]] = column[Option[String]]("JsReadme", O.Length(200,varying=true))
    /** Database column JsType SqlType(INTEGER) */
    val jstype: Rep[Option[Int]] = column[Option[Int]]("JsType")
    /** Database column ContentType SqlType(INTEGER), Default(Some(0)) */
    val contenttype: Rep[Option[Int]] = column[Option[Int]]("ContentType", O.Default(Some(0)))
    /** Database column JsFileName SqlType(VARCHAR), Length(50,true) */
    val jsfilename: Rep[Option[String]] = column[Option[String]]("JsFileName", O.Length(50,varying=true))
    /** Database column Config SqlType(VARCHAR), Length(16777216,true) */
    val config: Rep[Option[String]] = column[Option[String]]("Config", O.Length(16777216,varying=true))

    /** Index over (channelid) (database name PE_JSFILE_CHANNELID) */
    val index1 = index("PE_JSFILE_CHANNELID", channelid :: HNil)
  }
  /** Collection-like TableQuery object for table PeJsfile */
  lazy val PeJsfile = new TableQuery(tag => new PeJsfile(tag))
}
