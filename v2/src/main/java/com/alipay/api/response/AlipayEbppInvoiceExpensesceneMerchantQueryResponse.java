package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExpenseMerchantInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensescene.merchant.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:04
 */
public class AlipayEbppInvoiceExpensesceneMerchantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4429635348343264399L;

	/** 
	 * 商户信息
	 */
	@ApiListField("expense_merchant_info_list")
	@ApiField("expense_merchant_info")
	private List<ExpenseMerchantInfo> expenseMerchantInfoList;

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

	public void setExpenseMerchantInfoList(List<ExpenseMerchantInfo> expenseMerchantInfoList) {
		this.expenseMerchantInfoList = expenseMerchantInfoList;
	}
	public List<ExpenseMerchantInfo> getExpenseMerchantInfoList( ) {
		return this.expenseMerchantInfoList;
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
