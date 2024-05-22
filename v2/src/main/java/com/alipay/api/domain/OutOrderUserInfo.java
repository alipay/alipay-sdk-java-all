package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 正向创单用户信息
 *
 * @author auto create
 * @since 1.0, 2024-01-25 10:11:53
 */
public class OutOrderUserInfo extends AlipayObject {

	private static final long serialVersionUID = 7687682721339587281L;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 用户手机
	 */
	@ApiField("user_phone")
	private String userPhone;

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}
