package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.issuerule.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-30 21:07:36
 */
public class AlipayEbppInvoiceIssueruleDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3394958527759695511L;

	/** 
	 * 删除结果
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
