package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商修改
 *
 * @author auto create
 * @since 1.0, 2026-07-31 15:27:14
 */
public class AlipayCommerceEcRecyclinginvoiceCompanysupplierModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1777794818815289667L;

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
	 * 供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

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

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
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
