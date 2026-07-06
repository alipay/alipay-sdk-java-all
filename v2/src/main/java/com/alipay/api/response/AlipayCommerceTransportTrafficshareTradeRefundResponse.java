package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.trafficshare.trade.refund response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-28 21:22:42
 */
public class AlipayCommerceTransportTrafficshareTradeRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5343219247711763879L;

	/** 
	 * 平台订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商户订单号
	 */
	@ApiField("schedule_id")
	private String scheduleId;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getScheduleId( ) {
		return this.scheduleId;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
