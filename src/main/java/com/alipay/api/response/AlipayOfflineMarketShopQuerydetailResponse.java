package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.querydetail response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 16:27:51
 */
public class AlipayOfflineMarketShopQuerydetailResponse extends AlipayResponse {

	private static final long serialVersionUID = 5364724472916421197L;

	/** 
	 * 门店详细地址，注：不含省市区
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 门店审核状态描述，如果审核驳回则有相关的驳回理由
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 门店审核时需要的图片; 至少包含一张门头照片，两张内景照片，必须反映真实的门店情况，审核才能够通过， 多个以英文逗号分隔
	 */
	@ApiField("audit_images")
	private String auditImages;

	/** 
	 * 门店审核状态，对于系统商而言，只有三个状态，AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过。第一次审核通过会触发门店上架。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 授权函图片
	 */
	@ApiField("auth_letter")
	private String authLetter;

	/** 
	 * 人均消费价格，最少1元，最大不超过99999元，请按实际情况填写；单位元；
	 */
	@ApiField("avg_price")
	private String avgPrice;

	/** 
	 * 门店是否有包厢，T表示有，F表示没有，不传在客户端不作展示
	 */
	@ApiField("box")
	private String box;

	/** 
	 * 分店名称，比如：万塘路店，与主门店名合并在客户端显示为：肯德基(万塘路店)
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/** 
	 * 品牌LOGO; 图片ID，不填写则默认为门店首图main_image
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/** 
	 * 品牌名称；不填写则默认为“其它品牌”
	 */
	@ApiField("brand_name")
	private String brandName;

	/** 
	 * 经营许可证，只有餐饮类目需要
	 */
	@ApiField("business_certificate")
	private String businessCertificate;

	/** 
	 * 经营许可证有效期，格式：2020-03-20，只有餐饮类目需要
	 */
	@ApiField("business_certificate_expires")
	private String businessCertificateExpires;

	/** 
	 * 营业时间;支持分段营业时间，以英文逗号分隔
	 */
	@ApiField("business_time")
	private String businessTime;

	/** 
	 * 类目ID，类目初始数据由口碑提供
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 城市编码，国标码，详见国家统计局数据
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 门店电话号码；支持座机和手机，在客户端对用户展现，支持多个电话，以英文逗号分隔
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/** 
	 * 门店创建来源；如：开放平台、支付宝客户端、口碑商家app、商家自主开店、服务商开店、全民开店-支付宝客户端、全民开店-商户app、其它
	 */
	@ApiField("create_channel")
	private String createChannel;

	/** 
	 * 区县编码，国标码，详见国家统计局数据
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 门店创建时间
	 */
	@ApiField("gmt_shop_create")
	private String gmtShopCreate;

	/** 
	 * 门店修改时间
	 */
	@ApiField("gmt_shop_modified")
	private String gmtShopModified;

	/** 
	 * 店铺使用的机具编号，多个以英文逗号分隔
	 */
	@ApiField("implement_id")
	private String implementId;

	/** 
	 * 门店是否上架，T表示上架,F表示未上架，第一次门店审核通过后会触发上架
	 */
	@ApiField("is_online")
	private String isOnline;

	/** 
	 * 是否在其他平台开店，T表示有开店，F表示未开店，用于证明其开店资质
	 */
	@ApiField("is_operating_online")
	private String isOperatingOnline;

	/** 
	 * 门店是否在客户端显示，T表示显示，F表示隐藏
	 */
	@ApiField("is_show")
	private String isShow;

	/** 
	 * 开发者返佣ID，重要：如果有口碑签订了返佣协议，则该字段作为返佣数据提取的依据，需要与签约协议的PID保持一致， 该字段只能在创建接口中传入，不能在修改接口中被修改
	 */
	@ApiField("isv_uid")
	private String isvUid;

	/** 
	 * 纬度，最长15位字符（包括小数点）， 注：高德坐标系
	 */
	@ApiField("latitude")
	private String latitude;

	/** 
	 * 门店营业执照图片
	 */
	@ApiField("licence")
	private String licence;

	/** 
	 * 门店营业执照编号
	 */
	@ApiField("licence_code")
	private String licenceCode;

	/** 
	 * 营业执照过期时间
	 */
	@ApiField("licence_expires")
	private String licenceExpires;

