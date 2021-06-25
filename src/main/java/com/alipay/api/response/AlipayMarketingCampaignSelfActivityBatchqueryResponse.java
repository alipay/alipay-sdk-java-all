package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MarketingActivityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.self.activity.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-24 14:31:09
 */
public class AlipayMarketingCampaignSelfActivityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3174145193215512186L;

	/** 
	 * 活动列表
	 */
	@ApiListField("activity_list")
	@ApiField("marketing_activity_info")
	private List<MarketingActivityInfo> activityList;

	public void setActivityList(List<MarketingActivityInfo> activityList) {
		this.activityList = activityList;
	}
	public List<MarketingActivityInfo> getActivityList( ) {
		return this.activityList;
	}

}
