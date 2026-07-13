package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.subscription.estimatedrefund.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-20 10:57:44
 */
public class AlipayTradeSubscriptionEstimatedrefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3816336542942918726L;

	/** 
	 * 预计退款金额，仅当可退款时返回，其他状态不返回
	 */
	@ApiField("estimated_refund_amount")
	private Long estimatedRefundAmount;

	/** 
	 * true - 可以退款；
false - 不可退款
	 */
	@ApiField("refundable")
	private Boolean refundable;

	/** 
	 * 订阅id
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	/** 
	 * 订阅zhua
	 */
	@ApiField("subscription_status")
	private String subscriptionStatus;

	public void setEstimatedRefundAmount(Long estimatedRefundAmount) {
		this.estimatedRefundAmount = estimatedRefundAmount;
	}
	public Long getEstimatedRefundAmount( ) {
		return this.estimatedRefundAmount;
	}

	public void setRefundable(Boolean refundable) {
		this.refundable = refundable;
	}
	public Boolean getRefundable( ) {
		return this.refundable;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getSubscriptionId( ) {
		return this.subscriptionId;
	}

	public void setSubscriptionStatus(String subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}
	public String getSubscriptionStatus( ) {
		return this.subscriptionStatus;
	}

}
