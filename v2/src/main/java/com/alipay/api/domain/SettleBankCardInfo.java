package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行卡信息采集
 *
 * @author auto create
 * @since 1.0, 2026-05-06 15:16:16
 */
public class SettleBankCardInfo extends AlipayObject {

	private static final long serialVersionUID = 3285626531664545511L;

	/**
	 * 银行支行名称
	 */
	@ApiField("account_branch_name")
	private String accountBranchName;

	/**
	 * 开户名称
	 */
	@ApiField("account_holder_name")
	private String accountHolderName;

	/**
	 * 开户行所在市
	 */
	@ApiField("account_inst_city")
	private String accountInstCity;

	/**
	 * 开户银行
	 */
	@ApiField("account_inst_name")
	private String accountInstName;

	/**
	 * 开户行所在省
	 */
	@ApiField("account_inst_province")
	private String accountInstProvince;

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

	public String getAccountInstCity() {
		return this.accountInstCity;
	}
	public void setAccountInstCity(String accountInstCity) {
		this.accountInstCity = accountInstCity;
	}

	public String getAccountInstName() {
		return this.accountInstName;
	}
	public void setAccountInstName(String accountInstName) {
		this.accountInstName = accountInstName;
	}

	public String getAccountInstProvince() {
		return this.accountInstProvince;
	}
	public void setAccountInstProvince(String accountInstProvince) {
		this.accountInstProvince = accountInstProvince;
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
