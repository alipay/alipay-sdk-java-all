package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.activity.appitemvoucher.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 20:32:06
 */
public class AlipayMarketingToolActivityAppitemvoucherModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2546918114314389227L;

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
