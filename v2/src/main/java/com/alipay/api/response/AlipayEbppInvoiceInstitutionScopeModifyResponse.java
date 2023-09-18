package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.scope.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:16:44
 */
public class AlipayEbppInvoiceInstitutionScopeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7786925787981791475L;

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
