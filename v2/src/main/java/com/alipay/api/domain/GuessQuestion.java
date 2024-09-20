package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 猜你想问问题
 *
 * @author auto create
 * @since 1.0, 2024-07-15 16:20:32
 */
public class GuessQuestion extends AlipayObject {

	private static final long serialVersionUID = 8228729792126996532L;

	/**
	 * 问题内容
	 */
	@ApiField("question_content")
	private String questionContent;

	/**
	 * 问题唯一标识
	 */
	@ApiField("question_id")
	private String questionId;

	/**
	 * 问题类型
	 */
	@ApiField("question_type")
	private String questionType;

	/**
	 * 场景唯一标识
	 */
	@ApiField("scene_type")
	private String sceneType;

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

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
