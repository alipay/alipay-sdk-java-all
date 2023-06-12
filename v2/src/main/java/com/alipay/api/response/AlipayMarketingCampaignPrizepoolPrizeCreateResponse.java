package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.prizepool.prize.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:03:56
 */
public class AlipayMarketingCampaignPrizepoolPrizeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7185794831139169117L;

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
