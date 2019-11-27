package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.codetest response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAppCodetestResponse extends AlipayResponse {

	private static final long serialVersionUID = 8673559726694251319L;

	/** 
	 * 测试参数1
	 */
	@ApiField("paramtest")
	private String paramtest;

	/** 
	 * 测试参数2
	 */
	@ApiField("paramtesttest")
	private String paramtesttest;

	public void setParamtest(String paramtest) {
		this.paramtest = paramtest;
	}
	public String getParamtest( ) {
		return this.paramtest;
	}

	public void setParamtesttest(String paramtesttest) {
		this.paramtesttest = paramtesttest;
	}
	public String getParamtesttest( ) {
		return this.paramtesttest;
	}

}
