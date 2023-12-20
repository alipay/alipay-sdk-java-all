package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.robot.session.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-06 10:11:02
 */
public class AlipayIserviceCcmRobotSessionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1534613872566958489L;

	/** 
	 * 会话id
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
