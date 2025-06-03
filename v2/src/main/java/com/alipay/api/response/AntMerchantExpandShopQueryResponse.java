package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AddressInfo;
import com.alipay.api.domain.ShopBusinessTime;
import com.alipay.api.domain.ContactInfo;
import com.alipay.api.domain.ShopExtInfo;
import com.alipay.api.domain.MerchantShopIndustryInfo;
import com.alipay.api.domain.ShopIndustryLicense;
import com.alipay.api.domain.ComplexBusinessTime;
import com.alipay.api.domain.IndustryQualificationInfo;
import com.alipay.api.domain.ShopRecommendInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-20 20:32:27
 */
public class AntMerchantExpandShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6316874579999466527L;

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
	 * 店铺经营时间。
	 */
	@ApiListField("business_time")
	@ApiField("shop_business_time")
	private List<ShopBusinessTime> businessTime;

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
	 * 联系人信息。
	 */
	@ApiListField("contact_infos")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfos;

	/** 
	 * 店铺联系手机
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/** 
	 * 店铺的联系固话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/** 
	 * 扩展信息列表。key值需要向对应行业的bd进行申请。
	 */
	@ApiListField("ext_infos")
	@ApiField("shop_ext_info")
	private List<ShopExtInfo> extInfos;

	/** 
	 * 查询门店详情时，如果需要同时返回行业信息，需要设置入参中的need_industry_info=1
	 */
	@ApiListField("industry_info")
	@ApiField("merchant_shop_industry_info")
	private List<MerchantShopIndustryInfo> industryInfo;

	/** 
	 * 查询门店详情时，如果需要同时返回行业资质，需要设置入参中的need_industry_license=1
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
	@ApiListField("new_business_time")
	@ApiField("complex_business_time")
	private List<ComplexBusinessTime> newBusinessTime;

	/** 
	 * 新版门店类目标准二级类目code
	 */
	@ApiField("new_shop_category")
	private String newShopCategory;

	/** 
	 * 门头照，返回值为一个有访问时限的链接
	 */
	@ApiListField("out_door_images")
	@ApiField("string")
	private List<String> outDoorImages;

	/** 
	 * 行业特殊资质。
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
	 * 店铺类目，取值参见文件中的三级门店类目<a herf="https://mif-pub.alipayobjects.com/ShopCategory.xlsx"></a>
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/** 
	 * 支付宝侧蚂蚁店铺 id
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 当前名称、地址、经纬度信息准确一致，可用于数字化经营场景消费(如商品、券、消费圈等场域的分发)，不影响门店支付结算
	 */
	@ApiField("shop_info_status")
	private String shopInfoStatus;

	/** 
	 * 主要针对医疗行业门店主体类型进件使用，不同门店认证主体需要相应的主体资质证书。 
企业营业执照: ENTERPRISE; 
事业单位法人证书: INST_RGST_CTF; 
民办非企业单位登记证书 PRIVATE_NON_ENTERPRISE
	 */
	@ApiField("shop_main_type")
	private String shopMainType;

	/** 
	 * 店铺名称。
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 门店不置信推荐信息
	 */
	@ApiField("shop_recommend_info")
	private ShopRecommendInfo shopRecommendInfo;

	/** 
	 * 店铺经营类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/** 
	 * 商户侧门店编号。表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号。若未传入 shop_id  则本参数与与ip_role_id均必填。
	 */
	@ApiField("store_id")
	private String storeId;

	public void setAlipayPoiid(String alipayPoiid) {
		this.alipayPoiid = alipayPoiid;
	}
	public String getAlipayPoiid( ) {
		return this.alipayPoiid;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandId( ) {
		return this.brandId;
	}

	public void setBusinessAddress(AddressInfo businessAddress) {
		this.businessAddress = businessAddress;
	}
	public AddressInfo getBusinessAddress( ) {
		return this.businessAddress;
	}

	public void setBusinessTime(List<ShopBusinessTime> businessTime) {
		this.businessTime = businessTime;
	}
	public List<ShopBusinessTime> getBusinessTime( ) {
		return this.businessTime;
	}

	public void setCertImage(String certImage) {
		this.certImage = certImage;
	}
	public String getCertImage( ) {
		return this.certImage;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertName( ) {
		return this.certName;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setContactInfos(List<ContactInfo> contactInfos) {
		this.contactInfos = contactInfos;
	}
	public List<ContactInfo> getContactInfos( ) {
		return this.contactInfos;
	}

	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}
	public String getContactMobile( ) {
		return this.contactMobile;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getContactPhone( ) {
		return this.contactPhone;
	}

	public void setExtInfos(List<ShopExtInfo> extInfos) {
		this.extInfos = extInfos;
	}
	public List<ShopExtInfo> getExtInfos( ) {
		return this.extInfos;
	}

	public void setIndustryInfo(List<MerchantShopIndustryInfo> industryInfo) {
		this.industryInfo = industryInfo;
	}
	public List<MerchantShopIndustryInfo> getIndustryInfo( ) {
		return this.industryInfo;
	}

	public void setIndustryLicense(List<ShopIndustryLicense> industryLicense) {
		this.industryLicense = industryLicense;
	}
	public List<ShopIndustryLicense> getIndustryLicense( ) {
		return this.industryLicense;
	}

	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}
	public String getIpRoleId( ) {
		return this.ipRoleId;
	}

	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}
	public String getLegalCertNo( ) {
		return this.legalCertNo;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public String getLegalName( ) {
		return this.legalName;
	}

	public void setLicenseAuthLetterImage(String licenseAuthLetterImage) {
		this.licenseAuthLetterImage = licenseAuthLetterImage;
	}
	public String getLicenseAuthLetterImage( ) {
		return this.licenseAuthLetterImage;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setNewBusinessTime(List<ComplexBusinessTime> newBusinessTime) {
		this.newBusinessTime = newBusinessTime;
	}
	public List<ComplexBusinessTime> getNewBusinessTime( ) {
		return this.newBusinessTime;
	}

	public void setNewShopCategory(String newShopCategory) {
		this.newShopCategory = newShopCategory;
	}
	public String getNewShopCategory( ) {
		return this.newShopCategory;
	}

	public void setOutDoorImages(List<String> outDoorImages) {
		this.outDoorImages = outDoorImages;
	}
	public List<String> getOutDoorImages( ) {
		return this.outDoorImages;
	}

	public void setQualifications(List<IndustryQualificationInfo> qualifications) {
		this.qualifications = qualifications;
	}
	public List<IndustryQualificationInfo> getQualifications( ) {
		return this.qualifications;
	}

	public void setScene(String scene) {
		this.scene = scene;
	}
	public String getScene( ) {
		return this.scene;
	}

	public void setSettleAlipayLogonId(String settleAlipayLogonId) {
		this.settleAlipayLogonId = settleAlipayLogonId;
	}
	public String getSettleAlipayLogonId( ) {
		return this.settleAlipayLogonId;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public String getShopCategory( ) {
		return this.shopCategory;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setShopInfoStatus(String shopInfoStatus) {
		this.shopInfoStatus = shopInfoStatus;
	}
	public String getShopInfoStatus( ) {
		return this.shopInfoStatus;
	}

	public void setShopMainType(String shopMainType) {
		this.shopMainType = shopMainType;
	}
	public String getShopMainType( ) {
		return this.shopMainType;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setShopRecommendInfo(ShopRecommendInfo shopRecommendInfo) {
		this.shopRecommendInfo = shopRecommendInfo;
	}
	public ShopRecommendInfo getShopRecommendInfo( ) {
		return this.shopRecommendInfo;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	public String getShopType( ) {
		return this.shopType;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreId( ) {
		return this.storeId;
	}

}
