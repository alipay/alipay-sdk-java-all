package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-08-25 14:52:05
 */
public class GfsmartpayExtInfo extends AlipayObject {

	private static final long serialVersionUID = 4342644268126668288L;

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
