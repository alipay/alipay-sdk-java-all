package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openbizmock.openidnonstand.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-03 20:34:11
 */
public class AlipayOpenAppOpenbizmockOpenidnonstandQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3522286428626418445L;

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
