package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取accessToken
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:37:44
 */
public class AnttechNftOauthtokenApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4674629784113685141L;

	/**
	 * 授权码，用户对应用授权后得到。为 refresh_token 时不填。
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 授权方式。支持：
1.authorization_code，表示换取使用用户授权码code换取授权令牌access_token。
2.refresh_token，表示使用refresh_token刷新获取新授权令牌。
refresh_token本期新增
	 */
	@ApiField("grant_type")
	private String grantType;

	/**
	 * 刷新令牌，上次换取访问令牌时得到。
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/**
	 * 请求唯一ID，用于链路跟踪和问题排查
	 */
	@ApiField("req_msg_id")
	private String reqMsgId;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getGrantType() {
		return this.grantType;
	}
	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getReqMsgId() {
		return this.reqMsgId;
	}
	public void setReqMsgId(String reqMsgId) {
		this.reqMsgId = reqMsgId;
	}

}
