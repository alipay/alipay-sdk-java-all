package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权对象
 *
 * @author auto create
 * @since 1.0, 2019-01-08 20:19:05
 */
public class AuthInfo extends AlipayObject {

	private static final long serialVersionUID = 5212677782697474898L;

	/**
	 * 授权号
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 授权类型
	 */
	@ApiField("auth_type")
	private String authType;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

}
