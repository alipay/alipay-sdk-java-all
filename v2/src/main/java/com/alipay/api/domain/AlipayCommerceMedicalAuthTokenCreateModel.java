package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁阿福用户授权令牌获取
 *
 * @author auto create
 * @since 1.0, 2026-03-26 17:33:57
 */
public class AlipayCommerceMedicalAuthTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8666471116445921563L;

	/**
	 * 授权码，用户对应用授权后得到
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
