package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.dfsfas.de.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-11 19:20:55
 */
public class AlipayOpenAppDfsfasDeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2881387958588733631L;

	/** 
	 * 1
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
