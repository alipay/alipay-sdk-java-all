package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.activity.appitemvoucher.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-03 10:30:32
 */
public class AlipayMarketingToolActivityAppitemvoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7377414837782395296L;

	/** 
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

}
