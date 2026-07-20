package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-14 14:17:49
 */
public class QuestionInfoOpenapiResponse extends AlipayObject {

	private static final long serialVersionUID = 7862266476235866723L;

	/**
	 * 答案输入类型
	 */
	@ApiField("input_type")
	private String inputType;

	/**
	 * 问题可选项列表
	 */
	@ApiField("options")
	private OptionItemResponse options;

	/**
	 * 问题ID
	 */
	@ApiField("question_biz_id")
	private String questionBizId;

	/**
	 * 问题分类
	 */
	@ApiField("question_category")
	private String questionCategory;

	/**
	 * 问题
	 */
	@ApiField("question_content")
	private String questionContent;

	/**
	 * 问题填写描述
	 */
	@ApiField("question_desc")
	private String questionDesc;

	/**
	 * 问题排序
	 */
	@ApiField("question_sort_order")
	private Long questionSortOrder;

	/**
	 * 问题是否必须回答
	 */
	@ApiField("required")
	private Boolean required;

	public String getInputType() {
		return this.inputType;
	}
	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public OptionItemResponse getOptions() {
		return this.options;
	}
	public void setOptions(OptionItemResponse options) {
		this.options = options;
	}

	public String getQuestionBizId() {
		return this.questionBizId;
	}
	public void setQuestionBizId(String questionBizId) {
		this.questionBizId = questionBizId;
	}

	public String getQuestionCategory() {
		return this.questionCategory;
	}
	public void setQuestionCategory(String questionCategory) {
		this.questionCategory = questionCategory;
	}

	public String getQuestionContent() {
		return this.questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public String getQuestionDesc() {
		return this.questionDesc;
	}
	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}

	public Long getQuestionSortOrder() {
		return this.questionSortOrder;
	}
	public void setQuestionSortOrder(Long questionSortOrder) {
		this.questionSortOrder = questionSortOrder;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

}
