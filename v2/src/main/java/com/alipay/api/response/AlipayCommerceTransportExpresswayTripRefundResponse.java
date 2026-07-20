package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.expressway.trip.refund response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-28 22:02:47
 */
public class AlipayCommerceTransportExpresswayTripRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7532777417667813216L;

	/** 
	 * 标识一次退款请求，同一笔交易多次退款需要保证唯一
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 路网侧扣款行程单号： 1、需要与真实的扣款行程对应 2、路网侧全国车牌付场景下唯一
	 */
	@ApiField("out_trip_id")
	private String outTripId;

	/** 
	 * 本次需要退款的金额： 1、单位为元； 2、该金额不能大于行程扣款的金额； 3、支持两位小数；
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 退款状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 退款完成时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setOutTripId(String outTripId) {
		this.outTripId = outTripId;
	}
	public String getOutTripId( ) {
		return this.outTripId;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}
	public Date getRefundTime( ) {
		return this.refundTime;
	}

}
