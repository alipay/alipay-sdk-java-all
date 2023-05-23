package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.scope.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-19 15:36:57
 */
public class AlipayEbppInvoiceInstitutionScopeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5716518241676292335L;

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
