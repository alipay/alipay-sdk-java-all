package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用应用授权码（app_auth_code）换取或者刷新应用授权令牌(app_auth_token)
 *
 * @author auto create
 * @since 1.0, 2024-07-10 15:23:16
 */
public class AlipayOpenAuthTokenAppModel extends AlipayObject {

	private static final long serialVersionUID = 5162278364232342115L;

	/**
	 * 应用授权码，传入应用授权后得到的  app_auth_code。
说明：
grant_type 为 authorization_code 时，本参数必填；
grant_type 为 refresh_token 时不填。
	 */
	@ApiField("code")
	private String code;

	/**
	 * 授权方式。支持：
authorization_code：使用应用授权码换取应用授权令牌app_auth_token。
refresh_token：使用app_refresh_token刷新获取新授权令牌。
	 */
	@ApiField("grant_type")
	private String grantType;

	/**
	 * 刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填，且该值来源于此接口的返回值 app_refresh_token（即至少需要通过 grant_type=authorization_code 调用此接口一次才能获取）。
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
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

}
