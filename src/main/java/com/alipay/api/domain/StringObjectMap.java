package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 字符串到Object的映射
 *
 * @author auto create
 * @since 1.0, 2019-09-20 12:24:23
 */
public class StringObjectMap extends AlipayObject {

	private static final long serialVersionUID = 7725566956682316892L;

	/**
	 * 用户参数的key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 用户自定义参数的值
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
