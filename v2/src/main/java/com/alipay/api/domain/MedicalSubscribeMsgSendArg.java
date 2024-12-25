package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗订阅消息发送参数
 *
 * @author auto create
 * @since 1.0, 2023-11-09 21:24:16
 */
public class MedicalSubscribeMsgSendArg extends AlipayObject {

	private static final long serialVersionUID = 2679579363649411941L;

	/**
	 * 消息模板中参数的一个参数的键
	 */
	@ApiField("key")
	private String key;

	/**
	 * 消息模板中参数的一个参数的值
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
