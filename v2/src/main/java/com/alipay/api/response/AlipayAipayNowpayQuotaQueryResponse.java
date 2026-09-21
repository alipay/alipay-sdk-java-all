package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.nowpay.quota.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-02 00:47:52
 */
public class AlipayAipayNowpayQuotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6231211367217714912L;

	/** 
	 * 余额计算时间
	 */
	@ApiField("as_of_time")
	private String asOfTime;

	/** 
	 * 次数或积分COUNT/POINT
	 */
	@ApiField("quota_unit")
	private String quotaUnit;

	/** 
	 * 当前可消费余额，单位次数或积分个数
	 */
	@ApiField("remaining")
	private Long remaining;

	/** 
	 * 当前纳入聚合的有效发放额度，单位次数或积分个数
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 上述有效发放额度中的已使用量,单位次数或积分个数
	 */
	@ApiField("used")
	private Long used;

	public void setAsOfTime(String asOfTime) {
		this.asOfTime = asOfTime;
	}
	public String getAsOfTime( ) {
		return this.asOfTime;
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

	public void setUsed(Long used) {
		this.used = used;
	}
	public Long getUsed( ) {
		return this.used;
	}

}
