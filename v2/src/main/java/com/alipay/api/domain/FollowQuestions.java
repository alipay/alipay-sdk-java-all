package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 追问详情
 *
 * @author auto create
 * @since 1.0, 2026-09-08 17:33:22
 */
public class FollowQuestions extends AlipayObject {

	private static final long serialVersionUID = 4495247757576435611L;

	/**
	 * 追问回答
	 */
	@ApiField("follow_answer")
	private String followAnswer;

	/**
	 * 追问题目
	 */
	@ApiField("follow_question")
	private String followQuestion;

	/**
	 * 追问题序号
	 */
	@ApiField("follow_question_no")
	private String followQuestionNo;

	/**
	 * 追问目标题题型编码
	 */
	@ApiField("follow_question_type")
	private String followQuestionType;

	/**
	 * 追问题选项组
	 */
	@ApiListField("options")
	@ApiField("options")
	private List<Options> options;

	public String getFollowAnswer() {
		return this.followAnswer;
	}
	public void setFollowAnswer(String followAnswer) {
		this.followAnswer = followAnswer;
	}

	public String getFollowQuestion() {
		return this.followQuestion;
	}
	public void setFollowQuestion(String followQuestion) {
		this.followQuestion = followQuestion;
	}

	public String getFollowQuestionNo() {
		return this.followQuestionNo;
	}
	public void setFollowQuestionNo(String followQuestionNo) {
		this.followQuestionNo = followQuestionNo;
	}

	public String getFollowQuestionType() {
		return this.followQuestionType;
	}
	public void setFollowQuestionType(String followQuestionType) {
		this.followQuestionType = followQuestionType;
	}

	public List<Options> getOptions() {
		return this.options;
	}
	public void setOptions(List<Options> options) {
		this.options = options;
	}

}
