package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.booking.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-26 17:52:44
 */
public class AlipayCommerceLifeserviceBookingSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5444939629827457867L;

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
