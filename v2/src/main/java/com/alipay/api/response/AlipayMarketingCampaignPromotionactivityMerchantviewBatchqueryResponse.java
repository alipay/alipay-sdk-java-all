package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MarketActivityInfo;
import com.alipay.api.domain.Paginator;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.promotionactivity.merchantview.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 03:58:08
 */
public class AlipayMarketingCampaignPromotionactivityMerchantviewBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2864391611335951627L;

	/** 
	 * 活动列表
	 */
	@ApiListField("activities")
	@ApiField("market_activity_info")
	private List<MarketActivityInfo> activities;

	/** 
	 * 分页器
	 */
	@ApiField("paginator")
	private Paginator paginator;

	public void setActivities(List<MarketActivityInfo> activities) {
		this.activities = activities;
	}
	public List<MarketActivityInfo> getActivities( ) {
		return this.activities;
	}

	public void setPaginator(Paginator paginator) {
		this.paginator = paginator;
	}
	public Paginator getPaginator( ) {
		return this.paginator;
	}

}
