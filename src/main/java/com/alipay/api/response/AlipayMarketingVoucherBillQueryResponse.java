package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-14 16:19:22
 */
public class AlipayMarketingVoucherBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7621135621736392298L;

	/** 
	 * 当前的页码数
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页分页条数
	 */
	@ApiField("items_per_page")
	private Long itemsPerPage;

	/** 
	 * 总记录数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 查询结果的总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 券账单信息
	 */
	@ApiListField("voucher_bills")
	@ApiField("voucher_bill")
	private List<VoucherBill> voucherBills;

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

	public void setVoucherBills(List<VoucherBill> voucherBills) {
		this.voucherBills = voucherBills;
	}
	public List<VoucherBill> getVoucherBills( ) {
		return this.voucherBills;
	}

}
