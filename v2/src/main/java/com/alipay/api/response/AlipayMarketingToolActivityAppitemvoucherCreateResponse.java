package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.activity.appitemvoucher.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 20:32:06
 */
public class AlipayMarketingToolActivityAppitemvoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8173886984241159391L;

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
