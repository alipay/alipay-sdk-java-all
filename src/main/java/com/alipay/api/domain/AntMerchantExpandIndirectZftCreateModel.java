package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 直付通二级商户创建
 *
 * @author auto create
 * @since 1.0, 2019-08-01 19:00:18
 */
public class AntMerchantExpandIndirectZftCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8899647335146435127L;

	/**
	 * 商户别名
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 商户支付宝账号，用作结算账号。与银行卡对象字段二选一必填。本字段要求与商户名称name同名，且是实名认证支付宝账户
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 二级商户支付宝账户，用于协议确认。目前商业场景（除医疗、中小学教育等）下必填。本字段要求与商户名称name同名，且是实名认证支付宝账户
	 */
	@ApiField("binding_alipay_logon_id")
	private String bindingAlipayLogonId;

	/**
	 * 商户结算卡信息。本业务当前只允许传入一张结算卡。与支付宝账号字段二选一必填
	 */
	@ApiListField("biz_cards")
	@ApiField("settle_card_info")
	private List<SettleCardInfo> bizCards;

	/**
	 * 经营地址。地址对象中省、市、区、地址必填，其余选填
	 */
	@ApiField("business_address")
	private AddressInfo businessAddress;

	/**
	 * 营业执照图片url，本业务接口中，如果是特殊行业必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("cert_image")
	private String certImage;

	/**
	 * 证件反面图片。目前只有当商户类型是个人商户，主证件为身份证时才需填写
	 */
	@ApiField("cert_image_back")
	private String certImageBack;

	/**
	 * 目前只有个体工商户商户类型要求填入本字段，填写值为个体工商户营业执照上的名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 商户证件编号（企业或者个体工商户提供营业执照，事业单位提供事证号）
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 商户证件类型，取值范围：201：营业执照；2011:营业执照(统一社会信用代码)；204：民办非企业登记证书；206：社会团体法人登记证书；218：事业单位法人证书；219：党政机关批准设立文件/行政执法主体资格证；100：个人商户身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 商户联系人信息。在本业务中，ContactInfo对象中名称，类型、手机号必填，其他选填
	 */
	@ApiListField("contact_infos")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfos;

	/**
	 * 商户编号，由机构定义，需要保证在机构下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 开票资料信息
	 */
	@ApiField("invoice_info")
	private MerchantInvoiceInfo invoiceInfo;

	/**
	 * 法人身份证反面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
	 */
	@ApiField("legal_cert_back_image")
	private String legalCertBackImage;

	/**
	 * 法人身份证正面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
	 */
	@ApiField("legal_cert_front_image")
	private String legalCertFrontImage;

	/**
	 * 法人身份证号
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 默认可不填，认为legal_cert_no是大陆身份证。类型包括：100 大陆身份证；105 港澳居民往来内地通行证；106 台湾同胞往来大陆通行证；108 外国人居留证
	 */
	@ApiField("legal_cert_type")
	private String legalCertType;

	/**
	 * 法人名称
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 营业执照授权函。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。当商户名与结算卡户名不一致时必填
	 */
	@ApiField("license_auth_letter_image")
	private String licenseAuthLetterImage;

	/**
	 * 商户类别码mcc，参见附件描述中的“类目code”  https://gw.alipayobjects.com/os/basement_prod/82cb70f7-abbd-417a-91ba-73c1849f07ea.xlsx  如果要求资质一栏不为空，表明是特殊行业，会有人工审核。注：文档更新可能有滞后性，以实际为准
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商家类型：01：企业；02：事业单位；03：民办非企业组织；04：社会团体；05：党政及国家机关；06：个人商户；07：个体工商户
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 进件的二级商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部业务号。比如某种业务标准外部订单号,比如交易外部订单号，代表服务商端自己订单号。用于做并发控制，防止一笔外部订单发起两次进件。非必要场景禁止传入本字段，如要使用务必理清场景及字段生成规则，与蚂蚁金服对接人咨询。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 门头照，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。如果使用当面付服务则必填
	 */
	@ApiListField("out_door_images")
	@ApiField("string")
	private List<String> outDoorImages;

	/**
	 * 商户行业资质，当商户是特殊行业时必填
	 */
	@ApiListField("qualifications")
	@ApiField("industry_qualification_info")
	private List<IndustryQualificationInfo> qualifications;

	/**
	 * 商户使用服务，可选值有：当面付、app支付、wap支付、电脑支付
	 */
	@ApiListField("service")
	@ApiField("string")
	private List<String> service;

	/**
	 * 客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 二级商户与服务商的签约时间
	 */
	@ApiField("sign_time_with_isv")
	private String signTimeWithIsv;

	/**
	 * 商户站点信息，包括网站、app、小程序。商户使用服务包含电脑支付或wap支付时，必须填充一个类型为01(网站)的SiteInfo对象；当包含app支付时，必须至少填充类型为02(APP)或06(支付宝小程序)中一种类型的SiteInfo对象
	 */
	@ApiListField("sites")
	@ApiField("site_info")
	private List<SiteInfo> sites;

	public String getAliasName() {
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getBindingAlipayLogonId() {
		return this.bindingAlipayLogonId;
	}
	public void setBindingAlipayLogonId(String bindingAlipayLogonId) {
		this.bindingAlipayLogonId = bindingAlipayLogonId;
	}

	public List<SettleCardInfo> getBizCards() {
		return this.bizCards;
	}
	public void setBizCards(List<SettleCardInfo> bizCards) {
		this.bizCards = bizCards;
	}

	public AddressInfo getBusinessAddress() {
		return this.businessAddress;
	}
	public void setBusinessAddress(AddressInfo businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getCertImage() {
		return this.certImage;
	}
	public void setCertImage(String certImage) {
		this.certImage = certImage;
	}

	public String getCertImageBack() {
		return this.certImageBack;
	}
	public void setCertImageBack(String certImageBack) {
		this.certImageBack = certImageBack;
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

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public MerchantInvoiceInfo getInvoiceInfo() {
		return this.invoiceInfo;
	}
	public void setInvoiceInfo(MerchantInvoiceInfo invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}

	public String getLegalCertBackImage() {
		return this.legalCertBackImage;
	}
	public void setLegalCertBackImage(String legalCertBackImage) {
		this.legalCertBackImage = legalCertBackImage;
	}

	public String getLegalCertFrontImage() {
		return this.legalCertFrontImage;
	}
	public void setLegalCertFrontImage(String legalCertFrontImage) {
		this.legalCertFrontImage = legalCertFrontImage;
	}

	public String getLegalCertNo() {
		return this.legalCertNo;
	}
	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

	public String getLegalCertType() {
		return this.legalCertType;
	}
	public void setLegalCertType(String legalCertType) {
		this.legalCertType = legalCertType;
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

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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

	public List<String> getService() {
		return this.service;
	}
	public void setService(List<String> service) {
		this.service = service;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getSignTimeWithIsv() {
		return this.signTimeWithIsv;
	}
	public void setSignTimeWithIsv(String signTimeWithIsv) {
		this.signTimeWithIsv = signTimeWithIsv;
	}

	public List<SiteInfo> getSites() {
		return this.sites;
	}
	public void setSites(List<SiteInfo> sites) {
		this.sites = sites;
	}

}
