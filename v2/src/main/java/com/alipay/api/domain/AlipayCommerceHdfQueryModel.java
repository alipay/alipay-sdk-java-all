package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫合作方鉴权
 *
 * @author auto create
 * @since 1.0, 2025-11-11 14:37:41
 */
public class AlipayCommerceHdfQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5542266873666376128L;

	/**
	 * 好大夫的authCode
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
