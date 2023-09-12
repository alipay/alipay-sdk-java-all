package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 简直对类型的入参，类似Map<String,String>
 *
 * @author auto create
 * @since 1.0, 2020-09-14 16:37:59
 */
public class ExtInfoMap extends AlipayObject {

	private static final long serialVersionUID = 5533777624688426598L;

	/**
	 * 键值对的key，{"orderId":"123456"}中的orderId
	 */
	@ApiField("key")
	private String key;

	/**
	 * 键值对的value，{"orderId":"123456"} 中的123456
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
