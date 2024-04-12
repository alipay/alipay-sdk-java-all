package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 23:28:48
 */
public class AlipayOpenOperationOpenbizmockTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8157914225154528429L;

	/** 
	 * test
	 */
	@ApiField("out_open_id")
	private String outOpenId;

	/** 
	 * test
	 */
	@ApiField("out_test")
	private String outTest;

	public void setOutOpenId(String outOpenId) {
		this.outOpenId = outOpenId;
	}
	public String getOutOpenId( ) {
		return this.outOpenId;
	}

	public void setOutTest(String outTest) {
		this.outTest = outTest;
	}
	public String getOutTest( ) {
		return this.outTest;
	}

}
