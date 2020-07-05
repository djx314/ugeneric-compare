package models.access
// AUTO-GENERATED Slick data model for table PeHousecs
trait PeHousecsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeHousecs
   *  @param houseid Database column HouseID SqlType(INTEGER), PrimaryKey, Default(0)
   *  @param classid Database column ClassID SqlType(INTEGER), Default(Some(1))
   *  @param channelid Database column ChannelID SqlType(INTEGER), Default(Some(998))
   *  @param housesource Database column HouseSource SqlType(VARCHAR), Length(50,true)
   *  @param housequyu Database column HouseQuyu SqlType(VARCHAR), Length(20,true)
   *  @param housedizhi Database column HouseDiZhi SqlType(VARCHAR), Length(50,true)
   *  @param housexiangxidizhi Database column HouseXiangXiDiZhi SqlType(VARCHAR), Length(255,true)
   *  @param househuxing Database column HouseHuXing SqlType(VARCHAR), Length(50,true)
   *  @param housemianji Database column HouseMianJi SqlType(NUMERIC), Default(0)
   *  @param housechanquan Database column HouseChanQuan SqlType(VARCHAR), Length(50,true)
   *  @param housejiancheng Database column HouseJianCheng SqlType(VARCHAR), Length(15,true)
   *  @param houselouceng Database column HouseLouCeng SqlType(VARCHAR), Length(50,true)
   *  @param housechaoxiang Database column HouseChaoXiang SqlType(VARCHAR), Length(50,true)
   *  @param houseleixing Database column HouseLeiXing SqlType(VARCHAR), Length(20,true)
   *  @param housejichu Database column HouseJiChu SqlType(VARCHAR), Length(255,true)
   *  @param housezhuangxiu Database column HouseZhuangXiu SqlType(VARCHAR), Length(255,true)
   *  @param houseshuidian Database column HouseShuiDian SqlType(VARCHAR), Length(255,true)
   *  @param housedianqi Database column HouseDianQi SqlType(VARCHAR), Length(255,true)
   *  @param housejiaju Database column HouseJiaJu SqlType(VARCHAR), Length(255,true)
   *  @param housegongjiaolu Database column HouseGongJiaoLu SqlType(VARCHAR), Length(100,true)
   *  @param housegongjiaozhan Database column HouseGongJiaoZhan SqlType(VARCHAR), Length(50,true)
   *  @param houseshizheng Database column HouseShiZheng SqlType(VARCHAR), Length(255,true)
   *  @param jiaofangstartdate Database column JiaoFangStartDate SqlType(TIMESTAMP)
   *  @param totalprice Database column TotalPrice SqlType(NUMERIC), Default(Some(0))
   *  @param otherprice Database column OtherPrice SqlType(NUMERIC), Default(Some(0))
   *  @param housezhifu Database column HouseZhiFu SqlType(VARCHAR), Length(50,true)
   *  @param housepricetype Database column HousePriceType SqlType(VARCHAR), Length(50,true)
   *  @param shuifei Database column ShuiFei SqlType(VARCHAR), Length(50,true)
   *  @param contactname Database column ContactName SqlType(VARCHAR), Length(20,true)
   *  @param contactphone Database column ContactPhone SqlType(VARCHAR), Length(50,true)
   *  @param contactemail Database column ContactEmail SqlType(VARCHAR), Length(100,true)
   *  @param contactqq Database column ContactQQ SqlType(VARCHAR), Length(20,true)
   *  @param keyword Database column Keyword SqlType(VARCHAR), Length(255,true)
   *  @param youxiaoqi Database column YouXiaoQi SqlType(VARCHAR), Length(20,true)
   *  @param houseqita Database column HouseQiTa SqlType(VARCHAR), Length(16777216,true)
   *  @param editor Database column Editor SqlType(VARCHAR), Length(20,true)
   *  @param updatetime Database column UpdateTime SqlType(TIMESTAMP)
   *  @param hits Database column Hits SqlType(INTEGER), Default(Some(0))
   *  @param viewall Database column ViewAll SqlType(BOOLEAN)
   *  @param hot Database column Hot SqlType(BOOLEAN)
   *  @param ontop Database column OnTop SqlType(BOOLEAN)
   *  @param elite Database column Elite SqlType(BOOLEAN)
   *  @param passed Database column Passed SqlType(BOOLEAN)
   *  @param deleted Database column Deleted SqlType(BOOLEAN)
   *  @param commendclassdays Database column CommendClassDays SqlType(INTEGER), Default(Some(0))
   *  @param uploadphotos Database column UploadPhotos SqlType(VARCHAR), Length(16777216,true) */
  case class PeHousecsRow(houseid: Int = 0, classid: Option[Int] = Some(1), channelid: Option[Int] = Some(998), housesource: Option[String], housequyu: Option[String], housedizhi: Option[String], housexiangxidizhi: Option[String], househuxing: Option[String], housemianji: scala.math.BigDecimal = scala.math.BigDecimal("0"), housechanquan: Option[String], housejiancheng: Option[String], houselouceng: Option[String], housechaoxiang: Option[String], houseleixing: Option[String], housejichu: Option[String], housezhuangxiu: Option[String], houseshuidian: Option[String], housedianqi: Option[String], housejiaju: Option[String], housegongjiaolu: Option[String], housegongjiaozhan: Option[String], houseshizheng: Option[String], jiaofangstartdate: Option[java.sql.Timestamp], totalprice: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), otherprice: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), housezhifu: Option[String], housepricetype: Option[String], shuifei: Option[String], contactname: String, contactphone: String, contactemail: Option[String], contactqq: Option[String], keyword: String, youxiaoqi: Option[String], houseqita: Option[String], editor: Option[String], updatetime: Option[java.sql.Timestamp], hits: Option[Int] = Some(0), viewall: Option[Boolean], hot: Option[Boolean], ontop: Option[Boolean], elite: Option[Boolean], passed: Option[Boolean], deleted: Boolean, commendclassdays: Option[Int] = Some(0), uploadphotos: Option[String])
  /** GetResult implicit for fetching PeHousecsRow objects using plain SQL queries */

  /** Table description of table PE_HouseCS. Objects of this class serve as prototypes for rows in queries. */
  class PeHousecs(_tableTag: Tag) extends profile.api.Table[PeHousecsRow](_tableTag, "PE_HouseCS") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column HouseID SqlType(INTEGER), PrimaryKey, Default(0) */
    val houseid: Rep[Int] = column[Int]("HouseID", O.PrimaryKey, O.Default(0))
    /** Database column ClassID SqlType(INTEGER), Default(Some(1)) */
    val classid: Rep[Option[Int]] = column[Option[Int]]("ClassID", O.Default(Some(1)))
    /** Database column ChannelID SqlType(INTEGER), Default(Some(998)) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID", O.Default(Some(998)))
    /** Database column HouseSource SqlType(VARCHAR), Length(50,true) */
    val housesource: Rep[Option[String]] = column[Option[String]]("HouseSource", O.Length(50,varying=true))
    /** Database column HouseQuyu SqlType(VARCHAR), Length(20,true) */
    val housequyu: Rep[Option[String]] = column[Option[String]]("HouseQuyu", O.Length(20,varying=true))
    /** Database column HouseDiZhi SqlType(VARCHAR), Length(50,true) */
    val housedizhi: Rep[Option[String]] = column[Option[String]]("HouseDiZhi", O.Length(50,varying=true))
    /** Database column HouseXiangXiDiZhi SqlType(VARCHAR), Length(255,true) */
    val housexiangxidizhi: Rep[Option[String]] = column[Option[String]]("HouseXiangXiDiZhi", O.Length(255,varying=true))
    /** Database column HouseHuXing SqlType(VARCHAR), Length(50,true) */
    val househuxing: Rep[Option[String]] = column[Option[String]]("HouseHuXing", O.Length(50,varying=true))
    /** Database column HouseMianJi SqlType(NUMERIC), Default(0) */
    val housemianji: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("HouseMianJi", O.Default(scala.math.BigDecimal("0")))
    /** Database column HouseChanQuan SqlType(VARCHAR), Length(50,true) */
    val housechanquan: Rep[Option[String]] = column[Option[String]]("HouseChanQuan", O.Length(50,varying=true))
    /** Database column HouseJianCheng SqlType(VARCHAR), Length(15,true) */
    val housejiancheng: Rep[Option[String]] = column[Option[String]]("HouseJianCheng", O.Length(15,varying=true))
    /** Database column HouseLouCeng SqlType(VARCHAR), Length(50,true) */
    val houselouceng: Rep[Option[String]] = column[Option[String]]("HouseLouCeng", O.Length(50,varying=true))
    /** Database column HouseChaoXiang SqlType(VARCHAR), Length(50,true) */
    val housechaoxiang: Rep[Option[String]] = column[Option[String]]("HouseChaoXiang", O.Length(50,varying=true))
    /** Database column HouseLeiXing SqlType(VARCHAR), Length(20,true) */
    val houseleixing: Rep[Option[String]] = column[Option[String]]("HouseLeiXing", O.Length(20,varying=true))
    /** Database column HouseJiChu SqlType(VARCHAR), Length(255,true) */
    val housejichu: Rep[Option[String]] = column[Option[String]]("HouseJiChu", O.Length(255,varying=true))
    /** Database column HouseZhuangXiu SqlType(VARCHAR), Length(255,true) */
    val housezhuangxiu: Rep[Option[String]] = column[Option[String]]("HouseZhuangXiu", O.Length(255,varying=true))
    /** Database column HouseShuiDian SqlType(VARCHAR), Length(255,true) */
    val houseshuidian: Rep[Option[String]] = column[Option[String]]("HouseShuiDian", O.Length(255,varying=true))
    /** Database column HouseDianQi SqlType(VARCHAR), Length(255,true) */
    val housedianqi: Rep[Option[String]] = column[Option[String]]("HouseDianQi", O.Length(255,varying=true))
    /** Database column HouseJiaJu SqlType(VARCHAR), Length(255,true) */
    val housejiaju: Rep[Option[String]] = column[Option[String]]("HouseJiaJu", O.Length(255,varying=true))
    /** Database column HouseGongJiaoLu SqlType(VARCHAR), Length(100,true) */
    val housegongjiaolu: Rep[Option[String]] = column[Option[String]]("HouseGongJiaoLu", O.Length(100,varying=true))
    /** Database column HouseGongJiaoZhan SqlType(VARCHAR), Length(50,true) */
    val housegongjiaozhan: Rep[Option[String]] = column[Option[String]]("HouseGongJiaoZhan", O.Length(50,varying=true))
    /** Database column HouseShiZheng SqlType(VARCHAR), Length(255,true) */
    val houseshizheng: Rep[Option[String]] = column[Option[String]]("HouseShiZheng", O.Length(255,varying=true))
    /** Database column JiaoFangStartDate SqlType(TIMESTAMP) */
    val jiaofangstartdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("JiaoFangStartDate")
    /** Database column TotalPrice SqlType(NUMERIC), Default(Some(0)) */
    val totalprice: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("TotalPrice", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column OtherPrice SqlType(NUMERIC), Default(Some(0)) */
    val otherprice: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OtherPrice", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column HouseZhiFu SqlType(VARCHAR), Length(50,true) */
    val housezhifu: Rep[Option[String]] = column[Option[String]]("HouseZhiFu", O.Length(50,varying=true))
    /** Database column HousePriceType SqlType(VARCHAR), Length(50,true) */
    val housepricetype: Rep[Option[String]] = column[Option[String]]("HousePriceType", O.Length(50,varying=true))
    /** Database column ShuiFei SqlType(VARCHAR), Length(50,true) */
    val shuifei: Rep[Option[String]] = column[Option[String]]("ShuiFei", O.Length(50,varying=true))
    /** Database column ContactName SqlType(VARCHAR), Length(20,true) */
    val contactname: Rep[String] = column[String]("ContactName", O.Length(20,varying=true))
    /** Database column ContactPhone SqlType(VARCHAR), Length(50,true) */
    val contactphone: Rep[String] = column[String]("ContactPhone", O.Length(50,varying=true))
    /** Database column ContactEmail SqlType(VARCHAR), Length(100,true) */
    val contactemail: Rep[Option[String]] = column[Option[String]]("ContactEmail", O.Length(100,varying=true))
    /** Database column ContactQQ SqlType(VARCHAR), Length(20,true) */
    val contactqq: Rep[Option[String]] = column[Option[String]]("ContactQQ", O.Length(20,varying=true))
    /** Database column Keyword SqlType(VARCHAR), Length(255,true) */
    val keyword: Rep[String] = column[String]("Keyword", O.Length(255,varying=true))
    /** Database column YouXiaoQi SqlType(VARCHAR), Length(20,true) */
    val youxiaoqi: Rep[Option[String]] = column[Option[String]]("YouXiaoQi", O.Length(20,varying=true))
    /** Database column HouseQiTa SqlType(VARCHAR), Length(16777216,true) */
    val houseqita: Rep[Option[String]] = column[Option[String]]("HouseQiTa", O.Length(16777216,varying=true))
    /** Database column Editor SqlType(VARCHAR), Length(20,true) */
    val editor: Rep[Option[String]] = column[Option[String]]("Editor", O.Length(20,varying=true))
    /** Database column UpdateTime SqlType(TIMESTAMP) */
    val updatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UpdateTime")
    /** Database column Hits SqlType(INTEGER), Default(Some(0)) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits", O.Default(Some(0)))
    /** Database column ViewAll SqlType(BOOLEAN) */
    val viewall: Rep[Option[Boolean]] = column[Option[Boolean]]("ViewAll")
    /** Database column Hot SqlType(BOOLEAN) */
    val hot: Rep[Option[Boolean]] = column[Option[Boolean]]("Hot")
    /** Database column OnTop SqlType(BOOLEAN) */
    val ontop: Rep[Option[Boolean]] = column[Option[Boolean]]("OnTop")
    /** Database column Elite SqlType(BOOLEAN) */
    val elite: Rep[Option[Boolean]] = column[Option[Boolean]]("Elite")
    /** Database column Passed SqlType(BOOLEAN) */
    val passed: Rep[Option[Boolean]] = column[Option[Boolean]]("Passed")
    /** Database column Deleted SqlType(BOOLEAN) */
    val deleted: Rep[Boolean] = column[Boolean]("Deleted")
    /** Database column CommendClassDays SqlType(INTEGER), Default(Some(0)) */
    val commendclassdays: Rep[Option[Int]] = column[Option[Int]]("CommendClassDays", O.Default(Some(0)))
    /** Database column UploadPhotos SqlType(VARCHAR), Length(16777216,true) */
    val uploadphotos: Rep[Option[String]] = column[Option[String]]("UploadPhotos", O.Length(16777216,varying=true))

    /** Index over (channelid) (database name PE_HOUSECS_CHANNELID) */
    val index1 = index("PE_HOUSECS_CHANNELID", channelid)
    /** Index over (classid) (database name PE_HOUSECS_CLASSID) */
    val index2 = index("PE_HOUSECS_CLASSID", classid)
    /** Index over (elite) (database name PE_HOUSECS_ELITE) */
    val index3 = index("PE_HOUSECS_ELITE", elite)
    /** Index over (housemianji) (database name PE_HOUSECS_FW_MIANJI) */
    val index4 = index("PE_HOUSECS_FW_MIANJI", housemianji)
    /** Index over (hits) (database name PE_HOUSECS_HITS) */
    val index5 = index("PE_HOUSECS_HITS", hits)
    /** Index over (keyword) (database name PE_HOUSECS_KEY) */
    val index6 = index("PE_HOUSECS_KEY", keyword)
    /** Index over (ontop) (database name PE_HOUSECS_ONTOP) */
    val index7 = index("PE_HOUSECS_ONTOP", ontop)
    /** Index over (passed) (database name PE_HOUSECS_PASSED) */
    val index8 = index("PE_HOUSECS_PASSED", passed)
    /** Index over (updatetime) (database name PE_HOUSECS_UPDATETIME) */
    val index9 = index("PE_HOUSECS_UPDATETIME", updatetime)
  }
  /** Collection-like TableQuery object for table PeHousecs */
  lazy val PeHousecs = new TableQuery(tag => new PeHousecs(tag))
}
