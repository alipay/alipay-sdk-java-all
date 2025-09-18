package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商修改
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:38:15
 */
public class AlipayCommerceEcRecyclinginvoiceCompanysupplierModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7841858925554886731L;

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
