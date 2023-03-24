package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.openbizmock.openid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 21:56:47
 */
public class AlipayOpenOpenbizmockOpenidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5476721871763393511L;

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
