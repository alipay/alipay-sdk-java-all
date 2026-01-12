package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据token获取context
 *
 * @author auto create
 * @since 1.0, 2025-05-08 16:35:16
 */
public class AlipayIserviceIsportalLogincontextQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7613876413126889922L;

	/**
	 * 令牌
	 */
	@ApiField("login_token")
	private String loginToken;

	public String getLoginToken() {
		return this.loginToken;
	}
	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}

}
