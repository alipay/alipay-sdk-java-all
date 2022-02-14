package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pai.proxy.redirect response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 23:50:31
 */
public class AlipayPaiProxyRedirectResponse extends AlipayResponse {

	private static final long serialVersionUID = 4114112311571881879L;

	/** 
	 * 测试返回数据，页面级接口此项没用
	 */
	@ApiField("test_res")
	private String testRes;

	public void setTestRes(String testRes) {
		this.testRes = testRes;
	}
	public String getTestRes( ) {
		return this.testRes;
	}

}
