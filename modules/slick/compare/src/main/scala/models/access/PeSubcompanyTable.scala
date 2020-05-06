package models.access
// AUTO-GENERATED Slick data model for table PeSubcompany
trait PeSubcompanyTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeSubcompany
   *  @param subcompanyid Database column SubCompanyID SqlType(INTEGER), PrimaryKey, Default(0)
   *  @param subcompanyname Database column SubCompanyName SqlType(VARCHAR), Length(50,true)
   *  @param contacter Database column Contacter SqlType(VARCHAR), Length(50,true)
   *  @param telephone Database column Telephone SqlType(VARCHAR), Length(50,true)
   *  @param address Database column Address SqlType(VARCHAR), Length(50,true)
   *  @param eMail Database column E_mail SqlType(VARCHAR), Length(50,true)
   *  @param orderid Database column OrderID SqlType(INTEGER), Default(Some(0)) */
  case class PeSubcompanyRow(subcompanyid: Int = 0, subcompanyname: Option[String], contacter: Option[String], telephone: Option[String], address: Option[String], eMail: Option[String], orderid: Option[Int] = Some(0))
  /** GetResult implicit for fetching PeSubcompanyRow objects using plain SQL queries */

  /** Table description of table PE_SubCompany. Objects of this class serve as prototypes for rows in queries. */
  class PeSubcompany(_tableTag: Tag) extends profile.api.Table[PeSubcompanyRow](_tableTag, "PE_SubCompany") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column SubCompanyID SqlType(INTEGER), PrimaryKey, Default(0) */
    val subcompanyid: Rep[Int] = column[Int]("SubCompanyID", O.PrimaryKey, O.Default(0))
    /** Database column SubCompanyName SqlType(VARCHAR), Length(50,true) */
    val subcompanyname: Rep[Option[String]] = column[Option[String]]("SubCompanyName", O.Length(50,varying=true))
    /** Database column Contacter SqlType(VARCHAR), Length(50,true) */
    val contacter: Rep[Option[String]] = column[Option[String]]("Contacter", O.Length(50,varying=true))
    /** Database column Telephone SqlType(VARCHAR), Length(50,true) */
    val telephone: Rep[Option[String]] = column[Option[String]]("Telephone", O.Length(50,varying=true))
    /** Database column Address SqlType(VARCHAR), Length(50,true) */
    val address: Rep[Option[String]] = column[Option[String]]("Address", O.Length(50,varying=true))
    /** Database column E_mail SqlType(VARCHAR), Length(50,true) */
    val eMail: Rep[Option[String]] = column[Option[String]]("E_mail", O.Length(50,varying=true))
    /** Database column OrderID SqlType(INTEGER), Default(Some(0)) */
    val orderid: Rep[Option[Int]] = column[Option[Int]]("OrderID", O.Default(Some(0)))

    /** Index over (orderid) (database name PE_SUBCOMPANY_ORDERID) */
    val index1 = index("PE_SUBCOMPANY_ORDERID", orderid)
  }
  /** Collection-like TableQuery object for table PeSubcompany */
  lazy val PeSubcompany = new TableQuery(tag => new PeSubcompany(tag))
}
