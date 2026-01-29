package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动优惠时间信息
 *
 * @author auto create
 * @since 1.0, 2025-12-01 20:27:41
 */
public class ActivityPromotionDuration extends AlipayObject {

	private static final long serialVersionUID = 2497987717876498464L;

	/**
	 * 参数allowed_days表示允许的星期枚举集合，取值范围为星期至星期日，共7个明确的枚举值。
	 */
	@ApiListField("allowed_days")
	@ApiField("string")
	private List<String> allowedDays;

	/**
	 * 允许的时间集合
	 */
	@ApiListField("allowed_times")
	@ApiField("activity_time_range")
	private List<ActivityTimeRange> allowedTimes;

	/**
	 * 活动时间限制类型
	 */
	@ApiField("limit_type")
	private String limitType;

	public List<String> getAllowedDays() {
		return this.allowedDays;
	}
	public void setAllowedDays(List<String> allowedDays) {
		this.allowedDays = allowedDays;
	}

	public List<ActivityTimeRange> getAllowedTimes() {
		return this.allowedTimes;
	}
	public void setAllowedTimes(List<ActivityTimeRange> allowedTimes) {
		this.allowedTimes = allowedTimes;
	}

	public String getLimitType() {
		return this.limitType;
	}
	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

}
