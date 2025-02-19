package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.task.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-18 11:12:22
 */
public class AlipayOfflineProviderCollaborateTaskTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 5154288611697325275L;

	/** 
	 * 代表一次呼叫的唯一id
	 */
	@ApiField("call_id")
	private String callId;

	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getCallId( ) {
		return this.callId;
	}

}
