package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-13 19:22:54
 */
public class StrategyShowField extends AlipayObject {

	private static final long serialVersionUID = 2798172916236345453L;

	/**
	 * 组件名称
	 */
	@ApiField("component_name")
	private String componentName;

	/**
	 * 字段编码
	 */
	@ApiField("field_code")
	private String fieldCode;

	/**
	 * 字段名称
	 */
	@ApiField("field_name")
	private String fieldName;

	public String getComponentName() {
		return this.componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getFieldCode() {
		return this.fieldCode;
	}
	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}

	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

}
