package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.merchantactivity.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:31:22
 */
public class KoubeiMarketingCampaignItemMerchantactivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5863847926191857677L;

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
