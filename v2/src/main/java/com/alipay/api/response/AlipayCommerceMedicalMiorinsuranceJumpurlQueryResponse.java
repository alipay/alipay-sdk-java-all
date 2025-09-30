package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.miorinsurance.jumpurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-19 19:37:25
 */
public class AlipayCommerceMedicalMiorinsuranceJumpurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4573829382128835648L;

	/** 
	 * 跳转链接
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}
	public String getJumpUrl( ) {
		return this.jumpUrl;
	}

}
