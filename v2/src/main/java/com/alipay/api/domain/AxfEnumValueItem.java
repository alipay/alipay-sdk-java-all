package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心生活枚举值对
 *
 * @author auto create
 * @since 1.0, 2026-01-28 15:15:30
 */
public class AxfEnumValueItem extends AlipayObject {

	private static final long serialVersionUID = 6698252592278324767L;

	/**
	 * 枚举值key
	 */
	@ApiField("enum_key")
	private String enumKey;

	/**
	 * 枚举值对的值
	 */
	@ApiField("enum_value")
	private String enumValue;

	public String getEnumKey() {
		return this.enumKey;
	}
	public void setEnumKey(String enumKey) {
		this.enumKey = enumKey;
	}

	public String getEnumValue() {
		return this.enumValue;
	}
	public void setEnumValue(String enumValue) {
		this.enumValue = enumValue;
	}

}
