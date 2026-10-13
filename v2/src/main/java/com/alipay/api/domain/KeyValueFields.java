package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-09 17:17:53
 */
public class KeyValueFields extends AlipayObject {

	private static final long serialVersionUID = 5449373319337587294L;

	/**
	 * 字段编码
	 */
	@ApiField("key")
	private String key;

	/**
	 * 字段值
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
