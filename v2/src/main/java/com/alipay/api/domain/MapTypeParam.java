package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Map结构
 *
 * @author auto create
 * @since 1.0, 2022-09-29 19:47:26
 */
public class MapTypeParam extends AlipayObject {

	private static final long serialVersionUID = 1131815345426878275L;

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