	/** 
	 * 门店营业执照名称
	 */
	@ApiField("licence_name")
	private String licenceName;

	/** 
	 * 经度，最长15位字符（包括小数点）， 注：高德坐标系
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * 门店首图；非常重要，推荐尺寸2000*1500
	 */
	@ApiField("main_image")
	private String mainImage;

	/** 
	 * 主店名；比如：肯德基
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/** 
	 * 是否有无烟区，T表示有无烟区，F表示没有无烟区，不传在客户端不展示
	 */
	@ApiField("no_smoking")
	private String noSmoking;

	/** 
	 * 门店店长电话号码；用于接收门店状态变更通知，收款成功通知等通知消息，不在客户端展示；多个以引文逗号分隔
	 */
	@ApiField("notify_mobile")
	private String notifyMobile;

	/** 
	 * 在其他平台的开店图片，支持多张，逗号分隔
	 */
	@ApiField("online_image")
	private String onlineImage;

	/** 
	 * 通知发送url;当商户的门店审核状态发生变化时，会向该地址推送消息
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/** 
	 * 其它资质证明图片集；支持多张，逗号分隔
	 */
	@ApiField("other_auth_images")
	private String otherAuthImages;

	/** 
	 * 门店是否支持停车，T表示支持，F表示不支持，不传在客户端不作展示
	 */
	@ApiField("parking")
	private String parking;

	/** 
	 * 门店的签约ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 默认付款类型；如：付款码、扫码付、声波支付、在线买单、其它
	 */
	@ApiField("pay_type")
	private String payType;

	/** 
	 * 门店收款账户，门店收款账户只能被查询，不能通过接口修改。如果为空，则表示门店收款账户为商户签约账户
	 */
	@ApiField("payment_account")
	private String paymentAccount;

	/** 
	 * 图片集，是map转化成的json串，key是图片id,value是图片url
	 */
	@ApiField("pic_coll")
	private String picColl;

	/** 
	 * 经过加工后的门店收款二维码
	 */
	@ApiField("processed_qr_code")
	private String processedQrCode;

	/** 
	 * 门店运营归属人uid
	 */
	@ApiField("provider_xiaoer_uid")
	private String providerXiaoerUid;

	/** 
	 * 省份编码，国标码，详见国家统计局数据
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 门店收款二维码裸码
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 门店标签；JSON格式。包括：keyMerchant-是否重点商户（T/F）；isHallMeal-堂食（T/F）；注：若标签 key 不存在，则门店无对应的标签
	 */
	@ApiField("shop_tags")
	private String shopTags;

	/** 
	 * 外部门店编号；最长54位字符，该编号将作为收单接口的入参， 请开发者自行确保其唯一性
	 */
	@ApiField("store_id")
	private String storeId;

	/** 
	 * 门店其他的服务，门店与用户线下兑现
	 */
	@ApiField("value_added")
	private String valueAdded;

	/** 
	 * 门店是否支持WIFI，T表示支持，F表示不支持，不传在客户端不作展示
	 */
	@ApiField("wifi")
	private String wifi;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	public String getAuditDesc( ) {
		return this.auditDesc;
	}

	public void setAuditImages(String auditImages) {
		this.auditImages = auditImages;
	}
	public String getAuditImages( ) {
		return this.auditImages;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setAuthLetter(String authLetter) {
		this.authLetter = authLetter;
	}
	public String getAuthLetter( ) {
		return this.authLetter;
	}

	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}
	public String getAvgPrice( ) {
		return this.avgPrice;
	}

	public void setBox(String box) {
		this.box = box;
	}
	public String getBox( ) {
		return this.box;
	}

