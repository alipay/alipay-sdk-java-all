package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡模板表单字段
 *
 * @author auto create
 * @since 1.0, 2023-12-28 10:10:33
 */
public class TemplateFormFields extends AlipayObject {

	private static final long serialVersionUID = 3135245896789346177L;

	/**
	 * 开卡表单可填字段，可选字段选项不能与必填字段required重复
	 */
	@ApiListField("optional")
	@ApiField("string")
	private List<String> optional;

	/**
	 * 开卡表单必填字段，必填字段必须有一个值，并且不能与可选字段optional里面重复
	 */
	@ApiListField("required")
	@ApiField("string")
	private List<String> required;

	public List<String> getOptional() {
		return this.optional;
	}
	public void setOptional(List<String> optional) {
		this.optional = optional;
	}

	public List<String> getRequired() {
		return this.required;
	}
	public void setRequired(List<String> required) {
		this.required = required;
	}

}
