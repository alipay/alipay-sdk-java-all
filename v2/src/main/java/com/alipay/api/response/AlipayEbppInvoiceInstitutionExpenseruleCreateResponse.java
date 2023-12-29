package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.expenserule.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-22 15:31:31
 */
public class AlipayEbppInvoiceInstitutionExpenseruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5733971516852313272L;

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
