package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流消息KV
 *
 * @author auto create
 * @since 1.0, 2026-03-31 16:50:54
 */
public class LogisticsSPIParamInfo extends AlipayObject {

	private static final long serialVersionUID = 8681358696655494973L;

	/**
	 * 参数名
	 */
	@ApiField("key")
	private String key;

	/**
	 * 参数值
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
