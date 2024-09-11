package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 角色功能点
 *
 * @author auto create
 * @since 1.0, 2020-11-26 15:25:00
 */
public class Function extends AlipayObject {

	private static final long serialVersionUID = 5795636866275684776L;

	/**
	 * 功能点id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 功能点名称
	 */
	@ApiField("name")
	private String name;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
