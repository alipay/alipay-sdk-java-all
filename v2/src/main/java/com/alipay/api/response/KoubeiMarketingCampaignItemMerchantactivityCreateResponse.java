package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.merchantactivity.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:03:38
 */
public class KoubeiMarketingCampaignItemMerchantactivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4716472892228791652L;

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
