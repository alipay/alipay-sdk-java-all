package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗场景小程序消息发送参数
 *
 * @author auto create
 * @since 1.0, 2025-06-12 11:40:47
 */
public class MedicalMedmsgArg extends AlipayObject {

	private static final long serialVersionUID = 5276664256189812433L;

	/**
	 * 模版字段key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 模版字段value
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
