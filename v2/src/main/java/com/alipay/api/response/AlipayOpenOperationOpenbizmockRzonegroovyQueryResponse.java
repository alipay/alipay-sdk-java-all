package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.rzonegroovy.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 10:13:35
 */
public class AlipayOpenOperationOpenbizmockRzonegroovyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7717622453538217821L;

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
