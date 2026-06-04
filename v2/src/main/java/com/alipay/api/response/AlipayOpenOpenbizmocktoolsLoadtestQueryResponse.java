package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.openbizmocktools.loadtest.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-04 10:12:13
 */
public class AlipayOpenOpenbizmocktoolsLoadtestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6823546817896878279L;

	/** 
	 * hello
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
