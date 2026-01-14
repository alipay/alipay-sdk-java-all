package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceTaskTradeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.mbpcard.invoicetasktrade.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:36
 */
public class AlipayFundMbpcardInvoicetasktradeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2134816749259458838L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page")
	private String currentPage;

	/** 
	 * 是否还有下一页，true:有，false:没有
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 发票关联的交易列表信息
	 */
	@ApiListField("invoice_trade_list")
	@ApiField("invoice_task_trade_info")
	private List<InvoiceTaskTradeInfo> invoiceTradeList;

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

	public void setInvoiceTradeList(List<InvoiceTaskTradeInfo> invoiceTradeList) {
		this.invoiceTradeList = invoiceTradeList;
	}
	public List<InvoiceTaskTradeInfo> getInvoiceTradeList( ) {
		return this.invoiceTradeList;
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
