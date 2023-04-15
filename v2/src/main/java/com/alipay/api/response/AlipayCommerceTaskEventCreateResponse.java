package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.task.event.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:45:09
 */
public class AlipayCommerceTaskEventCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5754918456672727978L;

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
