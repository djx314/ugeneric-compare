package models.access
// AUTO-GENERATED Slick data model for table PeProduct
trait PeProductTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeProduct
   *  @param productid Database column ProductID SqlType(INTEGER), PrimaryKey, Default(0)
   *  @param channelid Database column ChannelID SqlType(INTEGER), Default(Some(0))
   *  @param productnum Database column ProductNum SqlType(VARCHAR), Length(20,true)
   *  @param barcode Database column BarCode SqlType(VARCHAR), Length(50,true)
   *  @param classid Database column ClassID SqlType(INTEGER), Default(Some(0))
   *  @param productkind Database column ProductKind SqlType(INTEGER), Default(Some(0))
   *  @param productname Database column ProductName SqlType(VARCHAR), Length(200,true)
   *  @param productmodel Database column ProductModel SqlType(VARCHAR), Length(100,true)
   *  @param productstandard Database column ProductStandard SqlType(VARCHAR), Length(100,true)
   *  @param producername Database column ProducerName SqlType(VARCHAR), Length(100,true)
   *  @param trademarkname Database column TrademarkName SqlType(VARCHAR), Length(100,true)
   *  @param productintro Database column ProductIntro SqlType(VARCHAR), Length(255,true)
   *  @param productexplain Database column ProductExplain SqlType(VARCHAR), Length(16777216,true)
   *  @param productthumb Database column ProductThumb SqlType(VARCHAR), Length(200,true)
   *  @param uploadfiles Database column UploadFiles SqlType(VARCHAR), Length(16777216,true)
   *  @param producttype Database column ProductType SqlType(INTEGER), Default(Some(0))
   *  @param price Database column Price SqlType(DECIMAL), Default(Some(0))
   *  @param priceOriginal Database column Price_Original SqlType(DECIMAL), Default(Some(0))
   *  @param priceMarket Database column Price_Market SqlType(DECIMAL), Default(Some(0))
   *  @param priceMember Database column Price_Member SqlType(DECIMAL), Default(Some(0))
   *  @param priceAgent Database column Price_Agent SqlType(DECIMAL), Default(Some(0))
   *  @param enablewholesale Database column EnableWholesale SqlType(BOOLEAN)
   *  @param priceWholesale1 Database column Price_Wholesale1 SqlType(DECIMAL), Default(Some(0))
   *  @param numberWholesale1 Database column Number_Wholesale1 SqlType(INTEGER), Default(Some(0))
   *  @param priceWholesale2 Database column Price_Wholesale2 SqlType(DECIMAL), Default(Some(0))
   *  @param numberWholesale2 Database column Number_Wholesale2 SqlType(INTEGER), Default(Some(0))
   *  @param priceWholesale3 Database column Price_Wholesale3 SqlType(DECIMAL), Default(Some(0))
   *  @param numberWholesale3 Database column Number_Wholesale3 SqlType(INTEGER), Default(Some(0))
   *  @param unit Database column Unit SqlType(VARCHAR), Length(20,true)
   *  @param ontop Database column OnTop SqlType(BOOLEAN)
   *  @param ishot Database column IsHot SqlType(BOOLEAN)
   *  @param iselite Database column IsElite SqlType(BOOLEAN)
   *  @param stars Database column Stars SqlType(INTEGER), Default(Some(0))
   *  @param stocks Database column Stocks SqlType(DOUBLE), Default(Some(0.0))
   *  @param ordernum Database column OrderNum SqlType(NUMERIC), Default(Some(0))
   *  @param alarmnum Database column AlarmNum SqlType(INTEGER), Default(Some(0))
   *  @param enablesale Database column EnableSale SqlType(BOOLEAN)
   *  @param discount Database column Discount SqlType(DOUBLE), Default(Some(0.0))
   *  @param begindate Database column BeginDate SqlType(TIMESTAMP)
   *  @param enddate Database column EndDate SqlType(TIMESTAMP)
   *  @param limitnum Database column LimitNum SqlType(DOUBLE), Default(Some(0.0))
   *  @param keyword Database column Keyword SqlType(VARCHAR), Length(255,true)
   *  @param commentcount Database column CommentCount SqlType(INTEGER), Default(Some(0))
   *  @param updatetime Database column UpdateTime SqlType(TIMESTAMP)
   *  @param createtime Database column CreateTime SqlType(TIMESTAMP)
   *  @param downloadurl Database column DownloadUrl SqlType(VARCHAR), Length(255,true)
   *  @param remark Database column Remark SqlType(VARCHAR), Length(255,true)
   *  @param serviceterm Database column ServiceTerm SqlType(INTEGER), Default(Some(0))
   *  @param hits Database column Hits SqlType(INTEGER), Default(Some(0))
   *  @param buytimes Database column BuyTimes SqlType(INTEGER), Default(Some(0))
   *  @param deleted Database column Deleted SqlType(BOOLEAN)
   *  @param inputer Database column Inputer SqlType(VARCHAR), Length(20,true)
   *  @param templateid Database column TemplateID SqlType(INTEGER), Default(Some(0))
   *  @param skinid Database column SkinID SqlType(INTEGER), Default(Some(0))
   *  @param voteid Database column VoteID SqlType(INTEGER), Default(Some(0))
   *  @param salepromotiontype Database column SalePromotionType SqlType(INTEGER), Default(Some(0))
   *  @param minnumber Database column MinNumber SqlType(INTEGER), Default(Some(0))
   *  @param presentnumber Database column PresentNumber SqlType(INTEGER), Default(Some(0))
   *  @param presentid Database column PresentID SqlType(VARCHAR), Length(50,true)
   *  @param presentmoney Database column PresentMoney SqlType(DECIMAL), Default(Some(0))
   *  @param presentpoint Database column PresentPoint SqlType(INTEGER), Default(Some(0))
   *  @param presentexp Database column PresentExp SqlType(INTEGER), Default(Some(0))
   *  @param weight Database column Weight SqlType(DOUBLE), Default(Some(0.0))
   *  @param enablesinglesell Database column EnableSingleSell SqlType(BOOLEAN)
   *  @param dependentproducts Database column DependentProducts SqlType(VARCHAR), Length(16777216,true) */
  case class PeProductRow(productid: Int = 0, channelid: Option[Int] = Some(0), productnum: Option[String], barcode: Option[String], classid: Option[Int] = Some(0), productkind: Option[Int] = Some(0), productname: Option[String], productmodel: Option[String], productstandard: Option[String], producername: Option[String], trademarkname: Option[String], productintro: Option[String], productexplain: Option[String], productthumb: Option[String], uploadfiles: Option[String], producttype: Option[Int] = Some(0), price: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), priceOriginal: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), priceMarket: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), priceMember: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), priceAgent: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), enablewholesale: Option[Boolean], priceWholesale1: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), numberWholesale1: Option[Int] = Some(0), priceWholesale2: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), numberWholesale2: Option[Int] = Some(0), priceWholesale3: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), numberWholesale3: Option[Int] = Some(0), unit: Option[String], ontop: Option[Boolean], ishot: Option[Boolean], iselite: Option[Boolean], stars: Option[Int] = Some(0), stocks: Option[Double] = Some(0.0), ordernum: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), alarmnum: Option[Int] = Some(0), enablesale: Option[Boolean], discount: Option[Double] = Some(0.0), begindate: Option[java.sql.Timestamp], enddate: Option[java.sql.Timestamp], limitnum: Option[Double] = Some(0.0), keyword: Option[String], commentcount: Option[Int] = Some(0), updatetime: Option[java.sql.Timestamp], createtime: Option[java.sql.Timestamp], downloadurl: Option[String], remark: Option[String], serviceterm: Option[Int] = Some(0), hits: Option[Int] = Some(0), buytimes: Option[Int] = Some(0), deleted: Option[Boolean], inputer: Option[String], templateid: Option[Int] = Some(0), skinid: Option[Int] = Some(0), voteid: Option[Int] = Some(0), salepromotiontype: Option[Int] = Some(0), minnumber: Option[Int] = Some(0), presentnumber: Option[Int] = Some(0), presentid: Option[String], presentmoney: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), presentpoint: Option[Int] = Some(0), presentexp: Option[Int] = Some(0), weight: Option[Double] = Some(0.0), enablesinglesell: Option[Boolean], dependentproducts: Option[String])
  /** GetResult implicit for fetching PeProductRow objects using plain SQL queries */

  /** Table description of table PE_Product. Objects of this class serve as prototypes for rows in queries. */
  class PeProduct(_tableTag: Tag) extends profile.api.Table[PeProductRow](_tableTag, "PE_Product") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ProductID SqlType(INTEGER), PrimaryKey, Default(0) */
    val productid: Rep[Int] = column[Int]("ProductID", O.PrimaryKey, O.Default(0))
    /** Database column ChannelID SqlType(INTEGER), Default(Some(0)) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID", O.Default(Some(0)))
    /** Database column ProductNum SqlType(VARCHAR), Length(20,true) */
    val productnum: Rep[Option[String]] = column[Option[String]]("ProductNum", O.Length(20,varying=true))
    /** Database column BarCode SqlType(VARCHAR), Length(50,true) */
    val barcode: Rep[Option[String]] = column[Option[String]]("BarCode", O.Length(50,varying=true))
    /** Database column ClassID SqlType(INTEGER), Default(Some(0)) */
    val classid: Rep[Option[Int]] = column[Option[Int]]("ClassID", O.Default(Some(0)))
    /** Database column ProductKind SqlType(INTEGER), Default(Some(0)) */
    val productkind: Rep[Option[Int]] = column[Option[Int]]("ProductKind", O.Default(Some(0)))
    /** Database column ProductName SqlType(VARCHAR), Length(200,true) */
    val productname: Rep[Option[String]] = column[Option[String]]("ProductName", O.Length(200,varying=true))
    /** Database column ProductModel SqlType(VARCHAR), Length(100,true) */
    val productmodel: Rep[Option[String]] = column[Option[String]]("ProductModel", O.Length(100,varying=true))
    /** Database column ProductStandard SqlType(VARCHAR), Length(100,true) */
    val productstandard: Rep[Option[String]] = column[Option[String]]("ProductStandard", O.Length(100,varying=true))
    /** Database column ProducerName SqlType(VARCHAR), Length(100,true) */
    val producername: Rep[Option[String]] = column[Option[String]]("ProducerName", O.Length(100,varying=true))
    /** Database column TrademarkName SqlType(VARCHAR), Length(100,true) */
    val trademarkname: Rep[Option[String]] = column[Option[String]]("TrademarkName", O.Length(100,varying=true))
    /** Database column ProductIntro SqlType(VARCHAR), Length(255,true) */
    val productintro: Rep[Option[String]] = column[Option[String]]("ProductIntro", O.Length(255,varying=true))
    /** Database column ProductExplain SqlType(VARCHAR), Length(16777216,true) */
    val productexplain: Rep[Option[String]] = column[Option[String]]("ProductExplain", O.Length(16777216,varying=true))
    /** Database column ProductThumb SqlType(VARCHAR), Length(200,true) */
    val productthumb: Rep[Option[String]] = column[Option[String]]("ProductThumb", O.Length(200,varying=true))
    /** Database column UploadFiles SqlType(VARCHAR), Length(16777216,true) */
    val uploadfiles: Rep[Option[String]] = column[Option[String]]("UploadFiles", O.Length(16777216,varying=true))
    /** Database column ProductType SqlType(INTEGER), Default(Some(0)) */
    val producttype: Rep[Option[Int]] = column[Option[Int]]("ProductType", O.Default(Some(0)))
    /** Database column Price SqlType(DECIMAL), Default(Some(0)) */
    val price: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Price", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column Price_Original SqlType(DECIMAL), Default(Some(0)) */
    val priceOriginal: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Price_Original", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column Price_Market SqlType(DECIMAL), Default(Some(0)) */
    val priceMarket: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Price_Market", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column Price_Member SqlType(DECIMAL), Default(Some(0)) */
    val priceMember: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Price_Member", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column Price_Agent SqlType(DECIMAL), Default(Some(0)) */
    val priceAgent: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Price_Agent", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column EnableWholesale SqlType(BOOLEAN) */
    val enablewholesale: Rep[Option[Boolean]] = column[Option[Boolean]]("EnableWholesale")
    /** Database column Price_Wholesale1 SqlType(DECIMAL), Default(Some(0)) */
    val priceWholesale1: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Price_Wholesale1", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column Number_Wholesale1 SqlType(INTEGER), Default(Some(0)) */
    val numberWholesale1: Rep[Option[Int]] = column[Option[Int]]("Number_Wholesale1", O.Default(Some(0)))
    /** Database column Price_Wholesale2 SqlType(DECIMAL), Default(Some(0)) */
    val priceWholesale2: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Price_Wholesale2", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column Number_Wholesale2 SqlType(INTEGER), Default(Some(0)) */
    val numberWholesale2: Rep[Option[Int]] = column[Option[Int]]("Number_Wholesale2", O.Default(Some(0)))
    /** Database column Price_Wholesale3 SqlType(DECIMAL), Default(Some(0)) */
    val priceWholesale3: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Price_Wholesale3", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column Number_Wholesale3 SqlType(INTEGER), Default(Some(0)) */
    val numberWholesale3: Rep[Option[Int]] = column[Option[Int]]("Number_Wholesale3", O.Default(Some(0)))
    /** Database column Unit SqlType(VARCHAR), Length(20,true) */
    val unit: Rep[Option[String]] = column[Option[String]]("Unit", O.Length(20,varying=true))
    /** Database column OnTop SqlType(BOOLEAN) */
    val ontop: Rep[Option[Boolean]] = column[Option[Boolean]]("OnTop")
    /** Database column IsHot SqlType(BOOLEAN) */
    val ishot: Rep[Option[Boolean]] = column[Option[Boolean]]("IsHot")
    /** Database column IsElite SqlType(BOOLEAN) */
    val iselite: Rep[Option[Boolean]] = column[Option[Boolean]]("IsElite")
    /** Database column Stars SqlType(INTEGER), Default(Some(0)) */
    val stars: Rep[Option[Int]] = column[Option[Int]]("Stars", O.Default(Some(0)))
    /** Database column Stocks SqlType(DOUBLE), Default(Some(0.0)) */
    val stocks: Rep[Option[Double]] = column[Option[Double]]("Stocks", O.Default(Some(0.0)))
    /** Database column OrderNum SqlType(NUMERIC), Default(Some(0)) */
    val ordernum: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OrderNum", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column AlarmNum SqlType(INTEGER), Default(Some(0)) */
    val alarmnum: Rep[Option[Int]] = column[Option[Int]]("AlarmNum", O.Default(Some(0)))
    /** Database column EnableSale SqlType(BOOLEAN) */
    val enablesale: Rep[Option[Boolean]] = column[Option[Boolean]]("EnableSale")
    /** Database column Discount SqlType(DOUBLE), Default(Some(0.0)) */
    val discount: Rep[Option[Double]] = column[Option[Double]]("Discount", O.Default(Some(0.0)))
    /** Database column BeginDate SqlType(TIMESTAMP) */
    val begindate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("BeginDate")
    /** Database column EndDate SqlType(TIMESTAMP) */
    val enddate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EndDate")
    /** Database column LimitNum SqlType(DOUBLE), Default(Some(0.0)) */
    val limitnum: Rep[Option[Double]] = column[Option[Double]]("LimitNum", O.Default(Some(0.0)))
    /** Database column Keyword SqlType(VARCHAR), Length(255,true) */
    val keyword: Rep[Option[String]] = column[Option[String]]("Keyword", O.Length(255,varying=true))
    /** Database column CommentCount SqlType(INTEGER), Default(Some(0)) */
    val commentcount: Rep[Option[Int]] = column[Option[Int]]("CommentCount", O.Default(Some(0)))
    /** Database column UpdateTime SqlType(TIMESTAMP) */
    val updatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UpdateTime")
    /** Database column CreateTime SqlType(TIMESTAMP) */
    val createtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CreateTime")
    /** Database column DownloadUrl SqlType(VARCHAR), Length(255,true) */
    val downloadurl: Rep[Option[String]] = column[Option[String]]("DownloadUrl", O.Length(255,varying=true))
    /** Database column Remark SqlType(VARCHAR), Length(255,true) */
    val remark: Rep[Option[String]] = column[Option[String]]("Remark", O.Length(255,varying=true))
    /** Database column ServiceTerm SqlType(INTEGER), Default(Some(0)) */
    val serviceterm: Rep[Option[Int]] = column[Option[Int]]("ServiceTerm", O.Default(Some(0)))
    /** Database column Hits SqlType(INTEGER), Default(Some(0)) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits", O.Default(Some(0)))
    /** Database column BuyTimes SqlType(INTEGER), Default(Some(0)) */
    val buytimes: Rep[Option[Int]] = column[Option[Int]]("BuyTimes", O.Default(Some(0)))
    /** Database column Deleted SqlType(BOOLEAN) */
    val deleted: Rep[Option[Boolean]] = column[Option[Boolean]]("Deleted")
    /** Database column Inputer SqlType(VARCHAR), Length(20,true) */
    val inputer: Rep[Option[String]] = column[Option[String]]("Inputer", O.Length(20,varying=true))
    /** Database column TemplateID SqlType(INTEGER), Default(Some(0)) */
    val templateid: Rep[Option[Int]] = column[Option[Int]]("TemplateID", O.Default(Some(0)))
    /** Database column SkinID SqlType(INTEGER), Default(Some(0)) */
    val skinid: Rep[Option[Int]] = column[Option[Int]]("SkinID", O.Default(Some(0)))
    /** Database column VoteID SqlType(INTEGER), Default(Some(0)) */
    val voteid: Rep[Option[Int]] = column[Option[Int]]("VoteID", O.Default(Some(0)))
    /** Database column SalePromotionType SqlType(INTEGER), Default(Some(0)) */
    val salepromotiontype: Rep[Option[Int]] = column[Option[Int]]("SalePromotionType", O.Default(Some(0)))
    /** Database column MinNumber SqlType(INTEGER), Default(Some(0)) */
    val minnumber: Rep[Option[Int]] = column[Option[Int]]("MinNumber", O.Default(Some(0)))
    /** Database column PresentNumber SqlType(INTEGER), Default(Some(0)) */
    val presentnumber: Rep[Option[Int]] = column[Option[Int]]("PresentNumber", O.Default(Some(0)))
    /** Database column PresentID SqlType(VARCHAR), Length(50,true) */
    val presentid: Rep[Option[String]] = column[Option[String]]("PresentID", O.Length(50,varying=true))
    /** Database column PresentMoney SqlType(DECIMAL), Default(Some(0)) */
    val presentmoney: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("PresentMoney", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column PresentPoint SqlType(INTEGER), Default(Some(0)) */
    val presentpoint: Rep[Option[Int]] = column[Option[Int]]("PresentPoint", O.Default(Some(0)))
    /** Database column PresentExp SqlType(INTEGER), Default(Some(0)) */
    val presentexp: Rep[Option[Int]] = column[Option[Int]]("PresentExp", O.Default(Some(0)))
    /** Database column Weight SqlType(DOUBLE), Default(Some(0.0)) */
    val weight: Rep[Option[Double]] = column[Option[Double]]("Weight", O.Default(Some(0.0)))
    /** Database column EnableSingleSell SqlType(BOOLEAN) */
    val enablesinglesell: Rep[Option[Boolean]] = column[Option[Boolean]]("EnableSingleSell")
    /** Database column DependentProducts SqlType(VARCHAR), Length(16777216,true) */
    val dependentproducts: Rep[Option[String]] = column[Option[String]]("DependentProducts", O.Length(16777216,varying=true))

    /** Index over (alarmnum) (database name PE_PRODUCT_ALARMNUM) */
    val index1 = index("PE_PRODUCT_ALARMNUM", alarmnum)
    /** Index over (channelid) (database name PE_PRODUCT_CHANNELID) */
    val index2 = index("PE_PRODUCT_CHANNELID", channelid)
    /** Index over (classid) (database name PE_PRODUCT_CLASSID) */
    val index3 = index("PE_PRODUCT_CLASSID", classid)
    /** Index over (keyword) (database name PE_PRODUCT_KEYWORD) */
    val index4 = index("PE_PRODUCT_KEYWORD", keyword)
    /** Index over (limitnum) (database name PE_PRODUCT_LIMITNUM) */
    val index5 = index("PE_PRODUCT_LIMITNUM", limitnum)
    /** Index over (numberWholesale2) (database name PE_PRODUCT_NUMBER_WHOLESALE1) */
    val index6 = index("PE_PRODUCT_NUMBER_WHOLESALE1", numberWholesale2)
    /** Index over (numberWholesale3) (database name PE_PRODUCT_NUMBER_WHOLESALE11) */
    val index7 = index("PE_PRODUCT_NUMBER_WHOLESALE11", numberWholesale3)
    /** Index over (numberWholesale1) (database name PE_PRODUCT_NUMER_WHOLESALE) */
    val index8 = index("PE_PRODUCT_NUMER_WHOLESALE", numberWholesale1)
    /** Index over (ordernum) (database name PE_PRODUCT_ORDERNUM) */
    val index9 = index("PE_PRODUCT_ORDERNUM", ordernum)
    /** Index over (presentid) (database name PE_PRODUCT_PRESENTID) */
    val index10 = index("PE_PRODUCT_PRESENTID", presentid)
    /** Index over (producername) (database name PE_PRODUCT_PRODUCERID) */
    val index11 = index("PE_PRODUCT_PRODUCERID", producername)
    /** Index over (productkind) (database name PE_PRODUCT_PRODUCTKIND) */
    val index12 = index("PE_PRODUCT_PRODUCTKIND", productkind)
    /** Index over (productnum) (database name PE_PRODUCT_PRODUCTNUM) */
    val index13 = index("PE_PRODUCT_PRODUCTNUM", productnum)
    /** Index over (skinid) (database name PE_PRODUCT_SKINID) */
    val index14 = index("PE_PRODUCT_SKINID", skinid)
    /** Index over (templateid) (database name PE_PRODUCT_TEMPLATEID) */
    val index15 = index("PE_PRODUCT_TEMPLATEID", templateid)
    /** Index over (trademarkname) (database name PE_PRODUCT_TRADEMARKID) */
    val index16 = index("PE_PRODUCT_TRADEMARKID", trademarkname)
  }
  /** Collection-like TableQuery object for table PeProduct */
  lazy val PeProduct = new TableQuery(tag => new PeProduct(tag))
}
