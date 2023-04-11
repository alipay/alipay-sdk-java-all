package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.haha.testddd.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 01:06:25
 */
public class AlipaySecurityProdHahaTestdddQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5498612742516966854L;

	/** 
	 * 测试
	 */
	@ApiField("haha")
	private String haha;

	public void setHaha(String haha) {
		this.haha = haha;
	}
	public String getHaha( ) {
		return this.haha;
	}

}
