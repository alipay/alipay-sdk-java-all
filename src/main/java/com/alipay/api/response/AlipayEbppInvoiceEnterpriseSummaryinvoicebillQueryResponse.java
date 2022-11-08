package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SummaryInvoiceBillOpenDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterprise.summaryinvoicebill.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-22 17:46:49
 */
public class AlipayEbppInvoiceEnterpriseSummaryinvoicebillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7739572645562379171L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页行数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 账单列表
	 */
	@ApiListField("summary_invoice_bill_list")
	@ApiField("summary_invoice_bill_open_d_t_o")
	private List<SummaryInvoiceBillOpenDTO> summaryInvoiceBillList;

	/** 
	 * 总条数
	 */
	@ApiField("total_size")
	private Long totalSize;

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

	public void setSummaryInvoiceBillList(List<SummaryInvoiceBillOpenDTO> summaryInvoiceBillList) {
		this.summaryInvoiceBillList = summaryInvoiceBillList;
	}
	public List<SummaryInvoiceBillOpenDTO> getSummaryInvoiceBillList( ) {
		return this.summaryInvoiceBillList;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
