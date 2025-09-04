package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.user.voucher.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:52:41
 */
public class AlipayMarketingCampaignUserVoucherBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6369953298576511169L;

	/** 
	 * 当面页数
	 */
	@ApiField("current_pages")
	private String currentPages;

	/** 
	 * 每页条数
	 */
	@ApiField("items_per_page")
	private String itemsPerPage;

	/** 
	 * 返回总条目数
	 */
	@ApiField("total_items")
	private String totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private String totalPages;

	/** 
	 * 券详情列表
	 */
	@ApiListField("voucher_item_list")
	@ApiField("voucher_item")
	private List<VoucherItem> voucherItemList;

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

	public void setVoucherItemList(List<VoucherItem> voucherItemList) {
		this.voucherItemList = voucherItemList;
	}
	public List<VoucherItem> getVoucherItemList( ) {
		return this.voucherItemList;
	}

}
