package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.nowpaydirect.quota.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-29 11:12:56
 */
public class AlipayAipayNowpaydirectQuotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6495838746458338164L;

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
	 * 剩余额度
	 */
	@ApiField("remaining")
	private Long remaining;

	/** 
	 * 已发放总额度
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 已使用总额度
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
