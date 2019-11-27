package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.remit.fxtradeorder.submit response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-26 20:50:05
 */
public class AlipayOverseasRemitFxtradeorderSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3358178212824996693L;

	/** 
	 * {}
	 */
	@ApiField("response")
	private String response;

	public void setResponse(String response) {
		this.response = response;
	}
	public String getResponse( ) {
		return this.response;
	}

}
