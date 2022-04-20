package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucherdetail.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-14 16:19:36
 */
public class AlipayMarketingVoucherdetailListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2386684498396926336L;

	/** 
	 * 当前的页码数
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每一页的分页条数
	 */
	@ApiField("items_per_page")
	private Long itemsPerPage;

	/** 
	 * 当前总记录数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 券详情
	 */
	@ApiListField("vouchers")
	@ApiField("voucher_query_info")
	private List<VoucherQueryInfo> vouchers;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setItemsPerPage(Long itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}
	public Long getItemsPerPage( ) {
		return this.itemsPerPage;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setVouchers(List<VoucherQueryInfo> vouchers) {
		this.vouchers = vouchers;
	}
	public List<VoucherQueryInfo> getVouchers( ) {
		return this.vouchers;
	}

}
