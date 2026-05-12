package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-29 14:47:45
 */
public class ChargerDiscountActivityQuota extends AlipayObject {

	private static final long serialVersionUID = 3852652995283757836L;

	/**
	 * 周期类型
	 */
	@ApiField("period_type")
	private String periodType;

	/**
	 * 用户在周期内剩余可参加活动的次数
	 */
	@ApiField("remaining_count")
	private Long remainingCount;

	/**
	 * 用户在周期内可参加活动的总次数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 用户在周期内已参数活动的次数
	 */
	@ApiField("used_count")
	private Long usedCount;

	public String getPeriodType() {
		return this.periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

	public Long getRemainingCount() {
		return this.remainingCount;
	}
	public void setRemainingCount(Long remainingCount) {
		this.remainingCount = remainingCount;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getUsedCount() {
		return this.usedCount;
	}
	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

}
