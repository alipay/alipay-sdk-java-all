package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefit.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-17 19:14:10
 */
public class AlipayCommerceRetailBenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7397851379665739533L;

	/** 
	 * 新建的活动id
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
