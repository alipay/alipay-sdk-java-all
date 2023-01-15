package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.wxlogin.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:56:38
 */
public class KoubeiShopWxloginQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2724324432737327628L;

	/** 
	 * 用户唯一标识的 openid
	 */
	@ApiField("openid")
	private String openid;

	/** 
	 * 会话密钥
	 */
	@ApiField("session_key")
	private String sessionKey;

	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getOpenid( ) {
		return this.openid;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	public String getSessionKey( ) {
		return this.sessionKey;
	}

}
