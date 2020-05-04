package models.access
// AUTO-GENERATED Slick data model for table PeOrderformitem
trait PeOrderformitemTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeOrderformitem
    *  @param itemid Database column ItemID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param orderformid Database column OrderFormID SqlType(INTEGER), Default(Some(0))
    *  @param productid Database column ProductID SqlType(INTEGER), Default(Some(0))
    *  @param saletype Database column SaleType SqlType(INTEGER), Default(Some(0))
    *  @param priceOriginal Database column Price_Original SqlType(DECIMAL), Default(Some(0))
    *  @param price Database column Price SqlType(DECIMAL), Default(Some(0))
    *  @param trueprice Database column TruePrice SqlType(DECIMAL), Default(Some(0))
    *  @param amount Database column Amount SqlType(INTEGER), Default(Some(0))
    *  @param subtotal Database column SubTotal SqlType(DECIMAL), Default(Some(0))
    *  @param begindate Database column BeginDate SqlType(TIMESTAMP)
    *  @param serviceterm Database column ServiceTerm SqlType(INTEGER), Default(Some(0))
    *  @param remark Database column Remark SqlType(VARCHAR), Length(255,true)
    *  @param presentmoney Database column PresentMoney SqlType(DECIMAL), Default(Some(0))
    *  @param presentpoint Database column PresentPoint SqlType(INTEGER), Default(Some(0))
    *  @param presentexp Database column PresentExp SqlType(INTEGER), Default(Some(0)) */
  case class PeOrderformitemRow(
    itemid: Int = 0,
    orderformid: Option[Int] = Some(0),
    productid: Option[Int] = Some(0),
    saletype: Option[Int] = Some(0),
    priceOriginal: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    price: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    trueprice: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    amount: Option[Int] = Some(0),
    subtotal: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    begindate: Option[java.sql.Timestamp],
    serviceterm: Option[Int] = Some(0),
    remark: Option[String],
    presentmoney: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    presentpoint: Option[Int] = Some(0),
    presentexp: Option[Int] = Some(0)
  )

  /** GetResult implicit for fetching PeOrderformitemRow objects using plain SQL queries */
  /** Table description of table PE_OrderFormItem. Objects of this class serve as prototypes for rows in queries. */
  class PeOrderformitem(_tableTag: Tag) extends profile.api.Table[PeOrderformitemRow](_tableTag, "PE_OrderFormItem") {
    def * =
      (itemid :: orderformid :: productid :: saletype :: priceOriginal :: price :: trueprice :: amount :: subtotal :: begindate :: serviceterm :: remark :: presentmoney :: presentpoint :: presentexp :: HNil)
        .mapTo[PeOrderformitemRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ItemID SqlType(INTEGER), PrimaryKey, Default(0) */
    val itemid: Rep[Int] = column[Int]("ItemID", O.PrimaryKey, O.Default(0))

    /** Database column OrderFormID SqlType(INTEGER), Default(Some(0)) */
    val orderformid: Rep[Option[Int]] = column[Option[Int]]("OrderFormID", O.Default(Some(0)))

    /** Database column ProductID SqlType(INTEGER), Default(Some(0)) */
    val productid: Rep[Option[Int]] = column[Option[Int]]("ProductID", O.Default(Some(0)))

    /** Database column SaleType SqlType(INTEGER), Default(Some(0)) */
    val saletype: Rep[Option[Int]] = column[Option[Int]]("SaleType", O.Default(Some(0)))

    /** Database column Price_Original SqlType(DECIMAL), Default(Some(0)) */
    val priceOriginal: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Price_Original", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column Price SqlType(DECIMAL), Default(Some(0)) */
    val price: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Price", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column TruePrice SqlType(DECIMAL), Default(Some(0)) */
    val trueprice: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("TruePrice", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column Amount SqlType(INTEGER), Default(Some(0)) */
    val amount: Rep[Option[Int]] = column[Option[Int]]("Amount", O.Default(Some(0)))

    /** Database column SubTotal SqlType(DECIMAL), Default(Some(0)) */
    val subtotal: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("SubTotal", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column BeginDate SqlType(TIMESTAMP) */
    val begindate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("BeginDate")

    /** Database column ServiceTerm SqlType(INTEGER), Default(Some(0)) */
    val serviceterm: Rep[Option[Int]] = column[Option[Int]]("ServiceTerm", O.Default(Some(0)))

    /** Database column Remark SqlType(VARCHAR), Length(255,true) */
    val remark: Rep[Option[String]] = column[Option[String]]("Remark", O.Length(255, varying = true))

    /** Database column PresentMoney SqlType(DECIMAL), Default(Some(0)) */
    val presentmoney: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("PresentMoney", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column PresentPoint SqlType(INTEGER), Default(Some(0)) */
    val presentpoint: Rep[Option[Int]] = column[Option[Int]]("PresentPoint", O.Default(Some(0)))

    /** Database column PresentExp SqlType(INTEGER), Default(Some(0)) */
    val presentexp: Rep[Option[Int]] = column[Option[Int]]("PresentExp", O.Default(Some(0)))

    /** Index over (orderformid) (database name PE_ORDERFORMITEM_ORDERFORMID) */
    val index1 = index("PE_ORDERFORMITEM_ORDERFORMID", orderformid :: HNil)

    /** Index over (productid) (database name PE_ORDERFORMITEM_PRODUCTID) */
    val index2 = index("PE_ORDERFORMITEM_PRODUCTID", productid :: HNil)
  }

  /** Collection-like TableQuery object for table PeOrderformitem */
  lazy val PeOrderformitem = new TableQuery(tag => new PeOrderformitem(tag))
}
