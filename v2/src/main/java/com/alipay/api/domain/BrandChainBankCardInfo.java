package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行卡信息
 *
 * @author auto create
 * @since 1.0, 2026-01-06 09:42:42
 */
public class BrandChainBankCardInfo extends AlipayObject {

	private static final long serialVersionUID = 1756366598826386419L;

	/**
	 * 开户支行
	 */
	@ApiField("account_branch_name")
	private String accountBranchName;

	/**
	 * 开户名
	 */
	@ApiField("account_holder_name")
	private String accountHolderName;

	/**
	 * 开户行所在省市
	 */
	@ApiField("account_inst_address")
	private String accountInstAddress;

	/**
	 * 开户银行
	 */
	@ApiField("account_inst_name")
	private String accountInstName;

	/**
	 * 银行账号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 联行号
	 */
	@ApiField("pbc_bank_code")
	private String pbcBankCode;

	/**
	 * 01：对公，02：对私
	 */
	@ApiField("usage_type")
	private String usageType;

	public String getAccountBranchName() {
		return this.accountBranchName;
	}
	public void setAccountBranchName(String accountBranchName) {
		this.accountBranchName = accountBranchName;
	}

	public String getAccountHolderName() {
		return this.accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountInstAddress() {
		return this.accountInstAddress;
	}
	public void setAccountInstAddress(String accountInstAddress) {
		this.accountInstAddress = accountInstAddress;
	}

	public String getAccountInstName() {
		return this.accountInstName;
	}
	public void setAccountInstName(String accountInstName) {
		this.accountInstName = accountInstName;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getPbcBankCode() {
		return this.pbcBankCode;
	}
	public void setPbcBankCode(String pbcBankCode) {
		this.pbcBankCode = pbcBankCode;
	}

	public String getUsageType() {
		return this.usageType;
	}
	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

}
