package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-16 13:47:56
 */
public class FieldInfoResult extends AlipayObject {

	private static final long serialVersionUID = 2332827511113148336L;

	/**
	 * 字段Key，办事保险箱注册授权配置时分配
	 */
	@ApiField("field_key")
	private String fieldKey;

	/**
	 * 字段值
	 */
	@ApiField("field_value")
	private String fieldValue;

	public String getFieldKey() {
		return this.fieldKey;
	}
	public void setFieldKey(String fieldKey) {
		this.fieldKey = fieldKey;
	}

	public String getFieldValue() {
		return this.fieldValue;
	}
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

}
