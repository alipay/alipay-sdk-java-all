package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrizeModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.prize.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 11:44:45
 */
public class MybankMarketingCampaignPrizeListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5443435562994765439L;

	/** 
	 * 奖品列表
	 */
	@ApiListField("prize_list")
	@ApiField("prize_model")
	private List<PrizeModel> prizeList;

	/** 
	 * 奖品总个数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setPrizeList(List<PrizeModel> prizeList) {
		this.prizeList = prizeList;
	}
	public List<PrizeModel> getPrizeList( ) {
		return this.prizeList;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
