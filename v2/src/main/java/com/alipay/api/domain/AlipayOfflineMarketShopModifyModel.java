package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 系统商需要通过该接口在口碑平台帮助商户修改门店信息，所有的选项都为非必填项，需要修改什么信息就传入什么参数，不传入的参数，则保持不变。修改门店名、首图、门店图片、营业执照相关字段、是否在其他平台开店相关字段，会重新触发风控审核，修改其他字段不会触发风控审核。
 *
 * @author auto create
 * @since 1.0, 2024-07-04 17:00:59
 */
public class AlipayOfflineMarketShopModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8669549874356438561L;

	/**
	 * 门店详细地址，地址字符长度在4-50个字符。门店详细地址，格式（不含省市区）：例1：道路+门牌号，“人民东路18号”；例2：道路+门牌号+标志性建筑+楼层；注：门店详细地址按规范格式填写地址，以免影响门店搜索及活动报名
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店审核时需要的图片; 至少包含一张门头照片，两张内景照片，必须反映真实的门店情况，审核才能够通过， 多个以英文逗号分隔。
	 */
	@ApiField("audit_images")
	private String auditImages;

	/**
	 * 门店授权函。
	 */
	@ApiField("auth_letter")
	private String authLetter;

	/**
	 * 人均消费价格，最少1元，最大不超过99999元，请按实际情况填写，单位元。
	 */
	@ApiField("avg_price")
	private String avgPrice;

	/**
	 * 店铺接口业务版本号，新接入的ISV，请统一传入2.0。
	 */
	@ApiField("biz_version")
	private String bizVersion;

	/**
	 * 包厢支持，T表示有包厢，F表示无包厢；不传值默认F。
	 */
	@ApiField("box")
	private String box;

	/**
	 * 分店名称，比如：万塘路店，与主门店名合并在客户端显示为：肯德基(万塘路店)。分店名长度需在2~20个字符之间。
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/**
	 * 品牌LOGO; 图片ID，不填写则默认为门店首图main_image。
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 品牌名称；不填写则默认为“其它品牌”。
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 许可证，各行业所需的证照资质参见<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=205&articleId=104497&docType=1">商户入驻要求</a>；该字段只能上传一张许可证，一张以外的许可证、除营业执照和许可证之外其他证照请放在其他资质字段上传。
	 */
	@ApiField("business_certificate")
	private String businessCertificate;

	/**
	 * 许可证有效期，格式：2020-03-20或长期。严格按照格式填写。
	 */
	@ApiField("business_certificate_expires")
	private String businessCertificateExpires;

	/**
	 * 请严格按"周一-周五 09:00-20:00,周六-周日 10:00-22:00"的格式进行填写，时间段不能重复，最多支持两个时间段，24小时营业请填写"00:00-23:59"
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 废弃字段，不支持修改类目。
类目id，请参考<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=205&articleId=104497&docType=1">商户入驻要求</a>。
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 城市编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 门店电话号码；支持座机和手机，在客户端对用户展现，支持多个电话，以英文逗号分隔。
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 区县编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 店铺使用的机具编号，多个以英文逗号分隔。
	 */
	@ApiField("implement_id")
	private String implementId;

	/**
	 * 是否在其他平台开店，T表示有开店，F表示未开店。
	 */
	@ApiField("is_operating_online")
	private String isOperatingOnline;

	/**
	 * 废弃字段，T表示显示，F表示隐藏，默认为T。
	 */
	@ApiField("is_show")
	private String isShow;

	/**
	 * 纬度，注：高德坐标系。经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门店营业执照图片，各行业所需的证照资质参见：https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.NBvQVP&treeId=78&articleId=104497&docType=1。
	 */
	@ApiField("licence")
	private String licence;

	/**
	 * 门店营业执照编号。只支持输入中文，英文和数字。
	 */
	@ApiField("licence_code")
	private String licenceCode;

	/**
	 * 营业执照过期时间。格式：2020-10-20或长期。严格按照格式填写。
	 */
	@ApiField("licence_expires")
	private String licenceExpires;

	/**
	 * 门店营业执照名称。
	 */
	@ApiField("licence_name")
	private String licenceName;

	/**
	 * 经度，注：高德坐标系。经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 门店首图；非常重要，推荐尺寸2000*1500。
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 主门店名  比如：肯德基；主店名里不要包含分店名，如“万塘路店”。主店名长度不能超过20个字符。【xxx店】、(xxx店)、（xxx店）、[xxx店]、<xxx店>、xxx店，等类似的主店名都是不合法的，如果需要录入分店，请填写到branch_shop_name字段中。
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/**
	 * 无烟区支持，T表示禁烟，F表示不禁烟；不传值默认F。
	 */
	@ApiField("no_smoking")
	private String noSmoking;

	/**
	 * 门店店长电话号码；用于接收门店状态变更通知，收款成功通知等通知消息，不在客户端展示；多个以引文逗号分隔。
	 */
	@ApiField("notify_mobile")
	private String notifyMobile;

	/**
	 * 废弃字段，请使用online_url字段替代。
	 */
	@ApiField("online_image")
	private String onlineImage;

	/**
	 * 其他平台开店的店铺链接url,多个url使用英文逗号隔开，isv迁移到新接口使用此字段，与is_operating_online=T配套使用。
	 */
	@ApiField("online_url")
	private String onlineUrl;

	/**
	 * （支付宝内部参数）操作员的支付账号ID(服务商ID、城市经理ID)。
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 表示以系统集成商的身份开店，开放平台现在统一传入ISV。
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 通知发送url;当商户的门店审核状态发生变化时，会向该地址推送消息。
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/**
	 * 其他资质。用于上传营业证照、许可证照外的其他资质，除已上传许可证外的其他许可证也可以在该字段上传。
	 */
	@ApiField("other_authorization")
	private String otherAuthorization;

	/**
	 * 门店是否支持停车，T表示支持，F表示不支持，不传在客户端不作展示。
	 */
	@ApiField("parking")
	private String parking;

	/**
	 * （支付宝内部参数）服务商要操作的商户PID。
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * （支付宝内部参数）付款方式：code_scanned_pay：付款码 
online_pay：在线买单。ISV不可以指定此字段，ISV泛行业开店默认为在线买单，云纵开店可以指定支付方式。
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 省份编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载”</a>。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 外部请求ID; 标识ISV本次修改的请求，由开发者自定义，不同的请求使用不同的ID，在门店notify消息中也会带有该参数，以此标明本次notify消息是对哪个请求的回应
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 支付宝门店ID。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 外部门店编号；最长32位字符，该编号将作为收单接口的入参， 请开发者自行确保其唯一性。
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店其他的服务，门店与用户线下兑现。
	 */
	@ApiField("value_added")
	private String valueAdded;

	/**
	 * 废弃字段，使用biz_version字段替代。
	 */
	@ApiField("version")
	private String version;

	/**
	 * 门店是否支持WIFI，T表示支持，F表示不支持，不传在客户端不作展示。
	 */
	@ApiField("wifi")
	private String wifi;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAuditImages() {
		return this.auditImages;
	}
	public void setAuditImages(String auditImages) {
		this.auditImages = auditImages;
	}

	public String getAuthLetter() {
		return this.authLetter;
	}
	public void setAuthLetter(String authLetter) {
		this.authLetter = authLetter;
	}

	public String getAvgPrice() {
		return this.avgPrice;
	}
	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}

	public String getBizVersion() {
		return this.bizVersion;
	}
	public void setBizVersion(String bizVersion) {
		this.bizVersion = bizVersion;
	}

	public String getBox() {
		return this.box;
	}
	public void setBox(String box) {
		this.box = box;
	}

	public String getBranchShopName() {
		return this.branchShopName;
	}
	public void setBranchShopName(String branchShopName) {
		this.branchShopName = branchShopName;
	}

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBusinessCertificate() {
		return this.businessCertificate;
	}
	public void setBusinessCertificate(String businessCertificate) {
		this.businessCertificate = businessCertificate;
	}

	public String getBusinessCertificateExpires() {
		return this.businessCertificateExpires;
	}
	public void setBusinessCertificateExpires(String businessCertificateExpires) {
		this.businessCertificateExpires = businessCertificateExpires;
	}

	public String getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getImplementId() {
		return this.implementId;
	}
	public void setImplementId(String implementId) {
		this.implementId = implementId;
	}

	public String getIsOperatingOnline() {
		return this.isOperatingOnline;
	}
	public void setIsOperatingOnline(String isOperatingOnline) {
		this.isOperatingOnline = isOperatingOnline;
	}

	public String getIsShow() {
		return this.isShow;
	}
	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLicence() {
		return this.licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getLicenceCode() {
		return this.licenceCode;
	}
	public void setLicenceCode(String licenceCode) {
		this.licenceCode = licenceCode;
	}

	public String getLicenceExpires() {
		return this.licenceExpires;
	}
	public void setLicenceExpires(String licenceExpires) {
		this.licenceExpires = licenceExpires;
	}

	public String getLicenceName() {
		return this.licenceName;
	}
	public void setLicenceName(String licenceName) {
		this.licenceName = licenceName;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMainImage() {
		return this.mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public String getMainShopName() {
		return this.mainShopName;
	}
	public void setMainShopName(String mainShopName) {
		this.mainShopName = mainShopName;
	}

	public String getNoSmoking() {
		return this.noSmoking;
	}
	public void setNoSmoking(String noSmoking) {
		this.noSmoking = noSmoking;
	}

	public String getNotifyMobile() {
		return this.notifyMobile;
	}
	public void setNotifyMobile(String notifyMobile) {
		this.notifyMobile = notifyMobile;
	}

	public String getOnlineImage() {
		return this.onlineImage;
	}
	public void setOnlineImage(String onlineImage) {
		this.onlineImage = onlineImage;
	}

	public String getOnlineUrl() {
		return this.onlineUrl;
	}
	public void setOnlineUrl(String onlineUrl) {
		this.onlineUrl = onlineUrl;
	}

	public String getOpId() {
		return this.opId;
	}
	public void setOpId(String opId) {
		this.opId = opId;
	}

	public String getOpRole() {
		return this.opRole;
	}
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

	public String getOperateNotifyUrl() {
		return this.operateNotifyUrl;
	}
	public void setOperateNotifyUrl(String operateNotifyUrl) {
		this.operateNotifyUrl = operateNotifyUrl;
	}

	public String getOtherAuthorization() {
		return this.otherAuthorization;
	}
	public void setOtherAuthorization(String otherAuthorization) {
		this.otherAuthorization = otherAuthorization;
	}

	public String getParking() {
		return this.parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getValueAdded() {
		return this.valueAdded;
	}
	public void setValueAdded(String valueAdded) {
		this.valueAdded = valueAdded;
	}

	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	public String getWifi() {
		return this.wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

}
