package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DelOauthDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.deloauth.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-29 21:26:56
 */
public class AlipayUserDeloauthDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1348238937379123555L;

	/** 
	 * 解除授权记录列表
	 */
	@ApiField("response")
	private DelOauthDetailResult response;

	public void setResponse(DelOauthDetailResult response) {
		this.response = response;
	}
	public DelOauthDetailResult getResponse( ) {
		return this.response;
	}

}
