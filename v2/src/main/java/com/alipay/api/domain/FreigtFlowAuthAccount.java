package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权主体账户信息（包含授权方 和 被授权方）
 *
 * @author auto create
 * @since 1.0, 2025-05-28 16:56:27
 */
public class FreigtFlowAuthAccount extends AlipayObject {

	private static final long serialVersionUID = 5244286286369453924L;

	/**
	 * 授权方账户名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 网商账户：666/888的卡号.为授权方时必填
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 证件号+证件类型 -> CERT
证件号+证件类型+卡号 -> CERT_AND_CARD_NO
	 */
	@ApiField("account_pattern")
	private String accountPattern;

	/**
	 * 网商参与者：MYBANK
ISV参与者：ISV
自然人: INDIVIDUAL
企业: CORPORATION
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 本期：
ANT_MYBANK
	 */
	@ApiField("bank_id")
	private String bankId;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
个人身份证: 100
企业统一信用编码: 2011
	 */
	@ApiField("cert_type")
	private String certType;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountPattern() {
		return this.accountPattern;
	}
	public void setAccountPattern(String accountPattern) {
		this.accountPattern = accountPattern;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBankId() {
		return this.bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
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

}
