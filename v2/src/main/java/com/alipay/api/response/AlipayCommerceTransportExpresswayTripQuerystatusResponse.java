package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.expressway.trip.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-28 20:52:48
 */
public class AlipayCommerceTransportExpresswayTripQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 2871866324632361636L;

	/** 
	 * 路网侧扣款行程单号： 1、需要与真实的扣款行程对应 2、路网侧全国车牌付场景下唯一
	 */
	@ApiField("out_trip_id")
	private String outTripId;

	/** 
	 * 交易支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/** 
	 * 行程需扣费金额，单位人民币元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号，只有交易支付成功后才会返回
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 行程扣款状态
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/** 
	 * 支付宝侧行程Id
	 */
	@ApiField("trip_id")
	private String tripId;

	public void setOutTripId(String outTripId) {
		this.outTripId = outTripId;
	}
	public String getOutTripId( ) {
		return this.outTripId;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getPayTime( ) {
		return this.payTime;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}
	public String getTripId( ) {
		return this.tripId;
	}

}
