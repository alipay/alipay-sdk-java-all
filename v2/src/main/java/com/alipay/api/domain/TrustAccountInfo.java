package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信价值中心账号信息
 *
 * @author auto create
 * @since 1.0, 2025-02-08 10:41:46
 */
public class TrustAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 2488424337813352464L;

	/**
	 * 账户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账号类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 联行号
	 */
	@ApiField("bank_branch_code")
	private String bankBranchCode;

	/**
	 * 开户支行
	 */
	@ApiField("bank_branch_name")
	private String bankBranchName;

	/**
	 * 开户银行
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 是否个人个人账号，不填默认对公账号
	 */
	@ApiField("personal_acc")
	private Boolean personalAcc;

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

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBankBranchCode() {
		return this.bankBranchCode;
	}
	public void setBankBranchCode(String bankBranchCode) {
		this.bankBranchCode = bankBranchCode;
	}

	public String getBankBranchName() {
		return this.bankBranchName;
	}
	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Boolean getPersonalAcc() {
		return this.personalAcc;
	}
	public void setPersonalAcc(Boolean personalAcc) {
		this.personalAcc = personalAcc;
	}

}
