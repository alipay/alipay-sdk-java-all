package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lease.plan.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:31:44
 */
public class AlipayCommerceLeasePlanPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 7249562498548436382L;

	/** 
	 * 租赁计划id
	 */
	@ApiField("plan_id")
	private String planId;

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanId( ) {
		return this.planId;
	}

}
