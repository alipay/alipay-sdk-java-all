package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.campaign.qualification.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayInsSceneCampaignQualificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5443526149948333687L;

	/** 
	 * 可以参加的活动的ID
	 */
	@ApiField("campaign_id")
	private String campaignId;

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignId( ) {
		return this.campaignId;
	}

}
