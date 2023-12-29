package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.prizepool.prize.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:03:14
 */
public class AlipayMarketingCampaignPrizepoolPrizeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8846478798669184839L;

	/** 
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}
	public String getPrizeId( ) {
		return this.prizeId;
	}

}
