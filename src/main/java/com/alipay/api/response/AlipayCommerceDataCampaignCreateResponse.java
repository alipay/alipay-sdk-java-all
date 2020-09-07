package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.campaign.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-13 14:06:53
 */
public class AlipayCommerceDataCampaignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6512973491663345225L;

	/** 
	 * 集点活动id
	 */
	@ApiField("camp_id")
	private String campId;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

}
