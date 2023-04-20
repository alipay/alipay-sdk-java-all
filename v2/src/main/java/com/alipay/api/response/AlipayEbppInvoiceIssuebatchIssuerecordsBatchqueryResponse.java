package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IssueRecordInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.issuebatch.issuerecords.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-14 10:36:44
 */
public class AlipayEbppInvoiceIssuebatchIssuerecordsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5446335117748846293L;

	/** 
	 * 当前批次下的发放记录信息列表
	 */
	@ApiField("issue_record_info_list")
	private IssueRecordInfo issueRecordInfoList;

	/** 
	 * 分页查询页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页查询单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private String totalPageCount;

	public void setIssueRecordInfoList(IssueRecordInfo issueRecordInfoList) {
		this.issueRecordInfoList = issueRecordInfoList;
	}
	public IssueRecordInfo getIssueRecordInfoList( ) {
		return this.issueRecordInfoList;
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

	public void setTotalPageCount(String totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public String getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
