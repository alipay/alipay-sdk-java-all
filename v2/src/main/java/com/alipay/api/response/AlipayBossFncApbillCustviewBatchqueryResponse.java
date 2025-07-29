package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ApMonthlyBillCustOpenApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.apbill.custview.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:54:58
 */
public class AlipayBossFncApbillCustviewBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8611884859562522443L;

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
	 * 应付月账单客户视图
	 */
	@ApiListField("result_set")
	@ApiField("ap_monthly_bill_cust_open_api_response")
	private List<ApMonthlyBillCustOpenApiResponse> resultSet;

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

	public void setResultSet(List<ApMonthlyBillCustOpenApiResponse> resultSet) {
		this.resultSet = resultSet;
	}
	public List<ApMonthlyBillCustOpenApiResponse> getResultSet( ) {
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
