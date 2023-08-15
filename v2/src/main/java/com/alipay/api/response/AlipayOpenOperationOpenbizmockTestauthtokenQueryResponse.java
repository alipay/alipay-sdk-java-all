package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testauthtoken.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 12:01:48
 */
public class AlipayOpenOperationOpenbizmockTestauthtokenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3229146713471325769L;

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
