package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收问题选项模型
 *
 * @author auto create
 * @since 1.0, 2023-08-22 17:48:49
 */
public class RecycleQuestionOptionInfo extends AlipayObject {

	private static final long serialVersionUID = 3167472399736263247L;

	/**
	 * 选项编码
	 */
	@ApiField("option_code")
	private String optionCode;

	/**
	 * 选项文案
	 */
	@ApiField("option_value")
	private String optionValue;

	/**
	 * 问题编码
	 */
	@ApiField("question_code")
	private String questionCode;

	public String getOptionCode() {
		return this.optionCode;
	}
	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	public String getOptionValue() {
		return this.optionValue;
	}
	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	public String getQuestionCode() {
		return this.questionCode;
	}
	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}

}
