package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.rule.crowd.count response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:57:42
 */
public class AlipayMarketingCampaignRuleCrowdCountResponse extends AlipayResponse {

	private static final long serialVersionUID = 2421197739923695797L;

	/** 
	 * 统计规则或标签所圈定的人群数目
	 */
	@ApiField("crowdcount")
	private String crowdcount;

	public void setCrowdcount(String crowdcount) {
		this.crowdcount = crowdcount;
	}
	public String getCrowdcount( ) {
		return this.crowdcount;
	}

}
