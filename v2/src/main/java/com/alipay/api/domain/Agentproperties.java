package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务属性
 *
 * @author auto create
 * @since 1.0, 2026-03-27 13:47:51
 */
public class Agentproperties extends AlipayObject {

	private static final long serialVersionUID = 6712144738261889939L;

	/**
	 * 属性值
	 */
	@ApiField("key")
	private String key;

	/**
	 * 属性值
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
