package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.oauth.token.revoke response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-21 14:27:34
 */
public class AlipayOpenOauthTokenRevokeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1436525124372985572L;

	/** 
	 * 处理结果，成功or失败
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
