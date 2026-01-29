package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefit.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 15:47:41
 */
public class AlipayCommerceRetailBenefitSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 1542438848654187551L;

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
