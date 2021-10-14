package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 银行间连商户入驻
 *
 * @author auto create
 * @since 1.0, 2021-09-10 16:52:13
 */
public class AntMerchantExpandIndirectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2676534554732593717L;

	/**
	 * 商户地址信息
	 */
	@ApiListField("address_info")
	@ApiField("address_info")
	private List<AddressInfo> addressInfo;

	/**
	 * 商户简称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 商户对应银行所开立的结算卡信息
	 */
	@ApiListField("bankcard_info")
	@ApiField("bank_card_info")
	private List<BankCardInfo> bankcardInfo;

	/**
	 * 商户证件编号（企业或者个体工商户提供营业执照，事业单位提供事证号）
	 */
	@ApiField("business_license")
	private String businessLicense;

	/**
	 * 商户证件类型，取值范围：NATIONAL_LEGAL：营业执照；NATIONAL_LEGAL_MERGE:营业执照(多证合一)；INST_RGST_CTF：事业单位法人证书
	 */
	@ApiField("business_license_type")
	private String businessLicenseType;

	/**
	 * 商户经营类目，参考文档：https://doc.open.alipay.com/doc2/detail?&docType=1&articleId=105444，非银联/网联进件时必传
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商户联系人信息
	 */
	@ApiListField("contact_info")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfo;

	/**
	 * 商户编号，由机构定义，需要保证在机构下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户的支付宝账号
	 */
	@ApiListField("logon_id")
	@ApiField("string")
	private List<String> logonId;

	/**
	 * 标准商户类别码，例如5976表示“专业销售-药品医疗-康复和身体辅助用品”，银联/网联进件时必传
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商户备注，可填写额外信息。分支机构进件，需要按照要求填写“分支机构码”，方便进行入驻管控，分支机构码由支付宝指定编码值，具体编码值可联系对口BD获取。填写分支机构码的时候用“##”标识符括起来，放在整条备注信息的开头处。示例：若进件分支机构为吉林省，由于对应分支机构编码值为220000，那么进件的时候应填写备注信息为：##220000##其他备注信息。
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 收单机构(例如银行）的标识，填写该机构在支付宝的pid。银联/网联进件时必传。
	 */
	@ApiField("org_pid")
	private String orgPid;

	/**
	 * 商户的支付二维码中信息，用于营销活动
	 */
	@ApiListField("pay_code_info")
	@ApiField("string")
	private List<String> payCodeInfo;

	/**
	 * 申请服务，不传默认申请当面付服务。
允许同时申请多个服务，各服务的准入验证相互独立，服务申请实时生效；当前可用服务请关注出参service_codes字段。</br>
目前支持三种类型</br>
PC：网站支付</br>
APP：无线支付</br>
F2F：当面付</br>
PRE_F2F：线下预授权</br>
PRE_APP：线上预授权</br>
</br>
PC和APP对应线上，F2F对应线下。
	 */
	@ApiListField("service_codes")
	@ApiField("string")
	private List<String> serviceCodes;

	/**
	 * 商户客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 仅支持网站、APP信息</br>
网站必传site_url,APP必传site_name。
	 */
	@ApiListField("site_info")
	@ApiField("site_info")
	private List<SiteInfo> siteInfo;

	/**
	 * 间连受理商户的推荐组织。如果是银行自有商户入驻，则推荐组织为银行，如果是ISV推广的商户，那么商户推荐组织为ISV，如果是第三方支付机构的自有商户，则推荐组织为第三方支付机构。
	 */
	@ApiField("source")
	private String source;

	public List<AddressInfo> getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(List<AddressInfo> addressInfo) {
		this.addressInfo = addressInfo;
	}

	public String getAliasName() {
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public List<BankCardInfo> getBankcardInfo() {
		return this.bankcardInfo;
	}
	public void setBankcardInfo(List<BankCardInfo> bankcardInfo) {
		this.bankcardInfo = bankcardInfo;
	}

	public String getBusinessLicense() {
		return this.businessLicense;
	}
	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public String getBusinessLicenseType() {
		return this.businessLicenseType;
	}
	public void setBusinessLicenseType(String businessLicenseType) {
		this.businessLicenseType = businessLicenseType;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<ContactInfo> getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(List<ContactInfo> contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public List<String> getLogonId() {
		return this.logonId;
	}
	public void setLogonId(List<String> logonId) {
		this.logonId = logonId;
	}

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrgPid() {
		return this.orgPid;
	}
	public void setOrgPid(String orgPid) {
		this.orgPid = orgPid;
	}

	public List<String> getPayCodeInfo() {
		return this.payCodeInfo;
	}
	public void setPayCodeInfo(List<String> payCodeInfo) {
		this.payCodeInfo = payCodeInfo;
	}

	public List<String> getServiceCodes() {
		return this.serviceCodes;
	}
	public void setServiceCodes(List<String> serviceCodes) {
		this.serviceCodes = serviceCodes;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public List<SiteInfo> getSiteInfo() {
		return this.siteInfo;
	}
	public void setSiteInfo(List<SiteInfo> siteInfo) {
		this.siteInfo = siteInfo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
