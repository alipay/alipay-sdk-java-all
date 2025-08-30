package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ActivityPhase;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.cobrandcardactivity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-08 11:17:37
 */
public class AlipayCommerceTransportChargerCobrandcardactivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4737875698657283144L;

	/** 
	 * 活动编号
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 活动阶段
	 */
	@ApiField("activity_phases")
	private ActivityPhase activityPhases;

	/** 
	 * 当前查询用户完成的订单笔数
	 */
	@ApiField("current_count")
	private Long currentCount;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setActivityPhases(ActivityPhase activityPhases) {
		this.activityPhases = activityPhases;
	}
	public ActivityPhase getActivityPhases( ) {
		return this.activityPhases;
	}

	public void setCurrentCount(Long currentCount) {
		this.currentCount = currentCount;
	}
	public Long getCurrentCount( ) {
		return this.currentCount;
	}

}
