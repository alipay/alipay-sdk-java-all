package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ReplyPayload;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.ai.agent.chat response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-12 14:12:27
 */
public class AlipayOpenAiAgentChatResponse extends AlipayResponse {

	private static final long serialVersionUID = 6431593128186472131L;

	/** 
	 * 对话返回事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/** 
	 * 对话返回体
	 */
	@ApiField("payloads")
	private ReplyPayload payloads;

	/** 
	 * 返回对话顺序。不同content类型，顺序会重置。
	 */
	@ApiField("turn")
	private String turn;

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventType( ) {
		return this.eventType;
	}

	public void setPayloads(ReplyPayload payloads) {
		this.payloads = payloads;
	}
	public ReplyPayload getPayloads( ) {
		return this.payloads;
	}

	public void setTurn(String turn) {
		this.turn = turn;
	}
	public String getTurn( ) {
		return this.turn;
	}

}
