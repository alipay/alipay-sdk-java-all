package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-26 10:32:43
 */
public class ShopPageQueryDetailVO extends AlipayObject {

	private static final long serialVersionUID = 3116138588491721425L;

	/**
	 * 门店地址库 ID，按照一定的平台规则识别出的线下真实存在、真实经营的蚂蚁门店地址库 ID，将作用于服务商的返佣激励、商品/券等权益的公域分发。如平台未返回alipay_poiid，请在确认门店信息真实有效后，稍后再进行查询。
	 */
	@ApiField("alipay_poiid")
	private String alipayPoiid;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 经营地址。
	 */
	@ApiField("business_address")
	private AddressInfo businessAddress;

	/**
	 * null
	 */
	@ApiListField("business_time")
	@ApiField("shop_business_time")
	private List<ShopBusinessTime> businessTime;

	/**
	 * 银行卡号
	 */
	@ApiField("card_account_no")
	private String cardAccountNo;

	/**
	 * 营业执照图片url。返回值为一个有访问时限的链接
	 */
	@ApiField("cert_image")
	private String certImage;

	/**
	 * 营业执照名称，值为营业执照或统一社会信用代码证上的名称。
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，取值范围：201：营业执照；2011:多证合一(统一社会信用代码)。
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * null
	 */
	@ApiListField("contact_infos")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfos;

	/**
	 * 门店联系手机
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 门店的联系固话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * null
	 */
	@ApiListField("ext_infos")
	@ApiField("shop_ext_info")
	private List<ShopExtInfo> extInfos;

	/**
	 * null
	 */
	@ApiListField("industry_info")
	@ApiField("merchant_shop_industry_info")
	private List<MerchantShopIndustryInfo> industryInfo;

	/**
	 * null
	 */
	@ApiListField("industry_license")
	@ApiField("shop_industry_license")
	private List<ShopIndustryLicense> industryLicense;

	/**
	 * 商户角色id，门店属于哪个商户角色。对于直连开店场景，为商户pid；对于间连开店场景（线上、线下、直付通），为商户smid。
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 法人身份证号。
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法人名称。
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 营业执照授权函。返回值为一个有访问时限的链接
	 */
	@ApiField("license_auth_letter_image")
	private String licenseAuthLetterImage;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 门店营业时间，支持一周7天，支持1天内多时间段
	 */
	@ApiField("new_business_time")
	private ComplexBusinessTime newBusinessTime;

	/**
	 * 新版门店类目标准二级类目code
	 */
	@ApiField("new_shop_category")
	private String newShopCategory;

	/**
	 * null
	 */
	@ApiListField("out_door_images")
	@ApiField("string")
	private List<String> outDoorImages;

	/**
	 * null
	 */
	@ApiListField("qualifications")
	@ApiField("industry_qualification_info")
	private List<IndustryQualificationInfo> qualifications;

	/**
	 * 场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 结算支付宝账号的登录号
	 */
	@ApiField("settle_alipay_logon_id")
	private String settleAlipayLogonId;

	/**
	 * 门店类目，取值参见文件中的三级门店类目
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 支付宝侧蚂蚁门店 id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 当前名称、地址、经纬度信息准确一致，可用于数字化经营场景消费(如商品、券、消费圈等场域的分发)，不影响门店支付结算
	 */
	@ApiField("shop_info_status")
	private String shopInfoStatus;

	/**
	 * 主要针对医疗行业门店主体类型进件使用，不同门店认证主体需要相应的主体资质证书。 企业营业执照：ENTERPRISE; 事业单位法人证书：INST_RGST_CTF; 民办非企业单位登记证书：PRIVATE_NON_ENTERPRISE; 企业（澳门）：AOMEN_ENTERPRISE
	 */
	@ApiField("shop_main_type")
	private String shopMainType;

	/**
	 * 门店名称。
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店不置信推荐信息
	 */
	@ApiField("shop_recommend_info")
	private ShopRecommendInfo shopRecommendInfo;

