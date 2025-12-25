package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收问卷选项约束关系
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:25:33
 */
public class RecycleOptionConstraint extends AlipayObject {

	private static final long serialVersionUID = 1428333918944239182L;

	/**
	 * 受影响问题code
	 */
	@ApiField("question_code")
	private String questionCode;

	/**
	 * 保留的选项code集合
	 */
	@ApiListField("retain_options")
	@ApiField("string")
	private List<String> retainOptions;

	/**
	 * 选择选项code
	 */
	@ApiField("selected_option_code")
	private String selectedOptionCode;

	public String getQuestionCode() {
		return this.questionCode;
	}
	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}

	public List<String> getRetainOptions() {
		return this.retainOptions;
	}
	public void setRetainOptions(List<String> retainOptions) {
		this.retainOptions = retainOptions;
	}

	public String getSelectedOptionCode() {
		return this.selectedOptionCode;
	}
	public void setSelectedOptionCode(String selectedOptionCode) {
		this.selectedOptionCode = selectedOptionCode;
	}

}
