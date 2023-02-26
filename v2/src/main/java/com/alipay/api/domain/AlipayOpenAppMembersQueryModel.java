package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序查询成员
 *
 * @author auto create
 * @since 1.0, 2022-11-28 20:20:14
 */
public class AlipayOpenAppMembersQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1754252855738327489L;

	/**
	 * 查询的成员角色类型。
枚举支持：
DEVELOPER：开发者；
EXPERIENCER：体验者。
请选择其一传入
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
