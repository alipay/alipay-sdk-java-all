package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.data.onlinetest.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-19 16:42:21
 */
public class KoubeiMemberDataOnlinetestRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2165434569572376372L;

	/** 
	 * 基础参数
	 */
	@ApiField("demo_case")
	private Boolean demoCase;

	public void setDemoCase(Boolean demoCase) {
		this.demoCase = demoCase;
	}
	public Boolean getDemoCase( ) {
		return this.demoCase;
	}

}
