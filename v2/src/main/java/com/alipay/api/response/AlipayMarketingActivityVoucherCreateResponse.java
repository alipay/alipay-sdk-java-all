package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 21:21:37
 */
public class AlipayMarketingActivityVoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4166127161796253297L;

	/** 
	 * 活动id
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
