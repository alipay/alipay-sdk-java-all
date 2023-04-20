package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链金融业务的标准银行账户信息
 *
 * @author auto create
 * @since 1.0, 2019-12-25 14:15:06
 */
public class FinanceBankAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 2472419538714375297L;

	/**
	 * 银行账户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 银行账户号码
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 开户银行地址
	 */
	@ApiField("bank_address")
	private String bankAddress;

	/**
	 * 开户市
	 */
	@ApiField("bank_city")
	private String bankCity;

	/**
	 * 开户银行编码
	 */
	@ApiField("bank_id")
	private String bankId;

	/**
	 * 开户省
	 */
	@ApiField("bank_province")
	private String bankProvince;

	/**
	 * 联行号
	 */
	@ApiField("branch_id")
	private String branchId;

	/**
	 * 开户支行
	 */
	@ApiField("branch_name")
	private String branchName;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * swift code
	 */
	@ApiField("swift_code")
	private String swiftCode;

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

	public String getBankAddress() {
		return this.bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getBankCity() {
		return this.bankCity;
	}
	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	public String getBankId() {
		return this.bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankProvince() {
		return this.bankProvince;
	}
	public void setBankProvince(String bankProvince) {
		this.bankProvince = bankProvince;
	}

	public String getBranchId() {
		return this.branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return this.branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getSwiftCode() {
		return this.swiftCode;
	}
	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

}
