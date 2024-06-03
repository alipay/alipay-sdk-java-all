package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.jhjtest.supportauthtoken.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-23 11:27:02
 */
public class AlipaySecurityProdJhjtestSupportauthtokenModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3776663384911643179L;

	/** 
	 * 2
	 */
	@ApiField("price")
	private String price;

	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice( ) {
		return this.price;
	}

}
