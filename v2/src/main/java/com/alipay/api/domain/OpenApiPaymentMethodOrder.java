package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款银行信息OpenApiOrder
 *
 * @author auto create
 * @since 1.0, 2025-11-12 16:35:55
 */
public class OpenApiPaymentMethodOrder extends AlipayObject {

	private static final long serialVersionUID = 8549237555552929618L;

	/**
	 * 银行账户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 银行账户号码
	 */
	@ApiField("account_number")
	private String accountNumber;

	/**
	 * 账户类型, 接口仅做记录, 并不清楚上游的type枚举有哪些, 无法列举
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 银行地址
	 */
	@ApiField("bank_address")
	private String bankAddress;

	/**
	 * 银行代码
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 开户行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 银行识别码
	 */
	@ApiField("bic")
	private String bic;

	/**
	 * 分行代码
	 */
	@ApiField("branch_code")
	private String branchCode;

	/**
	 * 支行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/**
	 * CNAPS code
	 */
	@ApiField("cnaps_code")
	private String cnapsCode;

	/**
	 * 账号对应的币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 国际银行帐号
	 */
	@ApiField("iban")
	private String iban;

	/**
	 * 银行名称
	 */
	@ApiField("main_bank_bame")
	private String mainBankBame;

	/**
	 * 分行名称
	 */
	@ApiField("sub_bank_name")
	private String subBankName;

	/**
	 * 银行国际代码
	 */
	@ApiField("swift_code")
	private String swiftCode;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBankAddress() {
		return this.bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
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

	public String getBic() {
		return this.bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getBranchCode() {
		return this.branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchName() {
		return this.branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCnapsCode() {
		return this.cnapsCode;
	}
	public void setCnapsCode(String cnapsCode) {
		this.cnapsCode = cnapsCode;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIban() {
		return this.iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getMainBankBame() {
		return this.mainBankBame;
	}
	public void setMainBankBame(String mainBankBame) {
		this.mainBankBame = mainBankBame;
	}

	public String getSubBankName() {
		return this.subBankName;
	}
	public void setSubBankName(String subBankName) {
		this.subBankName = subBankName;
	}

	public String getSwiftCode() {
		return this.swiftCode;
	}
	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

}
