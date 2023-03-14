package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.expenserule.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 19:01:45
 */
public class AlipayEbppInvoiceInstitutionExpenseruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4422412355563355916L;

	/** 
	 * 使用规则id
	 */
	@ApiField("standard_id")
	private String standardId;

	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}
	public String getStandardId( ) {
		return this.standardId;
	}

}
