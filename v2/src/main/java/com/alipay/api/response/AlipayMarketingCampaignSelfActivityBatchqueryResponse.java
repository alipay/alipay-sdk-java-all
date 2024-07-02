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
 * @since 1.0, 2023-08-21 04:15:34
 */
public class AlipayMarketingCampaignSelfActivityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7169428294277484927L;

	/** 
	 * 活动列表
	 */
	@ApiListField("activity_list")
	@ApiField("marketing_activity_info")
	private List<MarketingActivityInfo> activityList;

	/** 
	 * 当前页数
	 */
	@ApiField("current_pages")
	private String currentPages;

	/** 
	 * 每页活动数
	 */
	@ApiField("items_per_page")
	private String itemsPerPage;

	/** 
	 * 返回总活动数
	 */
	@ApiField("total_items")
	private String totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private String totalPages;

	public void setActivityList(List<MarketingActivityInfo> activityList) {
		this.activityList = activityList;
	}
	public List<MarketingActivityInfo> getActivityList( ) {
		return this.activityList;
	}

	public void setCurrentPages(String currentPages) {
		this.currentPages = currentPages;
	}
	public String getCurrentPages( ) {
		return this.currentPages;
	}

	public void setItemsPerPage(String itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}
	public String getItemsPerPage( ) {
		return this.itemsPerPage;
	}

	public void setTotalItems(String totalItems) {
		this.totalItems = totalItems;
	}
	public String getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}
	public String getTotalPages( ) {
		return this.totalPages;
	}

}
