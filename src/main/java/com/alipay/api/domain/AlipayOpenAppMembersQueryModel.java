package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序查询成员
 *
 * @author auto create
 * @since 1.0, 2021-08-13 15:50:56
 */
public class AlipayOpenAppMembersQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4727179358548399848L;

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
