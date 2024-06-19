package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参数content
 *
 * @author auto create
 * @since 1.0, 2020-08-06 17:23:50
 */
public class HomeApiContent extends AlipayObject {

	private static final long serialVersionUID = 1418995312778285394L;

	/**
	 * 参数的key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 参数value值
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
