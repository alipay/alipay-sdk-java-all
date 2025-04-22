package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 无限付的虚拟卡信息
 *
 * @author auto create
 * @since 1.0, 2022-12-29 15:28:32
 */
public class LargeInfiniteCardInfo extends AlipayObject {

	private static final long serialVersionUID = 8398785577268188584L;

	/**
	 * 账户余额,单位:元,精确到小数点后两位
	 */
	@ApiField("account_balance")
	private String accountBalance;

	/**
	 * 无限付产品转账的转入卡账户名称，支付宝分配。
	 */
	@ApiField("bank_account_name")
	private String bankAccountName;

	/**
	 * 无限付产品转账的转入卡账号，支付宝分配。
	 */
	@ApiField("bank_account_no")
	private String bankAccountNo;

	/**
	 * 无限付产品转账的转入行银行支行名称
	 */
	@ApiField("bank_branch")
	private String bankBranch;

	/**
	 * 无限付产品转账的转入行银行联行号
	 */
	@ApiField("bank_branch_code")
	private String bankBranchCode;

	/**
	 * 无限付产品转账的转入行银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 无限付产品转账的转入行银行开户地
	 */
	@ApiField("open_place")
	private String openPlace;

	public String getAccountBalance() {
		return this.accountBalance;
	}
	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
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

	public String getBankBranch() {
		return this.bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getBankBranchCode() {
		return this.bankBranchCode;
	}
	public void setBankBranchCode(String bankBranchCode) {
		this.bankBranchCode = bankBranchCode;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getOpenPlace() {
		return this.openPlace;
	}
	public void setOpenPlace(String openPlace) {
		this.openPlace = openPlace;
	}

}
