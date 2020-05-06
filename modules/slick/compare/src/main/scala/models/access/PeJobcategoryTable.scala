package models.access
// AUTO-GENERATED Slick data model for table PeJobcategory
trait PeJobcategoryTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeJobcategory
   *  @param jobcategoryid Database column JobCategoryID SqlType(INTEGER), PrimaryKey, Default(0)
   *  @param jobcategoryname Database column JobCategoryName SqlType(VARCHAR), Length(50,true)
   *  @param orderid Database column OrderID SqlType(INTEGER), Default(Some(0)) */
  case class PeJobcategoryRow(jobcategoryid: Int = 0, jobcategoryname: Option[String], orderid: Option[Int] = Some(0))
  /** GetResult implicit for fetching PeJobcategoryRow objects using plain SQL queries */

  /** Table description of table PE_JobCategory. Objects of this class serve as prototypes for rows in queries. */
  class PeJobcategory(_tableTag: Tag) extends profile.api.Table[PeJobcategoryRow](_tableTag, "PE_JobCategory") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column JobCategoryID SqlType(INTEGER), PrimaryKey, Default(0) */
    val jobcategoryid: Rep[Int] = column[Int]("JobCategoryID", O.PrimaryKey, O.Default(0))
    /** Database column JobCategoryName SqlType(VARCHAR), Length(50,true) */
    val jobcategoryname: Rep[Option[String]] = column[Option[String]]("JobCategoryName", O.Length(50,varying=true))
    /** Database column OrderID SqlType(INTEGER), Default(Some(0)) */
    val orderid: Rep[Option[Int]] = column[Option[Int]]("OrderID", O.Default(Some(0)))

    /** Index over (orderid) (database name PE_JOBCATEGORY_ORDERID) */
    val index1 = index("PE_JOBCATEGORY_ORDERID", orderid)
  }
  /** Collection-like TableQuery object for table PeJobcategory */
  lazy val PeJobcategory = new TableQuery(tag => new PeJobcategory(tag))
}
