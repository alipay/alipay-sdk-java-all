package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.codetesttest response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAppCodetesttestResponse extends AlipayResponse {

	private static final long serialVersionUID = 4257182627968888586L;

	/** 
	 * 测试测试测试
	 */
	@ApiField("testtesttest")
	private String testtesttest;

	public void setTesttesttest(String testtesttest) {
		this.testtesttest = testtesttest;
	}
	public String getTesttesttest( ) {
		return this.testtesttest;
	}

}
