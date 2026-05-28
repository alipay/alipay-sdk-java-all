package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-02-26 16:37:42
 */
public class DeviceAttr extends AlipayObject {

	private static final long serialVersionUID = 3698222659141634145L;

	/**
	 * 设备其他属性key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 设备其他属性value
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
