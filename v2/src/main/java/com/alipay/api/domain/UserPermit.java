package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权接收消息状态
 *
 * @author auto create
 * @since 1.0, 2018-12-11 15:22:45
 */
public class UserPermit extends AlipayObject {

	private static final long serialVersionUID = 6181466159279378441L;

	/**
	 * 用户授权接收消息状态
	 */
	@ApiField("permit_status")
	private String permitStatus;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getPermitStatus() {
		return this.permitStatus;
	}
	public void setPermitStatus(String permitStatus) {
		this.permitStatus = permitStatus;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
