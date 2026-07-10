package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI随访多选问题答案可选项
 *
 * @author auto create
 * @since 1.0, 2026-06-24 17:58:50
 */
public class OptionItemResponse extends AlipayObject {

	private static final long serialVersionUID = 5275738326798953284L;

	/**
	 * 问题编号
	 */
	@ApiField("key")
	private String key;

	/**
	 * 问题可选项内容
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
