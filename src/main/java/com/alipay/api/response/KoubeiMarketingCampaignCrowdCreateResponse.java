package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-24 14:39:25
 */
public class KoubeiMarketingCampaignCrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7557451692555987128L;

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
