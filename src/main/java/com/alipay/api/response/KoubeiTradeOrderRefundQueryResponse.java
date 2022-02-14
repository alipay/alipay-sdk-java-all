package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.order.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-03 14:49:26
 */
public class KoubeiTradeOrderRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6455223417384946861L;

	/** 
	 * 退款成功时间
	 */
	@ApiField("gmt_refund_time")
	private String gmtRefundTime;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 外部退款单号
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/** 
	 * 退款总金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 用户实退金额
	 */
	@ApiField("refund_buyer_amount")
	private String refundBuyerAmount;

	/** 
	 * 退平台优惠金额
	 */
	@ApiField("refund_discount_amount")
	private String refundDiscountAmount;

	/** 
	 * 退商家优惠金额
	 */
	@ApiField("refund_mdiscount_amount")
	private String refundMdiscountAmount;

	/** 
	 * 退款单状态 
SUCCESS - 成功
PROCESSING - 受理中
FAILED - 失败
	 */
	@ApiField("refund_status")
	private String refundStatus;

	public void setGmtRefundTime(String gmtRefundTime) {
		this.gmtRefundTime = gmtRefundTime;
	}
	public String getGmtRefundTime( ) {
		return this.gmtRefundTime;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}
	public String getOutRefundNo( ) {
		return this.outRefundNo;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundBuyerAmount(String refundBuyerAmount) {
		this.refundBuyerAmount = refundBuyerAmount;
	}
	public String getRefundBuyerAmount( ) {
		return this.refundBuyerAmount;
	}

	public void setRefundDiscountAmount(String refundDiscountAmount) {
		this.refundDiscountAmount = refundDiscountAmount;
	}
	public String getRefundDiscountAmount( ) {
		return this.refundDiscountAmount;
	}

	public void setRefundMdiscountAmount(String refundMdiscountAmount) {
		this.refundMdiscountAmount = refundMdiscountAmount;
	}
	public String getRefundMdiscountAmount( ) {
		return this.refundMdiscountAmount;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

}
