package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pai.proxy.redirect response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPaiProxyRedirectResponse extends AlipayResponse {

	private static final long serialVersionUID = 5367289973975273422L;

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
