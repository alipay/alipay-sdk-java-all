package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.factoring.supplier.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:07
 */
public class MybankCreditSupplychainFactoringSupplierCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3588144558455743411L;

	/** 
	 * supplierNo : 供应商编号
	 */
	@ApiField("supplier_no")
	private String supplierNo;

	public void setSupplierNo(String supplierNo) {
		this.supplierNo = supplierNo;
	}
	public String getSupplierNo( ) {
		return this.supplierNo;
	}

}
