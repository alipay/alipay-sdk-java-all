package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.mall.event.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:34:08
 */
public class KoubeiMallEventSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2719539865547987756L;

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
