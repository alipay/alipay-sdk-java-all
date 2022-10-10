package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExpenseQuotaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.quota.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-18 15:36:45
 */
public class AlipayEbppInvoiceExpensecontrolQuotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4384325326598624612L;

	/** 
	 * 额度列表
	 */
	@ApiListField("expense_quota_info_list")
	@ApiField("expense_quota_info")
	private List<ExpenseQuotaInfo> expenseQuotaInfoList;

	/** 
	 * 当前页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 当前记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private Long totalPageCount;

	public void setExpenseQuotaInfoList(List<ExpenseQuotaInfo> expenseQuotaInfoList) {
		this.expenseQuotaInfoList = expenseQuotaInfoList;
	}
	public List<ExpenseQuotaInfo> getExpenseQuotaInfoList( ) {
		return this.expenseQuotaInfoList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalPageCount(Long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public Long getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
