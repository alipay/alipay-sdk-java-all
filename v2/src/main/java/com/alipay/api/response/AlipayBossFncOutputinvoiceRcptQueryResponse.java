package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OutputInvoiceReceiptOpenApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.rcpt.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-30 19:35:38
 */
public class AlipayBossFncOutputinvoiceRcptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2891367142761263282L;

	/** 
	 * 当前页
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页条数
	 */
	@ApiField("items_page")
	private String itemsPage;

	/** 
	 * 结果
	 */
	@ApiListField("result_set")
	@ApiField("output_invoice_receipt_open_api_response")
	private List<OutputInvoiceReceiptOpenApiResponse> resultSet;

	/** 
	 * 总条数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setItemsPage(String itemsPage) {
		this.itemsPage = itemsPage;
	}
	public String getItemsPage( ) {
		return this.itemsPage;
	}

	public void setResultSet(List<OutputInvoiceReceiptOpenApiResponse> resultSet) {
		this.resultSet = resultSet;
	}
	public List<OutputInvoiceReceiptOpenApiResponse> getResultSet( ) {
		return this.resultSet;
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

}
