package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AQ授权令牌获取
 *
 * @author auto create
 * @since 1.0, 2025-11-28 16:27:41
 */
public class AlipayCommerceMedicalHomedoctorOauthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2871745128189194168L;

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
