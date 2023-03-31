package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.openbizmock.openid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-28 18:56:43
 */
public class AlipayOpenOpenbizmockOpenidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3479311292923718193L;

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
