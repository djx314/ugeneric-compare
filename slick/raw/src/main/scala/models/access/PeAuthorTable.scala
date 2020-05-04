package models.access
// AUTO-GENERATED Slick data model for table PeAuthor
trait PeAuthorTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeAuthor
   *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param channelid Database column ChannelID SqlType(SMALLINT), Default(Some(0))
   *  @param authorname Database column AuthorName SqlType(VARCHAR), Length(50,true)
   *  @param sex Database column Sex SqlType(SMALLINT), Default(Some(0))
   *  @param birthday Database column BirthDay SqlType(TIMESTAMP)
   *  @param photo Database column Photo SqlType(VARCHAR), Length(255,true)
   *  @param intro Database column Intro SqlType(VARCHAR), Length(16777216,true)
   *  @param address Database column Address SqlType(VARCHAR), Length(50,true)
   *  @param tel Database column Tel SqlType(VARCHAR), Length(50,true)
   *  @param fax Database column Fax SqlType(VARCHAR), Length(50,true)
   *  @param company Database column Company SqlType(VARCHAR), Length(50,true)
   *  @param department Database column Department SqlType(VARCHAR), Length(50,true)
   *  @param zipcode Database column ZipCode SqlType(VARCHAR), Length(50,true)
   *  @param homepage Database column HomePage SqlType(VARCHAR), Length(50,true)
   *  @param email Database column Email SqlType(VARCHAR), Length(50,true)
   *  @param qq Database column QQ SqlType(INTEGER), Default(Some(0))
   *  @param authortype Database column AuthorType SqlType(SMALLINT), Default(Some(0))
   *  @param lastusetime Database column LastUseTime SqlType(TIMESTAMP)
   *  @param passed Database column Passed SqlType(BOOLEAN)
   *  @param iselite Database column IsElite SqlType(BOOLEAN)
   *  @param ontop Database column onTop SqlType(BOOLEAN)
   *  @param hits Database column Hits SqlType(INTEGER), Default(Some(0))
   *  @param templateid Database column TemplateID SqlType(INTEGER), Default(Some(0)) */
  case class PeAuthorRow(id: Int, channelid: Option[Short] = Some(0), authorname: String, sex: Option[Short] = Some(0), birthday: Option[java.sql.Timestamp], photo: Option[String], intro: Option[String], address: Option[String], tel: Option[String], fax: Option[String], company: Option[String], department: Option[String], zipcode: Option[String], homepage: Option[String], email: Option[String], qq: Option[Int] = Some(0), authortype: Option[Short] = Some(0), lastusetime: Option[java.sql.Timestamp], passed: Option[Boolean], iselite: Option[Boolean], ontop: Option[Boolean], hits: Option[Int] = Some(0), templateid: Option[Int] = Some(0))
  /** GetResult implicit for fetching PeAuthorRow objects using plain SQL queries */

  /** Table description of table PE_Author. Objects of this class serve as prototypes for rows in queries. */
  class PeAuthor(_tableTag: Tag) extends profile.api.Table[PeAuthorRow](_tableTag, "PE_Author") {
    def * = (id :: channelid :: authorname :: sex :: birthday :: photo :: intro :: address :: tel :: fax :: company :: department :: zipcode :: homepage :: email :: qq :: authortype :: lastusetime :: passed :: iselite :: ontop :: hits :: templateid :: HNil).mapTo[PeAuthorRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)
    /** Database column ChannelID SqlType(SMALLINT), Default(Some(0)) */
    val channelid: Rep[Option[Short]] = column[Option[Short]]("ChannelID", O.Default(Some(0)))
    /** Database column AuthorName SqlType(VARCHAR), Length(50,true) */
    val authorname: Rep[String] = column[String]("AuthorName", O.Length(50,varying=true))
    /** Database column Sex SqlType(SMALLINT), Default(Some(0)) */
    val sex: Rep[Option[Short]] = column[Option[Short]]("Sex", O.Default(Some(0)))
    /** Database column BirthDay SqlType(TIMESTAMP) */
    val birthday: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("BirthDay")
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
    /** Database column Company SqlType(VARCHAR), Length(50,true) */
    val company: Rep[Option[String]] = column[Option[String]]("Company", O.Length(50,varying=true))
    /** Database column Department SqlType(VARCHAR), Length(50,true) */
    val department: Rep[Option[String]] = column[Option[String]]("Department", O.Length(50,varying=true))
    /** Database column ZipCode SqlType(VARCHAR), Length(50,true) */
    val zipcode: Rep[Option[String]] = column[Option[String]]("ZipCode", O.Length(50,varying=true))
    /** Database column HomePage SqlType(VARCHAR), Length(50,true) */
    val homepage: Rep[Option[String]] = column[Option[String]]("HomePage", O.Length(50,varying=true))
    /** Database column Email SqlType(VARCHAR), Length(50,true) */
    val email: Rep[Option[String]] = column[Option[String]]("Email", O.Length(50,varying=true))
    /** Database column QQ SqlType(INTEGER), Default(Some(0)) */
    val qq: Rep[Option[Int]] = column[Option[Int]]("QQ", O.Default(Some(0)))
    /** Database column AuthorType SqlType(SMALLINT), Default(Some(0)) */
    val authortype: Rep[Option[Short]] = column[Option[Short]]("AuthorType", O.Default(Some(0)))
    /** Database column LastUseTime SqlType(TIMESTAMP) */
    val lastusetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastUseTime")
    /** Database column Passed SqlType(BOOLEAN) */
    val passed: Rep[Option[Boolean]] = column[Option[Boolean]]("Passed")
    /** Database column IsElite SqlType(BOOLEAN) */
    val iselite: Rep[Option[Boolean]] = column[Option[Boolean]]("IsElite")
    /** Database column onTop SqlType(BOOLEAN) */
    val ontop: Rep[Option[Boolean]] = column[Option[Boolean]]("onTop")
    /** Database column Hits SqlType(INTEGER), Default(Some(0)) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits", O.Default(Some(0)))
    /** Database column TemplateID SqlType(INTEGER), Default(Some(0)) */
    val templateid: Rep[Option[Int]] = column[Option[Int]]("TemplateID", O.Default(Some(0)))

    /** Index over (channelid) (database name PE_AUTHOR_CHANNELID) */
    val index1 = index("PE_AUTHOR_CHANNELID", channelid :: HNil)
    /** Index over (templateid) (database name PE_AUTHOR_TEMPLATEID) */
    val index2 = index("PE_AUTHOR_TEMPLATEID", templateid :: HNil)
    /** Index over (zipcode) (database name PE_AUTHOR_ZIPCODE) */
    val index3 = index("PE_AUTHOR_ZIPCODE", zipcode :: HNil)
  }
  /** Collection-like TableQuery object for table PeAuthor */
  lazy val PeAuthor = new TableQuery(tag => new PeAuthor(tag))
}
