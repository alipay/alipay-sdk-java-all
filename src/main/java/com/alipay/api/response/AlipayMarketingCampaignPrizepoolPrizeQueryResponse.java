package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrizeConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.prizepool.prize.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-22 20:03:02
 */
public class AlipayMarketingCampaignPrizepoolPrizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1718923646225531337L;

	/** 
	 * 奖品列表
	 */
	@ApiListField("prize")
	@ApiField("prize_config")
	private List<PrizeConfig> prize;

	public void setPrize(List<PrizeConfig> prize) {
		this.prize = prize;
	}
	public List<PrizeConfig> getPrize( ) {
		return this.prize;
	}

}
