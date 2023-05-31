package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.factoring.supplier.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 10:25:20
 */
public class MybankCreditSupplychainFactoringSupplierCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2173353561276491981L;

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
