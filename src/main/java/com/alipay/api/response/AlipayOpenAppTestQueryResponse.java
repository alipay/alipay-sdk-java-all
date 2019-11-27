package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-17 13:07:21
 */
public class AlipayOpenAppTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2778436356872647667L;

	/** 
	 * 11
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
