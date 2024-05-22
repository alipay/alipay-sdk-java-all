package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.jhjtest.supportauthtoken.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-17 14:27:01
 */
public class AlipaySecurityProdJhjtestSupportauthtokenModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4549232162849935776L;

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
