package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.issuerule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-30 21:02:23
 */
public class AlipayEbppInvoiceIssueruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8162956355549413697L;

	/** 
	 * 修改结果
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
