package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.subscription.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-25 22:12:45
 */
public class AlipayTradeSubscriptionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4357466465974578426L;

	/** 
	 * 长链，适用于跳转拉起支付宝端，升级/降级/取消后撤销场景会返回
	 */
	@ApiField("alipay_jump_schema")
	private String alipayJumpSchema;

	/** 
	 * 短链，适用于生成二维码
升级/降级/取消后撤销场景会返回
	 */
	@ApiField("alipay_schema")
	private String alipaySchema;

	/** 
	 * 升级订阅时生成的支付请求单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付金额，单位分
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/** 
	 * 订阅修改时若传入优惠，生成的优惠信息
	 */
	@ApiField("promotion_info")
	private String promotionInfo;

	/** 
	 * 退款金额，单位分，取消并退款场景下生成
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/** 
	 * 退款业务单号，取消并退款场景下生成
	 */
	@ApiField("refund_order_id")
	private String refundOrderId;

	/** 
	 * 订阅id，订阅唯一标识
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	public void setAlipayJumpSchema(String alipayJumpSchema) {
		this.alipayJumpSchema = alipayJumpSchema;
	}
	public String getAlipayJumpSchema( ) {
		return this.alipayJumpSchema;
	}

	public void setAlipaySchema(String alipaySchema) {
		this.alipaySchema = alipaySchema;
	}
	public String getAlipaySchema( ) {
		return this.alipaySchema;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}
	public Long getPayAmount( ) {
		return this.payAmount;
	}

	public void setPromotionInfo(String promotionInfo) {
		this.promotionInfo = promotionInfo;
	}
	public String getPromotionInfo( ) {
		return this.promotionInfo;
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

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getSubscriptionId( ) {
		return this.subscriptionId;
	}

}
