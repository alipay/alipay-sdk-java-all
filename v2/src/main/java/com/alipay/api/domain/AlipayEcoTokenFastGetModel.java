package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 易联云极速授权token获取对外接口服务
 *
 * @author auto create
 * @since 1.0, 2019-09-06 17:54:46
 */
public class AlipayEcoTokenFastGetModel extends AlipayObject {

	private static final long serialVersionUID = 7753815982829677767L;

	/**
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 应用ID
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 应用Secret
	 */
	@ApiField("client_secret")
	private String clientSecret;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return this.clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

}
