package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsMktCampaignDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.campaign.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 09:49:45
 */
public class AlipayInsMarketingCampaignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1325158933379654278L;

	/** 
	 * 保险营销活动信息
	 */
	@ApiField("mkt_campaign")
	private InsMktCampaignDTO mktCampaign;

	public void setMktCampaign(InsMktCampaignDTO mktCampaign) {
		this.mktCampaign = mktCampaign;
	}
	public InsMktCampaignDTO getMktCampaign( ) {
		return this.mktCampaign;
	}

}
