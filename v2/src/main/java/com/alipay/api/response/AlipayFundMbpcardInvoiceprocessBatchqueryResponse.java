package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceEventInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.mbpcard.invoiceprocess.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-01 16:41:58
 */
public class AlipayFundMbpcardInvoiceprocessBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4479269981641653666L;

	/** 
	 * 当前页
	 */
	@ApiField("current_page")
	private String currentPage;

	/** 
	 * 是否还有下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 回票事件列表
	 */
	@ApiListField("invoice_event_list")
	@ApiField("invoice_event_info")
	private List<InvoiceEventInfo> invoiceEventList;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

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

	public void setInvoiceEventList(List<InvoiceEventInfo> invoiceEventList) {
		this.invoiceEventList = invoiceEventList;
	}
	public List<InvoiceEventInfo> getInvoiceEventList( ) {
		return this.invoiceEventList;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
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
