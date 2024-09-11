package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.voice.question.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-25 16:16:39
 */
public class AlipaySecurityProdVoiceQuestionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7375226656264771676L;

	/** 
	 * 问题推荐结果
	 */
	@ApiField("question_result")
	private String questionResult;

	public void setQuestionResult(String questionResult) {
		this.questionResult = questionResult;
	}
	public String getQuestionResult( ) {
		return this.questionResult;
	}

}
