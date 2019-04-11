package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ActivityParticipation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.activity.participation.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-14 20:58:23
 */
public class ZhimaMerchantActivityParticipationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6361211769949513455L;

	/** 
	 * 用户参加活动模型
	 */
	@ApiField("activity_participation")
	private ActivityParticipation activityParticipation;

	public void setActivityParticipation(ActivityParticipation activityParticipation) {
		this.activityParticipation = activityParticipation;
	}
	public ActivityParticipation getActivityParticipation( ) {
		return this.activityParticipation;
	}

}
