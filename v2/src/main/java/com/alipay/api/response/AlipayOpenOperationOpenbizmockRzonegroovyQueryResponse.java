package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.rzonegroovy.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:01
 */
public class AlipayOpenOperationOpenbizmockRzonegroovyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4435353956561871182L;

	/** 
	 * 测试
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
