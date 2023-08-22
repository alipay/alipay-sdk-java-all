package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权对象
 *
 * @author auto create
 * @since 1.0, 2021-11-25 11:52:32
 */
public class AuthInfo extends AlipayObject {

	private static final long serialVersionUID = 3268623454243456733L;

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
