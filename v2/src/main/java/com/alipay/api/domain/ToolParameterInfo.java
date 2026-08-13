package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:53
 */
public class ToolParameterInfo extends AlipayObject {

	private static final long serialVersionUID = 1853994348984638951L;

	/**
	 * 是否列表.true为列表
	 */
	@ApiField("array")
	private Boolean array;

	/**
	 * 默认值
	 */
	@ApiField("default_value")
	private String defaultValue;

	/**
	 * 参数描述
	 */
	@ApiField("param_desc")
	private String paramDesc;

	/**
	 * 参数名
	 */
	@ApiField("param_name")
	private String paramName;

	/**
	 * 参数类型
	 */
	@ApiField("param_type")
	private String paramType;

	/**
	 * 是否必填
	 */
	@ApiField("required")
	private Boolean required;

	/**
	 * 对象类型的子参数（key 为子参数名，value 为子参数定义）
	 */
	@ApiField("sub_params")
	private String subParams;

	public Boolean getArray() {
		return this.array;
	}
	public void setArray(Boolean array) {
		this.array = array;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getParamDesc() {
		return this.paramDesc;
	}
	public void setParamDesc(String paramDesc) {
		this.paramDesc = paramDesc;
	}

	public String getParamName() {
		return this.paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamType() {
		return this.paramType;
	}
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

	public String getSubParams() {
		return this.subParams;
	}
	public void setSubParams(String subParams) {
		this.subParams = subParams;
	}

}
