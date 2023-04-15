package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行账号
 *
 * @author auto create
 * @since 1.0, 2021-04-13 11:06:19
 */
public class BankAccount extends AlipayObject {

	private static final long serialVersionUID = 7545186751122771338L;

	/**
	 * 收款账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账户类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 银行支行联行号
	 */
	@ApiField("bank_branch_code")
	private String bankBranchCode;

	/**
	 * 银行支行
	 */
	@ApiField("bank_branch_name")
	private String bankBranchName;

	/**
	 * 开户行银行所在市
	 */
	@ApiField("bank_city_name")
	private String bankCityName;

	/**
	 * 开户行银行编码缩写
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 开户行银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 开户行银行所在省
	 */
	@ApiField("bank_prov_name")
	private String bankProvName;

	/**
	 * 开户人证件号码
	 */
	@ApiField("holder_cert_no")
	private String holderCertNo;

	/**
	 * 开户人名称
	 */
	@ApiField("holder_name")
	private String holderName;

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

	public String getBankCityName() {
		return this.bankCityName;
	}
	public void setBankCityName(String bankCityName) {
		this.bankCityName = bankCityName;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankProvName() {
		return this.bankProvName;
	}
	public void setBankProvName(String bankProvName) {
		this.bankProvName = bankProvName;
	}

	public String getHolderCertNo() {
		return this.holderCertNo;
	}
	public void setHolderCertNo(String holderCertNo) {
		this.holderCertNo = holderCertNo;
	}

	public String getHolderName() {
		return this.holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

}
