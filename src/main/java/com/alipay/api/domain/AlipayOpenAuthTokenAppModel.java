package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用应用授权码（app_auth_code）换取或者刷新应用授权令牌(app_auth_token)
 *
 * @author auto create
 * @since 1.0, 2018-06-29 17:54:42
 */
public class AlipayOpenAuthTokenAppModel extends AlipayObject {

	private static final long serialVersionUID = 1383556484225291557L;

	/**
	 * 授权码，如果grant_type的值为authorization_code。该值必须填写
	 */
	@ApiField("code")
	private String code;

	/**
	 * authorization_code表示换取app_auth_token。
refresh_token表示刷新app_auth_token。
	 */
	@ApiField("grant_type")
	private String grantType;

	/**
	 * 刷新令牌，如果grant_type值为refresh_token。该值不能为空。该值来源于此接口的返回值app_refresh_token（至少需要通过grant_type=authorization_code调用此接口一次才能获取）
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
