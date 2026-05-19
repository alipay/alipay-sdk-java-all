package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.resale.order.sign response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-22 11:52:45
 */
public class AlipayCommerceResaleOrderSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3185443467192266592L;

	/** 
	 * 信用受理台签约链接
	 */
	@ApiField("zmxy_sign_url")
	private String zmxySignUrl;

	public void setZmxySignUrl(String zmxySignUrl) {
		this.zmxySignUrl = zmxySignUrl;
	}
	public String getZmxySignUrl( ) {
		return this.zmxySignUrl;
	}

}
