package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-06 15:57:36
 */
public class AlipayBossTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3889497265574731883L;

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
