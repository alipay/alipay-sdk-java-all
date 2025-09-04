package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openbizmock.openidnonstand.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 15:22:34
 */
public class AlipayOpenAppOpenbizmockOpenidnonstandQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7166329937232831196L;

	/** 
	 * 模拟结果
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
