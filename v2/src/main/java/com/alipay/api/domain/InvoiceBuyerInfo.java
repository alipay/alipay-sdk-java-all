package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票购方信息，包含购方税号、名称、地址、开户行、电话和银行账号，和补充的个人购方信息
 *
 * @author auto create
 * @since 1.0, 2026-08-14 19:59:20
 */
public class InvoiceBuyerInfo extends AlipayObject {

	private static final long serialVersionUID = 3867183578875939262L;

	/**
	 * 购方地址
	 */
	@ApiField("buyer_address")
	private String buyerAddress;

	/**
	 * 购方开户行
	 */
	@ApiField("buyer_bank")
	private String buyerBank;

	/**
	 * 购方银行账号
	 */
	@ApiField("buyer_bank_account")
	private String buyerBankAccount;

	/**
	 * 购方名称或发票抬头
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 购方自然人证件号码
	 */
	@ApiField("buyer_personal_id_number")
	private String buyerPersonalIdNumber;

	/**
	 * 购方自然人证件类型
	 */
	@ApiField("buyer_personal_id_type")
	private String buyerPersonalIdType;

	/**
	 * 购方名称是否带个人,传 Y 或者 N，默认为 Y
	 */
	@ApiField("buyer_personal_name_flag")
	private String buyerPersonalNameFlag;

	/**
	 * 购方自然人国籍代码,中国156
	 */
	@ApiField("buyer_personal_nationality_code")
	private String buyerPersonalNationalityCode;

	/**
	 * 购方联系电话
	 */
	@ApiField("buyer_phone")
	private String buyerPhone;

	/**
	 * 购方税号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	public String getBuyerAddress() {
		return this.buyerAddress;
	}
	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}

	public String getBuyerBank() {
		return this.buyerBank;
	}
	public void setBuyerBank(String buyerBank) {
		this.buyerBank = buyerBank;
	}

	public String getBuyerBankAccount() {
		return this.buyerBankAccount;
	}
	public void setBuyerBankAccount(String buyerBankAccount) {
		this.buyerBankAccount = buyerBankAccount;
	}

	public String getBuyerName() {
		return this.buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerPersonalIdNumber() {
		return this.buyerPersonalIdNumber;
	}
	public void setBuyerPersonalIdNumber(String buyerPersonalIdNumber) {
		this.buyerPersonalIdNumber = buyerPersonalIdNumber;
	}

	public String getBuyerPersonalIdType() {
		return this.buyerPersonalIdType;
	}
	public void setBuyerPersonalIdType(String buyerPersonalIdType) {
		this.buyerPersonalIdType = buyerPersonalIdType;
	}

	public String getBuyerPersonalNameFlag() {
		return this.buyerPersonalNameFlag;
	}
	public void setBuyerPersonalNameFlag(String buyerPersonalNameFlag) {
		this.buyerPersonalNameFlag = buyerPersonalNameFlag;
	}

	public String getBuyerPersonalNationalityCode() {
		return this.buyerPersonalNationalityCode;
	}
	public void setBuyerPersonalNationalityCode(String buyerPersonalNationalityCode) {
		this.buyerPersonalNationalityCode = buyerPersonalNationalityCode;
	}

	public String getBuyerPhone() {
		return this.buyerPhone;
	}
	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}

	public String getBuyerTaxNo() {
		return this.buyerTaxNo;
	}
	public void setBuyerTaxNo(String buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}

}
