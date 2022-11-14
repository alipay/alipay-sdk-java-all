package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.issuerule.delete response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-18 15:41:51
 */
public class AlipayEbppInvoiceIssueruleDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8658994681199637791L;

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
