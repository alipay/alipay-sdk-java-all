package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.wxlogin.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-26 22:55:06
 */
public class KoubeiShopWxloginQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4891611112722453486L;

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
