package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-13 19:22:54
 */
public class StrategySearchField extends AlipayObject {

	private static final long serialVersionUID = 7291926835536157588L;

	/**
	 * gmt_create
	 */
	@ApiField("field_code")
	private String fieldCode;

	/**
	 * 操作符类型，取值见 enum（共18种）
	 */
	@ApiField("field_operator_type")
	private String fieldOperatorType;

	/**
	 * 字段值（支持多种类型）
	 */
	@ApiField("value")
	private String value;

	/**
	 * 字段变量名
	 */
	@ApiField("variable_name")
	private String variableName;

	public String getFieldCode() {
		return this.fieldCode;
	}
	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}

	public String getFieldOperatorType() {
		return this.fieldOperatorType;
	}
	public void setFieldOperatorType(String fieldOperatorType) {
		this.fieldOperatorType = fieldOperatorType;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public String getVariableName() {
		return this.variableName;
	}
	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

}
