package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantOnlineActivityOpenModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.merchantactivity.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:29:27
 */
public class KoubeiMarketingCampaignItemMerchantactivityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3852612919668874966L;

	/** 
	 * 活动信息
	 */
	@ApiListField("activities")
	@ApiField("merchant_online_activity_open_model")
	private List<MerchantOnlineActivityOpenModel> activities;

	public void setActivities(List<MerchantOnlineActivityOpenModel> activities) {
		this.activities = activities;
	}
	public List<MerchantOnlineActivityOpenModel> getActivities( ) {
		return this.activities;
	}

}
