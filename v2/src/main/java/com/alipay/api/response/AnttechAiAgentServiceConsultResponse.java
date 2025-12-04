package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.agent.service.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-12 19:27:32
 */
public class AnttechAiAgentServiceConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7741958296881819411L;

	/** 
	 * 回答文本内容
	 */
	@ApiField("answer")
	private String answer;

	/** 
	 * 流式响应，当输出内容未结束时，isEnd为false，最后次一次输出时，isEnd为true
	 */
	@ApiField("answer_end")
	private Boolean answerEnd;

	/** 
	 * 当次响应的唯一标识
	 */
	@ApiField("message_id")
	private String messageId;

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswer( ) {
		return this.answer;
	}

	public void setAnswerEnd(Boolean answerEnd) {
		this.answerEnd = answerEnd;
	}
	public Boolean getAnswerEnd( ) {
		return this.answerEnd;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessageId( ) {
		return this.messageId;
	}

}
