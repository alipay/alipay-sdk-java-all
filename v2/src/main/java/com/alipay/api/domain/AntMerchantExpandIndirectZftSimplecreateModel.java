package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 直付通二级商户免证照进件
 *
 * @author auto create
 * @since 1.0, 2024-11-28 15:29:57
 */
public class AntMerchantExpandIndirectZftSimplecreateModel extends AlipayObject {

	private static final long serialVersionUID = 7643194858984185359L;

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
	 * 商户别名。支付宝收银台及账单中的商户名称会展示此处设置的别名。如果涉及支付宝APP内的支付，支付结果页也会展示该别名；如果涉及线下当面付场景，请填写线下店铺名称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 结算支付宝账号，结算账号使用支付宝账号时必填，本字段指定交易资金结算的具体支付宝账号，与binding_alipay_logon_id同主体的支付宝账号即可
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 签约支付宝账户。需使用实名认证支付宝账号，使用该支付宝账号签约直付通二级商户及后续服务，商户主体与该支付宝账号主体相同
	 */
	@ApiField("binding_alipay_logon_id")
	private String bindingAlipayLogonId;

	/**
	 * 结算银行卡信息，结算账号使用银行卡时必填。本业务当前只允许传入一张结算卡。个人类型商户不允许结算到银行卡
	 */
	@ApiField("biz_cards")
	private SettleCardInfo bizCards;

	/**
	 * 经营地址。使用当面付服务时必填。地址对象中省、市、区、地址必填，其余选填
	 */
	@ApiField("business_address")
	private AddressInfo businessAddress;

	/**
	 * 商户联系人信息。在本业务中，ContactInfo对象中联系人姓名、手机号必填，其他选填
	 */
	@ApiField("contact_infos")
	private ContactInfo contactInfos;

	/**
	 * 默认结算规则。当调用收单接口，settle_info中设置默认结算规则（defaultSettle）时，交易资金将结算至此处设置的默认结算目标账户中。其详细描述及收单接口传参示例参考功能包文档
	 */
	@ApiField("default_settle_rule")
	private DefaultSettleRule defaultSettleRule;

	/**
	 * 商户编号，由一级商户定义，保证在一级商户下唯一即可
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 内景照，使用当面付服务时必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("in_door_images")
	private String inDoorImages;

	/**
	 * （平替原来的info_source_uid字段，如果能拿到openId，请传本字段，原字段留空）。信息关联的openId
	 */
	@ApiField("info_source_open_id")
	private String infoSourceOpenId;

	/**
	 * （已废弃，请使用info_source_open_id）。信息关联的uid
	 */
	@ApiField("info_source_uid")
	private String infoSourceUid;

	/**
	 * 开票资料信息
	 */
	@ApiField("invoice_info")
	private MerchantInvoiceInfo invoiceInfo;

	/**
	 * 授权函。当商户名与结算卡户名不一致。<a href="https://opendocs.alipay.com/open/direct-payment/cg5mkp#%E7%9B%B8%E5%85%B3%E8%B5%84%E6%96%99">《说明函》模板参考</a>。涉及外籍法人（这种情况上传任意能证明身份的图片）时必填，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。（<b>商户类型为个体工商户时，本字段仅需上传营业执照非授权函</b>）
	 */
	@ApiField("license_auth_letter_image")
	private String licenseAuthLetterImage;

	/**
	 * 商户类别码 mcc，可查看  <a href="https://mdn.alipayobjects.com/huamei_fctrxv/afts/file/A*3TMHRZ8ppa4AAAAAAAAAAAAADs2DAQ/%E8%BF%9B%E4%BB%B6MCC%E4%B8%8E%E8%B5%84%E8%B4%A8%E8%A6%81%E6%B1%82202212.xlsx">进件MCC与资质要求 202212.xlsx</a>，特殊行业要按照MCC说明中的资质一栏上传辅助资质，辅助资质要在 qualifications 中上传，会有人工审核。
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 进件的二级商户名称。一般情况下要与证件的名称相同。个体工商户类型可以放宽到法人名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 门头照，使用当面付服务时必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("out_door_images")
	private String outDoorImages;

	/**
	 * （已废弃，请使用oversea_settle_open_id）境外结算账号
	 */
	@ApiField("oversea_settle_account")
	private String overseaSettleAccount;

	/**
	 * （平替原来的oversea_settle_open_id字段，如能够获取到该场景的open_id，请传本字段，原字段留空）境外结算账号
	 */
	@ApiField("oversea_settle_open_id")
	private String overseaSettleOpenId;

	/**
	 * 商户行业资质图片，当商户的经营类目选择了特殊行业时该字段必填，需要特殊行业资质文件。每项行业资质信息中，industry_qualification_type和industry_qualification_image均必填。
	 */
	@ApiListField("qualifications")
	@ApiField("industry_qualification_info")
	private List<IndustryQualificationInfo> qualifications;

	/**
	 * 商户使用服务，可选值有：当面付、jsapi支付、app支付、wap支付、电脑支付、预授权支付、商户代扣、小程序支付、订单码支付。其值会影响其他字段必填性，详见其他字段描述
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
	 * 商户站点信息，包括网站、app、小程序。商户使用服务包含电脑支付、wap支付时，必须填充一个类型为01(网站)的SiteInfo对象，site_type/site_url/site_name必填；当包含app支付时，必须至少填充类型为02(APP)或06(支付宝小程序)中一种类型的SiteInfo对象，site_type/site_name必填；当包含jsapi支付时，必须填充一个类型为06(支付宝小程序)的SiteInfo对象；
	 */
	@ApiField("sites")
	private SiteInfo sites;

	/**
	 * 交易场景；
	 */
	@ApiListField("trade_scene")
	@ApiField("string")
	private List<String> tradeScene;

	/**
	 * 代扣产品信息
	 */
	@ApiField("zft_withholding_info")
	private ZFTWithholdingInfo zftWithholdingInfo;

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

	public String getInfoSourceOpenId() {
		return this.infoSourceOpenId;
	}
	public void setInfoSourceOpenId(String infoSourceOpenId) {
		this.infoSourceOpenId = infoSourceOpenId;
	}

	public String getInfoSourceUid() {
		return this.infoSourceUid;
	}
	public void setInfoSourceUid(String infoSourceUid) {
		this.infoSourceUid = infoSourceUid;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutDoorImages() {
		return this.outDoorImages;
	}
	public void setOutDoorImages(String outDoorImages) {
		this.outDoorImages = outDoorImages;
	}

	public String getOverseaSettleAccount() {
		return this.overseaSettleAccount;
	}
	public void setOverseaSettleAccount(String overseaSettleAccount) {
		this.overseaSettleAccount = overseaSettleAccount;
	}

	public String getOverseaSettleOpenId() {
		return this.overseaSettleOpenId;
	}
	public void setOverseaSettleOpenId(String overseaSettleOpenId) {
		this.overseaSettleOpenId = overseaSettleOpenId;
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

	public List<String> getTradeScene() {
		return this.tradeScene;
	}
	public void setTradeScene(List<String> tradeScene) {
		this.tradeScene = tradeScene;
	}

	public ZFTWithholdingInfo getZftWithholdingInfo() {
		return this.zftWithholdingInfo;
	}
	public void setZftWithholdingInfo(ZFTWithholdingInfo zftWithholdingInfo) {
		this.zftWithholdingInfo = zftWithholdingInfo;
	}

}
