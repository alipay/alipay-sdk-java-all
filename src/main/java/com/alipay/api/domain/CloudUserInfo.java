package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑主账号数据列表
 *
 * @author auto create
 * @since 1.0, 2018-11-16 21:41:24
 */
public class CloudUserInfo extends AlipayObject {

	private static final long serialVersionUID = 5353555845534571491L;

	/**
	 * 口碑主账号ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 口碑主账号名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
