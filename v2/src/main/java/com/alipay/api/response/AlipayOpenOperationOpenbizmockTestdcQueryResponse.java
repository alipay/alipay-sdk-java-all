package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testdc.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-17 10:53:05
 */
public class AlipayOpenOperationOpenbizmockTestdcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3814296961586647889L;

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
