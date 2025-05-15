package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预置问题模型
 *
 * @author auto create
 * @since 1.0, 2024-07-15 16:20:47
 */
public class PresetQuesiton extends AlipayObject {

	private static final long serialVersionUID = 7399961117263235812L;

	/**
	 * 问题的父id
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 问题内容
	 */
	@ApiField("question_content")
	private String questionContent;

	/**
	 * 问题唯一id
	 */
	@ApiField("question_id")
	private String questionId;

	/**
	 * 问题类型
	 */
	@ApiField("question_type")
	private String questionType;

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getQuestionContent() {
		return this.questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public String getQuestionId() {
		return this.questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestionType() {
		return this.questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

}
