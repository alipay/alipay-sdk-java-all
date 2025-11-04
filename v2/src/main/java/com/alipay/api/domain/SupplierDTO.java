package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商
 *
 * @author auto create
 * @since 1.0, 2023-08-18 10:17:23
 */
public class SupplierDTO extends AlipayObject {

	private static final long serialVersionUID = 4825199135235441387L;

	/**
	 * 供应商code
	 */
	@ApiField("supplier_code")
	private String supplierCode;

	/**
	 * 供应商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 供应商名称
	 */
	@ApiField("supplier_name")
	private String supplierName;

	public String getSupplierCode() {
		return this.supplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
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

}
