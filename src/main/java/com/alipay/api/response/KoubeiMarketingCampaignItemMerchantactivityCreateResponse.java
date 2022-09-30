package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.merchantactivity.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-19 15:11:30
 */
public class KoubeiMarketingCampaignItemMerchantactivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1774912615142454682L;

	/** 
	 * 运营活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

}
