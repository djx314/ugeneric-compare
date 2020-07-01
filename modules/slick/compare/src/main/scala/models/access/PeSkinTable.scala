package models.access
// AUTO-GENERATED Slick data model for table PeSkin
trait PeSkinTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeSkin
   *  @param skinid Database column SkinID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param skinname Database column SkinName SqlType(VARCHAR), Length(50,true)
   *  @param isdefault Database column IsDefault SqlType(BOOLEAN)
   *  @param skinCss Database column Skin_CSS SqlType(VARCHAR), Length(16777216,true)
   *  @param isdefaultinproject Database column IsDefaultInProject SqlType(BOOLEAN)
   *  @param projectname Database column ProjectName SqlType(VARCHAR), Length(255,true) */
  case class PeSkinRow(skinid: Int, skinname: String, isdefault: Boolean, skinCss: String, isdefaultinproject: Option[Boolean], projectname: Option[String])
  /** GetResult implicit for fetching PeSkinRow objects using plain SQL queries */

  /** Table description of table PE_Skin. Objects of this class serve as prototypes for rows in queries. */
  class PeSkin(_tableTag: Tag) extends profile.api.Table[PeSkinRow](_tableTag, "PE_Skin") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(implicit e => _.mapWithTable(this))
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column SkinID SqlType(INTEGER), AutoInc, PrimaryKey */
    val skinid: Rep[Int] = column[Int]("SkinID", O.AutoInc, O.PrimaryKey)
    /** Database column SkinName SqlType(VARCHAR), Length(50,true) */
    val skinname: Rep[String] = column[String]("SkinName", O.Length(50,varying=true))
    /** Database column IsDefault SqlType(BOOLEAN) */
    val isdefault: Rep[Boolean] = column[Boolean]("IsDefault")
    /** Database column Skin_CSS SqlType(VARCHAR), Length(16777216,true) */
    val skinCss: Rep[String] = column[String]("Skin_CSS", O.Length(16777216,varying=true))
    /** Database column IsDefaultInProject SqlType(BOOLEAN) */
    val isdefaultinproject: Rep[Option[Boolean]] = column[Option[Boolean]]("IsDefaultInProject")
    /** Database column ProjectName SqlType(VARCHAR), Length(255,true) */
    val projectname: Rep[Option[String]] = column[Option[String]]("ProjectName", O.Length(255,varying=true))

    /** Index over (projectname) (database name PE_SKIN_PROJECTNAME) */
    val index1 = index("PE_SKIN_PROJECTNAME", projectname)
  }
  /** Collection-like TableQuery object for table PeSkin */
  lazy val PeSkin = new TableQuery(tag => new PeSkin(tag))
}
