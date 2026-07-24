package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ActivityPeriodInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promo.activityperiod.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-29 15:02:56
 */
public class AlipayCommerceOperationPromoActivityperiodQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8667949654652264291L;

	/** 
	 * 当前在途活动
	 */
	@ApiField("current_activity")
	private ActivityPeriodInfo currentActivity;

	/** 
	 * 下一期活动
	 */
	@ApiField("next_activity")
	private ActivityPeriodInfo nextActivity;

	public void setCurrentActivity(ActivityPeriodInfo currentActivity) {
		this.currentActivity = currentActivity;
	}
	public ActivityPeriodInfo getCurrentActivity( ) {
		return this.currentActivity;
	}

	public void setNextActivity(ActivityPeriodInfo nextActivity) {
		this.nextActivity = nextActivity;
	}
	public ActivityPeriodInfo getNextActivity( ) {
		return this.nextActivity;
	}

}
