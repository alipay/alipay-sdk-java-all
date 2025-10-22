package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityPhase;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.cobrandcardactivity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-13 17:47:40
 */
public class AlipayCommerceTransportChargerCobrandcardactivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4185566883911738965L;

	/** 
	 * 活动编号
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 活动阶段
	 */
	@ApiListField("activity_phases")
	@ApiField("activity_phase")
	private List<ActivityPhase> activityPhases;

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

	public void setActivityPhases(List<ActivityPhase> activityPhases) {
		this.activityPhases = activityPhases;
	}
	public List<ActivityPhase> getActivityPhases( ) {
		return this.activityPhases;
	}

	public void setCurrentCount(Long currentCount) {
		this.currentCount = currentCount;
	}
	public Long getCurrentCount( ) {
		return this.currentCount;
	}

}
