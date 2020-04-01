package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MultiCurrencyMoneyOpenApi;
import com.alipay.api.domain.ArInvoiceOpenApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayBossFncInvoiceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8687133515911276622L;

	/** 
	 * 发票总金额
	 */
	@ApiField("amt")
	private MultiCurrencyMoneyOpenApi amt;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页条数
	 */
	@ApiField("items_page")
	private Long itemsPage;

	/** 
	 * 结果对象,发票对象的集合
	 */
	@ApiListField("result_set")
	@ApiField("ar_invoice_open_api_response")
	private List<ArInvoiceOpenApiResponse> resultSet;

	/** 
	 * 查询到的结果总数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setAmt(MultiCurrencyMoneyOpenApi amt) {
		this.amt = amt;
	}
	public MultiCurrencyMoneyOpenApi getAmt( ) {
		return this.amt;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setItemsPage(Long itemsPage) {
		this.itemsPage = itemsPage;
	}
	public Long getItemsPage( ) {
		return this.itemsPage;
	}

	public void setResultSet(List<ArInvoiceOpenApiResponse> resultSet) {
		this.resultSet = resultSet;
	}
	public List<ArInvoiceOpenApiResponse> getResultSet( ) {
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
