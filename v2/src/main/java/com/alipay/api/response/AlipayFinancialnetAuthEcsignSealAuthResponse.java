package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.seal.auth response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayFinancialnetAuthEcsignSealAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 6381588638752718481L;

	/** 
	 * 授权跳转链接
	 */
	@ApiField("auth_jump_url")
	private String authJumpUrl;

	public void setAuthJumpUrl(String authJumpUrl) {
		this.authJumpUrl = authJumpUrl;
	}
	public String getAuthJumpUrl( ) {
		return this.authJumpUrl;
	}

}
