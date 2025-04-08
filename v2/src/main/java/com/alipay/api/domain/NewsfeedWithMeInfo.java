package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 和谁在一起
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class NewsfeedWithMeInfo extends AlipayObject {

	private static final long serialVersionUID = 2756379135259716716L;

	/**
	 * 登录ID
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
