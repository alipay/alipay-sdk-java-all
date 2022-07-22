package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * K-V键值对
 *
 * @author auto create
 * @since 1.0, 2019-02-19 17:19:59
 */
public class KeyValuePair extends AlipayObject {

	private static final long serialVersionUID = 6826916671951597393L;

	/**
	 * key
	 */
	@ApiField("key")
	private String key;

	/**
	 * value
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
