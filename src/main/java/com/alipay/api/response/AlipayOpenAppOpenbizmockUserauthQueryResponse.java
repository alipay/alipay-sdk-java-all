package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openbizmock.userauth.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-05 12:04:43
 */
public class AlipayOpenAppOpenbizmockUserauthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5771115327951647667L;

	/** 
	 * 结果
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
