package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.operate response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 10:28:43
 */
public class AlipayMarketingCampaignDiscountOperateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2516994999176819627L;

	/** 
	 * 123
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
