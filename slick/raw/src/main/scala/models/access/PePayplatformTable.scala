package models.access
// AUTO-GENERATED Slick data model for table PePayplatform
trait PePayplatformTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PePayplatform
   *  @param platformid Database column PlatformID SqlType(INTEGER), PrimaryKey, Default(0)
   *  @param platformname Database column PlatformName SqlType(VARCHAR), Length(50,true)
   *  @param showname Database column ShowName SqlType(VARCHAR), Length(50,true)
   *  @param description Database column Description SqlType(VARCHAR), Length(16777216,true)
   *  @param accountsid Database column AccountsID SqlType(VARCHAR), Length(50,true)
   *  @param rate Database column Rate SqlType(DOUBLE), Default(Some(0.0))
   *  @param pluspoundage Database column PlusPoundage SqlType(BOOLEAN)
   *  @param orderid Database column OrderID SqlType(INTEGER), Default(Some(0))
   *  @param isdisabled Database column IsDisabled SqlType(BOOLEAN)
   *  @param isdefault Database column IsDefault SqlType(BOOLEAN)
   *  @param md5key Database column MD5Key SqlType(VARCHAR), Length(255,true) */
  case class PePayplatformRow(platformid: Int = 0, platformname: Option[String], showname: Option[String], description: Option[String], accountsid: Option[String], rate: Option[Double] = Some(0.0), pluspoundage: Boolean, orderid: Option[Int] = Some(0), isdisabled: Boolean, isdefault: Boolean, md5key: Option[String])
  /** GetResult implicit for fetching PePayplatformRow objects using plain SQL queries */

  /** Table description of table PE_PayPlatform. Objects of this class serve as prototypes for rows in queries. */
  class PePayplatform(_tableTag: Tag) extends profile.api.Table[PePayplatformRow](_tableTag, "PE_PayPlatform") {
    def * = (platformid :: platformname :: showname :: description :: accountsid :: rate :: pluspoundage :: orderid :: isdisabled :: isdefault :: md5key :: HNil).mapTo[PePayplatformRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column PlatformID SqlType(INTEGER), PrimaryKey, Default(0) */
    val platformid: Rep[Int] = column[Int]("PlatformID", O.PrimaryKey, O.Default(0))
    /** Database column PlatformName SqlType(VARCHAR), Length(50,true) */
    val platformname: Rep[Option[String]] = column[Option[String]]("PlatformName", O.Length(50,varying=true))
    /** Database column ShowName SqlType(VARCHAR), Length(50,true) */
    val showname: Rep[Option[String]] = column[Option[String]]("ShowName", O.Length(50,varying=true))
    /** Database column Description SqlType(VARCHAR), Length(16777216,true) */
    val description: Rep[Option[String]] = column[Option[String]]("Description", O.Length(16777216,varying=true))
    /** Database column AccountsID SqlType(VARCHAR), Length(50,true) */
    val accountsid: Rep[Option[String]] = column[Option[String]]("AccountsID", O.Length(50,varying=true))
    /** Database column Rate SqlType(DOUBLE), Default(Some(0.0)) */
    val rate: Rep[Option[Double]] = column[Option[Double]]("Rate", O.Default(Some(0.0)))
    /** Database column PlusPoundage SqlType(BOOLEAN) */
    val pluspoundage: Rep[Boolean] = column[Boolean]("PlusPoundage")
    /** Database column OrderID SqlType(INTEGER), Default(Some(0)) */
    val orderid: Rep[Option[Int]] = column[Option[Int]]("OrderID", O.Default(Some(0)))
    /** Database column IsDisabled SqlType(BOOLEAN) */
    val isdisabled: Rep[Boolean] = column[Boolean]("IsDisabled")
    /** Database column IsDefault SqlType(BOOLEAN) */
    val isdefault: Rep[Boolean] = column[Boolean]("IsDefault")
    /** Database column MD5Key SqlType(VARCHAR), Length(255,true) */
    val md5key: Rep[Option[String]] = column[Option[String]]("MD5Key", O.Length(255,varying=true))

    /** Index over (isdisabled) (database name PE_PAYPLATFORM_ISDISABLED) */
    val index1 = index("PE_PAYPLATFORM_ISDISABLED", isdisabled :: HNil)
    /** Index over (orderid) (database name PE_PAYPLATFORM_ORDERID) */
    val index2 = index("PE_PAYPLATFORM_ORDERID", orderid :: HNil)
  }
  /** Collection-like TableQuery object for table PePayplatform */
  lazy val PePayplatform = new TableQuery(tag => new PePayplatform(tag))
}
