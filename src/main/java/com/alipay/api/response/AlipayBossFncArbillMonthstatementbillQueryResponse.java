package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ArMonthlyStatementBillOpenApiResponse;
import com.alipay.api.domain.MultiCurrencyMoneyOpenApi;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.arbill.monthstatementbill.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:41:56
 */
public class AlipayBossFncArbillMonthstatementbillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6546221879228798852L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page")
	private String currentPage;

	/** 
	 * 每页条数
	 */
	@ApiField("items_page")
	private String itemsPage;

	/** 
	 * 对账单开放平台返回结果
	 */
	@ApiListField("result_set")
	@ApiField("ar_monthly_statement_bill_open_api_response")
	private List<ArMonthlyStatementBillOpenApiResponse> resultSet;

	/** 
	 * 汇总服务费总调整金额
	 */
	@ApiField("total_adj_amt")
	private MultiCurrencyMoneyOpenApi totalAdjAmt;

	/** 
	 * 汇总服务费总金额
	 */
	@ApiField("total_bill_amt")
	private MultiCurrencyMoneyOpenApi totalBillAmt;

	/** 
	 * 汇总可开票总金额
	 */
	@ApiField("total_inv_amt")
	private MultiCurrencyMoneyOpenApi totalInvAmt;

	/** 
	 * 汇总已开票总金额
	 */
	@ApiField("total_inved_amt")
	private MultiCurrencyMoneyOpenApi totalInvedAmt;

	/** 
	 * 查询到的结果总数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 汇总已关联票总金额
	 */
	@ApiField("total_link_invoice_amt")
	private MultiCurrencyMoneyOpenApi totalLinkInvoiceAmt;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 对账单开放平台查询返回结果
	 */
	@ApiField("total_received_amt")
	private MultiCurrencyMoneyOpenApi totalReceivedAmt;

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public String getCurrentPage( ) {
		return this.currentPage;
	}

	public void setItemsPage(String itemsPage) {
		this.itemsPage = itemsPage;
	}
	public String getItemsPage( ) {
		return this.itemsPage;
	}

	public void setResultSet(List<ArMonthlyStatementBillOpenApiResponse> resultSet) {
		this.resultSet = resultSet;
	}
	public List<ArMonthlyStatementBillOpenApiResponse> getResultSet( ) {
		return this.resultSet;
	}

	public void setTotalAdjAmt(MultiCurrencyMoneyOpenApi totalAdjAmt) {
		this.totalAdjAmt = totalAdjAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalAdjAmt( ) {
		return this.totalAdjAmt;
	}

	public void setTotalBillAmt(MultiCurrencyMoneyOpenApi totalBillAmt) {
		this.totalBillAmt = totalBillAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalBillAmt( ) {
		return this.totalBillAmt;
	}

	public void setTotalInvAmt(MultiCurrencyMoneyOpenApi totalInvAmt) {
		this.totalInvAmt = totalInvAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalInvAmt( ) {
		return this.totalInvAmt;
	}

	public void setTotalInvedAmt(MultiCurrencyMoneyOpenApi totalInvedAmt) {
		this.totalInvedAmt = totalInvedAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalInvedAmt( ) {
		return this.totalInvedAmt;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalLinkInvoiceAmt(MultiCurrencyMoneyOpenApi totalLinkInvoiceAmt) {
		this.totalLinkInvoiceAmt = totalLinkInvoiceAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalLinkInvoiceAmt( ) {
		return this.totalLinkInvoiceAmt;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalReceivedAmt(MultiCurrencyMoneyOpenApi totalReceivedAmt) {
		this.totalReceivedAmt = totalReceivedAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalReceivedAmt( ) {
		return this.totalReceivedAmt;
	}

}
