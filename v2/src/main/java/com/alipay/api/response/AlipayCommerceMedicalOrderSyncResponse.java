package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-04 11:27:53
 */
public class AlipayCommerceMedicalOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3595834759127914939L;

	/** 
	 * 订单回流事件ID
	 */
	@ApiField("event_id")
	private String eventId;

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventId( ) {
		return this.eventId;
	}

}
