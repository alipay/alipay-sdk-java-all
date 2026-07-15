package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * muse身份绑定
 *
 * @author auto create
 * @since 1.0, 2026-04-01 15:32:44
 */
public class AlipayAfxMuseUserBindModel extends AlipayObject {

	private static final long serialVersionUID = 1563452994397115391L;

	/**
	 * 用户uid，仅做路由，不实际消费
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户uid，仅做路由，不实际消费
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
