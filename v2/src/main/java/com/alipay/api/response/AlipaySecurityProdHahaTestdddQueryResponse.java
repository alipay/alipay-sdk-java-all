package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.haha.testddd.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-18 21:48:16
 */
public class AlipaySecurityProdHahaTestdddQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4115215112776595733L;

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
