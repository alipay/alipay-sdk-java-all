package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testdc.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-20 10:59:35
 */
public class AlipayOpenOperationOpenbizmockTestdcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4777118479755617855L;

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
