package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权码换取授权令牌
 *
 * @author auto create
 * @since 1.0, 2022-12-30 12:01:56
 */
public class MybankCreditUserSystemOauthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6145342639622513662L;

	/**
	 * 授权码，用户对应用授权后得到。
	 */
	@ApiField("code")
	private String code;

	/**
	 * 值为authorization_code时，代表用code换取；值为refresh_token时，代表用refresh_token换取
	 */
	@ApiField("grant_type")
	private String grantType;

	/**
	 * 刷新令牌，上次换取访问令牌时得到。见出参的refresh_token字段
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
