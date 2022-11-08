package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FundTransferLogResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.transfer.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-30 20:18:01
 */
public class AlipayCommerceYuntaskTransferBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6536628345522464794L;

	/** 
	 * 转账日志记录
	 */
	@ApiListField("fund_transfer_logs")
	@ApiField("fund_transfer_log_result")
	private List<FundTransferLogResult> fundTransferLogs;

	/** 
	 * 第几页，默认1（从1开始计数）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页记录条数，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 最大记录数
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setFundTransferLogs(List<FundTransferLogResult> fundTransferLogs) {
		this.fundTransferLogs = fundTransferLogs;
	}
	public List<FundTransferLogResult> getFundTransferLogs( ) {
		return this.fundTransferLogs;
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

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
