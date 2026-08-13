package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-04 14:01:24
 */
public class ExtInfoAttrs extends AlipayObject {

	private static final long serialVersionUID = 1128227827228736555L;

	/**
	 * 扩展信息key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 扩展信息value
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
