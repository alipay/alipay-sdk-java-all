package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-28 10:52:06
 */
public class AlipayEbppInvoiceInstitutionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6169292829672115388L;

	/** 
	 * 修改是否成功
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
