package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 弱引用
 *
 * @author auto create
 * @since 1.0, 2025-03-07 11:00:02
 */
public class RainysComplexRefSecond extends AlipayObject {

	private static final long serialVersionUID = 5211744142615557625L;

	/**
	 * null
	 */
	@ApiListField("schema_param_boolean")
	@ApiField("boolean")
	private List<Boolean> schemaParamBoolean;

	/**
	 * 数字类型
	 */
	@ApiField("schema_param_num")
	private Long schemaParamNum;

	/**
	 * 字符串
	 */
	@ApiField("schema_param_string")
	private String schemaParamString;

	public List<Boolean> getSchemaParamBoolean() {
		return this.schemaParamBoolean;
	}
	public void setSchemaParamBoolean(List<Boolean> schemaParamBoolean) {
		this.schemaParamBoolean = schemaParamBoolean;
	}

	public Long getSchemaParamNum() {
		return this.schemaParamNum;
	}
	public void setSchemaParamNum(Long schemaParamNum) {
		this.schemaParamNum = schemaParamNum;
	}

	public String getSchemaParamString() {
		return this.schemaParamString;
	}
	public void setSchemaParamString(String schemaParamString) {
		this.schemaParamString = schemaParamString;
	}

}
