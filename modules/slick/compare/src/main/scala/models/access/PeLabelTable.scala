package models.access
// AUTO-GENERATED Slick data model for table PeLabel
trait PeLabelTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeLabel
   *  @param labelid Database column LabelID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param labelname Database column LabelName SqlType(VARCHAR), Length(50,true)
   *  @param labelclass Database column LabelClass SqlType(VARCHAR), Length(50,true)
   *  @param labeltype Database column LabelType SqlType(SMALLINT), Default(Some(0))
   *  @param pagenum Database column PageNum SqlType(INTEGER), Default(Some(0))
   *  @param reflashtime Database column reFlashTime SqlType(SMALLINT), Default(Some(0))
   *  @param labelintro Database column LabelIntro SqlType(VARCHAR), Length(16777216,true)
   *  @param priority Database column Priority SqlType(INTEGER), Default(Some(0))
   *  @param labelcontent Database column LabelContent SqlType(VARCHAR), Length(16777216,true)
   *  @param areacollectionid Database column AreaCollectionID SqlType(INTEGER), Default(Some(0))
   *  @param fieldlist Database column fieldlist SqlType(VARCHAR), Length(255,true) */
  case class PeLabelRow(labelid: Int, labelname: Option[String], labelclass: Option[String], labeltype: Option[Short] = Some(0), pagenum: Option[Int] = Some(0), reflashtime: Option[Short] = Some(0), labelintro: Option[String], priority: Option[Int] = Some(0), labelcontent: Option[String], areacollectionid: Option[Int] = Some(0), fieldlist: Option[String])
  /** GetResult implicit for fetching PeLabelRow objects using plain SQL queries */

  /** Table description of table PE_Label. Objects of this class serve as prototypes for rows in queries. */
  class PeLabel(_tableTag: Tag) extends profile.api.Table[PeLabelRow](_tableTag, "PE_Label") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(implicit e => _.mapWithTable(this))
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column LabelID SqlType(INTEGER), AutoInc, PrimaryKey */
    val labelid: Rep[Int] = column[Int]("LabelID", O.AutoInc, O.PrimaryKey)
    /** Database column LabelName SqlType(VARCHAR), Length(50,true) */
    val labelname: Rep[Option[String]] = column[Option[String]]("LabelName", O.Length(50,varying=true))
    /** Database column LabelClass SqlType(VARCHAR), Length(50,true) */
    val labelclass: Rep[Option[String]] = column[Option[String]]("LabelClass", O.Length(50,varying=true))
    /** Database column LabelType SqlType(SMALLINT), Default(Some(0)) */
    val labeltype: Rep[Option[Short]] = column[Option[Short]]("LabelType", O.Default(Some(0)))
    /** Database column PageNum SqlType(INTEGER), Default(Some(0)) */
    val pagenum: Rep[Option[Int]] = column[Option[Int]]("PageNum", O.Default(Some(0)))
    /** Database column reFlashTime SqlType(SMALLINT), Default(Some(0)) */
    val reflashtime: Rep[Option[Short]] = column[Option[Short]]("reFlashTime", O.Default(Some(0)))
    /** Database column LabelIntro SqlType(VARCHAR), Length(16777216,true) */
    val labelintro: Rep[Option[String]] = column[Option[String]]("LabelIntro", O.Length(16777216,varying=true))
    /** Database column Priority SqlType(INTEGER), Default(Some(0)) */
    val priority: Rep[Option[Int]] = column[Option[Int]]("Priority", O.Default(Some(0)))
    /** Database column LabelContent SqlType(VARCHAR), Length(16777216,true) */
    val labelcontent: Rep[Option[String]] = column[Option[String]]("LabelContent", O.Length(16777216,varying=true))
    /** Database column AreaCollectionID SqlType(INTEGER), Default(Some(0)) */
    val areacollectionid: Rep[Option[Int]] = column[Option[Int]]("AreaCollectionID", O.Default(Some(0)))
    /** Database column fieldlist SqlType(VARCHAR), Length(255,true) */
    val fieldlist: Rep[Option[String]] = column[Option[String]]("fieldlist", O.Length(255,varying=true))

    /** Index over (areacollectionid) (database name PE_LABEL_AREACOLLECTIONID) */
    val index1 = index("PE_LABEL_AREACOLLECTIONID", areacollectionid)
    /** Index over (pagenum) (database name PE_LABEL_PAGENUM) */
    val index2 = index("PE_LABEL_PAGENUM", pagenum)
    /** Index over (reflashtime) (database name PE_LABEL_PAGENUM1) */
    val index3 = index("PE_LABEL_PAGENUM1", reflashtime)
  }
  /** Collection-like TableQuery object for table PeLabel */
  lazy val PeLabel = new TableQuery(tag => new PeLabel(tag))
}
