package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁健康用户授权令牌获取
 *
 * @author auto create
 * @since 1.0, 2025-12-30 14:07:41
 */
public class AlipayCommerceMedicalHomedoctorOauthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2471427154396814797L;

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
