package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商新增
 *
 * @author auto create
 * @since 1.0, 2026-07-31 15:27:22
 */
public class AlipayCommerceEcRecyclinginvoiceCompanysupplierCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4544744247363182543L;

	/**
	 * 手机
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 供应商收款银行卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 供应商收款银行编码
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 是否维护供应商收款银行卡：YES/NO。缺省按 NO 处理。
	 */
	@ApiField("has_bank_card")
	private String hasBankCard;

	/**
	 * 请求方传入的外部供应商ID
	 */
	@ApiField("outer_supplier_id")
	private String outerSupplierId;

	/**
	 * 支付宝账号
	 */
	@ApiField("supplier_account_no")
	private String supplierAccountNo;

	/**
	 * 供应商姓名
	 */
	@ApiField("supplier_name")
	private String supplierName;

	/**
	 * 供应商联系电话
	 */
	@ApiField("supplier_phone")
	private String supplierPhone;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getHasBankCard() {
		return this.hasBankCard;
	}
	public void setHasBankCard(String hasBankCard) {
		this.hasBankCard = hasBankCard;
	}

	public String getOuterSupplierId() {
		return this.outerSupplierId;
	}
	public void setOuterSupplierId(String outerSupplierId) {
		this.outerSupplierId = outerSupplierId;
	}

	public String getSupplierAccountNo() {
		return this.supplierAccountNo;
	}
	public void setSupplierAccountNo(String supplierAccountNo) {
		this.supplierAccountNo = supplierAccountNo;
	}

	public String getSupplierName() {
		return this.supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierPhone() {
		return this.supplierPhone;
	}
	public void setSupplierPhone(String supplierPhone) {
		this.supplierPhone = supplierPhone;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
