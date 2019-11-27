package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.activity.discard.creaa response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMarketingCampaignActivityDiscardCreaaResponse extends AlipayResponse {

	private static final long serialVersionUID = 5779837487451752923L;

	/** 
	 * 创建成功的活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 创建成功的券模版id
	 */
	@ApiField("prize_id")
	private String prizeId;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}
	public String getPrizeId( ) {
		return this.prizeId;
	}

}
