package models.access
// AUTO-GENERATED Slick data model for table PeDictionary
trait PeDictionaryTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeDictionary
   *  @param fieldid Database column FieldID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param title Database column Title SqlType(VARCHAR), Length(50,true)
   *  @param tablename Database column TableName SqlType(VARCHAR), Length(30,true)
   *  @param fieldname Database column FieldName SqlType(VARCHAR), Length(30,true)
   *  @param fieldvalue Database column FieldValue SqlType(VARCHAR), Length(16777216,true) */
  case class PeDictionaryRow(fieldid: Int, title: Option[String], tablename: Option[String], fieldname: Option[String], fieldvalue: Option[String])
  /** GetResult implicit for fetching PeDictionaryRow objects using plain SQL queries */

  /** Table description of table PE_Dictionary. Objects of this class serve as prototypes for rows in queries. */
  class PeDictionary(_tableTag: Tag) extends profile.api.Table[PeDictionaryRow](_tableTag, "PE_Dictionary") {
    def * = (fieldid :: title :: tablename :: fieldname :: fieldvalue :: HNil).mapTo[PeDictionaryRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column FieldID SqlType(INTEGER), AutoInc, PrimaryKey */
    val fieldid: Rep[Int] = column[Int]("FieldID", O.AutoInc, O.PrimaryKey)
    /** Database column Title SqlType(VARCHAR), Length(50,true) */
    val title: Rep[Option[String]] = column[Option[String]]("Title", O.Length(50,varying=true))
    /** Database column TableName SqlType(VARCHAR), Length(30,true) */
    val tablename: Rep[Option[String]] = column[Option[String]]("TableName", O.Length(30,varying=true))
    /** Database column FieldName SqlType(VARCHAR), Length(30,true) */
    val fieldname: Rep[Option[String]] = column[Option[String]]("FieldName", O.Length(30,varying=true))
    /** Database column FieldValue SqlType(VARCHAR), Length(16777216,true) */
    val fieldvalue: Rep[Option[String]] = column[Option[String]]("FieldValue", O.Length(16777216,varying=true))

    /** Index over (fieldname) (database name PE_DICTIONARY_FIELDNAME) */
    val index1 = index("PE_DICTIONARY_FIELDNAME", fieldname :: HNil)
    /** Index over (tablename) (database name PE_DICTIONARY_TABLENAME) */
    val index2 = index("PE_DICTIONARY_TABLENAME", tablename :: HNil)
  }
  /** Collection-like TableQuery object for table PeDictionary */
  lazy val PeDictionary = new TableQuery(tag => new PeDictionary(tag))
}
