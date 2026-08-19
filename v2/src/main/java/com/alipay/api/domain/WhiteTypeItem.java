package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-11 17:27:49
 */
public class WhiteTypeItem extends AlipayObject {

	private static final long serialVersionUID = 2365538457513724519L;

	/**
	 * 白名单类型名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 白名单类型编码
	 */
	@ApiField("type")
	private String type;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
