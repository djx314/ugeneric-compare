package models.access
// AUTO-GENERATED Slick data model for table PeShoppingcarts
trait PeShoppingcartsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeShoppingcarts
   *  @param cartitemid Database column CartItemID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param cartid Database column CartID SqlType(VARCHAR), Length(50,true)
   *  @param productid Database column ProductID SqlType(INTEGER), Default(Some(0))
   *  @param quantity Database column Quantity SqlType(INTEGER), Default(Some(0))
   *  @param presentid Database column PresentID SqlType(INTEGER), Default(Some(0))
   *  @param updatetime Database column UpdateTime SqlType(TIMESTAMP)
   *  @param username Database column UserName SqlType(VARCHAR), Length(20,true) */
  case class PeShoppingcartsRow(cartitemid: Int, cartid: Option[String], productid: Option[Int] = Some(0), quantity: Option[Int] = Some(0), presentid: Option[Int] = Some(0), updatetime: Option[java.sql.Timestamp], username: Option[String])
  /** GetResult implicit for fetching PeShoppingcartsRow objects using plain SQL queries */

  /** Table description of table PE_ShoppingCarts. Objects of this class serve as prototypes for rows in queries. */
  class PeShoppingcarts(_tableTag: Tag) extends profile.api.Table[PeShoppingcartsRow](_tableTag, "PE_ShoppingCarts") {
    def * = (cartitemid :: cartid :: productid :: quantity :: presentid :: updatetime :: username :: HNil).mapTo[PeShoppingcartsRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column CartItemID SqlType(INTEGER), AutoInc, PrimaryKey */
    val cartitemid: Rep[Int] = column[Int]("CartItemID", O.AutoInc, O.PrimaryKey)
    /** Database column CartID SqlType(VARCHAR), Length(50,true) */
    val cartid: Rep[Option[String]] = column[Option[String]]("CartID", O.Length(50,varying=true))
    /** Database column ProductID SqlType(INTEGER), Default(Some(0)) */
    val productid: Rep[Option[Int]] = column[Option[Int]]("ProductID", O.Default(Some(0)))
    /** Database column Quantity SqlType(INTEGER), Default(Some(0)) */
    val quantity: Rep[Option[Int]] = column[Option[Int]]("Quantity", O.Default(Some(0)))
    /** Database column PresentID SqlType(INTEGER), Default(Some(0)) */
    val presentid: Rep[Option[Int]] = column[Option[Int]]("PresentID", O.Default(Some(0)))
    /** Database column UpdateTime SqlType(TIMESTAMP) */
    val updatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UpdateTime")
    /** Database column UserName SqlType(VARCHAR), Length(20,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(20,varying=true))

    /** Index over (cartid) (database name PE_SHOPPINGCARTS_CARTID) */
    val index1 = index("PE_SHOPPINGCARTS_CARTID", cartid :: HNil)
    /** Index over (presentid) (database name PE_SHOPPINGCARTS_PRESENTID) */
    val index2 = index("PE_SHOPPINGCARTS_PRESENTID", presentid :: HNil)
    /** Index over (productid) (database name PE_SHOPPINGCARTS_PRODUCTID) */
    val index3 = index("PE_SHOPPINGCARTS_PRODUCTID", productid :: HNil)
  }
  /** Collection-like TableQuery object for table PeShoppingcarts */
  lazy val PeShoppingcarts = new TableQuery(tag => new PeShoppingcarts(tag))
}