	public void setBranchShopName(String branchShopName) {
		this.branchShopName = branchShopName;
	}
	public String getBranchShopName( ) {
		return this.branchShopName;
	}

	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}
	public String getBrandLogo( ) {
		return this.brandLogo;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName( ) {
		return this.brandName;
	}

	public void setBusinessCertificate(String businessCertificate) {
		this.businessCertificate = businessCertificate;
	}
	public String getBusinessCertificate( ) {
		return this.businessCertificate;
	}

	public void setBusinessCertificateExpires(String businessCertificateExpires) {
		this.businessCertificateExpires = businessCertificateExpires;
	}
	public String getBusinessCertificateExpires( ) {
		return this.businessCertificateExpires;
	}

	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}
	public String getBusinessTime( ) {
		return this.businessTime;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactNumber( ) {
		return this.contactNumber;
	}

	public void setCreateChannel(String createChannel) {
		this.createChannel = createChannel;
	}
	public String getCreateChannel( ) {
		return this.createChannel;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCode( ) {
		return this.districtCode;
	}

	public void setGmtShopCreate(String gmtShopCreate) {
		this.gmtShopCreate = gmtShopCreate;
	}
	public String getGmtShopCreate( ) {
		return this.gmtShopCreate;
	}

	public void setGmtShopModified(String gmtShopModified) {
		this.gmtShopModified = gmtShopModified;
	}
	public String getGmtShopModified( ) {
		return this.gmtShopModified;
	}

	public void setImplementId(String implementId) {
		this.implementId = implementId;
	}
	public String getImplementId( ) {
		return this.implementId;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
	public String getIsOnline( ) {
		return this.isOnline;
	}

	public void setIsOperatingOnline(String isOperatingOnline) {
		this.isOperatingOnline = isOperatingOnline;
	}
	public String getIsOperatingOnline( ) {
		return this.isOperatingOnline;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public String getIsShow( ) {
		return this.isShow;
	}

	public void setIsvUid(String isvUid) {
		this.isvUid = isvUid;
	}
	public String getIsvUid( ) {
		return this.isvUid;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}
	public String getLicence( ) {
		return this.licence;
	}

	public void setLicenceCode(String licenceCode) {
		this.licenceCode = licenceCode;
	}
	public String getLicenceCode( ) {
		return this.licenceCode;
	}

	public void setLicenceExpires(String licenceExpires) {
		this.licenceExpires = licenceExpires;
	}
	public String getLicenceExpires( ) {
		return this.licenceExpires;
	}

	public void setLicenceName(String licenceName) {
		this.licenceName = licenceName;
	}
	public String getLicenceName( ) {
		return this.licenceName;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}
	public String getMainImage( ) {
		return this.mainImage;
	}

	public void setMainShopName(String mainShopName) {
		this.mainShopName = mainShopName;
	}
	public String getMainShopName( ) {
		return this.mainShopName;
	}

	public void setNoSmoking(String noSmoking) {
		this.noSmoking = noSmoking;
	}
	public String getNoSmoking( ) {
		return this.noSmoking;
	}

	public void setNotifyMobile(String notifyMobile) {
		this.notifyMobile = notifyMobile;
	}
	public String getNotifyMobile( ) {
		return this.notifyMobile;
	}

	public void setOnlineImage(String onlineImage) {
		this.onlineImage = onlineImage;
	}
	public String getOnlineImage( ) {
		return this.onlineImage;
	}

	public void setOperateNotifyUrl(String operateNotifyUrl) {
		this.operateNotifyUrl = operateNotifyUrl;
	}
	public String getOperateNotifyUrl( ) {
		return this.operateNotifyUrl;
	}

	public void setOtherAuthImages(String otherAuthImages) {
		this.otherAuthImages = otherAuthImages;
	}
	public String getOtherAuthImages( ) {
		return this.otherAuthImages;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getParking( ) {
		return this.parking;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayType( ) {
		return this.payType;
	}

	public void setPaymentAccount(String paymentAccount) {
		this.paymentAccount = paymentAccount;
	}
	public String getPaymentAccount( ) {
		return this.paymentAccount;
	}

	public void setPicColl(String picColl) {
		this.picColl = picColl;
	}
	public String getPicColl( ) {
		return this.picColl;
	}

	public void setProcessedQrCode(String processedQrCode) {
		this.processedQrCode = processedQrCode;
	}
	public String getProcessedQrCode( ) {
		return this.processedQrCode;
	}

	public void setProviderXiaoerUid(String providerXiaoerUid) {
		this.providerXiaoerUid = providerXiaoerUid;
	}
	public String getProviderXiaoerUid( ) {
		return this.providerXiaoerUid;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

	public void setShopTags(String shopTags) {
		this.shopTags = shopTags;
	}
	public String getShopTags( ) {
		return this.shopTags;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreId( ) {
		return this.storeId;
	}

	public void setValueAdded(String valueAdded) {
		this.valueAdded = valueAdded;
	}
	public String getValueAdded( ) {
		return this.valueAdded;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getWifi( ) {
		return this.wifi;
	}

}
