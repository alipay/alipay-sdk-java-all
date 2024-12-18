package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GuessQuestion;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.assistant.guessquestion.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-15 16:22:04
 */
public class AlipayCloudCloudpromoAssistantGuessquestionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3342324728221536928L;

	/** 
	 * 问题列表
	 */
	@ApiField("questions")
	private GuessQuestion questions;

	public void setQuestions(GuessQuestion questions) {
		this.questions = questions;
	}
	public GuessQuestion getQuestions( ) {
		return this.questions;
	}

}
