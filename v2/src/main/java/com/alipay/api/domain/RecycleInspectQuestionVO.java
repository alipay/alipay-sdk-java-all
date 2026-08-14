package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收质检问题对象
 *
 * @author auto create
 * @since 1.0, 2026-08-10 10:26:39
 */
public class RecycleInspectQuestionVO extends AlipayObject {

	private static final long serialVersionUID = 8378325758675112197L;

	/**
	 * 问题答案列表
	 */
	@ApiListField("answer_list")
	@ApiField("recycle_inspect_answer_v_o")
	private List<RecycleInspectAnswerVO> answerList;

	/**
	 * 问题编码
	 */
	@ApiField("question_code")
	private String questionCode;

	/**
	 * 问题的中文描述
	 */
	@ApiField("question_name")
	private String questionName;

	public List<RecycleInspectAnswerVO> getAnswerList() {
		return this.answerList;
	}
	public void setAnswerList(List<RecycleInspectAnswerVO> answerList) {
		this.answerList = answerList;
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
