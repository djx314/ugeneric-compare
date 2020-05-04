package models.access
// AUTO-GENERATED Slick data model for table PeNotdown
trait PeNotdownTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeNotdown
    *  @param notdown Database column notdown SqlType(VARBINARY) */
  case class PeNotdownRow(notdown: Option[java.sql.Blob])

  /** GetResult implicit for fetching PeNotdownRow objects using plain SQL queries */
  /** Table description of table PE_NotDown. Objects of this class serve as prototypes for rows in queries. */
  class PeNotdown(_tableTag: Tag) extends profile.api.Table[PeNotdownRow](_tableTag, "PE_NotDown") {
    def * = (notdown :: HNil).mapTo[PeNotdownRow]

    /** Database column notdown SqlType(VARBINARY) */
    val notdown: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("notdown")
  }

  /** Collection-like TableQuery object for table PeNotdown */
  lazy val PeNotdown = new TableQuery(tag => new PeNotdown(tag))
}
