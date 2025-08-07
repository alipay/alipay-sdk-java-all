package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收问题模型
 *
 * @author auto create
 * @since 1.0, 2023-08-22 17:53:20
 */
public class RecycleQuestion extends AlipayObject {

	private static final long serialVersionUID = 7237218119481666731L;

	/**
	 * 选项列表
	 */
	@ApiListField("option_list")
	@ApiField("recycle_question_option_info")
	private List<RecycleQuestionOptionInfo> optionList;

	/**
	 * 问题编码
	 */
	@ApiField("question_code")
	private String questionCode;

	/**
	 * 问题名称
	 */
	@ApiField("question_name")
	private String questionName;

	public List<RecycleQuestionOptionInfo> getOptionList() {
		return this.optionList;
	}
	public void setOptionList(List<RecycleQuestionOptionInfo> optionList) {
		this.optionList = optionList;
	}

	public String getQuestionCode() {
		return this.questionCode;
	}
	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}

	public String getQuestionName() {
		return this.questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

}
