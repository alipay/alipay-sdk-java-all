package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.usertaxbillsign.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-12 11:31:44
 */
public class AlipayCommerceCommonUsertaxbillsignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2623426549339979951L;

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
