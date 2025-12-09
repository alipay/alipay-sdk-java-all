package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.callcontainer.session.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:27
 */
public class AlipayCloudCloudrunCallcontainerSessionApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1692943911134631513L;

	/** 
	 * 单次会话ID，后续都需要传递，如果超时了需要新申请
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
