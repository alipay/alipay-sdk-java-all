package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.activity.discount.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-01 20:32:41
 */
public class AlipayCommerceEcActivityDiscountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4814787926796445165L;

	/** 
	 * 企业码立减活动ID
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
