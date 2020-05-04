package models.access
// AUTO-GENERATED Slick data model for table PeConfig
trait PeConfigTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeConfig
    *  @param sitename Database column SiteName SqlType(VARCHAR), Length(50,true)
    *  @param sitetitle Database column SiteTitle SqlType(VARCHAR), Length(50,true)
    *  @param siteurl Database column SiteUrl SqlType(VARCHAR), Length(255,true)
    *  @param installdir Database column InstallDir SqlType(VARCHAR), Length(30,true)
    *  @param logourl Database column LogoUrl SqlType(VARCHAR), Length(255,true)
    *  @param bannerurl Database column BannerUrl SqlType(VARCHAR), Length(255,true)
    *  @param webmastername Database column WebmasterName SqlType(VARCHAR), Length(20,true)
    *  @param webmasteremail Database column WebmasterEmail SqlType(VARCHAR), Length(100,true)
    *  @param copyright Database column Copyright SqlType(VARCHAR), Length(16777216,true)
    *  @param metaKeywords Database column Meta_Keywords SqlType(VARCHAR), Length(16777216,true)
    *  @param metaDescription Database column Meta_Description SqlType(VARCHAR), Length(16777216,true)
    *  @param sitekey Database column SiteKey SqlType(VARCHAR), Length(16777216,true)
    *  @param showsitechannel Database column ShowSiteChannel SqlType(BOOLEAN)
    *  @param showadminlogin Database column ShowAdminLogin SqlType(BOOLEAN)
    *  @param enablesaveremote Database column EnableSaveRemote SqlType(BOOLEAN)
    *  @param enablelinkreg Database column EnableLinkReg SqlType(BOOLEAN)
    *  @param enablecountfriendsitehits Database column EnableCountFriendSiteHits SqlType(BOOLEAN)
    *  @param enablesoftkey Database column EnableSoftKey SqlType(BOOLEAN)
    *  @param objnameFso Database column objName_FSO SqlType(VARCHAR), Length(50,true)
    *  @param admindir Database column AdminDir SqlType(VARCHAR), Length(50,true)
    *  @param addir Database column ADDir SqlType(VARCHAR), Length(50,true)
    *  @param announcecookietime Database column AnnounceCookieTime SqlType(INTEGER), Default(Some(0))
    *  @param hitsofhot Database column HitsOfHot SqlType(INTEGER)
    *  @param fileextSiteindex Database column FileExt_SiteIndex SqlType(INTEGER), Default(Some(0))
    *  @param fileextSitespecial Database column FileExt_SiteSpecial SqlType(INTEGER), Default(Some(0))
    *  @param siteurltype Database column SiteUrlType SqlType(INTEGER), Default(Some(0))
    *  @param modules Database column Modules SqlType(VARCHAR), Length(16777216,true)
    *  @param lockiptype Database column LockIPType SqlType(INTEGER), Default(0)
    *  @param lockip Database column LockIP SqlType(VARCHAR), Length(16777216,true)
    *  @param enableuserreg Database column EnableUserReg SqlType(BOOLEAN)
    *  @param emailcheckreg Database column EmailCheckReg SqlType(BOOLEAN)
    *  @param admincheckreg Database column AdminCheckReg SqlType(BOOLEAN)
    *  @param enablemultiregperemail Database column EnableMultiRegPerEmail SqlType(BOOLEAN)
    *  @param usernamelimit Database column UserNameLimit SqlType(INTEGER), Default(Some(0))
    *  @param usernamemax Database column UserNameMax SqlType(INTEGER), Default(Some(0))
    *  @param usernameRegdisabled Database column UserName_RegDisabled SqlType(VARCHAR), Length(16777216,true)
    *  @param regfieldsMustfill Database column RegFields_MustFill SqlType(VARCHAR), Length(16777216,true)
    *  @param enablecheckcodeoflogin Database column EnableCheckCodeOfLogin SqlType(BOOLEAN)
    *  @param enablecheckcodeofreg Database column EnableCheckCodeOfReg SqlType(BOOLEAN)
    *  @param enableqaofreg Database column EnableQAofReg SqlType(BOOLEAN)
    *  @param qaofreg Database column QAofReg SqlType(VARCHAR), Length(16777216,true)
    *  @param presentexp Database column PresentExp SqlType(DOUBLE), Default(Some(0.0))
    *  @param presentmoney Database column PresentMoney SqlType(DOUBLE), Default(Some(0.0))
    *  @param presentpoint Database column PresentPoint SqlType(INTEGER), Default(Some(0))
    *  @param presentvalidnum Database column PresentValidNum SqlType(INTEGER), Default(Some(0))
    *  @param presentvalidunit Database column PresentValidUnit SqlType(INTEGER), Default(Some(0))
    *  @param moneyexchangepoint Database column MoneyExchangePoint SqlType(DOUBLE), Default(Some(0.0))
    *  @param moneyexchangevalidday Database column MoneyExchangeValidDay SqlType(DOUBLE), Default(Some(0.0))
    *  @param userexpexchangepoint Database column UserExpExchangePoint SqlType(DOUBLE), Default(Some(0.0))
    *  @param userexpexchangevalidday Database column UserExpExchangeValidDay SqlType(DOUBLE), Default(Some(0.0))
    *  @param presentexpperlogin Database column PresentExpPerLogin SqlType(INTEGER), Default(Some(0))
    *  @param presentexpperelite Database column PresentExpPerElite SqlType(INTEGER), Default(Some(0))
    *  @param pointname Database column PointName SqlType(VARCHAR), Length(20,true)
    *  @param pointunit Database column PointUnit SqlType(VARCHAR), Length(20,true)
    *  @param emailofregcheck Database column EmailOfRegCheck SqlType(VARCHAR), Length(16777216,true)
    *  @param mailobject Database column MailObject SqlType(INTEGER), Default(Some(0))
    *  @param mailserver Database column MailServer SqlType(VARCHAR), Length(50,true)
    *  @param mailserverusername Database column MailServerUserName SqlType(VARCHAR), Length(50,true)
    *  @param mailserverpassword Database column MailServerPassWord SqlType(VARCHAR), Length(50,true)
    *  @param maildomain Database column MailDomain SqlType(VARCHAR), Length(50,true)
    *  @param photoobject Database column PhotoObject SqlType(INTEGER), Default(Some(0))
    *  @param thumbDefaultwidth Database column Thumb_DefaultWidth SqlType(INTEGER), Default(Some(0))
    *  @param thumbDefaultheight Database column Thumb_DefaultHeight SqlType(INTEGER), Default(Some(0))
    *  @param thumbArithmetic Database column Thumb_Arithmetic SqlType(INTEGER), Default(Some(0))
    *  @param watermarkType Database column Watermark_Type SqlType(INTEGER), Default(Some(0))
    *  @param watermarkText Database column Watermark_Text SqlType(VARCHAR), Length(50,true)
    *  @param watermarkTextFontname Database column Watermark_Text_FontName SqlType(VARCHAR), Length(50,true)
    *  @param watermarkTextFontsize Database column Watermark_Text_FontSize SqlType(INTEGER), Default(Some(0))
    *  @param watermarkTextFontcolor Database column Watermark_Text_FontColor SqlType(VARCHAR), Length(50,true)
    *  @param watermarkTextBold Database column Watermark_Text_Bold SqlType(BOOLEAN)
    *  @param watermarkImagesFilename Database column Watermark_Images_FileName SqlType(VARCHAR), Length(255,true)
    *  @param watermarkImagesTransparence Database column Watermark_Images_Transparence SqlType(INTEGER), Default(Some(0))
    *  @param watermarkImagesBackgroundcolor Database column Watermark_Images_BackgroundColor SqlType(VARCHAR), Length(20,true)
    *  @param watermarkPositionX Database column Watermark_Position_X SqlType(INTEGER), Default(Some(0))
    *  @param watermarkPositionY Database column Watermark_Position_Y SqlType(INTEGER), Default(Some(0))
    *  @param watermarkPosition Database column Watermark_Position SqlType(INTEGER), Default(Some(0))
    *  @param searchinterval Database column SearchInterval SqlType(INTEGER), Default(Some(0))
    *  @param searchresultnum Database column SearchResultNum SqlType(INTEGER), Default(Some(0))
    *  @param maxperpageSearchresult Database column MaxPerPage_SearchResult SqlType(INTEGER), Default(Some(0))
    *  @param searchcontent Database column SearchContent SqlType(BOOLEAN)
    *  @param enableguestbuy Database column EnableGuestBuy SqlType(BOOLEAN)
    *  @param includetax Database column IncludeTax SqlType(BOOLEAN)
    *  @param taxrate Database column TaxRate SqlType(INTEGER), Default(Some(0))
    *  @param payonlineprovider Database column PayOnlineProvider SqlType(INTEGER), Default(Some(0))
    *  @param payonlineshopid Database column PayOnlineShopID SqlType(VARCHAR), Length(50,true)
    *  @param payonlinekey Database column PayOnlineKey SqlType(VARCHAR), Length(255,true)
    *  @param payonlinerate Database column PayOnlineRate SqlType(NUMERIC), Default(Some(0))
    *  @param payonlinepluspoundage Database column PayOnlinePlusPoundage SqlType(BOOLEAN)
    *  @param prefixOrderformnum Database column Prefix_OrderFormNum SqlType(VARCHAR), Length(4,true)
    *  @param prefixPaymentnum Database column Prefix_PaymentNum SqlType(VARCHAR), Length(4,true)
    *  @param country Database column Country SqlType(VARCHAR), Length(50,true)
    *  @param province Database column Province SqlType(VARCHAR), Length(50,true)
    *  @param city Database column City SqlType(VARCHAR), Length(50,true)
    *  @param postcode Database column PostCode SqlType(VARCHAR), Length(10,true)
    *  @param messageoforderconfirm Database column MessageOfOrderConfirm SqlType(VARCHAR), Length(16777216,true)
    *  @param emailoforderconfirm Database column EmailOfOrderConfirm SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofsendcard Database column MessageOfSendCard SqlType(VARCHAR), Length(16777216,true)
    *  @param emailofsendcard Database column EmailOfSendCard SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofreceiptmoney Database column MessageOfReceiptMoney SqlType(VARCHAR), Length(16777216,true)
    *  @param emailofreceiptmoney Database column EmailOfReceiptMoney SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofrefund Database column MessageOfRefund SqlType(VARCHAR), Length(16777216,true)
    *  @param emailofrefund Database column EmailOfRefund SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofinvoice Database column MessageOfInvoice SqlType(VARCHAR), Length(16777216,true)
    *  @param emailofinvoice Database column EmailOfInvoice SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofdeliver Database column MessageOfDeliver SqlType(VARCHAR), Length(16777216,true)
    *  @param emailofdeliver Database column EmailOfDeliver SqlType(VARCHAR), Length(16777216,true)
    *  @param guestbookEnablevisitor Database column GuestBook_EnableVisitor SqlType(BOOLEAN)
    *  @param guestbookcheck Database column GuestBookCheck SqlType(BOOLEAN)
    *  @param guestbookEnablemanagerubbish Database column GuestBook_EnableManageRubbish SqlType(BOOLEAN)
    *  @param guestbookManagerubbish Database column GuestBook_ManageRubbish SqlType(VARCHAR), Length(16777216,true)
    *  @param guestbookShowip Database column GuestBook_ShowIP SqlType(BOOLEAN)
    *  @param guestbookIsassignsort Database column GuestBook_IsAssignSort SqlType(BOOLEAN)
    *  @param guestbookMaxperpage Database column GuestBook_MaxPerPage SqlType(VARCHAR), Length(16777216,true)
    *  @param enablerss Database column EnableRss SqlType(BOOLEAN)
    *  @param rsscodetype Database column RssCodeType SqlType(BOOLEAN)
    *  @param enablewap Database column EnableWap SqlType(BOOLEAN)
    *  @param waplogo Database column WapLogo SqlType(VARCHAR), Length(100,true)
    *  @param enablewappl Database column EnableWapPl SqlType(BOOLEAN)
    *  @param showwapappendix Database column ShowWapAppendix SqlType(BOOLEAN)
    *  @param showwapshop Database column ShowWapShop SqlType(BOOLEAN)
    *  @param showwapmanage Database column ShowWapManage SqlType(BOOLEAN)
    *  @param databaseversion Database column DatabaseVersion SqlType(DOUBLE), Default(Some(0.0))
    *  @param timingSetdate Database column Timing_SetDate SqlType(INTEGER), Default(Some(0))
    *  @param timingSetday Database column Timing_SetDay SqlType(INTEGER), Default(Some(0))
    *  @param timingSetweekday Database column Timing_SetWeekday SqlType(INTEGER), Default(Some(0))
    *  @param timingTime Database column Timing_Time SqlType(VARCHAR), Length(50,true)
    *  @param timingDate Database column Timing_Date SqlType(TIMESTAMP)
    *  @param timingCollectionitemid Database column Timing_CollectionItemID SqlType(VARCHAR), Length(200,true)
    *  @param timingAreacollection Database column Timing_AreaCollection SqlType(VARCHAR), Length(255,true)
    *  @param timingBreakpoint Database column Timing_Breakpoint SqlType(VARCHAR), Length(16777216,true)
    *  @param iscustomContent Database column IsCustom_Content SqlType(BOOLEAN)
    *  @param smsusername Database column SMSUserName SqlType(VARCHAR), Length(50,true)
    *  @param smskey Database column SMSKey SqlType(VARCHAR), Length(50,true)
    *  @param mobiles Database column Mobiles SqlType(VARCHAR), Length(255,true)
    *  @param sendmessagetoadminwhenorder Database column SendMessageToAdminWhenOrder SqlType(BOOLEAN)
    *  @param sendmessagetomemberwhenpaysuccess Database column SendMessageToMemberWhenPaySuccess SqlType(BOOLEAN)
    *  @param surveykey Database column SurveyKey SqlType(VARCHAR), Length(16777216,true)
    *  @param messageoforder Database column MessageOfOrder SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofaddremit Database column MessageOfAddRemit SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofaddincome Database column MessageOfAddIncome SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofaddpayment Database column MessageOfAddPayment SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofexchangepoint Database column MessageOfExchangePoint SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofaddpoint Database column MessageOfAddPoint SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofminuspoint Database column MessageOfMinusPoint SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofexchangevalid Database column MessageOfExchangeValid SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofaddvalid Database column MessageOfAddValid SqlType(VARCHAR), Length(16777216,true)
    *  @param messageofminusvalid Database column MessageOfMinusValid SqlType(VARCHAR), Length(16777216,true)
    *  @param thumbBackgroundcolor Database column Thumb_BackgroundColor SqlType(VARCHAR), Length(10,true)
    *  @param photoquality Database column PhotoQuality SqlType(INTEGER)
    *  @param showusermodel Database column ShowUserModel SqlType(BOOLEAN)
    *  @param showanonymous Database column ShowAnonymous SqlType(BOOLEAN) */
  case class PeConfigRow(
    sitename: Option[String],
    sitetitle: Option[String],
    siteurl: Option[String],
    installdir: Option[String],
    logourl: Option[String],
    bannerurl: Option[String],
    webmastername: Option[String],
    webmasteremail: Option[String],
    copyright: Option[String],
    metaKeywords: Option[String],
    metaDescription: Option[String],
    sitekey: Option[String],
    showsitechannel: Boolean,
    showadminlogin: Boolean,
    enablesaveremote: Boolean,
    enablelinkreg: Boolean,
    enablecountfriendsitehits: Boolean,
    enablesoftkey: Boolean,
    objnameFso: Option[String],
    admindir: Option[String],
    addir: Option[String],
    announcecookietime: Option[Int] = Some(0),
    hitsofhot: Option[Int],
    fileextSiteindex: Option[Int] = Some(0),
    fileextSitespecial: Option[Int] = Some(0),
    siteurltype: Option[Int] = Some(0),
    modules: Option[String],
    lockiptype: Int = 0,
    lockip: Option[String],
    enableuserreg: Boolean,
    emailcheckreg: Boolean,
    admincheckreg: Boolean,
    enablemultiregperemail: Option[Boolean],
    usernamelimit: Option[Int] = Some(0),
    usernamemax: Option[Int] = Some(0),
    usernameRegdisabled: Option[String],
    regfieldsMustfill: Option[String],
    enablecheckcodeoflogin: Option[Boolean],
    enablecheckcodeofreg: Option[Boolean],
    enableqaofreg: Option[Boolean],
    qaofreg: Option[String],
    presentexp: Option[Double] = Some(0.0),
    presentmoney: Option[Double] = Some(0.0),
    presentpoint: Option[Int] = Some(0),
    presentvalidnum: Option[Int] = Some(0),
    presentvalidunit: Option[Int] = Some(0),
    moneyexchangepoint: Option[Double] = Some(0.0),
    moneyexchangevalidday: Option[Double] = Some(0.0),
    userexpexchangepoint: Option[Double] = Some(0.0),
    userexpexchangevalidday: Option[Double] = Some(0.0),
    presentexpperlogin: Option[Int] = Some(0),
    presentexpperelite: Option[Int] = Some(0),
    pointname: Option[String],
    pointunit: Option[String],
    emailofregcheck: Option[String],
    mailobject: Option[Int] = Some(0),
    mailserver: Option[String],
    mailserverusername: Option[String],
    mailserverpassword: Option[String],
    maildomain: Option[String],
    photoobject: Option[Int] = Some(0),
    thumbDefaultwidth: Option[Int] = Some(0),
    thumbDefaultheight: Option[Int] = Some(0),
    thumbArithmetic: Option[Int] = Some(0),
    watermarkType: Option[Int] = Some(0),
    watermarkText: Option[String],
    watermarkTextFontname: Option[String],
    watermarkTextFontsize: Option[Int] = Some(0),
    watermarkTextFontcolor: Option[String],
    watermarkTextBold: Option[Boolean],
    watermarkImagesFilename: Option[String],
    watermarkImagesTransparence: Option[Int] = Some(0),
    watermarkImagesBackgroundcolor: Option[String],
    watermarkPositionX: Option[Int] = Some(0),
    watermarkPositionY: Option[Int] = Some(0),
    watermarkPosition: Option[Int] = Some(0),
    searchinterval: Option[Int] = Some(0),
    searchresultnum: Option[Int] = Some(0),
    maxperpageSearchresult: Option[Int] = Some(0),
    searchcontent: Option[Boolean],
    enableguestbuy: Option[Boolean],
    includetax: Option[Boolean],
    taxrate: Option[Int] = Some(0),
    payonlineprovider: Option[Int] = Some(0),
    payonlineshopid: Option[String],
    payonlinekey: Option[String],
    payonlinerate: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    payonlinepluspoundage: Option[Boolean],
    prefixOrderformnum: Option[String],
    prefixPaymentnum: Option[String],
    country: Option[String],
    province: Option[String],
    city: Option[String],
    postcode: Option[String],
    messageoforderconfirm: Option[String],
    emailoforderconfirm: Option[String],
    messageofsendcard: Option[String],
    emailofsendcard: Option[String],
    messageofreceiptmoney: Option[String],
    emailofreceiptmoney: Option[String],
    messageofrefund: Option[String],
    emailofrefund: Option[String],
    messageofinvoice: Option[String],
    emailofinvoice: Option[String],
    messageofdeliver: Option[String],
    emailofdeliver: Option[String],
    guestbookEnablevisitor: Boolean,
    guestbookcheck: Boolean,
    guestbookEnablemanagerubbish: Boolean,
    guestbookManagerubbish: Option[String],
    guestbookShowip: Boolean,
    guestbookIsassignsort: Boolean,
    guestbookMaxperpage: Option[String],
    enablerss: Boolean,
    rsscodetype: Option[Boolean],
    enablewap: Boolean,
    waplogo: Option[String],
    enablewappl: Boolean,
    showwapappendix: Boolean,
    showwapshop: Option[Boolean],
    showwapmanage: Option[Boolean],
    databaseversion: Option[Double] = Some(0.0),
    timingSetdate: Option[Int] = Some(0),
    timingSetday: Option[Int] = Some(0),
    timingSetweekday: Option[Int] = Some(0),
    timingTime: Option[String],
    timingDate: Option[java.sql.Timestamp],
    timingCollectionitemid: Option[String],
    timingAreacollection: Option[String],
    timingBreakpoint: Option[String],
    iscustomContent: Option[Boolean],
    smsusername: Option[String],
    smskey: Option[String],
    mobiles: Option[String],
    sendmessagetoadminwhenorder: Option[Boolean],
    sendmessagetomemberwhenpaysuccess: Option[Boolean],
    surveykey: Option[String],
    messageoforder: Option[String],
    messageofaddremit: Option[String],
    messageofaddincome: Option[String],
    messageofaddpayment: Option[String],
    messageofexchangepoint: Option[String],
    messageofaddpoint: Option[String],
    messageofminuspoint: Option[String],
    messageofexchangevalid: Option[String],
    messageofaddvalid: Option[String],
    messageofminusvalid: Option[String],
    thumbBackgroundcolor: Option[String],
    photoquality: Option[Int],
    showusermodel: Option[Boolean],
    showanonymous: Option[Boolean]
  )

  /** GetResult implicit for fetching PeConfigRow objects using plain SQL queries */
  /** Table description of table PE_Config. Objects of this class serve as prototypes for rows in queries. */
  class PeConfig(_tableTag: Tag) extends profile.api.Table[PeConfigRow](_tableTag, "PE_Config") {
    def * =
      (sitename :: sitetitle :: siteurl :: installdir :: logourl :: bannerurl :: webmastername :: webmasteremail :: copyright :: metaKeywords :: metaDescription :: sitekey :: showsitechannel :: showadminlogin :: enablesaveremote :: enablelinkreg :: enablecountfriendsitehits :: enablesoftkey :: objnameFso :: admindir :: addir :: announcecookietime :: hitsofhot :: fileextSiteindex :: fileextSitespecial :: siteurltype :: modules :: lockiptype :: lockip :: enableuserreg :: emailcheckreg :: admincheckreg :: enablemultiregperemail :: usernamelimit :: usernamemax :: usernameRegdisabled :: regfieldsMustfill :: enablecheckcodeoflogin :: enablecheckcodeofreg :: enableqaofreg :: qaofreg :: presentexp :: presentmoney :: presentpoint :: presentvalidnum :: presentvalidunit :: moneyexchangepoint :: moneyexchangevalidday :: userexpexchangepoint :: userexpexchangevalidday :: presentexpperlogin :: presentexpperelite :: pointname :: pointunit :: emailofregcheck :: mailobject :: mailserver :: mailserverusername :: mailserverpassword :: maildomain :: photoobject :: thumbDefaultwidth :: thumbDefaultheight :: thumbArithmetic :: watermarkType :: watermarkText :: watermarkTextFontname :: watermarkTextFontsize :: watermarkTextFontcolor :: watermarkTextBold :: watermarkImagesFilename :: watermarkImagesTransparence :: watermarkImagesBackgroundcolor :: watermarkPositionX :: watermarkPositionY :: watermarkPosition :: searchinterval :: searchresultnum :: maxperpageSearchresult :: searchcontent :: enableguestbuy :: includetax :: taxrate :: payonlineprovider :: payonlineshopid :: payonlinekey :: payonlinerate :: payonlinepluspoundage :: prefixOrderformnum :: prefixPaymentnum :: country :: province :: city :: postcode :: messageoforderconfirm :: emailoforderconfirm :: messageofsendcard :: emailofsendcard :: messageofreceiptmoney :: emailofreceiptmoney :: messageofrefund :: emailofrefund :: messageofinvoice :: emailofinvoice :: messageofdeliver :: emailofdeliver :: guestbookEnablevisitor :: guestbookcheck :: guestbookEnablemanagerubbish :: guestbookManagerubbish :: guestbookShowip :: guestbookIsassignsort :: guestbookMaxperpage :: enablerss :: rsscodetype :: enablewap :: waplogo :: enablewappl :: showwapappendix :: showwapshop :: showwapmanage :: databaseversion :: timingSetdate :: timingSetday :: timingSetweekday :: timingTime :: timingDate :: timingCollectionitemid :: timingAreacollection :: timingBreakpoint :: iscustomContent :: smsusername :: smskey :: mobiles :: sendmessagetoadminwhenorder :: sendmessagetomemberwhenpaysuccess :: surveykey :: messageoforder :: messageofaddremit :: messageofaddincome :: messageofaddpayment :: messageofexchangepoint :: messageofaddpoint :: messageofminuspoint :: messageofexchangevalid :: messageofaddvalid :: messageofminusvalid :: thumbBackgroundcolor :: photoquality :: showusermodel :: showanonymous :: HNil)
        .mapTo[PeConfigRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column SiteName SqlType(VARCHAR), Length(50,true) */
    val sitename: Rep[Option[String]] = column[Option[String]]("SiteName", O.Length(50, varying = true))

    /** Database column SiteTitle SqlType(VARCHAR), Length(50,true) */
    val sitetitle: Rep[Option[String]] = column[Option[String]]("SiteTitle", O.Length(50, varying = true))

    /** Database column SiteUrl SqlType(VARCHAR), Length(255,true) */
    val siteurl: Rep[Option[String]] = column[Option[String]]("SiteUrl", O.Length(255, varying = true))

    /** Database column InstallDir SqlType(VARCHAR), Length(30,true) */
    val installdir: Rep[Option[String]] = column[Option[String]]("InstallDir", O.Length(30, varying = true))

    /** Database column LogoUrl SqlType(VARCHAR), Length(255,true) */
    val logourl: Rep[Option[String]] = column[Option[String]]("LogoUrl", O.Length(255, varying = true))

    /** Database column BannerUrl SqlType(VARCHAR), Length(255,true) */
    val bannerurl: Rep[Option[String]] = column[Option[String]]("BannerUrl", O.Length(255, varying = true))

    /** Database column WebmasterName SqlType(VARCHAR), Length(20,true) */
    val webmastername: Rep[Option[String]] = column[Option[String]]("WebmasterName", O.Length(20, varying = true))

    /** Database column WebmasterEmail SqlType(VARCHAR), Length(100,true) */
    val webmasteremail: Rep[Option[String]] = column[Option[String]]("WebmasterEmail", O.Length(100, varying = true))

    /** Database column Copyright SqlType(VARCHAR), Length(16777216,true) */
    val copyright: Rep[Option[String]] = column[Option[String]]("Copyright", O.Length(16777216, varying = true))

    /** Database column Meta_Keywords SqlType(VARCHAR), Length(16777216,true) */
    val metaKeywords: Rep[Option[String]] = column[Option[String]]("Meta_Keywords", O.Length(16777216, varying = true))

    /** Database column Meta_Description SqlType(VARCHAR), Length(16777216,true) */
    val metaDescription: Rep[Option[String]] = column[Option[String]]("Meta_Description", O.Length(16777216, varying = true))

    /** Database column SiteKey SqlType(VARCHAR), Length(16777216,true) */
    val sitekey: Rep[Option[String]] = column[Option[String]]("SiteKey", O.Length(16777216, varying = true))

    /** Database column ShowSiteChannel SqlType(BOOLEAN) */
    val showsitechannel: Rep[Boolean] = column[Boolean]("ShowSiteChannel")

    /** Database column ShowAdminLogin SqlType(BOOLEAN) */
    val showadminlogin: Rep[Boolean] = column[Boolean]("ShowAdminLogin")

    /** Database column EnableSaveRemote SqlType(BOOLEAN) */
    val enablesaveremote: Rep[Boolean] = column[Boolean]("EnableSaveRemote")

    /** Database column EnableLinkReg SqlType(BOOLEAN) */
    val enablelinkreg: Rep[Boolean] = column[Boolean]("EnableLinkReg")

    /** Database column EnableCountFriendSiteHits SqlType(BOOLEAN) */
    val enablecountfriendsitehits: Rep[Boolean] = column[Boolean]("EnableCountFriendSiteHits")

    /** Database column EnableSoftKey SqlType(BOOLEAN) */
    val enablesoftkey: Rep[Boolean] = column[Boolean]("EnableSoftKey")

    /** Database column objName_FSO SqlType(VARCHAR), Length(50,true) */
    val objnameFso: Rep[Option[String]] = column[Option[String]]("objName_FSO", O.Length(50, varying = true))

    /** Database column AdminDir SqlType(VARCHAR), Length(50,true) */
    val admindir: Rep[Option[String]] = column[Option[String]]("AdminDir", O.Length(50, varying = true))

    /** Database column ADDir SqlType(VARCHAR), Length(50,true) */
    val addir: Rep[Option[String]] = column[Option[String]]("ADDir", O.Length(50, varying = true))

    /** Database column AnnounceCookieTime SqlType(INTEGER), Default(Some(0)) */
    val announcecookietime: Rep[Option[Int]] = column[Option[Int]]("AnnounceCookieTime", O.Default(Some(0)))

    /** Database column HitsOfHot SqlType(INTEGER) */
    val hitsofhot: Rep[Option[Int]] = column[Option[Int]]("HitsOfHot")

    /** Database column FileExt_SiteIndex SqlType(INTEGER), Default(Some(0)) */
    val fileextSiteindex: Rep[Option[Int]] = column[Option[Int]]("FileExt_SiteIndex", O.Default(Some(0)))

    /** Database column FileExt_SiteSpecial SqlType(INTEGER), Default(Some(0)) */
    val fileextSitespecial: Rep[Option[Int]] = column[Option[Int]]("FileExt_SiteSpecial", O.Default(Some(0)))

    /** Database column SiteUrlType SqlType(INTEGER), Default(Some(0)) */
    val siteurltype: Rep[Option[Int]] = column[Option[Int]]("SiteUrlType", O.Default(Some(0)))

    /** Database column Modules SqlType(VARCHAR), Length(16777216,true) */
    val modules: Rep[Option[String]] = column[Option[String]]("Modules", O.Length(16777216, varying = true))

    /** Database column LockIPType SqlType(INTEGER), Default(0) */
    val lockiptype: Rep[Int] = column[Int]("LockIPType", O.Default(0))

    /** Database column LockIP SqlType(VARCHAR), Length(16777216,true) */
    val lockip: Rep[Option[String]] = column[Option[String]]("LockIP", O.Length(16777216, varying = true))

    /** Database column EnableUserReg SqlType(BOOLEAN) */
    val enableuserreg: Rep[Boolean] = column[Boolean]("EnableUserReg")

    /** Database column EmailCheckReg SqlType(BOOLEAN) */
    val emailcheckreg: Rep[Boolean] = column[Boolean]("EmailCheckReg")

    /** Database column AdminCheckReg SqlType(BOOLEAN) */
    val admincheckreg: Rep[Boolean] = column[Boolean]("AdminCheckReg")

    /** Database column EnableMultiRegPerEmail SqlType(BOOLEAN) */
    val enablemultiregperemail: Rep[Option[Boolean]] = column[Option[Boolean]]("EnableMultiRegPerEmail")

    /** Database column UserNameLimit SqlType(INTEGER), Default(Some(0)) */
    val usernamelimit: Rep[Option[Int]] = column[Option[Int]]("UserNameLimit", O.Default(Some(0)))

    /** Database column UserNameMax SqlType(INTEGER), Default(Some(0)) */
    val usernamemax: Rep[Option[Int]] = column[Option[Int]]("UserNameMax", O.Default(Some(0)))

    /** Database column UserName_RegDisabled SqlType(VARCHAR), Length(16777216,true) */
    val usernameRegdisabled: Rep[Option[String]] = column[Option[String]]("UserName_RegDisabled", O.Length(16777216, varying = true))

    /** Database column RegFields_MustFill SqlType(VARCHAR), Length(16777216,true) */
    val regfieldsMustfill: Rep[Option[String]] = column[Option[String]]("RegFields_MustFill", O.Length(16777216, varying = true))

    /** Database column EnableCheckCodeOfLogin SqlType(BOOLEAN) */
    val enablecheckcodeoflogin: Rep[Option[Boolean]] = column[Option[Boolean]]("EnableCheckCodeOfLogin")

    /** Database column EnableCheckCodeOfReg SqlType(BOOLEAN) */
    val enablecheckcodeofreg: Rep[Option[Boolean]] = column[Option[Boolean]]("EnableCheckCodeOfReg")

    /** Database column EnableQAofReg SqlType(BOOLEAN) */
    val enableqaofreg: Rep[Option[Boolean]] = column[Option[Boolean]]("EnableQAofReg")

    /** Database column QAofReg SqlType(VARCHAR), Length(16777216,true) */
    val qaofreg: Rep[Option[String]] = column[Option[String]]("QAofReg", O.Length(16777216, varying = true))

    /** Database column PresentExp SqlType(DOUBLE), Default(Some(0.0)) */
    val presentexp: Rep[Option[Double]] = column[Option[Double]]("PresentExp", O.Default(Some(0.0)))

    /** Database column PresentMoney SqlType(DOUBLE), Default(Some(0.0)) */
    val presentmoney: Rep[Option[Double]] = column[Option[Double]]("PresentMoney", O.Default(Some(0.0)))

    /** Database column PresentPoint SqlType(INTEGER), Default(Some(0)) */
    val presentpoint: Rep[Option[Int]] = column[Option[Int]]("PresentPoint", O.Default(Some(0)))

    /** Database column PresentValidNum SqlType(INTEGER), Default(Some(0)) */
    val presentvalidnum: Rep[Option[Int]] = column[Option[Int]]("PresentValidNum", O.Default(Some(0)))

    /** Database column PresentValidUnit SqlType(INTEGER), Default(Some(0)) */
    val presentvalidunit: Rep[Option[Int]] = column[Option[Int]]("PresentValidUnit", O.Default(Some(0)))

    /** Database column MoneyExchangePoint SqlType(DOUBLE), Default(Some(0.0)) */
    val moneyexchangepoint: Rep[Option[Double]] = column[Option[Double]]("MoneyExchangePoint", O.Default(Some(0.0)))

    /** Database column MoneyExchangeValidDay SqlType(DOUBLE), Default(Some(0.0)) */
    val moneyexchangevalidday: Rep[Option[Double]] = column[Option[Double]]("MoneyExchangeValidDay", O.Default(Some(0.0)))

    /** Database column UserExpExchangePoint SqlType(DOUBLE), Default(Some(0.0)) */
    val userexpexchangepoint: Rep[Option[Double]] = column[Option[Double]]("UserExpExchangePoint", O.Default(Some(0.0)))

    /** Database column UserExpExchangeValidDay SqlType(DOUBLE), Default(Some(0.0)) */
    val userexpexchangevalidday: Rep[Option[Double]] = column[Option[Double]]("UserExpExchangeValidDay", O.Default(Some(0.0)))

    /** Database column PresentExpPerLogin SqlType(INTEGER), Default(Some(0)) */
    val presentexpperlogin: Rep[Option[Int]] = column[Option[Int]]("PresentExpPerLogin", O.Default(Some(0)))

    /** Database column PresentExpPerElite SqlType(INTEGER), Default(Some(0)) */
    val presentexpperelite: Rep[Option[Int]] = column[Option[Int]]("PresentExpPerElite", O.Default(Some(0)))

    /** Database column PointName SqlType(VARCHAR), Length(20,true) */
    val pointname: Rep[Option[String]] = column[Option[String]]("PointName", O.Length(20, varying = true))

    /** Database column PointUnit SqlType(VARCHAR), Length(20,true) */
    val pointunit: Rep[Option[String]] = column[Option[String]]("PointUnit", O.Length(20, varying = true))

    /** Database column EmailOfRegCheck SqlType(VARCHAR), Length(16777216,true) */
    val emailofregcheck: Rep[Option[String]] = column[Option[String]]("EmailOfRegCheck", O.Length(16777216, varying = true))

    /** Database column MailObject SqlType(INTEGER), Default(Some(0)) */
    val mailobject: Rep[Option[Int]] = column[Option[Int]]("MailObject", O.Default(Some(0)))

    /** Database column MailServer SqlType(VARCHAR), Length(50,true) */
    val mailserver: Rep[Option[String]] = column[Option[String]]("MailServer", O.Length(50, varying = true))

    /** Database column MailServerUserName SqlType(VARCHAR), Length(50,true) */
    val mailserverusername: Rep[Option[String]] = column[Option[String]]("MailServerUserName", O.Length(50, varying = true))

    /** Database column MailServerPassWord SqlType(VARCHAR), Length(50,true) */
    val mailserverpassword: Rep[Option[String]] = column[Option[String]]("MailServerPassWord", O.Length(50, varying = true))

    /** Database column MailDomain SqlType(VARCHAR), Length(50,true) */
    val maildomain: Rep[Option[String]] = column[Option[String]]("MailDomain", O.Length(50, varying = true))

    /** Database column PhotoObject SqlType(INTEGER), Default(Some(0)) */
    val photoobject: Rep[Option[Int]] = column[Option[Int]]("PhotoObject", O.Default(Some(0)))

    /** Database column Thumb_DefaultWidth SqlType(INTEGER), Default(Some(0)) */
    val thumbDefaultwidth: Rep[Option[Int]] = column[Option[Int]]("Thumb_DefaultWidth", O.Default(Some(0)))

    /** Database column Thumb_DefaultHeight SqlType(INTEGER), Default(Some(0)) */
    val thumbDefaultheight: Rep[Option[Int]] = column[Option[Int]]("Thumb_DefaultHeight", O.Default(Some(0)))

    /** Database column Thumb_Arithmetic SqlType(INTEGER), Default(Some(0)) */
    val thumbArithmetic: Rep[Option[Int]] = column[Option[Int]]("Thumb_Arithmetic", O.Default(Some(0)))

    /** Database column Watermark_Type SqlType(INTEGER), Default(Some(0)) */
    val watermarkType: Rep[Option[Int]] = column[Option[Int]]("Watermark_Type", O.Default(Some(0)))

    /** Database column Watermark_Text SqlType(VARCHAR), Length(50,true) */
    val watermarkText: Rep[Option[String]] = column[Option[String]]("Watermark_Text", O.Length(50, varying = true))

    /** Database column Watermark_Text_FontName SqlType(VARCHAR), Length(50,true) */
    val watermarkTextFontname: Rep[Option[String]] = column[Option[String]]("Watermark_Text_FontName", O.Length(50, varying = true))

    /** Database column Watermark_Text_FontSize SqlType(INTEGER), Default(Some(0)) */
    val watermarkTextFontsize: Rep[Option[Int]] = column[Option[Int]]("Watermark_Text_FontSize", O.Default(Some(0)))

    /** Database column Watermark_Text_FontColor SqlType(VARCHAR), Length(50,true) */
    val watermarkTextFontcolor: Rep[Option[String]] = column[Option[String]]("Watermark_Text_FontColor", O.Length(50, varying = true))

    /** Database column Watermark_Text_Bold SqlType(BOOLEAN) */
    val watermarkTextBold: Rep[Option[Boolean]] = column[Option[Boolean]]("Watermark_Text_Bold")

    /** Database column Watermark_Images_FileName SqlType(VARCHAR), Length(255,true) */
    val watermarkImagesFilename: Rep[Option[String]] = column[Option[String]]("Watermark_Images_FileName", O.Length(255, varying = true))

    /** Database column Watermark_Images_Transparence SqlType(INTEGER), Default(Some(0)) */
    val watermarkImagesTransparence: Rep[Option[Int]] = column[Option[Int]]("Watermark_Images_Transparence", O.Default(Some(0)))

    /** Database column Watermark_Images_BackgroundColor SqlType(VARCHAR), Length(20,true) */
    val watermarkImagesBackgroundcolor: Rep[Option[String]] = column[Option[String]]("Watermark_Images_BackgroundColor", O.Length(20, varying = true))

    /** Database column Watermark_Position_X SqlType(INTEGER), Default(Some(0)) */
    val watermarkPositionX: Rep[Option[Int]] = column[Option[Int]]("Watermark_Position_X", O.Default(Some(0)))

    /** Database column Watermark_Position_Y SqlType(INTEGER), Default(Some(0)) */
    val watermarkPositionY: Rep[Option[Int]] = column[Option[Int]]("Watermark_Position_Y", O.Default(Some(0)))

    /** Database column Watermark_Position SqlType(INTEGER), Default(Some(0)) */
    val watermarkPosition: Rep[Option[Int]] = column[Option[Int]]("Watermark_Position", O.Default(Some(0)))

    /** Database column SearchInterval SqlType(INTEGER), Default(Some(0)) */
    val searchinterval: Rep[Option[Int]] = column[Option[Int]]("SearchInterval", O.Default(Some(0)))

    /** Database column SearchResultNum SqlType(INTEGER), Default(Some(0)) */
    val searchresultnum: Rep[Option[Int]] = column[Option[Int]]("SearchResultNum", O.Default(Some(0)))

    /** Database column MaxPerPage_SearchResult SqlType(INTEGER), Default(Some(0)) */
    val maxperpageSearchresult: Rep[Option[Int]] = column[Option[Int]]("MaxPerPage_SearchResult", O.Default(Some(0)))

    /** Database column SearchContent SqlType(BOOLEAN) */
    val searchcontent: Rep[Option[Boolean]] = column[Option[Boolean]]("SearchContent")

    /** Database column EnableGuestBuy SqlType(BOOLEAN) */
    val enableguestbuy: Rep[Option[Boolean]] = column[Option[Boolean]]("EnableGuestBuy")

    /** Database column IncludeTax SqlType(BOOLEAN) */
    val includetax: Rep[Option[Boolean]] = column[Option[Boolean]]("IncludeTax")

    /** Database column TaxRate SqlType(INTEGER), Default(Some(0)) */
    val taxrate: Rep[Option[Int]] = column[Option[Int]]("TaxRate", O.Default(Some(0)))

    /** Database column PayOnlineProvider SqlType(INTEGER), Default(Some(0)) */
    val payonlineprovider: Rep[Option[Int]] = column[Option[Int]]("PayOnlineProvider", O.Default(Some(0)))

    /** Database column PayOnlineShopID SqlType(VARCHAR), Length(50,true) */
    val payonlineshopid: Rep[Option[String]] = column[Option[String]]("PayOnlineShopID", O.Length(50, varying = true))

    /** Database column PayOnlineKey SqlType(VARCHAR), Length(255,true) */
    val payonlinekey: Rep[Option[String]] = column[Option[String]]("PayOnlineKey", O.Length(255, varying = true))

    /** Database column PayOnlineRate SqlType(NUMERIC), Default(Some(0)) */
    val payonlinerate: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("PayOnlineRate", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column PayOnlinePlusPoundage SqlType(BOOLEAN) */
    val payonlinepluspoundage: Rep[Option[Boolean]] = column[Option[Boolean]]("PayOnlinePlusPoundage")

    /** Database column Prefix_OrderFormNum SqlType(VARCHAR), Length(4,true) */
    val prefixOrderformnum: Rep[Option[String]] = column[Option[String]]("Prefix_OrderFormNum", O.Length(4, varying = true))

    /** Database column Prefix_PaymentNum SqlType(VARCHAR), Length(4,true) */
    val prefixPaymentnum: Rep[Option[String]] = column[Option[String]]("Prefix_PaymentNum", O.Length(4, varying = true))

    /** Database column Country SqlType(VARCHAR), Length(50,true) */
    val country: Rep[Option[String]] = column[Option[String]]("Country", O.Length(50, varying = true))

    /** Database column Province SqlType(VARCHAR), Length(50,true) */
    val province: Rep[Option[String]] = column[Option[String]]("Province", O.Length(50, varying = true))

    /** Database column City SqlType(VARCHAR), Length(50,true) */
    val city: Rep[Option[String]] = column[Option[String]]("City", O.Length(50, varying = true))

    /** Database column PostCode SqlType(VARCHAR), Length(10,true) */
    val postcode: Rep[Option[String]] = column[Option[String]]("PostCode", O.Length(10, varying = true))

    /** Database column MessageOfOrderConfirm SqlType(VARCHAR), Length(16777216,true) */
    val messageoforderconfirm: Rep[Option[String]] = column[Option[String]]("MessageOfOrderConfirm", O.Length(16777216, varying = true))

    /** Database column EmailOfOrderConfirm SqlType(VARCHAR), Length(16777216,true) */
    val emailoforderconfirm: Rep[Option[String]] = column[Option[String]]("EmailOfOrderConfirm", O.Length(16777216, varying = true))

    /** Database column MessageOfSendCard SqlType(VARCHAR), Length(16777216,true) */
    val messageofsendcard: Rep[Option[String]] = column[Option[String]]("MessageOfSendCard", O.Length(16777216, varying = true))

    /** Database column EmailOfSendCard SqlType(VARCHAR), Length(16777216,true) */
    val emailofsendcard: Rep[Option[String]] = column[Option[String]]("EmailOfSendCard", O.Length(16777216, varying = true))

    /** Database column MessageOfReceiptMoney SqlType(VARCHAR), Length(16777216,true) */
    val messageofreceiptmoney: Rep[Option[String]] = column[Option[String]]("MessageOfReceiptMoney", O.Length(16777216, varying = true))

    /** Database column EmailOfReceiptMoney SqlType(VARCHAR), Length(16777216,true) */
    val emailofreceiptmoney: Rep[Option[String]] = column[Option[String]]("EmailOfReceiptMoney", O.Length(16777216, varying = true))

    /** Database column MessageOfRefund SqlType(VARCHAR), Length(16777216,true) */
    val messageofrefund: Rep[Option[String]] = column[Option[String]]("MessageOfRefund", O.Length(16777216, varying = true))

    /** Database column EmailOfRefund SqlType(VARCHAR), Length(16777216,true) */
    val emailofrefund: Rep[Option[String]] = column[Option[String]]("EmailOfRefund", O.Length(16777216, varying = true))

    /** Database column MessageOfInvoice SqlType(VARCHAR), Length(16777216,true) */
    val messageofinvoice: Rep[Option[String]] = column[Option[String]]("MessageOfInvoice", O.Length(16777216, varying = true))

    /** Database column EmailOfInvoice SqlType(VARCHAR), Length(16777216,true) */
    val emailofinvoice: Rep[Option[String]] = column[Option[String]]("EmailOfInvoice", O.Length(16777216, varying = true))

    /** Database column MessageOfDeliver SqlType(VARCHAR), Length(16777216,true) */
    val messageofdeliver: Rep[Option[String]] = column[Option[String]]("MessageOfDeliver", O.Length(16777216, varying = true))

    /** Database column EmailOfDeliver SqlType(VARCHAR), Length(16777216,true) */
    val emailofdeliver: Rep[Option[String]] = column[Option[String]]("EmailOfDeliver", O.Length(16777216, varying = true))

    /** Database column GuestBook_EnableVisitor SqlType(BOOLEAN) */
    val guestbookEnablevisitor: Rep[Boolean] = column[Boolean]("GuestBook_EnableVisitor")

    /** Database column GuestBookCheck SqlType(BOOLEAN) */
    val guestbookcheck: Rep[Boolean] = column[Boolean]("GuestBookCheck")

    /** Database column GuestBook_EnableManageRubbish SqlType(BOOLEAN) */
    val guestbookEnablemanagerubbish: Rep[Boolean] = column[Boolean]("GuestBook_EnableManageRubbish")

    /** Database column GuestBook_ManageRubbish SqlType(VARCHAR), Length(16777216,true) */
    val guestbookManagerubbish: Rep[Option[String]] = column[Option[String]]("GuestBook_ManageRubbish", O.Length(16777216, varying = true))

    /** Database column GuestBook_ShowIP SqlType(BOOLEAN) */
    val guestbookShowip: Rep[Boolean] = column[Boolean]("GuestBook_ShowIP")

    /** Database column GuestBook_IsAssignSort SqlType(BOOLEAN) */
    val guestbookIsassignsort: Rep[Boolean] = column[Boolean]("GuestBook_IsAssignSort")

    /** Database column GuestBook_MaxPerPage SqlType(VARCHAR), Length(16777216,true) */
    val guestbookMaxperpage: Rep[Option[String]] = column[Option[String]]("GuestBook_MaxPerPage", O.Length(16777216, varying = true))

    /** Database column EnableRss SqlType(BOOLEAN) */
    val enablerss: Rep[Boolean] = column[Boolean]("EnableRss")

    /** Database column RssCodeType SqlType(BOOLEAN) */
    val rsscodetype: Rep[Option[Boolean]] = column[Option[Boolean]]("RssCodeType")

    /** Database column EnableWap SqlType(BOOLEAN) */
    val enablewap: Rep[Boolean] = column[Boolean]("EnableWap")

    /** Database column WapLogo SqlType(VARCHAR), Length(100,true) */
    val waplogo: Rep[Option[String]] = column[Option[String]]("WapLogo", O.Length(100, varying = true))

    /** Database column EnableWapPl SqlType(BOOLEAN) */
    val enablewappl: Rep[Boolean] = column[Boolean]("EnableWapPl")

    /** Database column ShowWapAppendix SqlType(BOOLEAN) */
    val showwapappendix: Rep[Boolean] = column[Boolean]("ShowWapAppendix")

    /** Database column ShowWapShop SqlType(BOOLEAN) */
    val showwapshop: Rep[Option[Boolean]] = column[Option[Boolean]]("ShowWapShop")

    /** Database column ShowWapManage SqlType(BOOLEAN) */
    val showwapmanage: Rep[Option[Boolean]] = column[Option[Boolean]]("ShowWapManage")

    /** Database column DatabaseVersion SqlType(DOUBLE), Default(Some(0.0)) */
    val databaseversion: Rep[Option[Double]] = column[Option[Double]]("DatabaseVersion", O.Default(Some(0.0)))

    /** Database column Timing_SetDate SqlType(INTEGER), Default(Some(0)) */
    val timingSetdate: Rep[Option[Int]] = column[Option[Int]]("Timing_SetDate", O.Default(Some(0)))

    /** Database column Timing_SetDay SqlType(INTEGER), Default(Some(0)) */
    val timingSetday: Rep[Option[Int]] = column[Option[Int]]("Timing_SetDay", O.Default(Some(0)))

    /** Database column Timing_SetWeekday SqlType(INTEGER), Default(Some(0)) */
    val timingSetweekday: Rep[Option[Int]] = column[Option[Int]]("Timing_SetWeekday", O.Default(Some(0)))

    /** Database column Timing_Time SqlType(VARCHAR), Length(50,true) */
    val timingTime: Rep[Option[String]] = column[Option[String]]("Timing_Time", O.Length(50, varying = true))

    /** Database column Timing_Date SqlType(TIMESTAMP) */
    val timingDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("Timing_Date")

    /** Database column Timing_CollectionItemID SqlType(VARCHAR), Length(200,true) */
    val timingCollectionitemid: Rep[Option[String]] = column[Option[String]]("Timing_CollectionItemID", O.Length(200, varying = true))

    /** Database column Timing_AreaCollection SqlType(VARCHAR), Length(255,true) */
    val timingAreacollection: Rep[Option[String]] = column[Option[String]]("Timing_AreaCollection", O.Length(255, varying = true))

    /** Database column Timing_Breakpoint SqlType(VARCHAR), Length(16777216,true) */
    val timingBreakpoint: Rep[Option[String]] = column[Option[String]]("Timing_Breakpoint", O.Length(16777216, varying = true))

    /** Database column IsCustom_Content SqlType(BOOLEAN) */
    val iscustomContent: Rep[Option[Boolean]] = column[Option[Boolean]]("IsCustom_Content")

    /** Database column SMSUserName SqlType(VARCHAR), Length(50,true) */
    val smsusername: Rep[Option[String]] = column[Option[String]]("SMSUserName", O.Length(50, varying = true))

    /** Database column SMSKey SqlType(VARCHAR), Length(50,true) */
    val smskey: Rep[Option[String]] = column[Option[String]]("SMSKey", O.Length(50, varying = true))

    /** Database column Mobiles SqlType(VARCHAR), Length(255,true) */
    val mobiles: Rep[Option[String]] = column[Option[String]]("Mobiles", O.Length(255, varying = true))

    /** Database column SendMessageToAdminWhenOrder SqlType(BOOLEAN) */
    val sendmessagetoadminwhenorder: Rep[Option[Boolean]] = column[Option[Boolean]]("SendMessageToAdminWhenOrder")

    /** Database column SendMessageToMemberWhenPaySuccess SqlType(BOOLEAN) */
    val sendmessagetomemberwhenpaysuccess: Rep[Option[Boolean]] = column[Option[Boolean]]("SendMessageToMemberWhenPaySuccess")

    /** Database column SurveyKey SqlType(VARCHAR), Length(16777216,true) */
    val surveykey: Rep[Option[String]] = column[Option[String]]("SurveyKey", O.Length(16777216, varying = true))

    /** Database column MessageOfOrder SqlType(VARCHAR), Length(16777216,true) */
    val messageoforder: Rep[Option[String]] = column[Option[String]]("MessageOfOrder", O.Length(16777216, varying = true))

    /** Database column MessageOfAddRemit SqlType(VARCHAR), Length(16777216,true) */
    val messageofaddremit: Rep[Option[String]] = column[Option[String]]("MessageOfAddRemit", O.Length(16777216, varying = true))

    /** Database column MessageOfAddIncome SqlType(VARCHAR), Length(16777216,true) */
    val messageofaddincome: Rep[Option[String]] = column[Option[String]]("MessageOfAddIncome", O.Length(16777216, varying = true))

    /** Database column MessageOfAddPayment SqlType(VARCHAR), Length(16777216,true) */
    val messageofaddpayment: Rep[Option[String]] = column[Option[String]]("MessageOfAddPayment", O.Length(16777216, varying = true))

    /** Database column MessageOfExchangePoint SqlType(VARCHAR), Length(16777216,true) */
    val messageofexchangepoint: Rep[Option[String]] = column[Option[String]]("MessageOfExchangePoint", O.Length(16777216, varying = true))

    /** Database column MessageOfAddPoint SqlType(VARCHAR), Length(16777216,true) */
    val messageofaddpoint: Rep[Option[String]] = column[Option[String]]("MessageOfAddPoint", O.Length(16777216, varying = true))

    /** Database column MessageOfMinusPoint SqlType(VARCHAR), Length(16777216,true) */
    val messageofminuspoint: Rep[Option[String]] = column[Option[String]]("MessageOfMinusPoint", O.Length(16777216, varying = true))

    /** Database column MessageOfExchangeValid SqlType(VARCHAR), Length(16777216,true) */
    val messageofexchangevalid: Rep[Option[String]] = column[Option[String]]("MessageOfExchangeValid", O.Length(16777216, varying = true))

    /** Database column MessageOfAddValid SqlType(VARCHAR), Length(16777216,true) */
    val messageofaddvalid: Rep[Option[String]] = column[Option[String]]("MessageOfAddValid", O.Length(16777216, varying = true))

    /** Database column MessageOfMinusValid SqlType(VARCHAR), Length(16777216,true) */
    val messageofminusvalid: Rep[Option[String]] = column[Option[String]]("MessageOfMinusValid", O.Length(16777216, varying = true))

    /** Database column Thumb_BackgroundColor SqlType(VARCHAR), Length(10,true) */
    val thumbBackgroundcolor: Rep[Option[String]] = column[Option[String]]("Thumb_BackgroundColor", O.Length(10, varying = true))

    /** Database column PhotoQuality SqlType(INTEGER) */
    val photoquality: Rep[Option[Int]] = column[Option[Int]]("PhotoQuality")

    /** Database column ShowUserModel SqlType(BOOLEAN) */
    val showusermodel: Rep[Option[Boolean]] = column[Option[Boolean]]("ShowUserModel")

    /** Database column ShowAnonymous SqlType(BOOLEAN) */
    val showanonymous: Rep[Option[Boolean]] = column[Option[Boolean]]("ShowAnonymous")

    /** Index over (surveykey) (database name PE_CONFIG_SURVEYKEY) */
    val index1 = index("PE_CONFIG_SURVEYKEY", surveykey :: HNil)
  }

  /** Collection-like TableQuery object for table PeConfig */
  lazy val PeConfig = new TableQuery(tag => new PeConfig(tag))
}
