package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.bot.session.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-31 11:07:03
 */
public class AlipayEbppIndustryBotSessionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6575715152318589448L;

	/** 
	 * 会话id。创建会话接口后返回的会话id，有效期10分钟。若10分钟内用户没有对话请求，会话id自动失效。
	 */
	@ApiField("session_id")
	private String sessionId;

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId( ) {
		return this.sessionId;
	}

}
