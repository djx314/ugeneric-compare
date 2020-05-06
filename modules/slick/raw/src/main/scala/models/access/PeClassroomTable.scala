package models.access
// AUTO-GENERATED Slick data model for table PeClassroom
trait PeClassroomTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeClassroom
   *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param fatherid Database column FatherID SqlType(INTEGER), Default(Some(0))
   *  @param classroomname Database column ClassroomName SqlType(VARCHAR), Length(50,true)
   *  @param classroomintroduce Database column ClassroomIntroduce SqlType(VARCHAR), Length(200,true) */
  case class PeClassroomRow(id: Int, fatherid: Option[Int] = Some(0), classroomname: Option[String], classroomintroduce: Option[String])
  /** GetResult implicit for fetching PeClassroomRow objects using plain SQL queries */

  /** Table description of table PE_Classroom. Objects of this class serve as prototypes for rows in queries. */
  class PeClassroom(_tableTag: Tag) extends profile.api.Table[PeClassroomRow](_tableTag, "PE_Classroom") {
    def * = (id :: fatherid :: classroomname :: classroomintroduce :: HNil).mapTo[PeClassroomRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)
    /** Database column FatherID SqlType(INTEGER), Default(Some(0)) */
    val fatherid: Rep[Option[Int]] = column[Option[Int]]("FatherID", O.Default(Some(0)))
    /** Database column ClassroomName SqlType(VARCHAR), Length(50,true) */
    val classroomname: Rep[Option[String]] = column[Option[String]]("ClassroomName", O.Length(50,varying=true))
    /** Database column ClassroomIntroduce SqlType(VARCHAR), Length(200,true) */
    val classroomintroduce: Rep[Option[String]] = column[Option[String]]("ClassroomIntroduce", O.Length(200,varying=true))

    /** Index over (fatherid) (database name PE_CLASSROOM_FATHERID) */
    val index1 = index("PE_CLASSROOM_FATHERID", fatherid :: HNil)
  }
  /** Collection-like TableQuery object for table PeClassroom */
  lazy val PeClassroom = new TableQuery(tag => new PeClassroom(tag))
}
