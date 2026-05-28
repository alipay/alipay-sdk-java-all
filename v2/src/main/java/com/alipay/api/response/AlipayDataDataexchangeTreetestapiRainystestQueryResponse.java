package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.treetestapi.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-25 10:52:45
 */
public class AlipayDataDataexchangeTreetestapiRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2376562483694563985L;

	/** 
	 * 支付宝用户的userId。sdsdsd
	 */
	@ApiField("demo")
	private String demo;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("demo_0525_out")
	private String demo0525Out;

	public void setDemo(String demo) {
		this.demo = demo;
	}
	public String getDemo( ) {
		return this.demo;
	}

	public void setDemo0525Out(String demo0525Out) {
		this.demo0525Out = demo0525Out;
	}
	public String getDemo0525Out( ) {
		return this.demo0525Out;
	}

}
