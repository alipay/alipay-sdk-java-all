package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.activity.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:16:30
 */
public class AlipayMarketingToolFengdieActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7728858374234427415L;

	/** 
	 * H5应用的唯一id
	 */
	@ApiField("activity_id")
	private Long activityId;

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}
	public Long getActivityId( ) {
		return this.activityId;
	}

}
