package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.token.exchange response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-29 10:57:51
 */
public class AlipayEbppInvoiceTokenExchangeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7236475189979578494L;

	/** 
	 * token
	 */
	@ApiField("apply_token")
	private String applyToken;

	public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}
	public String getApplyToken( ) {
		return this.applyToken;
	}

}
