package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefitmaterial.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 15:47:42
 */
public class AlipayCommerceRetailBenefitmaterialCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2687419288762468225L;

	/** 
	 * 素材id
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
