package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testtestnumber.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-02 13:56:49
 */
public class AlipayOpenOperationOpenbizmockTesttestnumberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7715519555978621991L;

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
