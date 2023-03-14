package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.mall.event.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 23:57:06
 */
public class KoubeiMallEventSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2316676294337254678L;

	/** 
	 * 事件ID
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
