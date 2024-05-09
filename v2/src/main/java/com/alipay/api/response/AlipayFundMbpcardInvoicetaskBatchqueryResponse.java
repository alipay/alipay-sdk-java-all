package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceTaskInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.mbpcard.invoicetask.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:16
 */
public class AlipayFundMbpcardInvoicetaskBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7664757749978417916L;

	/** 
	 * 当前页
	 */
	@ApiField("current_page")
	private String currentPage;

	/** 
	 * 是否存在下一页，true:存在 false:不存在
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 回票任务详情信息
	 */
	@ApiListField("invoice_task_list")
	@ApiField("invoice_task_info")
	private List<InvoiceTaskInfo> invoiceTaskList;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 已回票总金额，单位为元
	 */
	@ApiField("total_finish_invoice_amount")
	private String totalFinishInvoiceAmount;

	/** 
	 * 应回票总金额，单位为元
	 */
	@ApiField("total_invoice_amount")
	private String totalInvoiceAmount;

	/** 
	 * 总条数
	 */
	@ApiField("total_num")
	private String totalNum;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private String totalPage;

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public String getCurrentPage( ) {
		return this.currentPage;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setInvoiceTaskList(List<InvoiceTaskInfo> invoiceTaskList) {
		this.invoiceTaskList = invoiceTaskList;
	}
	public List<InvoiceTaskInfo> getInvoiceTaskList( ) {
		return this.invoiceTaskList;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalFinishInvoiceAmount(String totalFinishInvoiceAmount) {
		this.totalFinishInvoiceAmount = totalFinishInvoiceAmount;
	}
	public String getTotalFinishInvoiceAmount( ) {
		return this.totalFinishInvoiceAmount;
	}

	public void setTotalInvoiceAmount(String totalInvoiceAmount) {
		this.totalInvoiceAmount = totalInvoiceAmount;
	}
	public String getTotalInvoiceAmount( ) {
		return this.totalInvoiceAmount;
	}

	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	public String getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}
	public String getTotalPage( ) {
		return this.totalPage;
	}

}
