package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.factoring.supplier.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 13:53:03
 */
public class MybankCreditSupplychainFactoringSupplierCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2725791672794792766L;

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
