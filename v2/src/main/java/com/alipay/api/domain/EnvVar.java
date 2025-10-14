package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 环境变量值
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:17:00
 */
public class EnvVar extends AlipayObject {

	private static final long serialVersionUID = 6131347836242727738L;

	/**
	 * 自定义环境变量Key值
	 */
	@ApiField("key")
	private String key;

	/**
	 * 自定义环境变量value值
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
