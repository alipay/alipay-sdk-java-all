package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-15 15:12:41
 */
public class PBCScanParam extends AlipayObject {

	private static final long serialVersionUID = 5796316246294873646L;

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
