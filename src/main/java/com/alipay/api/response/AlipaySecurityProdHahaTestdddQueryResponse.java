package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.haha.testddd.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-11 14:02:53
 */
public class AlipaySecurityProdHahaTestdddQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2499667674618867233L;

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
