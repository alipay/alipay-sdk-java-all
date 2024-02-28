package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CashCampaignInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cash.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-12 06:59:53
 */
public class AlipayMarketingCampaignCashListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3783967358481521147L;

	/** 
	 * 活动列表
	 */
	@ApiListField("camp_list")
	@ApiField("cash_campaign_info")
	private List<CashCampaignInfo> campList;

	/** 
	 * 分页的页码,起始从1开始
	 */
	@ApiField("page_index")
	private String pageIndex;

	/** 
	 * 分页每页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 活动总个数
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setCampList(List<CashCampaignInfo> campList) {
		this.campList = campList;
	}
	public List<CashCampaignInfo> getCampList( ) {
		return this.campList;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}
	public String getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
