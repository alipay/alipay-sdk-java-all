package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进子任务考核指标
 *
 * @author auto create
 * @since 1.0, 2025-09-23 14:26:27
 */
public class SalesSubActivityItemIndex extends AlipayObject {

	private static final long serialVersionUID = 6139248783599874212L;

	/**
	 * 指标key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 统计结果
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
