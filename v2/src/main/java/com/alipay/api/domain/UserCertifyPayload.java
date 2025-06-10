package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权认证消息体
 *
 * @author auto create
 * @since 1.0, 2020-01-09 10:59:34
 */
public class UserCertifyPayload extends AlipayObject {

	private static final long serialVersionUID = 4583253352485956716L;

	/**
	 * 授权编码
	 */
	@ApiField("auth_code")
	private String authCode;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

}
