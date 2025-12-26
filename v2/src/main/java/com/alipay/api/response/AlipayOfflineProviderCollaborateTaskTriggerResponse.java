package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.task.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-10 13:52:23
 */
public class AlipayOfflineProviderCollaborateTaskTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 4251788583261797139L;

	/** 
	 * 代表一次呼叫的唯一id
	 */
	@ApiField("call_id")
	private String callId;

	/** 
	 * true:允许变更呼叫方式，允许服务商在意图确认接口，通过反馈UN_ANSWERED拿到商户具体的联系方式。
false:默认值
	 */
	@ApiField("call_transfer")
	private Boolean callTransfer;

	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getCallId( ) {
		return this.callId;
	}

	public void setCallTransfer(Boolean callTransfer) {
		this.callTransfer = callTransfer;
	}
	public Boolean getCallTransfer( ) {
		return this.callTransfer;
	}

}
