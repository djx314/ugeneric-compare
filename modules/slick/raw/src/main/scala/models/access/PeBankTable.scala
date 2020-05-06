package models.access
// AUTO-GENERATED Slick data model for table PeBank
trait PeBankTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeBank
   *  @param bankid Database column BankID SqlType(INTEGER), PrimaryKey, Default(0)
   *  @param bankshortname Database column BankShortName SqlType(VARCHAR), Length(20,true)
   *  @param bankname Database column BankName SqlType(VARCHAR), Length(50,true)
   *  @param accounts Database column Accounts SqlType(VARCHAR), Length(30,true)
   *  @param cardnum Database column CardNum SqlType(VARCHAR), Length(30,true)
   *  @param holdername Database column HolderName SqlType(VARCHAR), Length(20,true)
   *  @param bankintro Database column BankIntro SqlType(VARCHAR), Length(255,true)
   *  @param bankpic Database column BankPic SqlType(VARCHAR), Length(200,true)
   *  @param isdefault Database column IsDefault SqlType(BOOLEAN)
   *  @param orderid Database column OrderID SqlType(INTEGER), Default(Some(0))
   *  @param isdisabled Database column IsDisabled SqlType(BOOLEAN) */
  case class PeBankRow(bankid: Int = 0, bankshortname: Option[String], bankname: Option[String], accounts: Option[String], cardnum: Option[String], holdername: Option[String], bankintro: Option[String], bankpic: Option[String], isdefault: Option[Boolean], orderid: Option[Int] = Some(0), isdisabled: Option[Boolean])
  /** GetResult implicit for fetching PeBankRow objects using plain SQL queries */

  /** Table description of table PE_Bank. Objects of this class serve as prototypes for rows in queries. */
  class PeBank(_tableTag: Tag) extends profile.api.Table[PeBankRow](_tableTag, "PE_Bank") {
    def * = (bankid :: bankshortname :: bankname :: accounts :: cardnum :: holdername :: bankintro :: bankpic :: isdefault :: orderid :: isdisabled :: HNil).mapTo[PeBankRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column BankID SqlType(INTEGER), PrimaryKey, Default(0) */
    val bankid: Rep[Int] = column[Int]("BankID", O.PrimaryKey, O.Default(0))
    /** Database column BankShortName SqlType(VARCHAR), Length(20,true) */
    val bankshortname: Rep[Option[String]] = column[Option[String]]("BankShortName", O.Length(20,varying=true))
    /** Database column BankName SqlType(VARCHAR), Length(50,true) */
    val bankname: Rep[Option[String]] = column[Option[String]]("BankName", O.Length(50,varying=true))
    /** Database column Accounts SqlType(VARCHAR), Length(30,true) */
    val accounts: Rep[Option[String]] = column[Option[String]]("Accounts", O.Length(30,varying=true))
    /** Database column CardNum SqlType(VARCHAR), Length(30,true) */
    val cardnum: Rep[Option[String]] = column[Option[String]]("CardNum", O.Length(30,varying=true))
    /** Database column HolderName SqlType(VARCHAR), Length(20,true) */
    val holdername: Rep[Option[String]] = column[Option[String]]("HolderName", O.Length(20,varying=true))
    /** Database column BankIntro SqlType(VARCHAR), Length(255,true) */
    val bankintro: Rep[Option[String]] = column[Option[String]]("BankIntro", O.Length(255,varying=true))
    /** Database column BankPic SqlType(VARCHAR), Length(200,true) */
    val bankpic: Rep[Option[String]] = column[Option[String]]("BankPic", O.Length(200,varying=true))
    /** Database column IsDefault SqlType(BOOLEAN) */
    val isdefault: Rep[Option[Boolean]] = column[Option[Boolean]]("IsDefault")
    /** Database column OrderID SqlType(INTEGER), Default(Some(0)) */
    val orderid: Rep[Option[Int]] = column[Option[Int]]("OrderID", O.Default(Some(0)))
    /** Database column IsDisabled SqlType(BOOLEAN) */
    val isdisabled: Rep[Option[Boolean]] = column[Option[Boolean]]("IsDisabled")

    /** Index over (cardnum) (database name PE_BANK_CARDNUM) */
    val index1 = index("PE_BANK_CARDNUM", cardnum :: HNil)
    /** Index over (orderid) (database name PE_BANK_ORDERID) */
    val index2 = index("PE_BANK_ORDERID", orderid :: HNil)
  }
  /** Collection-like TableQuery object for table PeBank */
  lazy val PeBank = new TableQuery(tag => new PeBank(tag))
}
