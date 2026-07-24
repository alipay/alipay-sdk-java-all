package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-22 11:42:54
 */
public class QuestionInfoOpenapiResponse extends AlipayObject {

	private static final long serialVersionUID = 5186982985459294667L;

	/**
	 * 答案输入类型
	 */
	@ApiField("input_type")
	private String inputType;

	/**
	 * null
	 */
	@ApiListField("options")
	@ApiField("option_item_response")
	private List<OptionItemResponse> options;

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

	public List<OptionItemResponse> getOptions() {
		return this.options;
	}
	public void setOptions(List<OptionItemResponse> options) {
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
