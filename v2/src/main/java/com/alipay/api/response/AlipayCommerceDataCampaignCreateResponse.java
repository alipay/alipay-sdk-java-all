package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.campaign.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 23:39:32
 */
public class AlipayCommerceDataCampaignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8563698924858153177L;

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
