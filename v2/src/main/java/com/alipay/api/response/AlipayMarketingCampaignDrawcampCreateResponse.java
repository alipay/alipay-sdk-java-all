package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:33:35
 */
public class AlipayMarketingCampaignDrawcampCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6735196323823315239L;

	/** 
	 * 抽奖活动id
	 */
	@ApiField("camp_id")
	private String campId;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

}
