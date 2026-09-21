package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Doctors;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.advisoragent.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-14 17:22:35
 */
public class AlipayCommerceMedicalAdvisoragentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2714789475659542715L;

	/** 
	 * 对话ID，传递本次场景交互的唯一对话ID
	 */
	@ApiField("chat_id")
	private String chatId;

	/** 
	 * 医生推荐列表
	 */
	@ApiField("doctors")
	private Doctors doctors;

	/** 
	 * 会话ID，传递本次交互的唯一会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	/** 
	 * 建议列表
	 */
	@ApiField("suggestions")
	private String suggestions;

	/** 
	 * 回复内容
	 */
	@ApiField("text")
	private String text;

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}
	public String getChatId( ) {
		return this.chatId;
	}

	public void setDoctors(Doctors doctors) {
		this.doctors = doctors;
	}
	public Doctors getDoctors( ) {
		return this.doctors;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId( ) {
		return this.sessionId;
	}

	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}
	public String getSuggestions( ) {
		return this.suggestions;
	}

	public void setText(String text) {
		this.text = text;
	}
	public String getText( ) {
		return this.text;
	}

}
