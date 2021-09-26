package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 直付通二级商户免证照进件
 *
 * @author auto create
 * @since 1.0, 2021-09-10 20:24:59
 */
public class AntMerchantExpandIndirectZftSimplecreateModel extends AlipayObject {

	private static final long serialVersionUID = 4196646597638565266L;

	/**
	 * 补充证件图片，与additional_cert_no、additional_cert_type同时提供。当商户类型为个人时，使用当面付收款有限额，补充这组证件信息可提额。目前仅允许个人类型商户传入。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("additional_cert_image")
	private String additionalCertImage;

	/**
	 * 补充证件号，与additional_cert_type+additional_cert_image同时提供。当商户类型为个人时，使用当面付收款有限额，补充这组证件信息可提额。目前仅允许个人类型商户传入本字段。
	 */
	@ApiField("additional_cert_no")
	private String additionalCertNo;

	/**
	 * 补充证件类型，与additional_cert_no+additional_cert_image同时提供。可选值有201（营业执照号）、204（民办非企业登记证书）、206（社会团体法人登记证书）、218（事业单位法人证书）、219（党政机关批准设立文件/行政执法主体资格证）。当商户类型为个人时，使用当面付收款有限额，补充这组证件信息可提额。目前仅允许个人类型商户传入本字段。
	 */
	@ApiField("additional_cert_type")
	private String additionalCertType;

	/**
	 * 商户别名。支付宝收银台及账单中的商户名称会展示此处设置的别名。如果涉及支付宝APP内的支付，支付结果页也会展示该别名；如果涉及当面付场景，请填写线下店铺名称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 结算支付宝账号，结算到商户支付宝账号时填写，默认值为与签约支付宝账号相同。本字段要求与签约支付宝账号同主体的实名认证支付宝账户(个体工商户可以与营业执照名称或法人名称相同)
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 已实名认证支付宝账号，使用该支付宝账号签约直付通二级商户及后续服务，商户主体将与该支付宝账号相同
	 */
	@ApiField("binding_alipay_logon_id")
	private String bindingAlipayLogonId;

	/**
	 * 结算银行卡信息，如果结算到支付宝账号，则不需要填写。本业务当前只允许传入一张结算卡
	 */
	@ApiField("biz_cards")
	private SettleCardInfo bizCards;

	/**
	 * 经营地址。签约当面付必填。地址对象中省、市、区、地址必填，其余选填
	 */
	@ApiField("business_address")
	private AddressInfo businessAddress;

	/**
	 * 商户联系人信息。在本业务中，ContactInfo对象中联系人姓名、手机号必填，其他选填
	 */
	@ApiField("contact_infos")
	private ContactInfo contactInfos;

	/**
	 * 默认结算规则。当调用收单接口，结算条款中设置默认结算规则时，交易资金将结算至此处设置的默认结算目标账户中。其详细描述及收单接口传参示例参考功能包文档
	 */
	@ApiField("default_settle_rule")
	private DefaultSettleRule defaultSettleRule;

	/**
	 * 商户编号，由机构定义，需要保证在机构下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 内景照，签约当面付必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("in_door_images")
	private String inDoorImages;

	/**
	 * 开票资料信息
	 */
	@ApiField("invoice_info")
	private MerchantInvoiceInfo invoiceInfo;

	/**
	 * 授权函。当商户名与结算卡户名不一致（模板参考https://gw.alipayobjects.com/os/skylark-tools/public/files/d5fcbe7463d7159a0d362da417d157ed.docx），或涉及外籍法人（这种情况上传任意能证明身份的图片）时必填，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("license_auth_letter_image")
	private String licenseAuthLetterImage;

	/**
	 * 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/e5dbb27b-1d8d-442e-be9e-6e52971ce7c3.xlsx
特殊行业要按照MCC说明中的资质一栏上传辅助资质，辅助资质在qualifications字段中上传，会有人工审核
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 门头照，签约当面付必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("out_door_images")
	private String outDoorImages;

	/**
	 * 商户行业资质图片，当商户是特殊行业时必填。每项行业资质信息中，industry_qualification_type和industry_qualification_image均必填。
	 */
	@ApiListField("qualifications")
	@ApiField("industry_qualification_info")
	private List<IndustryQualificationInfo> qualifications;

	/**
	 * 商户签约服务，可选值有：当面付、app支付、wap支付、电脑支付、线上资金预授权、新当面资金授权、商户代扣、小程序支付。其值会影响其他字段必填性，详见其他字段描述
	 */
	@ApiListField("service")
	@ApiField("string")
	private List<String> service;

	/**
	 * 商户客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 二级商户与服务商的签约时间。
	 */
	@ApiField("sign_time_with_isv")
	private String signTimeWithIsv;

	/**
	 * 商户站点信息，包括网站、app、小程序站点。签约电脑支付或wap支付时，必须填充一个类型为01(网站)的SiteInfo对象，site_type/site_url/site_name必填；签约app支付时，必须填充类型为02(APP)或06(支付宝小程序)的SiteInfo对象，site_type/site_name必填
	 */
	@ApiField("sites")
	private SiteInfo sites;

	public String getAdditionalCertImage() {
		return this.additionalCertImage;
	}
	public void setAdditionalCertImage(String additionalCertImage) {
		this.additionalCertImage = additionalCertImage;
	}

	public String getAdditionalCertNo() {
		return this.additionalCertNo;
	}
	public void setAdditionalCertNo(String additionalCertNo) {
		this.additionalCertNo = additionalCertNo;
	}

	public String getAdditionalCertType() {
		return this.additionalCertType;
	}
	public void setAdditionalCertType(String additionalCertType) {
		this.additionalCertType = additionalCertType;
	}

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

	public SettleCardInfo getBizCards() {
		return this.bizCards;
	}
	public void setBizCards(SettleCardInfo bizCards) {
		this.bizCards = bizCards;
	}

	public AddressInfo getBusinessAddress() {
		return this.businessAddress;
	}
	public void setBusinessAddress(AddressInfo businessAddress) {
		this.businessAddress = businessAddress;
	}

	public ContactInfo getContactInfos() {
		return this.contactInfos;
	}
	public void setContactInfos(ContactInfo contactInfos) {
		this.contactInfos = contactInfos;
	}

	public DefaultSettleRule getDefaultSettleRule() {
		return this.defaultSettleRule;
	}
	public void setDefaultSettleRule(DefaultSettleRule defaultSettleRule) {
		this.defaultSettleRule = defaultSettleRule;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getInDoorImages() {
		return this.inDoorImages;
	}
	public void setInDoorImages(String inDoorImages) {
		this.inDoorImages = inDoorImages;
	}

	public MerchantInvoiceInfo getInvoiceInfo() {
		return this.invoiceInfo;
	}
	public void setInvoiceInfo(MerchantInvoiceInfo invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
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

	public String getOutDoorImages() {
		return this.outDoorImages;
	}
	public void setOutDoorImages(String outDoorImages) {
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

	public SiteInfo getSites() {
		return this.sites;
	}
	public void setSites(SiteInfo sites) {
		this.sites = sites;
	}

}
