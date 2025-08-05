package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 规格标签
 *
 * @author auto create
 * @since 1.0, 2025-08-01 09:52:03
 */
public class AIChatAttribute extends AlipayObject {

	private static final long serialVersionUID = 6662671986888137757L;

	/**
	 * 甜度
	 */
	@ApiField("key")
	private String key;

	/**
	 * 五分糖
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
