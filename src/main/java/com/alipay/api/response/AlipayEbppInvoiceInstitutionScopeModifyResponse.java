package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.scope.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-18 15:34:29
 */
public class AlipayEbppInvoiceInstitutionScopeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1311993361888944511L;

	/** 
	 * 操作是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
