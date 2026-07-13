package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.biztransferauth.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-25 17:17:57
 */
public class AlipayCommerceEcRecyclinginvoiceBiztransferauthApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4369139396674185493L;

	/** 
	 * 授权流水ID,可用于查询企业授权结果
	 */
	@ApiField("auth_id")
	private String authId;

	/** 
	 * 企业授权状态
	 */
	@ApiField("auth_status")
	private String authStatus;

	/** 
	 * 授权链接,通过此链接可以跳转发票平台授权
	 */
	@ApiField("auth_url")
	private String authUrl;

	public void setAuthId(String authId) {
		this.authId = authId;
	}
	public String getAuthId( ) {
		return this.authId;
	}

	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}
	public String getAuthStatus( ) {
		return this.authStatus;
	}

	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}
	public String getAuthUrl( ) {
		return this.authUrl;
	}

}
