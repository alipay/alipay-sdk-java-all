package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流运单状态变更同步的参数模型
 *
 * @author auto create
 * @since 1.0, 2021-01-28 09:46:26
 */
public class ParamInfo extends AlipayObject {

	private static final long serialVersionUID = 8164729659815877271L;

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
