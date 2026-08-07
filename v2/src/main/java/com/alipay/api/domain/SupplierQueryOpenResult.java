package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于查询供应商信息
 *
 * @author auto create
 * @since 1.0, 2026-07-31 15:27:17
 */
public class SupplierQueryOpenResult extends AlipayObject {

	private static final long serialVersionUID = 5562291177449181169L;

	/**
	 * 支付宝账号类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 收款银行卡号（已脱敏）
	 */
	@ApiField("bank_card_no_masked")
	private String bankCardNoMasked;

	/**
	 * 供应商收款银行编码
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 供应商收款银行
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 是否维护供应商收款银行卡
	 */
	@ApiField("has_bank_card")
	private String hasBankCard;

	/**
	 * 供应商支付宝账号
	 */
	@ApiField("supplier_account_no")
	private String supplierAccountNo;

	/**
	 * 供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

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
	 * 供应商状态
	 */
	@ApiField("supplier_status")
	private String supplierStatus;

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBankCardNoMasked() {
		return this.bankCardNoMasked;
	}
	public void setBankCardNoMasked(String bankCardNoMasked) {
		this.bankCardNoMasked = bankCardNoMasked;
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

	public String getHasBankCard() {
		return this.hasBankCard;
	}
	public void setHasBankCard(String hasBankCard) {
		this.hasBankCard = hasBankCard;
	}

	public String getSupplierAccountNo() {
		return this.supplierAccountNo;
	}
	public void setSupplierAccountNo(String supplierAccountNo) {
		this.supplierAccountNo = supplierAccountNo;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
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

	public String getSupplierStatus() {
		return this.supplierStatus;
	}
	public void setSupplierStatus(String supplierStatus) {
		this.supplierStatus = supplierStatus;
	}

}
