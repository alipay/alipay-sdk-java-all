package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机器人对话问答返回的流式详情
 *
 * @author auto create
 * @since 1.0, 2025-03-26 22:42:52
 */
public class AnswerStreamDetail extends AlipayObject {

	private static final long serialVersionUID = 2658252625996312785L;

	/**
	 * 流式回复前置文案
	 */
	@ApiField("follow_question")
	private String followQuestion;

	/**
	 * 是否是支付宝通用知识回答，是true，否false。
	 */
	@ApiField("general_bottom_line_answer")
	private Boolean generalBottomLineAnswer;

	/**
	 * 通用回答提示语，general_bottom_line_answer=true时才有值。
	 */
	@ApiField("general_bottom_line_answer_hint")
	private String generalBottomLineAnswerHint;

	/**
	 * 是否流式输出
	 */
	@ApiField("stream_out")
	private Boolean streamOut;

	public String getFollowQuestion() {
		return this.followQuestion;
	}
	public void setFollowQuestion(String followQuestion) {
		this.followQuestion = followQuestion;
	}

	public Boolean getGeneralBottomLineAnswer() {
		return this.generalBottomLineAnswer;
	}
	public void setGeneralBottomLineAnswer(Boolean generalBottomLineAnswer) {
		this.generalBottomLineAnswer = generalBottomLineAnswer;
	}

	public String getGeneralBottomLineAnswerHint() {
		return this.generalBottomLineAnswerHint;
	}
	public void setGeneralBottomLineAnswerHint(String generalBottomLineAnswerHint) {
		this.generalBottomLineAnswerHint = generalBottomLineAnswerHint;
	}

	public Boolean getStreamOut() {
		return this.streamOut;
	}
	public void setStreamOut(Boolean streamOut) {
		this.streamOut = streamOut;
	}

}
