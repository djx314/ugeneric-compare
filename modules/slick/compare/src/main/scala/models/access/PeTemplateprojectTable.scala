package models.access
// AUTO-GENERATED Slick data model for table PeTemplateproject
trait PeTemplateprojectTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeTemplateproject
   *  @param templateprojectid Database column TemplateProjectID SqlType(INTEGER), PrimaryKey, Default(0)
   *  @param templateprojectname Database column TemplateProjectName SqlType(VARCHAR), Length(255,true)
   *  @param intro Database column Intro SqlType(VARCHAR), Length(16777216,true)
   *  @param isdefault Database column IsDefault SqlType(BOOLEAN) */
  case class PeTemplateprojectRow(templateprojectid: Int = 0, templateprojectname: Option[String], intro: Option[String], isdefault: Option[Boolean])
  /** GetResult implicit for fetching PeTemplateprojectRow objects using plain SQL queries */

  /** Table description of table PE_TemplateProject. Objects of this class serve as prototypes for rows in queries. */
  class PeTemplateproject(_tableTag: Tag) extends profile.api.Table[PeTemplateprojectRow](_tableTag, "PE_TemplateProject") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(implicit e => _.mapWithTable(this))
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column TemplateProjectID SqlType(INTEGER), PrimaryKey, Default(0) */
    val templateprojectid: Rep[Int] = column[Int]("TemplateProjectID", O.PrimaryKey, O.Default(0))
    /** Database column TemplateProjectName SqlType(VARCHAR), Length(255,true) */
    val templateprojectname: Rep[Option[String]] = column[Option[String]]("TemplateProjectName", O.Length(255,varying=true))
    /** Database column Intro SqlType(VARCHAR), Length(16777216,true) */
    val intro: Rep[Option[String]] = column[Option[String]]("Intro", O.Length(16777216,varying=true))
    /** Database column IsDefault SqlType(BOOLEAN) */
    val isdefault: Rep[Option[Boolean]] = column[Option[Boolean]]("IsDefault")
  }
  /** Collection-like TableQuery object for table PeTemplateproject */
  lazy val PeTemplateproject = new TableQuery(tag => new PeTemplateproject(tag))
}
