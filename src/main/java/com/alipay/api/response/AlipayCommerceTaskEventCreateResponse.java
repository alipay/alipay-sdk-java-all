package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.task.event.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-31 14:26:40
 */
public class AlipayCommerceTaskEventCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6359682983344414241L;

	/** 
	 * 模版id
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
