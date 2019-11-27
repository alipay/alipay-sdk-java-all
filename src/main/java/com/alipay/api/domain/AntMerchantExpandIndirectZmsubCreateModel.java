package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻二级商户进件
 *
 * @author auto create
 * @since 1.0, 2017-11-28 10:39:16
 */
public class AntMerchantExpandIndirectZmsubCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2313772524833229726L;

	/**
	 * 授权书url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。与法人相关信息(legal_xx)二选一必填
	 */
	@ApiField("auth_letter_url")
	private String authLetterUrl;

	/**
	 * 营业执照号。进件二级商户时填写。当商户类型(merchant_type)为企业时必填
	 */
	@ApiField("business_license")
	private String businessLicense;

	/**
	 * 营业执照有效期失效时间，yyyy-MM-dd hh:mm:ss格式。商户类型为企业时必填
	 */
	@ApiField("business_license_expire_date")
	private Date businessLicenseExpireDate;

	/**
	 * 营业执照(business_license)的类型，NATIONAL_LEGAL表示普通营业执照，NATIONAL_LEGAL_MERGE表示统一社会信用代码，即多证合一。当商户类型(merchant_type)为企业时必填
	 */
	@ApiField("business_license_type")
	private String businessLicenseType;

	/**
	 * 营业执照图片url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。商户类型为企业时必填
	 */
	@ApiField("business_license_url")
	private String businessLicenseUrl;

	/**
	 * 营业执照有效期开始日期，yyyy-MM-dd hh:mm:ss格式。商户类型为企业时必填
	 */
	@ApiField("business_license_valid_date")
	private Date businessLicenseValidDate;

	/**
	 * 法人地址。当商户类型是企业时，与授权书(auth_letter_url)二选一必填。经纬度及类型可不填；省-市-县(区)三级结构需填写，除非个别省存在的省-县(区)两级结构，这种情况填省-县(区)两级信息
	 */
	@ApiField("legal_address")
	private AddressInfo legalAddress;

	/**
	 * 法人身份证背面图片，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。当商户类型是企业时，与授权书(auth_letter_url)二选一必填
	 */
	@ApiField("legal_cert_back_url")
	private String legalCertBackUrl;

	/**
	 * 法人身份证有效期失效时间。当商户类型是企业时，与授权书(auth_letter_url)二选一必填
	 */
	@ApiField("legal_cert_expire_date")
	private String legalCertExpireDate;

	/**
	 * 法人身份证证明图片url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。当商户类型是企业时，与授权书(auth_letter_url)二选一必填
	 */
	@ApiField("legal_cert_front_url")
	private String legalCertFrontUrl;

	/**
	 * 法人身份证号。当商户类型是企业时，与授权书(auth_letter_url)二选一必填
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法人身份证有效期起始时间。当商户类型是企业时，与授权书(auth_letter_url)二选一必填
	 */
	@ApiField("legal_cert_valid_date")
	private String legalCertValidDate;

	/**
	 * 法人名称。当商户类型是企业时，与授权书(auth_letter_url)二选一必填
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * logo地址，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 商户类别码mcc，参见附件描述中的“类目code”  https://mif-pub.alipayobjects.com/AlipayMCC.xlsx
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商户所在地址。经纬度及类型可不填；省-市-县(区)三级结构需填写，除非个别省存在的省-县(区)两级结构，这种情况填省-县(区)两级信息
	 */
	@ApiField("merchant_address")
	private AddressInfo merchantAddress;

	/**
	 * 商户别名
	 */
	@ApiField("merchant_alias_name")
	private String merchantAliasName;

	/**
	 * 商户联系人信息。其子项信息中，每一个联系人中，名称必填，手机号和邮箱至少有一项，类型和身份证号在本流程中不用填写；通过tag字段来描述联系人的职责，其中 商户关键联系人 (tag=06)在联系人列表中必须存在
	 */
	@ApiListField("merchant_contact")
	@ApiField("contact_info")
	private List<ContactInfo> merchantContact;

	/**
	 * 进件的二级商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户站点信息，包括网站、APP、微信公众号、服务窗等内容。至少填写一个。每个SiteInfo中类型必填，如果类型是网站则站点url必填，其他类型则站点名称必填
	 */
	@ApiListField("merchant_site")
	@ApiField("site_info")
	private List<SiteInfo> merchantSite;

	/**
	 * 商家类型：ENTERPRISE：企业；PARTY_AND_STATE_ORGAN：党政及国家机关；PUBLIC_INSTITUTION：事业单位
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 组织机构代码，商户类型不是企业时，与其他证照(other_license_url)至少填写一项
	 */
	@ApiField("organization_no")
	private String organizationNo;

	/**
	 * 组织机构代码证url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。商户类型不是企业时，与其他证照(other_license_url)至少填写一项
	 */
	@ApiField("organization_url")
	private String organizationUrl;

	/**
	 * 其他证照url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。与组织机构代码二选一必填
	 */
	@ApiField("other_license_url")
	private String otherLicenseUrl;

	/**
	 * 外部业务号。比如某种业务标准外部订单号,比如交易外部订单号，代表服务商端自己订单号。用于做并发控制，防止一笔外部订单发起两次进件。如果没有可不用传入。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 芝麻二级商户入驻签约用意，值在下述文本描述中，个人类与企业类分别最多只能有5个，多个值使用|分隔(英文竖线)。个人类型包括：现金放贷、消费分期、个人融资租赁、发放信用卡、极速返利、押金减免、先用后付、社交场景信用互查、个人会员分层信用参考、实名认证、实人认证、个人其他；企业类型包括：企业间赊销或后付、企业贷款、供应链金融、企业融资租赁、企业会员分层信用参考、企业其他。个人其他与企业其他需要在[]中填写具体信息
	 */
	@ApiField("zm_biz_scene")
	private String zmBizScene;

	/**
	 * 芝麻行业，具体定义参见附件excel中的“二级类目code”  https://mif-pub.alipayobjects.com/ZmIndustry.xlsx
	 */
	@ApiField("zm_industry")
	private String zmIndustry;

	public String getAuthLetterUrl() {
		return this.authLetterUrl;
	}
	public void setAuthLetterUrl(String authLetterUrl) {
		this.authLetterUrl = authLetterUrl;
	}

	public String getBusinessLicense() {
		return this.businessLicense;
	}
	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public Date getBusinessLicenseExpireDate() {
		return this.businessLicenseExpireDate;
	}
	public void setBusinessLicenseExpireDate(Date businessLicenseExpireDate) {
		this.businessLicenseExpireDate = businessLicenseExpireDate;
	}

	public String getBusinessLicenseType() {
		return this.businessLicenseType;
	}
	public void setBusinessLicenseType(String businessLicenseType) {
		this.businessLicenseType = businessLicenseType;
	}

	public String getBusinessLicenseUrl() {
		return this.businessLicenseUrl;
	}
	public void setBusinessLicenseUrl(String businessLicenseUrl) {
		this.businessLicenseUrl = businessLicenseUrl;
	}

	public Date getBusinessLicenseValidDate() {
		return this.businessLicenseValidDate;
	}
	public void setBusinessLicenseValidDate(Date businessLicenseValidDate) {
		this.businessLicenseValidDate = businessLicenseValidDate;
	}

	public AddressInfo getLegalAddress() {
		return this.legalAddress;
	}
	public void setLegalAddress(AddressInfo legalAddress) {
		this.legalAddress = legalAddress;
	}

	public String getLegalCertBackUrl() {
		return this.legalCertBackUrl;
	}
	public void setLegalCertBackUrl(String legalCertBackUrl) {
		this.legalCertBackUrl = legalCertBackUrl;
	}

	public String getLegalCertExpireDate() {
		return this.legalCertExpireDate;
	}
	public void setLegalCertExpireDate(String legalCertExpireDate) {
		this.legalCertExpireDate = legalCertExpireDate;
	}

	public String getLegalCertFrontUrl() {
		return this.legalCertFrontUrl;
	}
	public void setLegalCertFrontUrl(String legalCertFrontUrl) {
		this.legalCertFrontUrl = legalCertFrontUrl;
	}

	public String getLegalCertNo() {
		return this.legalCertNo;
	}
	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

	public String getLegalCertValidDate() {
		return this.legalCertValidDate;
	}
	public void setLegalCertValidDate(String legalCertValidDate) {
		this.legalCertValidDate = legalCertValidDate;
	}

	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public AddressInfo getMerchantAddress() {
		return this.merchantAddress;
	}
	public void setMerchantAddress(AddressInfo merchantAddress) {
		this.merchantAddress = merchantAddress;
	}

	public String getMerchantAliasName() {
		return this.merchantAliasName;
	}
	public void setMerchantAliasName(String merchantAliasName) {
		this.merchantAliasName = merchantAliasName;
	}

	public List<ContactInfo> getMerchantContact() {
		return this.merchantContact;
	}
	public void setMerchantContact(List<ContactInfo> merchantContact) {
		this.merchantContact = merchantContact;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public List<SiteInfo> getMerchantSite() {
		return this.merchantSite;
	}
	public void setMerchantSite(List<SiteInfo> merchantSite) {
		this.merchantSite = merchantSite;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getOrganizationNo() {
		return this.organizationNo;
	}
	public void setOrganizationNo(String organizationNo) {
		this.organizationNo = organizationNo;
	}

	public String getOrganizationUrl() {
		return this.organizationUrl;
	}
	public void setOrganizationUrl(String organizationUrl) {
		this.organizationUrl = organizationUrl;
	}

	public String getOtherLicenseUrl() {
		return this.otherLicenseUrl;
	}
	public void setOtherLicenseUrl(String otherLicenseUrl) {
		this.otherLicenseUrl = otherLicenseUrl;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getZmBizScene() {
		return this.zmBizScene;
	}
	public void setZmBizScene(String zmBizScene) {
		this.zmBizScene = zmBizScene;
	}

	public String getZmIndustry() {
		return this.zmIndustry;
	}
	public void setZmIndustry(String zmIndustry) {
		this.zmIndustry = zmIndustry;
	}

}
