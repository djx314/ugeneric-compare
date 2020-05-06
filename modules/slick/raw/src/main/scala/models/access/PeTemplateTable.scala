package models.access
// AUTO-GENERATED Slick data model for table PeTemplate
trait PeTemplateTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeTemplate
   *  @param templateid Database column TemplateID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param channelid Database column ChannelID SqlType(INTEGER)
   *  @param templatename Database column TemplateName SqlType(VARCHAR), Length(50,true)
   *  @param templatetype Database column TemplateType SqlType(INTEGER)
   *  @param templatecontent Database column TemplateContent SqlType(VARCHAR), Length(16777216,true)
   *  @param isdefault Database column IsDefault SqlType(BOOLEAN)
   *  @param projectname Database column ProjectName SqlType(VARCHAR), Length(255,true)
   *  @param isdefaultinproject Database column IsDefaultInProject SqlType(BOOLEAN)
   *  @param deleted Database column Deleted SqlType(BOOLEAN) */
  case class PeTemplateRow(templateid: Int, channelid: Int, templatename: String, templatetype: Int, templatecontent: Option[String], isdefault: Boolean, projectname: Option[String], isdefaultinproject: Option[Boolean], deleted: Option[Boolean])
  /** GetResult implicit for fetching PeTemplateRow objects using plain SQL queries */

  /** Table description of table PE_Template. Objects of this class serve as prototypes for rows in queries. */
  class PeTemplate(_tableTag: Tag) extends profile.api.Table[PeTemplateRow](_tableTag, "PE_Template") {
    def * = (templateid :: channelid :: templatename :: templatetype :: templatecontent :: isdefault :: projectname :: isdefaultinproject :: deleted :: HNil).mapTo[PeTemplateRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column TemplateID SqlType(INTEGER), AutoInc, PrimaryKey */
    val templateid: Rep[Int] = column[Int]("TemplateID", O.AutoInc, O.PrimaryKey)
    /** Database column ChannelID SqlType(INTEGER) */
    val channelid: Rep[Int] = column[Int]("ChannelID")
    /** Database column TemplateName SqlType(VARCHAR), Length(50,true) */
    val templatename: Rep[String] = column[String]("TemplateName", O.Length(50,varying=true))
    /** Database column TemplateType SqlType(INTEGER) */
    val templatetype: Rep[Int] = column[Int]("TemplateType")
    /** Database column TemplateContent SqlType(VARCHAR), Length(16777216,true) */
    val templatecontent: Rep[Option[String]] = column[Option[String]]("TemplateContent", O.Length(16777216,varying=true))
    /** Database column IsDefault SqlType(BOOLEAN) */
    val isdefault: Rep[Boolean] = column[Boolean]("IsDefault")
    /** Database column ProjectName SqlType(VARCHAR), Length(255,true) */
    val projectname: Rep[Option[String]] = column[Option[String]]("ProjectName", O.Length(255,varying=true))
    /** Database column IsDefaultInProject SqlType(BOOLEAN) */
    val isdefaultinproject: Rep[Option[Boolean]] = column[Option[Boolean]]("IsDefaultInProject")
    /** Database column Deleted SqlType(BOOLEAN) */
    val deleted: Rep[Option[Boolean]] = column[Option[Boolean]]("Deleted")

    /** Index over (channelid) (database name PE_TEMPLATE_CHANNELID) */
    val index1 = index("PE_TEMPLATE_CHANNELID", channelid :: HNil)
  }
  /** Collection-like TableQuery object for table PeTemplate */
  lazy val PeTemplate = new TableQuery(tag => new PeTemplate(tag))
}
