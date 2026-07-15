package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.voice.event.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:33
 */
public class AlipayCommerceLogisticsVoiceEventTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 7868482186663999437L;

	/** 
	 * 本次事件触发的唯一标识
	 */
	@ApiField("trigger_id")
	private String triggerId;

	public void setTriggerId(String triggerId) {
		this.triggerId = triggerId;
	}
	public String getTriggerId( ) {
		return this.triggerId;
	}

}
