package models.access
// AUTO-GENERATED Slick data model for table PeCopyfrom
trait PeCopyfromTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeCopyfrom
   *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param channelid Database column ChannelID SqlType(SMALLINT), Default(Some(0))
   *  @param sourcename Database column SourceName SqlType(VARCHAR), Length(50,true)
   *  @param photo Database column Photo SqlType(VARCHAR), Length(255,true)
   *  @param intro Database column Intro SqlType(VARCHAR), Length(16777216,true)
   *  @param address Database column Address SqlType(VARCHAR), Length(50,true)
   *  @param tel Database column Tel SqlType(VARCHAR), Length(50,true)
   *  @param fax Database column Fax SqlType(VARCHAR), Length(50,true)
   *  @param mail Database column Mail SqlType(VARCHAR), Length(50,true)
   *  @param zipcode Database column ZipCode SqlType(VARCHAR), Length(50,true)
   *  @param homepage Database column HomePage SqlType(VARCHAR), Length(50,true)
   *  @param email Database column Email SqlType(VARCHAR), Length(50,true)
   *  @param qq Database column QQ SqlType(INTEGER), Default(Some(0))
   *  @param contactername Database column ContacterName SqlType(VARCHAR), Length(50,true)
   *  @param sourcetype Database column SourceType SqlType(SMALLINT), Default(Some(0))
   *  @param passed Database column Passed SqlType(BOOLEAN)
   *  @param ontop Database column onTop SqlType(BOOLEAN)
   *  @param iselite Database column IsElite SqlType(BOOLEAN)
   *  @param hits Database column Hits SqlType(INTEGER), Default(Some(0))
   *  @param lastusetime Database column LastUseTime SqlType(TIMESTAMP) */
  case class PeCopyfromRow(id: Int, channelid: Option[Short] = Some(0), sourcename: Option[String], photo: Option[String], intro: Option[String], address: Option[String], tel: Option[String], fax: Option[String], mail: Option[String], zipcode: Option[String], homepage: Option[String], email: Option[String], qq: Option[Int] = Some(0), contactername: Option[String], sourcetype: Option[Short] = Some(0), passed: Option[Boolean], ontop: Option[Boolean], iselite: Option[Boolean], hits: Option[Int] = Some(0), lastusetime: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching PeCopyfromRow objects using plain SQL queries */

  /** Table description of table PE_CopyFrom. Objects of this class serve as prototypes for rows in queries. */
  class PeCopyfrom(_tableTag: Tag) extends profile.api.Table[PeCopyfromRow](_tableTag, "PE_CopyFrom") {
    def * = (id :: channelid :: sourcename :: photo :: intro :: address :: tel :: fax :: mail :: zipcode :: homepage :: email :: qq :: contactername :: sourcetype :: passed :: ontop :: iselite :: hits :: lastusetime :: HNil).mapTo[PeCopyfromRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)
    /** Database column ChannelID SqlType(SMALLINT), Default(Some(0)) */
    val channelid: Rep[Option[Short]] = column[Option[Short]]("ChannelID", O.Default(Some(0)))
    /** Database column SourceName SqlType(VARCHAR), Length(50,true) */
    val sourcename: Rep[Option[String]] = column[Option[String]]("SourceName", O.Length(50,varying=true))
    /** Database column Photo SqlType(VARCHAR), Length(255,true) */
    val photo: Rep[Option[String]] = column[Option[String]]("Photo", O.Length(255,varying=true))
    /** Database column Intro SqlType(VARCHAR), Length(16777216,true) */
    val intro: Rep[Option[String]] = column[Option[String]]("Intro", O.Length(16777216,varying=true))
    /** Database column Address SqlType(VARCHAR), Length(50,true) */
    val address: Rep[Option[String]] = column[Option[String]]("Address", O.Length(50,varying=true))
    /** Database column Tel SqlType(VARCHAR), Length(50,true) */
    val tel: Rep[Option[String]] = column[Option[String]]("Tel", O.Length(50,varying=true))
    /** Database column Fax SqlType(VARCHAR), Length(50,true) */
    val fax: Rep[Option[String]] = column[Option[String]]("Fax", O.Length(50,varying=true))
    /** Database column Mail SqlType(VARCHAR), Length(50,true) */
    val mail: Rep[Option[String]] = column[Option[String]]("Mail", O.Length(50,varying=true))
    /** Database column ZipCode SqlType(VARCHAR), Length(50,true) */
    val zipcode: Rep[Option[String]] = column[Option[String]]("ZipCode", O.Length(50,varying=true))
    /** Database column HomePage SqlType(VARCHAR), Length(50,true) */
    val homepage: Rep[Option[String]] = column[Option[String]]("HomePage", O.Length(50,varying=true))
    /** Database column Email SqlType(VARCHAR), Length(50,true) */
    val email: Rep[Option[String]] = column[Option[String]]("Email", O.Length(50,varying=true))
    /** Database column QQ SqlType(INTEGER), Default(Some(0)) */
    val qq: Rep[Option[Int]] = column[Option[Int]]("QQ", O.Default(Some(0)))
    /** Database column ContacterName SqlType(VARCHAR), Length(50,true) */
    val contactername: Rep[Option[String]] = column[Option[String]]("ContacterName", O.Length(50,varying=true))
    /** Database column SourceType SqlType(SMALLINT), Default(Some(0)) */
    val sourcetype: Rep[Option[Short]] = column[Option[Short]]("SourceType", O.Default(Some(0)))
    /** Database column Passed SqlType(BOOLEAN) */
    val passed: Rep[Option[Boolean]] = column[Option[Boolean]]("Passed")
    /** Database column onTop SqlType(BOOLEAN) */
    val ontop: Rep[Option[Boolean]] = column[Option[Boolean]]("onTop")
    /** Database column IsElite SqlType(BOOLEAN) */
    val iselite: Rep[Option[Boolean]] = column[Option[Boolean]]("IsElite")
    /** Database column Hits SqlType(INTEGER), Default(Some(0)) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits", O.Default(Some(0)))
    /** Database column LastUseTime SqlType(TIMESTAMP) */
    val lastusetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastUseTime")

    /** Index over (channelid) (database name PE_COPYFROM_CHANNELID) */
    val index1 = index("PE_COPYFROM_CHANNELID", channelid :: HNil)
    /** Index over (zipcode) (database name PE_COPYFROM_ZIPCODE) */
    val index2 = index("PE_COPYFROM_ZIPCODE", zipcode :: HNil)
  }
  /** Collection-like TableQuery object for table PeCopyfrom */
  lazy val PeCopyfrom = new TableQuery(tag => new PeCopyfrom(tag))
}
