package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.usertaxbillsign.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-07 15:26:51
 */
public class AlipayCommerceCommonUsertaxbillsignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1612983647145761278L;

	/** 
	 * 跳转的签约地址
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
