package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 景区扩展信息
 *
 * @author auto create
 * @since 1.0, 2021-03-03 16:21:05
 */
public class ScenicExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5391737478423887568L;

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
