package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单账号信息
 *
 * @author auto create
 * @since 1.0, 2025-12-18 19:39:46
 */
public class PolicyAccountInfoModel extends AlipayObject {

	private static final long serialVersionUID = 5374916144729855129L;

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
	 * 开户行所在市
	 */
	@ApiField("bank_account_city")
	private String bankAccountCity;

	/**
	 * 开户行所在市编码
	 */
	@ApiField("bank_account_city_id")
	private String bankAccountCityId;

	/**
	 * 银行卡账户名
	 */
	@ApiField("bank_account_name")
	private String bankAccountName;

	/**
	 * 开户行所在省
	 */
	@ApiField("bank_account_province")
	private String bankAccountProvince;

	/**
	 * 开户行所在省编码
	 */
	@ApiField("bank_account_province_id")
	private String bankAccountProvinceId;

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

	/**
	 * 开户银行对应机构编码
	 */
	@ApiField("bank_inst_code")
	private String bankInstCode;

	/**
	 * 开户银行
	 */
	@ApiField("bank_name")
	private String bankName;

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

	public String getBankAccountCity() {
		return this.bankAccountCity;
	}
	public void setBankAccountCity(String bankAccountCity) {
		this.bankAccountCity = bankAccountCity;
	}

	public String getBankAccountCityId() {
		return this.bankAccountCityId;
	}
	public void setBankAccountCityId(String bankAccountCityId) {
		this.bankAccountCityId = bankAccountCityId;
	}

	public String getBankAccountName() {
		return this.bankAccountName;
	}
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getBankAccountProvince() {
		return this.bankAccountProvince;
	}
	public void setBankAccountProvince(String bankAccountProvince) {
		this.bankAccountProvince = bankAccountProvince;
	}

	public String getBankAccountProvinceId() {
		return this.bankAccountProvinceId;
	}
	public void setBankAccountProvinceId(String bankAccountProvinceId) {
		this.bankAccountProvinceId = bankAccountProvinceId;
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

	public String getBankInstCode() {
		return this.bankInstCode;
	}
	public void setBankInstCode(String bankInstCode) {
		this.bankInstCode = bankInstCode;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
