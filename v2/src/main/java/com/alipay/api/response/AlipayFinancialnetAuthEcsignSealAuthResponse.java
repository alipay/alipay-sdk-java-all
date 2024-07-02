package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.seal.auth response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-18 18:55:41
 */
public class AlipayFinancialnetAuthEcsignSealAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 8236562827872922594L;

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
