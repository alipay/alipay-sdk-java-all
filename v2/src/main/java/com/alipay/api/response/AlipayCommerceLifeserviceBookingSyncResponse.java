package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.booking.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-22 10:32:55
 */
public class AlipayCommerceLifeserviceBookingSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5564623525813779499L;

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
