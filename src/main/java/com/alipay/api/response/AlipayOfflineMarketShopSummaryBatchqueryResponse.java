package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopSummaryQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.summary.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-07 22:50:01
 */
public class AlipayOfflineMarketShopSummaryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4317161977178164836L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private String currentPageNo;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 支付宝门店摘要信息列表
	 */
	@ApiListField("shop_summary_infos")
	@ApiField("shop_summary_query_response")
	private List<ShopSummaryQueryResponse> shopSummaryInfos;

	/** 
	 * 总记录数
	 */
	@ApiField("total_items")
	private String totalItems;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private String totalPageNo;

	public void setCurrentPageNo(String currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	public String getCurrentPageNo( ) {
		return this.currentPageNo;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setShopSummaryInfos(List<ShopSummaryQueryResponse> shopSummaryInfos) {
		this.shopSummaryInfos = shopSummaryInfos;
	}
	public List<ShopSummaryQueryResponse> getShopSummaryInfos( ) {
		return this.shopSummaryInfos;
	}

	public void setTotalItems(String totalItems) {
		this.totalItems = totalItems;
	}
	public String getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPageNo(String totalPageNo) {
		this.totalPageNo = totalPageNo;
	}
	public String getTotalPageNo( ) {
		return this.totalPageNo;
	}

}
