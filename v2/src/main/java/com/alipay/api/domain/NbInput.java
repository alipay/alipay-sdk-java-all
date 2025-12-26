package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户输入
 *
 * @author auto create
 * @since 1.0, 2024-07-05 10:28:52
 */
public class NbInput extends AlipayObject {

	private static final long serialVersionUID = 5347591797338611946L;

	/**
	 * 变量名称
	 */
	@ApiField("label")
	private String label;

	/**
	 * 最大长度，单位字符
	 */
	@ApiField("max_length")
	private Long maxLength;

	/**
	 * 用户输入变量值的自定义下拉选项列表
	 */
	@ApiListField("options")
	@ApiField("string")
	private List<String> options;

	/**
	 * 是否必填
	 */
	@ApiField("required")
	private Boolean required;

	/**
	 * 输入类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 变量key
	 */
	@ApiField("variable")
	private String variable;

	/**
	 * 权重比例，单位百分比
	 */
	@ApiField("weight")
	private String weight;

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public Long getMaxLength() {
		return this.maxLength;
	}
	public void setMaxLength(Long maxLength) {
		this.maxLength = maxLength;
	}

	public List<String> getOptions() {
		return this.options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getVariable() {
		return this.variable;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
