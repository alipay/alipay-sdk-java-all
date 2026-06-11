package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.expressway.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-28 20:52:48
 */
public class AlipayCommerceTransportExpresswayRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6348379127991699188L;

	/** 
	 * 外部退款流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 路网侧扣款行程单号
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
