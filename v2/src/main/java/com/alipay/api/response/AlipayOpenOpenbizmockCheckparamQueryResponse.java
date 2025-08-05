package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.openbizmock.checkparam.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-27 10:23:34
 */
public class AlipayOpenOpenbizmockCheckparamQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6763656858384554955L;

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
