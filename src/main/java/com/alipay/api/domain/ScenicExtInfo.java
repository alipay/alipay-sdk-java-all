package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 景区扩展信息
 *
 * @author auto create
 * @since 1.0, 2022-06-17 10:02:40
 */
public class ScenicExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5861325331319331681L;

	/**
	 * key的值
	 */
	@ApiField("key")
	private String key;

	/**
	 * value值
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
