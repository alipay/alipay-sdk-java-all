package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.trip.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-08 15:17:55
 */
public class AlipayCommerceTransportTaxiTripUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5534511175268742163L;

	/** 
	 * 写入tripId-可以无视返回结果
	 */
	@ApiField("trip_id")
	private String tripId;

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}
	public String getTripId( ) {
		return this.tripId;
	}

}
