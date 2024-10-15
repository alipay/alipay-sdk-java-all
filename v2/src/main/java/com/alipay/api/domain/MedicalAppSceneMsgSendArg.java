package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗场景小程序消息发送参数
 *
 * @author auto create
 * @since 1.0, 2023-06-06 10:28:29
 */
public class MedicalAppSceneMsgSendArg extends AlipayObject {

	private static final long serialVersionUID = 3814148513992415547L;

	/**
	 * 键
	 */
	@ApiField("key")
	private String key;

	/**
	 * 值
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
