package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.antassistant.llm.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-25 11:46:53
 */
public class AlipayIserviceAntassistantLlmConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7114818215143218426L;

	/** 
	 * 当前会话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/** 
	 * 当前轮次返回的答案
	 */
	@ApiField("response")
	private String response;

	/** 
	 * 多轮会话唯一id
	 */
	@ApiField("session_id")
	private String sessionId;

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}
	public String getChatId( ) {
		return this.chatId;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	public String getResponse( ) {
		return this.response;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId( ) {
		return this.sessionId;
	}

}
