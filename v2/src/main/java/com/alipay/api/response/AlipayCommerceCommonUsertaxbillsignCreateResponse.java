package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.usertaxbillsign.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-04 20:01:54
 */
public class AlipayCommerceCommonUsertaxbillsignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5524814985981277223L;

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
