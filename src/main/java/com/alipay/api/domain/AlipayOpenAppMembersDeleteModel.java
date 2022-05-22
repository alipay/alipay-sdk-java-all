package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除小程序成员
 *
 * @author auto create
 * @since 1.0, 2021-06-21 10:40:06
 */
public class AlipayOpenAppMembersDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8242892834951128146L;

	/**
	 * 被删除成员的角色类型，枚举支持：
DEVELOPER：开发者。
EXPERIENCER：体验者。
	 */
	@ApiField("role")
	private String role;

	/**
	 * 被删除成员的支付宝账户唯一标识，以2088开头。
	 */
	@ApiField("user_id")
	private String userId;

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
