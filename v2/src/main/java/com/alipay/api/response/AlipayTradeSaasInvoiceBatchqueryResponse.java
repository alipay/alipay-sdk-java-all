package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.invoice.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-14 20:02:48
 */
public class AlipayTradeSaasInvoiceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8681591194131228891L;

	/** 
	 * 是否还有下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 发票详细信息列表
	 */
	@ApiField("invoice_detail_info_list")
	private InvoiceDetailInfo invoiceDetailInfoList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_no")
	private String pageNo;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 符合条件的总记录数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setInvoiceDetailInfoList(InvoiceDetailInfo invoiceDetailInfoList) {
		this.invoiceDetailInfoList = invoiceDetailInfoList;
	}
	public InvoiceDetailInfo getInvoiceDetailInfoList( ) {
		return this.invoiceDetailInfoList;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
