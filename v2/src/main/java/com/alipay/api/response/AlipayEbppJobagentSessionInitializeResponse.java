package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jobagent.session.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-08 16:42:54
 */
public class AlipayEbppJobagentSessionInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8496897292129612845L;

	/** 
	 * 初始化后的会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/** 
	 * 对话开场白
	 */
	@ApiField("welcome_speech")
	private String welcomeSpeech;

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId( ) {
		return this.sessionId;
	}

	public void setWelcomeSpeech(String welcomeSpeech) {
		this.welcomeSpeech = welcomeSpeech;
	}
	public String getWelcomeSpeech( ) {
		return this.welcomeSpeech;
	}

}
