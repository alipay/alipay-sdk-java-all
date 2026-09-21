package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-18 22:32:55
 */
public class NameValueParam extends AlipayObject {

	private static final long serialVersionUID = 8468475595383288164L;

	/**
	 * 参数名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 参数值
	 */
	@ApiField("value")
	private String value;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
