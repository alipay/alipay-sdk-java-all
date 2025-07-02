package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-26 18:07:30
 */
public class AlipayBossTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2479263379165948886L;

	/** 
	 * 测试
	 */
	@ApiField("test_01")
	private String test01;

	public void setTest01(String test01) {
		this.test01 = test01;
	}
	public String getTest01( ) {
		return this.test01;
	}

}
