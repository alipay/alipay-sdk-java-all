package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AuthFieldResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.api.field.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-06 19:20:24
 */
public class AlipayOpenAppApiFieldQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6471626231536974791L;

	/** 
	 * 用户信息申请信息记录查询响应模型
	 */
	@ApiField("auth_field_response")
	private AuthFieldResponse authFieldResponse;

	public void setAuthFieldResponse(AuthFieldResponse authFieldResponse) {
		this.authFieldResponse = authFieldResponse;
	}
	public AuthFieldResponse getAuthFieldResponse( ) {
		return this.authFieldResponse;
	}

}
