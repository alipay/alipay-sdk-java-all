package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.order.aggregate.refund response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-03 14:48:58
 */
public class KoubeiTradeOrderAggregateRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7466824674351482269L;

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
	 * PROCESSING - 退款处理中
FAILED - 退款失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 外部订单号；
同一商户下必须唯一，用来控制幂等
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 外部退款单号	；
同一商户下必须唯一，用来控制幂等
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/** 
	 * 实收金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 用户实付金额
	 */
	@ApiField("refund_buyer_amount")
	private String refundBuyerAmount;

	/** 
	 * 平台优惠金额
	 */
	@ApiField("refund_discount_amount")
	private String refundDiscountAmount;

	/** 
	 * 商家优惠金额
	 */
	@ApiField("refund_mdiscount_amount")
	private String refundMdiscountAmount;

	/** 
	 * 口碑退款单ID
	 */
	@ApiField("refund_order_id")
	private String refundOrderId;

	/** 
	 * 实际退款金额
	 */
	@ApiField("refund_real_amount")
	private String refundRealAmount;

	/** 
	 * 支付宝/微信交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

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

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
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

	public void setRefundOrderId(String refundOrderId) {
		this.refundOrderId = refundOrderId;
	}
	public String getRefundOrderId( ) {
		return this.refundOrderId;
	}

	public void setRefundRealAmount(String refundRealAmount) {
		this.refundRealAmount = refundRealAmount;
	}
	public String getRefundRealAmount( ) {
		return this.refundRealAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
