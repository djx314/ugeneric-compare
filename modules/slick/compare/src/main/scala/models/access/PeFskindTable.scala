package models.access
// AUTO-GENERATED Slick data model for table PeFskind
trait PeFskindTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeFskind
    *  @param kindid Database column KindID SqlType(INTEGER), PrimaryKey
    *  @param kindname Database column KindName SqlType(VARCHAR), Length(50,true)
    *  @param readme Database column ReadMe SqlType(VARCHAR), Length(255,true)
    *  @param kindtype Database column KindType SqlType(INTEGER), Default(Some(0)) */
  case class PeFskindRow(kindid: Int, kindname: String, readme: Option[String], kindtype: Option[Int] = Some(0))

  /** GetResult implicit for fetching PeFskindRow objects using plain SQL queries */
  /** Table description of table PE_FsKind. Objects of this class serve as prototypes for rows in queries. */
  class PeFskind(_tableTag: Tag) extends profile.api.Table[PeFskindRow](_tableTag, "PE_FsKind") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column KindID SqlType(INTEGER), PrimaryKey */
    val kindid: Rep[Int] = column[Int]("KindID", O.PrimaryKey)

    /** Database column KindName SqlType(VARCHAR), Length(50,true) */
    val kindname: Rep[String] = column[String]("KindName", O.Length(50, varying = true))

    /** Database column ReadMe SqlType(VARCHAR), Length(255,true) */
    val readme: Rep[Option[String]] = column[Option[String]]("ReadMe", O.Length(255, varying = true))

    /** Database column KindType SqlType(INTEGER), Default(Some(0)) */
    val kindtype: Rep[Option[Int]] = column[Option[Int]]("KindType", O.Default(Some(0)))
  }

  /** Collection-like TableQuery object for table PeFskind */
  lazy val PeFskind = new TableQuery(tag => new PeFskind(tag))
}
