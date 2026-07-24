package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.house.bizentity.set response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-16 10:17:56
 */
public class AlipayCommerceRentHouseBizentitySetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5744911952733983339L;

	/** 
	 * 特性id
	 */
	@ApiField("feature_id")
	private String featureId;

	public void setFeatureId(String featureId) {
		this.featureId = featureId;
	}
	public String getFeatureId( ) {
		return this.featureId;
	}

}
