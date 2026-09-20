package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.expressway.cardtrip.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-24 14:27:51
 */
public class AlipayCommerceTransportExpresswayCardtripSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3275992763354211421L;

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
