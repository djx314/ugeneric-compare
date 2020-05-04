package models.access
// AUTO-GENERATED Slick data model for table PeField
trait PeFieldTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeField
   *  @param fieldid Database column FieldID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param channelid Database column ChannelID SqlType(INTEGER), Default(Some(0))
   *  @param fieldname Database column FieldName SqlType(VARCHAR), Length(50,true)
   *  @param title Database column Title SqlType(VARCHAR), Length(50,true)
   *  @param labelname Database column LabelName SqlType(VARCHAR), Length(50,true)
   *  @param tips Database column Tips SqlType(VARCHAR), Length(255,true)
   *  @param fieldtype Database column FieldType SqlType(INTEGER), Default(Some(0))
   *  @param defaultvalue Database column DefaultValue SqlType(VARCHAR), Length(255,true)
   *  @param options Database column Options SqlType(VARCHAR), Length(16777216,true)
   *  @param enablenull Database column EnableNull SqlType(BOOLEAN)
   *  @param showonform Database column ShowOnForm SqlType(BOOLEAN)
   *  @param fieldlevel Database column FieldLevel SqlType(INTEGER), Default(Some(0)) */
  case class PeFieldRow(fieldid: Int, channelid: Option[Int] = Some(0), fieldname: Option[String], title: Option[String], labelname: Option[String], tips: Option[String], fieldtype: Option[Int] = Some(0), defaultvalue: Option[String], options: Option[String], enablenull: Option[Boolean], showonform: Option[Boolean], fieldlevel: Option[Int] = Some(0))
  /** GetResult implicit for fetching PeFieldRow objects using plain SQL queries */

  /** Table description of table PE_Field. Objects of this class serve as prototypes for rows in queries. */
  class PeField(_tableTag: Tag) extends profile.api.Table[PeFieldRow](_tableTag, "PE_Field") {
    def * = (fieldid :: channelid :: fieldname :: title :: labelname :: tips :: fieldtype :: defaultvalue :: options :: enablenull :: showonform :: fieldlevel :: HNil).mapTo[PeFieldRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column FieldID SqlType(INTEGER), AutoInc, PrimaryKey */
    val fieldid: Rep[Int] = column[Int]("FieldID", O.AutoInc, O.PrimaryKey)
    /** Database column ChannelID SqlType(INTEGER), Default(Some(0)) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID", O.Default(Some(0)))
    /** Database column FieldName SqlType(VARCHAR), Length(50,true) */
    val fieldname: Rep[Option[String]] = column[Option[String]]("FieldName", O.Length(50,varying=true))
    /** Database column Title SqlType(VARCHAR), Length(50,true) */
    val title: Rep[Option[String]] = column[Option[String]]("Title", O.Length(50,varying=true))
    /** Database column LabelName SqlType(VARCHAR), Length(50,true) */
    val labelname: Rep[Option[String]] = column[Option[String]]("LabelName", O.Length(50,varying=true))
    /** Database column Tips SqlType(VARCHAR), Length(255,true) */
    val tips: Rep[Option[String]] = column[Option[String]]("Tips", O.Length(255,varying=true))
    /** Database column FieldType SqlType(INTEGER), Default(Some(0)) */
    val fieldtype: Rep[Option[Int]] = column[Option[Int]]("FieldType", O.Default(Some(0)))
    /** Database column DefaultValue SqlType(VARCHAR), Length(255,true) */
    val defaultvalue: Rep[Option[String]] = column[Option[String]]("DefaultValue", O.Length(255,varying=true))
    /** Database column Options SqlType(VARCHAR), Length(16777216,true) */
    val options: Rep[Option[String]] = column[Option[String]]("Options", O.Length(16777216,varying=true))
    /** Database column EnableNull SqlType(BOOLEAN) */
    val enablenull: Rep[Option[Boolean]] = column[Option[Boolean]]("EnableNull")
    /** Database column ShowOnForm SqlType(BOOLEAN) */
    val showonform: Rep[Option[Boolean]] = column[Option[Boolean]]("ShowOnForm")
    /** Database column FieldLevel SqlType(INTEGER), Default(Some(0)) */
    val fieldlevel: Rep[Option[Int]] = column[Option[Int]]("FieldLevel", O.Default(Some(0)))

    /** Index over (channelid) (database name PE_FIELD_CHANNELID) */
    val index1 = index("PE_FIELD_CHANNELID", channelid :: HNil)
  }
  /** Collection-like TableQuery object for table PeField */
  lazy val PeField = new TableQuery(tag => new PeField(tag))
}
