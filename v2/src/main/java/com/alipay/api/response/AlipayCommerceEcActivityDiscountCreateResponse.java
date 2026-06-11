package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.activity.discount.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-11 17:03:20
 */
public class AlipayCommerceEcActivityDiscountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2864214853213115317L;

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
