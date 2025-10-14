package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 迭代内新增
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:20
 */
public class RainyComplexTypesRefWeakSecond extends AlipayObject {

	private static final long serialVersionUID = 2783699368694668357L;

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
