package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.sku.campaign.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 16:27:46
 */
public class AnttechNftSkuCampaignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4533657342741955814L;

	/** 
	 * 活动Id
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
