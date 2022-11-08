package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于权益相关操作的用户信息
 *
 * @author auto create
 * @since 1.0, 2022-03-03 16:49:39
 */
public class FinUserInfo extends AlipayObject {

	private static final long serialVersionUID = 3458945428967772393L;

	/**
	 * 蚂蚁中的用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
