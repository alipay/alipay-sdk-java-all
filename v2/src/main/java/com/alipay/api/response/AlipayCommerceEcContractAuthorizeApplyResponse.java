package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.contract.authorize.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 11:33:21
 */
public class AlipayCommerceEcContractAuthorizeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3364868264424319348L;

	/** 
	 * 签约授权地址
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
