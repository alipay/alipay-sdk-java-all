package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 直付通二级商户创建
 *
 * @author auto create
 * @since 1.0, 2022-12-01 21:49:18
 */
public class AntMerchantExpandIndirectZftCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2397256177138319846L;

	/**
	 * 商户别名。支付宝账单中的商户名称会展示此处设置的别名，如果涉及支付宝APP内的支付，支付结果页也会展示该别名。如果涉及当面付场景，请填写线下店铺名称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 结算支付宝账号，结算账号使用支付宝账号时必填。本字段要求与商户名称name同名，且是实名认证支付宝账户(个体工商户可以与name或cert_name相同)
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 签约支付宝账户，用于协议确认，及后续二级商户增值产品服务签约时使用。本字段要求与商户名称name同名(个体工商户可以与name或cert_name相同)，且是实名认证支付宝账户
	 */
	@ApiField("binding_alipay_logon_id")
	private String bindingAlipayLogonId;

	/**
	 * 结算银行卡，如果结算到支付宝账号，则不需要填写。本业务当前只允许传入一张结算卡。个人类型商户不允许结算到银行卡
	 */
	@ApiListField("biz_cards")
	@ApiField("settle_card_info")
	private List<SettleCardInfo> bizCards;

	/**
	 * 经营地址。当使用当面付服务时，本字段要求必填。地址对象中省、市、区、地址必填，其余选填
	 */
	@ApiField("business_address")
	private AddressInfo businessAddress;

	/**
	 * 商户证件图片url，本业务接口中，如果是特殊行业必填；使用当面付服务时，非个人必填，个人结算到卡时必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("cert_image")
	private String certImage;

	/**
	 * 证件反面图片。目前只有当商户类型是个人商户且使用当面付服务时才需填写
	 */
	@ApiField("cert_image_back")
	private String certImageBack;

	/**
	 * 目前只有个体工商户商户类型要求填入本字段，填写值为个体工商户营业执照上的名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 商户证件编号，按商户类型merchant_type的说明提供对应的证件编号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 商户证件类型，按商户类型merchant_type的说明提供对应的证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 商户联系人信息。在本业务中，ContactInfo对象中联系人姓名，手机号必填，其他选填
	 */
	@ApiListField("contact_infos")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfos;

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
	 * 内景照，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。如果使用当面付服务则必填
	 */
	@ApiListField("in_door_images")
	@ApiField("string")
	private List<String> inDoorImages;

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
	 * 法人身份证号。非个人商户类型必填
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 默认可不填，认为legal_cert_no是大陆身份证。类型包括：100 大陆身份证；105 港澳居民往来内地通行证；106 台湾同胞往来大陆通行证；108 外国人居留证
	 */
	@ApiField("legal_cert_type")
	private String legalCertType;

	/**
	 * 法人名称。非个人商户类型必填
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 授权函。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。当商户名与结算卡户名不一致（模板参考https://gw.alipayobjects.com/os/skylark-tools/public/files/d5fcbe7463d7159a0d362da417d157ed.docx），或涉及外籍法人（这种情况上传任意能证明身份的图片）时必填
	 */
	@ApiField("license_auth_letter_image")
	private String licenseAuthLetterImage;

	/**
	 * 商户类别码 mcc，可查看  <a href="https://mdn.alipayobjects.com/portal_mdssth/afts/file/A*-EYjSJ2soV0AAAAAAAAAAAAAAQAAAQ">进件MCC与资质要求 202211.xlsx</a>，特殊行业要按照MCC说明中的资质一栏上传辅助资质，辅助资质要在 qualifications 中上传，会有人工审核。
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商户类型：
01：企业；cert_type填写201（营业执照）；cert_no填写营业执照号；
02：事业单位：cert_type填写218（事业单位法人证书）；cert_no填写事业单位法人证书编号；
03：民办非企业组织：cert_type填写204（民办非企业登记证书）；cert_no填写民办非企业登记证书编号；
04：社会团体：cert_type填写206（社会团体法人登记证书）；cert_no填写社会团体法人登记证书编号；
05：党政及国家机关：cert_type填写219（党政机关批准设立文件/行政执法主体资格证）；cert_no填写党政机关批准设立文件/行政执法主体资格证编号；
06：个人商户：cert_type填写100（个人身份证）；cert_no填写个人身份证号码；
07：个体工商户：cert_type填写201（营业执照）；cert_no填写营业执照编号；
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 进件的二级商户名称。一般情况下要与证件的名称相同。个体工商户类型可以放宽到法人名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部业务号。目前已废弃。新接入场景禁止传入本字段，否则可能会产生无法新进件的情况
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
	 * 商户行业资质，当商户是特殊行业时必填。每项行业资质信息中，industry_qualification_type和industry_qualification_image均必填
	 */
	@ApiListField("qualifications")
	@ApiField("industry_qualification_info")
	private List<IndustryQualificationInfo> qualifications;

	/**
	 * 商户使用服务，可选值有：当面付、app支付、wap支付、电脑支付、线上资金预授权、新当面资金授权、商户代扣、小程序支付。其值会影响其他字段必填性，详见其他字段描述
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
	 * 商户站点信息，包括网站、app、小程序。商户使用服务包含电脑支付或wap支付时，必须填充一个类型为01(网站)的SiteInfo对象，site_type/site_url/site_name必填；当包含app支付时，必须至少填充类型为02(APP)或06(支付宝小程序)中一种类型的SiteInfo对象，site_type/site_name必填
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

	public List<String> getInDoorImages() {
		return this.inDoorImages;
	}
	public void setInDoorImages(List<String> inDoorImages) {
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

	public List<SiteInfo> getSites() {
		return this.sites;
	}
	public void setSites(List<SiteInfo> sites) {
		this.sites = sites;
	}

}
