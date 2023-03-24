package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.scope.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 19:01:43
 */
public class AlipayEbppInvoiceInstitutionScopeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8542918795521497929L;

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
