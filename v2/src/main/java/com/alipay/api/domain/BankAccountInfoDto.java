package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行账户信息
 *
 * @author auto create
 * @since 1.0, 2024-02-26 14:15:06
 */
public class BankAccountInfoDto extends AlipayObject {

	private static final long serialVersionUID = 4297461236156127836L;

	/**
	 * 账户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 银行账户
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 银行支行名称
	 */
	@ApiField("bank_branch_name")
	private String bankBranchName;

	/**
	 * 银行编码
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 币种编码
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * ou编码
	 */
	@ApiField("ou_code")
	private String ouCode;

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

	public String getBankBranchName() {
		return this.bankBranchName;
	}
	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

}
