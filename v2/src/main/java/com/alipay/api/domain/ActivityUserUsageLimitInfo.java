package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定义用户使用活动的限制信息，如用户类型、时间类型等
 *
 * @author auto create
 * @since 1.0, 2025-12-01 20:27:41
 */
public class ActivityUserUsageLimitInfo extends AlipayObject {

	private static final long serialVersionUID = 6268935255227963189L;

	/**
	 * 限制活动的可用次数
	 */
	@ApiField("limit_count")
	private String limitCount;

	/**
	 * 用户使用限制
	 */
	@ApiField("limit_type")
	private String limitType;

	/**
	 * 可用的用户类型
	 */
	@ApiField("usage_rule_type")
	private String usageRuleType;

	/**
	 * 可用的时间类型
	 */
	@ApiField("usage_time_type")
	private String usageTimeType;

	public String getLimitCount() {
		return this.limitCount;
	}
	public void setLimitCount(String limitCount) {
		this.limitCount = limitCount;
	}

	public String getLimitType() {
		return this.limitType;
	}
	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

	public String getUsageRuleType() {
		return this.usageRuleType;
	}
	public void setUsageRuleType(String usageRuleType) {
		this.usageRuleType = usageRuleType;
	}

	public String getUsageTimeType() {
		return this.usageTimeType;
	}
	public void setUsageTimeType(String usageTimeType) {
		this.usageTimeType = usageTimeType;
	}

}
