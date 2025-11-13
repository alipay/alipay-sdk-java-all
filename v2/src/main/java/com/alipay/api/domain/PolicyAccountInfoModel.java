package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单账号信息
 *
 * @author auto create
 * @since 1.0, 2025-10-28 14:27:28
 */
public class PolicyAccountInfoModel extends AlipayObject {

	private static final long serialVersionUID = 8336419711814168536L;

	/**
	 * 账户类型（alipay/bankcard）
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 账户类型是alipay时，取此字段。支付宝用户名（邮箱、手机号）
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 银行卡账户名
	 */
	@ApiField("bank_account_name")
	private String bankAccountName;

	/**
	 * 账户类型是bankcard时，取此字段。所属银行
	 */
	@ApiField("bank_branch_name")
	private String bankBranchName;

	/**
	 * 收款银行卡号
	 */
	@ApiField("bank_card_account")
	private String bankCardAccount;

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getBankAccountName() {
		return this.bankAccountName;
	}
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getBankBranchName() {
		return this.bankBranchName;
	}
	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getBankCardAccount() {
		return this.bankCardAccount;
	}
	public void setBankCardAccount(String bankCardAccount) {
		this.bankCardAccount = bankCardAccount;
	}

}
