package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.operate response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 11:35:02
 */
public class AlipayMarketingCampaignDiscountOperateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4396193849426726527L;

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
