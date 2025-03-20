package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BotAnswer;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.bot.session.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-25 10:57:25
 */
public class AlipayEbppIndustryBotSessionConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7552939464473783227L;

	/** 
	 * 机器人对话问答的回复
	 */
	@ApiField("answer")
	private BotAnswer answer;

	/** 
	 * 对话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/** 
	 * 机器人会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	public void setAnswer(BotAnswer answer) {
		this.answer = answer;
	}
	public BotAnswer getAnswer( ) {
		return this.answer;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}
	public String getChatId( ) {
		return this.chatId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId( ) {
		return this.sessionId;
	}

}
