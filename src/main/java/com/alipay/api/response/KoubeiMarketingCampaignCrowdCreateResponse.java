package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-07-26 14:03:29
 */
public class KoubeiMarketingCampaignCrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1536527754386275596L;

	/** 
	 * 返回的人群组的唯一标识
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}
	public String getCrowdGroupId( ) {
		return this.crowdGroupId;
	}

}
