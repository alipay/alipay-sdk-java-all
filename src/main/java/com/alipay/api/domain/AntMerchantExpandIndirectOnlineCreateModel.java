package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 线上间连商户入驻
 *
 * @author auto create
 * @since 1.0, 2021-06-17 10:42:32
 */
public class AntMerchantExpandIndirectOnlineCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4325747585322959453L;

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
	 * 签约受理机构pid
	 */
	@ApiField("bank_pid")
	private String bankPid;

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
	 * 商户联系人信息
	 */
	@ApiListField("contact_info")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfo;

	/**
	 * 支付机构pid/source id；服务商PID；
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 商户的支付宝账号
	 */
	@ApiListField("logon_id")
	@ApiField("string")
	private List<String> logonId;

	/**
	 * mcc编码
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商户特殊资质等
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户的支付二维码中信息，用于营销活动
	 */
	@ApiListField("pay_code_info")
	@ApiField("string")
	private List<String> payCodeInfo;

	/**
	 * 商户客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 商户在银行端的签约时间
	 */
	@ApiField("sign_bank_time")
	private Date signBankTime;

	/**
	 * 站点信息
	 */
	@ApiListField("site_info")
	@ApiField("site_info")
	private List<SiteInfo> siteInfo;

	/**
	 * 商户在受理机构的唯一代码，该代号在该机构下保持唯一；extenalID；
	 */
	@ApiField("unique_id_by_bank")
	private String uniqueIdByBank;

	/**
	 * 商户在支付机构的的唯一代码；服务商对该商户分配的ID；
	 */
	@ApiField("unique_id_by_isv")
	private String uniqueIdByIsv;

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

	public String getBankPid() {
		return this.bankPid;
	}
	public void setBankPid(String bankPid) {
		this.bankPid = bankPid;
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

	public List<ContactInfo> getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(List<ContactInfo> contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
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

	public List<String> getPayCodeInfo() {
		return this.payCodeInfo;
	}
	public void setPayCodeInfo(List<String> payCodeInfo) {
		this.payCodeInfo = payCodeInfo;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public Date getSignBankTime() {
		return this.signBankTime;
	}
	public void setSignBankTime(Date signBankTime) {
		this.signBankTime = signBankTime;
	}

	public List<SiteInfo> getSiteInfo() {
		return this.siteInfo;
	}
	public void setSiteInfo(List<SiteInfo> siteInfo) {
		this.siteInfo = siteInfo;
	}

	public String getUniqueIdByBank() {
		return this.uniqueIdByBank;
	}
	public void setUniqueIdByBank(String uniqueIdByBank) {
		this.uniqueIdByBank = uniqueIdByBank;
	}

	public String getUniqueIdByIsv() {
		return this.uniqueIdByIsv;
	}
	public void setUniqueIdByIsv(String uniqueIdByIsv) {
		this.uniqueIdByIsv = uniqueIdByIsv;
	}

}
