package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.closelyrzone.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 18:47:00
 */
public class AlipayOpenOperationOpenbizmockCloselyrzoneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2845781164235112446L;

	/** 
	 * 测试人员测试时需要
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
