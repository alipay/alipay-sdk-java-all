package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Map结构的入参
 *
 * @author auto create
 * @since 1.0, 2019-11-14 21:55:36
 */
public class MapParameter extends AlipayObject {

	private static final long serialVersionUID = 6523935811571967418L;

	/**
	 * 参数的名字
	 */
	@ApiField("key")
	private String key;

	/**
	 * 参数的值
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
