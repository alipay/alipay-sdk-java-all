package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testdc.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-29 14:12:01
 */
public class AlipayOpenOperationOpenbizmockTestdcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2854294621868122631L;

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
