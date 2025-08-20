package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当事人详情
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:25:27
 */
public class EpPartiesDetailsInfo extends AlipayObject {

	private static final long serialVersionUID = 3246768436732295748L;

	/**
	 * 当事人名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 角色
	 */
	@ApiField("roles")
	private String roles;

	/**
	 * 当事人类型
	 */
	@ApiField("type")
	private String type;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRoles() {
		return this.roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
