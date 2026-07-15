package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商新增
 *
 * @author auto create
 * @since 1.0, 2026-04-29 15:39:48
 */
public class AlipayCommerceEcRecyclinginvoiceCompanysupplierCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1397235556218389192L;

	/**
	 * 手机
	 */
	@ApiField("account_type")
	private String accountType;

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
