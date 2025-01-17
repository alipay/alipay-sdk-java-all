package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 历史对话
 *
 * @author auto create
 * @since 1.0, 2024-08-26 15:49:51
 */
public class ChatHistory extends AlipayObject {

	private static final long serialVersionUID = 1222957546648591535L;

	/**
	 * 针对用户提问的回答
	 */
	@ApiField("answer")
	private String answer;

	/**
	 * 用户原始提问
	 */
	@ApiField("question")
	private String question;

	/**
	 * 单条会话历史的记录唯一ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 提问时间
	 */
	@ApiField("time")
	private String time;

	public String getAnswer() {
		return this.answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
