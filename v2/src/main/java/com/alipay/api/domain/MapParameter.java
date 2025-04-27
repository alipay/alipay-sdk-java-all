package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Map结构的入参
 *
 * @author auto create
 * @since 1.0, 2020-03-11 14:46:34
 */
public class MapParameter extends AlipayObject {

	private static final long serialVersionUID = 3327696347293497285L;

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
