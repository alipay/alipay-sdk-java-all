package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业用户详情
 *
 * @author auto create
 * @since 1.0, 2022-09-08 11:48:37
 */
public class EnterpriseCustomerInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2563353432265547523L;

	/**
	 * 企业名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 企业地址（开票用）
	 */
	@ApiField("enterprise_addr")
	private String enterpriseAddr;

	/**
	 * 企业银行卡卡名
	 */
	@ApiField("enterprise_bank_card_name")
	private String enterpriseBankCardName;

	/**
	 * 开户行名称（开票用）
	 */
	@ApiField("enterprise_bank_name")
	private String enterpriseBankName;

	/**
	 * 银行企业账号（开票用）
	 */
	@ApiField("enterprise_bank_no")
	private String enterpriseBankNo;

	/**
	 * 企业电话号码
	 */
	@ApiField("enterprise_phone")
	private String enterprisePhone;

	/**
	 * 法人证件号码（身份证）
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法人手机号
	 */
	@ApiField("legal_mobile_phone")
	private String legalMobilePhone;

	/**
	 * 法人名称
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("unified_social_cert_code")
	private String unifiedSocialCertCode;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getEnterpriseAddr() {
		return this.enterpriseAddr;
	}
	public void setEnterpriseAddr(String enterpriseAddr) {
		this.enterpriseAddr = enterpriseAddr;
	}

	public String getEnterpriseBankCardName() {
		return this.enterpriseBankCardName;
	}
	public void setEnterpriseBankCardName(String enterpriseBankCardName) {
		this.enterpriseBankCardName = enterpriseBankCardName;
	}

	public String getEnterpriseBankName() {
		return this.enterpriseBankName;
	}
	public void setEnterpriseBankName(String enterpriseBankName) {
		this.enterpriseBankName = enterpriseBankName;
	}

	public String getEnterpriseBankNo() {
		return this.enterpriseBankNo;
	}
	public void setEnterpriseBankNo(String enterpriseBankNo) {
		this.enterpriseBankNo = enterpriseBankNo;
	}

	public String getEnterprisePhone() {
		return this.enterprisePhone;
	}
	public void setEnterprisePhone(String enterprisePhone) {
		this.enterprisePhone = enterprisePhone;
	}

	public String getLegalCertNo() {
		return this.legalCertNo;
	}
	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

	public String getLegalMobilePhone() {
		return this.legalMobilePhone;
	}
	public void setLegalMobilePhone(String legalMobilePhone) {
		this.legalMobilePhone = legalMobilePhone;
	}

	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getUnifiedSocialCertCode() {
		return this.unifiedSocialCertCode;
	}
	public void setUnifiedSocialCertCode(String unifiedSocialCertCode) {
		this.unifiedSocialCertCode = unifiedSocialCertCode;
	}

}
