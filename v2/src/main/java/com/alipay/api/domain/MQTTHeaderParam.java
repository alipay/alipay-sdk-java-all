package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-04-22 00:52:27
 */
public class MQTTHeaderParam extends AlipayObject {

	private static final long serialVersionUID = 1223357977669642426L;

	/**
	 * MQTT协议请求头参数名
	 */
	@ApiField("name")
	private String name;

	/**
	 * MQTT协议 请求头取值
	 */
	@ApiField("value")
	private String value;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
