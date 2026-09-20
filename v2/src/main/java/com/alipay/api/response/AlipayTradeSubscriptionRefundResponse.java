package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.subscription.refund response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-11 14:07:53
 */
public class AlipayTradeSubscriptionRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6246463149124477434L;

	/** 
	 * 商户退款请求号，与请求参数中的商户退款请求号一致
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 本次申请的退款金额，单位为分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/** 
	 * 支付宝订阅退款业务单号，可用于关联退款结果通知
	 */
	@ApiField("refund_order_id")
	private String refundOrderId;

	/** 
	 * 退款状态：
PENDING - 待处理；
PROCESSING - 退款处理中；
SUCCESS - 退款成功；
PARTIAL_SUCCESS - 部分退款成功；
FAILED - 退款失败
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 订阅ID
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	/** 
	 * 本次退款对应的支付宝原交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}
	public Long getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundOrderId(String refundOrderId) {
		this.refundOrderId = refundOrderId;
	}
	public String getRefundOrderId( ) {
		return this.refundOrderId;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getSubscriptionId( ) {
		return this.subscriptionId;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
