package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保区域平台消息发送参数
 *
 * @author auto create
 * @since 1.0, 2023-12-15 17:46:43
 */
public class MedicalAreaPlatformMsgSendArg extends AlipayObject {

	private static final long serialVersionUID = 3213667521145818785L;

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
