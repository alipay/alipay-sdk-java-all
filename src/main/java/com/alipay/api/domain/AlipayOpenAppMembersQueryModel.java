package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序查询成员
 *
 * @author auto create
 * @since 1.0, 2017-12-20 11:25:09
 */
public class AlipayOpenAppMembersQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7891222692338853195L;

	/**
	 * 成员的角色类型，DEVELOPER-开发者，EXPERIENCER-体验者
	 */
	@ApiField("role")
	private String role;

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
