package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票销方信息，包含销方购方税号、名称、地址、开户行、电话和银行账号等信息
 *
 * @author auto create
 * @since 1.0, 2026-08-14 19:59:20
 */
public class InvoiceSellerInfo extends AlipayObject {

	private static final long serialVersionUID = 1817337923858858626L;

	/**
	 * 销方地址
	 */
	@ApiField("seller_address")
	private String sellerAddress;

	/**
	 * 销方开户行
	 */
	@ApiField("seller_bank")
	private String sellerBank;

	/**
	 * 销方银行账号
	 */
	@ApiField("seller_bank_account")
	private String sellerBankAccount;

	/**
	 * 销方名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * 销方电话
	 */
	@ApiField("seller_phone")
	private String sellerPhone;

	/**
	 * 销方税号
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	public String getSellerAddress() {
		return this.sellerAddress;
	}
	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	public String getSellerBank() {
		return this.sellerBank;
	}
	public void setSellerBank(String sellerBank) {
		this.sellerBank = sellerBank;
	}

	public String getSellerBankAccount() {
		return this.sellerBankAccount;
	}
	public void setSellerBankAccount(String sellerBankAccount) {
		this.sellerBankAccount = sellerBankAccount;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerPhone() {
		return this.sellerPhone;
	}
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	public String getSellerTaxNo() {
		return this.sellerTaxNo;
	}
	public void setSellerTaxNo(String sellerTaxNo) {
		this.sellerTaxNo = sellerTaxNo;
	}

}
