package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.session.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 10:37:02
 */
public class AntfortuneFinresearchSessionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7263535261697469987L;

	/** 
	 * 新建会话成功之后返回的会话id，后续可以使用这个id进行提问题
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
