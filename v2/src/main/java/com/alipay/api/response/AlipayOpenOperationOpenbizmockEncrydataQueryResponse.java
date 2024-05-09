package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.encrydata.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:16:44
 */
public class AlipayOpenOperationOpenbizmockEncrydataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7199921314466728892L;

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
