package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扁鹊服务端登录验证接口
 *
 * @author auto create
 * @since 1.0, 2025-11-17 16:02:47
 */
public class AlipayCommerceMedicalBqLoginCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 6332167621898918779L;

	/**
	 * 原始authCode使用Base64编码后的结果

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
