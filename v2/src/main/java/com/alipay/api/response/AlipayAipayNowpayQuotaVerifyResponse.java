package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.nowpay.quota.verify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-02 00:47:51
 */
public class AlipayAipayNowpayQuotaVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5647495621365823466L;

	/** 
	 * 消费流水标识
	 */
	@ApiField("consume_order_id")
	private String consumeOrderId;

	/** 
	 * 原请求中的消费原因
	 */
	@ApiField("consume_reason")
	private String consumeReason;

	/** 
	 * SUCCEEDED/FAILED/PROCESSING
	 */
	@ApiField("consume_status")
	private String consumeStatus;

	/** 
	 * 实际扣减；未成功为 0，，单位次数或积分
	 */
	@ApiField("consumed")
	private Long consumed;

	/** 
	 * 次数或积分，COUNT/POINT
	 */
	@ApiField("quota_unit")
	private String quotaUnit;

	/** 
	 * 如 INSUFFICIENT_QUOTA/QUOTA_UNAVAILABLE
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/** 
	 * SUCCEEDED 时返回本次原子扣减后的可消费余额，单位次数或积分
	 */
	@ApiField("remaining")
	private Long remaining;

	/** 
	 * 更新时间
	 */
	@ApiField("update_time")
	private String updateTime;

	public void setConsumeOrderId(String consumeOrderId) {
		this.consumeOrderId = consumeOrderId;
	}
	public String getConsumeOrderId( ) {
		return this.consumeOrderId;
	}

	public void setConsumeReason(String consumeReason) {
		this.consumeReason = consumeReason;
	}
	public String getConsumeReason( ) {
		return this.consumeReason;
	}

	public void setConsumeStatus(String consumeStatus) {
		this.consumeStatus = consumeStatus;
	}
	public String getConsumeStatus( ) {
		return this.consumeStatus;
	}

	public void setConsumed(Long consumed) {
		this.consumed = consumed;
	}
	public Long getConsumed( ) {
		return this.consumed;
	}

	public void setQuotaUnit(String quotaUnit) {
		this.quotaUnit = quotaUnit;
	}
	public String getQuotaUnit( ) {
		return this.quotaUnit;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getReasonCode( ) {
		return this.reasonCode;
	}

	public void setRemaining(Long remaining) {
		this.remaining = remaining;
	}
	public Long getRemaining( ) {
		return this.remaining;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateTime( ) {
		return this.updateTime;
	}

}
