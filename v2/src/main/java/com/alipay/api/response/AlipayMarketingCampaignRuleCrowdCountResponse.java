package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.rule.crowd.count response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:21:59
 */
public class AlipayMarketingCampaignRuleCrowdCountResponse extends AlipayResponse {

	private static final long serialVersionUID = 8345935323485241135L;

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
