package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.encrydata.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-21 14:26:33
 */
public class AlipayOpenOperationOpenbizmockEncrydataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2245883931675453921L;

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
