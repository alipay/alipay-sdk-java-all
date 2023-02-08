package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.prizepool.prize.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:25:37
 */
public class AlipayMarketingCampaignPrizepoolPrizeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5272221996489758292L;

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
