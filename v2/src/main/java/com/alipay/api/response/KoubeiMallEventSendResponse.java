package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.mall.event.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:18:46
 */
public class KoubeiMallEventSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5881938517741219897L;

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
