package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.aipay.apass.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-17 11:42:59
 */
public class AlipaySecurityAipayApassSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 1268721539814759579L;

	/** 
	 * agent注册的身份token，若为空则说明设备注册失败
	 */
	@ApiField("agent_token")
	private String agentToken;

	/** 
	 * 设备注册的身份token，若为空则说明设备注册失败
	 */
	@ApiField("device_token")
	private String deviceToken;

	public void setAgentToken(String agentToken) {
		this.agentToken = agentToken;
	}
	public String getAgentToken( ) {
		return this.agentToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}
	public String getDeviceToken( ) {
		return this.deviceToken;
	}

}
