package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.openbizmock.checkparam.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 11:07:41
 */
public class AlipayOpenOpenbizmockCheckparamQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4577291372638491171L;

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
