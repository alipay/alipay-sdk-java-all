package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-16 10:17:56
 */
public class FieldValuePairs extends AlipayObject {

	private static final long serialVersionUID = 6461935695337936927L;

	/**
	 * 特性key
	 */
	@ApiField("field_key")
	private String fieldKey;

	/**
	 * enable有效/disable失效
	 */
	@ApiField("field_status")
	private String fieldStatus;

	/**
	 * 特性标签值
	 */
	@ApiField("value")
	private String value;

	public String getFieldKey() {
		return this.fieldKey;
	}
	public void setFieldKey(String fieldKey) {
		this.fieldKey = fieldKey;
	}

	public String getFieldStatus() {
		return this.fieldStatus;
	}
	public void setFieldStatus(String fieldStatus) {
		this.fieldStatus = fieldStatus;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
