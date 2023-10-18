package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.scenepay.authorize.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-20 13:53:29
 */
public class AlipayFundScenepayAuthorizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1495815678413239962L;

	/** 
	 * 授权ID
	 */
	@ApiField("authorization_id")
	private String authorizationId;

	/** 
	 * NORMAL 正常状态
UNSIGN 未签约或已解约
	 */
	@ApiField("status")
	private String status;

	public void setAuthorizationId(String authorizationId) {
		this.authorizationId = authorizationId;
	}
	public String getAuthorizationId( ) {
		return this.authorizationId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
