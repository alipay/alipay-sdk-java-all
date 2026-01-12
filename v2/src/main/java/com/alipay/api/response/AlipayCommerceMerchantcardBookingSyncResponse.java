package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.booking.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-03 10:27:43
 */
public class AlipayCommerceMerchantcardBookingSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4129758381453135668L;

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
