package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceApplyDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.tcn.invoiceapplydetail.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 11:31:12
 */
public class AlipayCommerceEcTcnInvoiceapplydetailBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5193151278794571698L;

	/** 
	 * 开票申请明细
	 */
	@ApiField("detail_list")
	private InvoiceApplyDetail detailList;

	/** 
	 * 页号
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 数据总数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setDetailList(InvoiceApplyDetail detailList) {
		this.detailList = detailList;
	}
	public InvoiceApplyDetail getDetailList( ) {
		return this.detailList;
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

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
