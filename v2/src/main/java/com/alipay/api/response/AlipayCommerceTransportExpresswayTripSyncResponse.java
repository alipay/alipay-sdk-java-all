package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.expressway.trip.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-12 10:02:59
 */
public class AlipayCommerceTransportExpresswayTripSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7385528192392864233L;

	/** 
	 * 路网侧唯一高速行程单号
	 */
	@ApiField("out_trip_id")
	private String outTripId;

	/** 
	 * 支付宝侧高速行程单号
	 */
	@ApiField("trip_id")
	private String tripId;

	public void setOutTripId(String outTripId) {
		this.outTripId = outTripId;
	}
	public String getOutTripId( ) {
		return this.outTripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}
	public String getTripId( ) {
		return this.tripId;
	}

}
