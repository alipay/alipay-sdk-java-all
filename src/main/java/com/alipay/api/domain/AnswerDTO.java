package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版答题结果
 *
 * @author auto create
 * @since 1.0, 2022-01-16 12:21:45
 */
public class AnswerDTO extends AlipayObject {

	private static final long serialVersionUID = 4781924982795783855L;

	/**
	 * 答题内容的默认值
	 */
	@ApiField("initial_value")
	private String initialValue;

	/**
	 * 问题描述
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 答题结果
	 */
	@ApiField("value")
	private String value;

	public String getInitialValue() {
		return this.initialValue;
	}
	public void setInitialValue(String initialValue) {
		this.initialValue = initialValue;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
