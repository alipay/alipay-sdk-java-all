package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.VcpAssetBillInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.assetorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-02-25 15:44:49
 */
public class AlipayAssetAssetorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6765928456335822285L;

	/** 
	 * 订单列表
	 */
	@ApiField("asset_bills")
	private VcpAssetBillInfo assetBills;

	/** 
	 * 当前页
	 */
	@ApiField("current_page")
	private String currentPage;

	/** 
	 * 每页条数
	 */
	@ApiField("items_per_page")
	private String itemsPerPage;

	/** 
	 * 返回条件的总条数
	 */
	@ApiField("total_items")
	private String totalItems;

	/** 
	 * 总页数，根据totalcount和pagesize计算出来
	 */
	@ApiField("total_pages")
	private String totalPages;

	public void setAssetBills(VcpAssetBillInfo assetBills) {
		this.assetBills = assetBills;
	}
	public VcpAssetBillInfo getAssetBills( ) {
		return this.assetBills;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public String getCurrentPage( ) {
		return this.currentPage;
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
