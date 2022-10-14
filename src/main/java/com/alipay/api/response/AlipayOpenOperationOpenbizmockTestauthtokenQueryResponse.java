package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testauthtoken.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-16 21:16:44
 */
public class AlipayOpenOperationOpenbizmockTestauthtokenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8441549197796786364L;

	/** 
	 * 测试用户授权
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
