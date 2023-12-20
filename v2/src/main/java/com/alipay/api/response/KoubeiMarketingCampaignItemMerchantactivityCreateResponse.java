package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.merchantactivity.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:13:46
 */
public class KoubeiMarketingCampaignItemMerchantactivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6398715468484675726L;

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
