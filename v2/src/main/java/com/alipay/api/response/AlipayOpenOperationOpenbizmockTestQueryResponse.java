package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-22 10:14:50
 */
public class AlipayOpenOperationOpenbizmockTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5638791759735347472L;

	/** 
	 * 哈哈
	 */
	@ApiField("out_open_id")
	private String outOpenId;

	/** 
	 * 哈哈
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
