package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrizeModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.prize.list.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:13:58
 */
public class MybankMarketingCampaignPrizeListConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5822818181877538766L;

	/** 
	 * 可用的奖品列表
	 */
	@ApiListField("prize_list")
	@ApiField("prize_model")
	private List<PrizeModel> prizeList;

	public void setPrizeList(List<PrizeModel> prizeList) {
		this.prizeList = prizeList;
	}
	public List<PrizeModel> getPrizeList( ) {
		return this.prizeList;
	}

}
