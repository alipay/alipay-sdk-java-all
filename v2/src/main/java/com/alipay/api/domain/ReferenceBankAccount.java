package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联银行账号
 *
 * @author auto create
 * @since 1.0, 2024-10-23 17:06:51
 */
public class ReferenceBankAccount extends AlipayObject {

	private static final long serialVersionUID = 4673851878587781244L;

	/**
	 * 开户行
	 */
	@ApiField("bank")
	private String bank;

	/**
	 * 账号名称
	 */
	@ApiField("bank_account_name")
	private String bankAccountName;

	/**
	 * 银行卡号
	 */
	@ApiField("bank_account_no")
	private String bankAccountNo;

	/**
	 * 联行号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 支行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	public String getBank() {
		return this.bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankAccountName() {
		return this.bankAccountName;
	}
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getBankAccountNo() {
		return this.bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBranchName() {
		return this.branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
