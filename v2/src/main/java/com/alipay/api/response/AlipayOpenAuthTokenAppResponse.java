package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppTokenExchangeSubElement;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.token.app response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-10 16:07:04
 */
public class AlipayOpenAuthTokenAppResponse extends AlipayResponse {

	private static final long serialVersionUID = 6538554348456265775L;

	/** 
	 * 应用授权令牌
	 */
	@ApiField("app_auth_token")
	private String appAuthToken;

	/** 
	 * 刷新令牌
	 */
	@ApiField("app_refresh_token")
	private String appRefreshToken;

	/** 
	 * 授权商户的appid
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/** 
	 * 该字段已作废，应用令牌长期有效，接入方不需要消费该字段
	 */
	@ApiField("expires_in")
	private String expiresIn;

	/** 
	 * 刷新令牌的有效时间（从接口调用时间作为起始时间），单位到秒
	 */
	@ApiField("re_expires_in")
	private String reExpiresIn;

	/** 
	 * 批量授权换码访问令牌列表
	 */
	@ApiListField("tokens")
	@ApiField("app_token_exchange_sub_element")
	private List<AppTokenExchangeSubElement> tokens;

	/** 
	 * 授权商户的user_id
	 */
	@ApiField("user_id")
	private String userId;

	public void setAppAuthToken(String appAuthToken) {
		this.appAuthToken = appAuthToken;
	}
	public String getAppAuthToken( ) {
		return this.appAuthToken;
	}

	public void setAppRefreshToken(String appRefreshToken) {
		this.appRefreshToken = appRefreshToken;
	}
	public String getAppRefreshToken( ) {
		return this.appRefreshToken;
	}

	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}
	public String getAuthAppId( ) {
		return this.authAppId;
	}

	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}
	public String getExpiresIn( ) {
		return this.expiresIn;
	}

	public void setReExpiresIn(String reExpiresIn) {
		this.reExpiresIn = reExpiresIn;
	}
	public String getReExpiresIn( ) {
		return this.reExpiresIn;
	}

	public void setTokens(List<AppTokenExchangeSubElement> tokens) {
		this.tokens = tokens;
	}
	public List<AppTokenExchangeSubElement> getTokens( ) {
		return this.tokens;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
