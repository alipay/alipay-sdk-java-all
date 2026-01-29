package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PrizeConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.prizepool.prize.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-09 19:52:48
 */
public class AlipayMarketingCampaignPrizepoolPrizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4825682241238639389L;

	/** 
	 * 指定奖品id的详细配置
	 */
	@ApiField("prize_config")
	private PrizeConfig prizeConfig;

	public void setPrizeConfig(PrizeConfig prizeConfig) {
		this.prizeConfig = prizeConfig;
	}
	public PrizeConfig getPrizeConfig( ) {
		return this.prizeConfig;
	}

}
