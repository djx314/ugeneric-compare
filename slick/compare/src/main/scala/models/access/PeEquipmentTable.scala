package models.access
// AUTO-GENERATED Slick data model for table PeEquipment
trait PeEquipmentTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeEquipment
   *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param classroomid Database column ClassroomID SqlType(INTEGER), Default(Some(0))
   *  @param equipmentname Database column EquipmentName SqlType(VARCHAR), Length(50,true)
   *  @param equipmentintroduce Database column EquipmentIntroduce SqlType(VARCHAR), Length(200,true)
   *  @param equipmentsituation Database column EquipmentSituation SqlType(INTEGER), Default(Some(0))
   *  @param equipmentvalue Database column EquipmentValue SqlType(VARCHAR), Length(100,true)
   *  @param explain Database column Explain SqlType(VARCHAR), Length(200,true) */
  case class PeEquipmentRow(id: Int, classroomid: Option[Int] = Some(0), equipmentname: Option[String], equipmentintroduce: Option[String], equipmentsituation: Option[Int] = Some(0), equipmentvalue: Option[String], explain: Option[String])
  /** GetResult implicit for fetching PeEquipmentRow objects using plain SQL queries */

  /** Table description of table PE_Equipment. Objects of this class serve as prototypes for rows in queries. */
  class PeEquipment(_tableTag: Tag) extends profile.api.Table[PeEquipmentRow](_tableTag, "PE_Equipment") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)
    /** Database column ClassroomID SqlType(INTEGER), Default(Some(0)) */
    val classroomid: Rep[Option[Int]] = column[Option[Int]]("ClassroomID", O.Default(Some(0)))
    /** Database column EquipmentName SqlType(VARCHAR), Length(50,true) */
    val equipmentname: Rep[Option[String]] = column[Option[String]]("EquipmentName", O.Length(50,varying=true))
    /** Database column EquipmentIntroduce SqlType(VARCHAR), Length(200,true) */
    val equipmentintroduce: Rep[Option[String]] = column[Option[String]]("EquipmentIntroduce", O.Length(200,varying=true))
    /** Database column EquipmentSituation SqlType(INTEGER), Default(Some(0)) */
    val equipmentsituation: Rep[Option[Int]] = column[Option[Int]]("EquipmentSituation", O.Default(Some(0)))
    /** Database column EquipmentValue SqlType(VARCHAR), Length(100,true) */
    val equipmentvalue: Rep[Option[String]] = column[Option[String]]("EquipmentValue", O.Length(100,varying=true))
    /** Database column Explain SqlType(VARCHAR), Length(200,true) */
    val explain: Rep[Option[String]] = column[Option[String]]("Explain", O.Length(200,varying=true))

    /** Index over (classroomid) (database name PE_EQUIPMENT_CLASSROOMID) */
    val index1 = index("PE_EQUIPMENT_CLASSROOMID", classroomid)
  }
  /** Collection-like TableQuery object for table PeEquipment */
  lazy val PeEquipment = new TableQuery(tag => new PeEquipment(tag))
}
