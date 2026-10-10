package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.nowpaydirect.quota.verify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-29 11:17:55
 */
public class AlipayAipayNowpaydirectQuotaVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8618918521445556588L;

	/** 
	 * 原请求中的核销说明
	 */
	@ApiField("consume_reason")
	private String consumeReason;

	/** 
	 * 核销状态
	 */
	@ApiField("consume_status")
	private String consumeStatus;

	/** 
	 * 实际扣减
	 */
	@ApiField("consumed")
	private Long consumed;

	/** 
	 * 额度类型
	 */
	@ApiField("quota_unit")
	private String quotaUnit;

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
