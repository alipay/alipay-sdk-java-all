package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.openbizmock.newinterface.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-13 18:57:04
 */
public class AlipayOpenOpenbizmockNewinterfaceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7156585554382434327L;

	/** 
	 * 2
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
