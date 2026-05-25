package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.expressway.trip.close response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-21 14:32:45
 */
public class AlipayCommerceTransportExpresswayTripCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8122272429616486423L;

	/** 
	 * 路网侧扣款行程单号
	 */
	@ApiField("out_trip_id")
	private String outTripId;

	/** 
	 * 交易状态
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setOutTripId(String outTripId) {
		this.outTripId = outTripId;
	}
	public String getOutTripId( ) {
		return this.outTripId;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
