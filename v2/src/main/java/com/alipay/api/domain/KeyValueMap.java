package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * key-value键值对
 *
 * @author auto create
 * @since 1.0, 2022-11-29 14:27:38
 */
public class KeyValueMap extends AlipayObject {

	private static final long serialVersionUID = 6631775355768581831L;

	/**
	 * key-value中的key
	 */
	@ApiField("key")
	private String key;

	/**
	 * key-value中的value
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
