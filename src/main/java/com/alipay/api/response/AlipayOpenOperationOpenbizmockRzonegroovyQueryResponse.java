package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.rzonegroovy.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 18:47:00
 */
public class AlipayOpenOperationOpenbizmockRzonegroovyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3889879758294966868L;

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
