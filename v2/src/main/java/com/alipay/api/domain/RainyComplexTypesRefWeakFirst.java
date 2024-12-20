package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 强引用
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:17:18
 */
public class RainyComplexTypesRefWeakFirst extends AlipayObject {

	private static final long serialVersionUID = 8411762671271676534L;

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
