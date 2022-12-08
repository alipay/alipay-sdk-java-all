package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.schema.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:21:40
 */
public class AlipayOpenOperationOpenbizmockSchemaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6861558173384132668L;

	/** 
	 * test
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
