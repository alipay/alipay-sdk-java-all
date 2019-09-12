package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除小程序成员
 *
 * @author auto create
 * @since 1.0, 2018-12-25 14:15:41
 */
public class AlipayOpenAppMembersDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6781183781483756378L;

	/**
	 * 成员的角色类型，DEVELOPER-开发者，EXPERIENCER-体验者
	 */
	@ApiField("role")
	private String role;

	/**
	 * 蚂蚁统一会员ID
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
