package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业用户信登录结果
 *
 * @author auto create
 * @since 1.0, 2024-10-15 14:15:51
 */
public class OpenApiEnterpriseUserAuthInfo extends AlipayObject {

	private static final long serialVersionUID = 3728615618567127563L;

	/**
	 * 返回的登录授权码
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
