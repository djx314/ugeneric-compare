package models.access
// AUTO-GENERATED Slick data model for table PeUsergroup
trait PeUsergroupTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeUsergroup
   *  @param groupid Database column GroupID SqlType(INTEGER), PrimaryKey, Default(0)
   *  @param groupname Database column GroupName SqlType(VARCHAR), Length(20,true)
   *  @param groupintro Database column GroupIntro SqlType(VARCHAR), Length(255,true)
   *  @param grouptype Database column GroupType SqlType(SMALLINT)
   *  @param arrclassBrowse Database column arrClass_Browse SqlType(VARCHAR), Length(16777216,true)
   *  @param arrclassView Database column arrClass_View SqlType(VARCHAR), Length(16777216,true)
   *  @param arrclassInput Database column arrClass_Input SqlType(VARCHAR), Length(16777216,true)
   *  @param groupsetting Database column GroupSetting SqlType(VARCHAR), Length(16777216,true) */
  case class PeUsergroupRow(groupid: Int = 0, groupname: String, groupintro: Option[String], grouptype: Option[Short], arrclassBrowse: Option[String], arrclassView: Option[String], arrclassInput: Option[String], groupsetting: Option[String])
  /** GetResult implicit for fetching PeUsergroupRow objects using plain SQL queries */

  /** Table description of table PE_UserGroup. Objects of this class serve as prototypes for rows in queries. */
  class PeUsergroup(_tableTag: Tag) extends profile.api.Table[PeUsergroupRow](_tableTag, "PE_UserGroup") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column GroupID SqlType(INTEGER), PrimaryKey, Default(0) */
    val groupid: Rep[Int] = column[Int]("GroupID", O.PrimaryKey, O.Default(0))
    /** Database column GroupName SqlType(VARCHAR), Length(20,true) */
    val groupname: Rep[String] = column[String]("GroupName", O.Length(20,varying=true))
    /** Database column GroupIntro SqlType(VARCHAR), Length(255,true) */
    val groupintro: Rep[Option[String]] = column[Option[String]]("GroupIntro", O.Length(255,varying=true))
    /** Database column GroupType SqlType(SMALLINT) */
    val grouptype: Rep[Option[Short]] = column[Option[Short]]("GroupType")
    /** Database column arrClass_Browse SqlType(VARCHAR), Length(16777216,true) */
    val arrclassBrowse: Rep[Option[String]] = column[Option[String]]("arrClass_Browse", O.Length(16777216,varying=true))
    /** Database column arrClass_View SqlType(VARCHAR), Length(16777216,true) */
    val arrclassView: Rep[Option[String]] = column[Option[String]]("arrClass_View", O.Length(16777216,varying=true))
    /** Database column arrClass_Input SqlType(VARCHAR), Length(16777216,true) */
    val arrclassInput: Rep[Option[String]] = column[Option[String]]("arrClass_Input", O.Length(16777216,varying=true))
    /** Database column GroupSetting SqlType(VARCHAR), Length(16777216,true) */
    val groupsetting: Rep[Option[String]] = column[Option[String]]("GroupSetting", O.Length(16777216,varying=true))
  }
  /** Collection-like TableQuery object for table PeUsergroup */
  lazy val PeUsergroup = new TableQuery(tag => new PeUsergroup(tag))
}
