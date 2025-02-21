package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenVoucherDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:17
 */
public class AlipayMarketingVoucherBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6288189471445976554L;

	/** 
	 * 当前页
	 */
	@ApiField("current_page")
	private String currentPage;

	/** 
	 * 每页显示条数
	 */
	@ApiField("items_per_page")
	private String itemsPerPage;

	/** 
	 * 总条数
	 */
	@ApiField("total_items")
	private String totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private String totalPages;

	/** 
	 * 券列表
	 */
	@ApiListField("vouchers")
	@ApiField("open_voucher_d_t_o")
	private List<OpenVoucherDTO> vouchers;

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

	public void setVouchers(List<OpenVoucherDTO> vouchers) {
		this.vouchers = vouchers;
	}
	public List<OpenVoucherDTO> getVouchers( ) {
		return this.vouchers;
	}

}
