package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.booking.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-28 16:47:42
 */
public class AlipayCommerceLifeserviceBookingSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2568522765573429118L;

	/** 
	 * 预约单id
	 */
	@ApiField("booking_id")
	private String bookingId;

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingId( ) {
		return this.bookingId;
	}

}
