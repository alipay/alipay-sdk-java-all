package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.token.app.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-07 14:50:23
 */
public class AlipayOpenAuthTokenAppQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1376614293398392654L;

	/** 
	 * 授权商户的appid
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/** 
	 * 授权失效时间
	 */
	@ApiField("auth_end")
	private Date authEnd;

	/** 
	 * 当前app_auth_token的授权接口列表
	 */
	@ApiListField("auth_methods")
	@ApiField("string")
	private List<String> authMethods;

	/** 
	 * 授权生效时间
	 */
	@ApiField("auth_start")
	private Date authStart;

	/** 
	 * 应用授权令牌失效时间，单位到秒
	 */
	@ApiField("expires_in")
	private Long expiresIn;

	/** 
	 * valid：有效状态；invalid：无效状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 授权商户的user_id
	 */
	@ApiField("user_id")
	private String userId;

	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}
	public String getAuthAppId( ) {
		return this.authAppId;
	}

	public void setAuthEnd(Date authEnd) {
		this.authEnd = authEnd;
	}
	public Date getAuthEnd( ) {
		return this.authEnd;
	}

	public void setAuthMethods(List<String> authMethods) {
		this.authMethods = authMethods;
	}
	public List<String> getAuthMethods( ) {
		return this.authMethods;
	}

	public void setAuthStart(Date authStart) {
		this.authStart = authStart;
	}
	public Date getAuthStart( ) {
		return this.authStart;
	}

	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}
	public Long getExpiresIn( ) {
		return this.expiresIn;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
