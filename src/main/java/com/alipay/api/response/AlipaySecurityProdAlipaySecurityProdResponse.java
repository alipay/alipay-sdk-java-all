package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AAATest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.alipay.security.prod response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdAlipaySecurityProdResponse extends AlipayResponse {

	private static final long serialVersionUID = 4753694731695748726L;

	/** 
	 * 测试
	 */
	@ApiField("test")
	private AAATest test;

	public void setTest(AAATest test) {
		this.test = test;
	}
	public AAATest getTest( ) {
		return this.test;
	}

}
