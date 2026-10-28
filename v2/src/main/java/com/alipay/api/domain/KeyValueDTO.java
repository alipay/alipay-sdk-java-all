package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-26 17:58:00
 */
public class KeyValueDTO extends AlipayObject {

	private static final long serialVersionUID = 4239846711117733281L;

	/**
	 * map中的key
	 */
	@ApiField("key")
	private String key;

	/**
	 * map中的value
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
