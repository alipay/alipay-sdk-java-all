package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-14 19:12:45
 */
public class PBCScanParam extends AlipayObject {

	private static final long serialVersionUID = 6469138472735518351L;

	/**
	 * 证件信息
	 */
	@ApiField("id")
	private String id;

	/**
	 * 名称，包含人名与企业名
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
