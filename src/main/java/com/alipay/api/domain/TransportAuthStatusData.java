package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行授权状态数据
 *
 * @author auto create
 * @since 1.0, 2021-12-28 16:35:13
 */
public class TransportAuthStatusData extends AlipayObject {

	private static final long serialVersionUID = 8784756636251356268L;

	/**
	 * 授权状态。取值枚举为authed、unauthed。分别表示已授权、未授权
	 */
	@ApiField("auth_status")
	private String authStatus;

	/**
	 * 蚂蚁会员id。当授权状态为已授权时，需要返回本字段。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAuthStatus() {
		return this.authStatus;
	}
	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