	/**
	 * 门店经营类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 商户侧门店编号。表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号。若未传入 shop_id 则本参数与与ip_role_id均必填。
	 */
	@ApiField("store_id")
	private String storeId;

	public String getAlipayPoiid() {
		return this.alipayPoiid;
	}
	public void setAlipayPoiid(String alipayPoiid) {
		this.alipayPoiid = alipayPoiid;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public AddressInfo getBusinessAddress() {
		return this.businessAddress;
	}
	public void setBusinessAddress(AddressInfo businessAddress) {
		this.businessAddress = businessAddress;
	}

	public List<ShopBusinessTime> getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(List<ShopBusinessTime> businessTime) {
		this.businessTime = businessTime;
	}

	public String getCardAccountNo() {
		return this.cardAccountNo;
	}
	public void setCardAccountNo(String cardAccountNo) {
		this.cardAccountNo = cardAccountNo;
	}

	public String getCertImage() {
		return this.certImage;
	}
	public void setCertImage(String certImage) {
		this.certImage = certImage;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public List<ContactInfo> getContactInfos() {
		return this.contactInfos;
	}
	public void setContactInfos(List<ContactInfo> contactInfos) {
		this.contactInfos = contactInfos;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public List<ShopExtInfo> getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(List<ShopExtInfo> extInfos) {
		this.extInfos = extInfos;
	}

	public List<MerchantShopIndustryInfo> getIndustryInfo() {
		return this.industryInfo;
	}
	public void setIndustryInfo(List<MerchantShopIndustryInfo> industryInfo) {
		this.industryInfo = industryInfo;
	}

	public List<ShopIndustryLicense> getIndustryLicense() {
		return this.industryLicense;
	}
	public void setIndustryLicense(List<ShopIndustryLicense> industryLicense) {
		this.industryLicense = industryLicense;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getLegalCertNo() {
		return this.legalCertNo;
	}
	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getLicenseAuthLetterImage() {
		return this.licenseAuthLetterImage;
	}
	public void setLicenseAuthLetterImage(String licenseAuthLetterImage) {
		this.licenseAuthLetterImage = licenseAuthLetterImage;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public ComplexBusinessTime getNewBusinessTime() {
		return this.newBusinessTime;
	}
	public void setNewBusinessTime(ComplexBusinessTime newBusinessTime) {
		this.newBusinessTime = newBusinessTime;
	}

	public String getNewShopCategory() {
		return this.newShopCategory;
	}
	public void setNewShopCategory(String newShopCategory) {
		this.newShopCategory = newShopCategory;
	}

	public List<String> getOutDoorImages() {
		return this.outDoorImages;
	}
	public void setOutDoorImages(List<String> outDoorImages) {
		this.outDoorImages = outDoorImages;
	}

	public List<IndustryQualificationInfo> getQualifications() {
		return this.qualifications;
	}
	public void setQualifications(List<IndustryQualificationInfo> qualifications) {
		this.qualifications = qualifications;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSettleAlipayLogonId() {
		return this.settleAlipayLogonId;
	}
	public void setSettleAlipayLogonId(String settleAlipayLogonId) {
		this.settleAlipayLogonId = settleAlipayLogonId;
	}

	public String getShopCategory() {
		return this.shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopInfoStatus() {
		return this.shopInfoStatus;
	}
	public void setShopInfoStatus(String shopInfoStatus) {
		this.shopInfoStatus = shopInfoStatus;
	}

	public String getShopMainType() {
		return this.shopMainType;
	}
	public void setShopMainType(String shopMainType) {
		this.shopMainType = shopMainType;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public ShopRecommendInfo getShopRecommendInfo() {
		return this.shopRecommendInfo;
	}
	public void setShopRecommendInfo(ShopRecommendInfo shopRecommendInfo) {
		this.shopRecommendInfo = shopRecommendInfo;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
