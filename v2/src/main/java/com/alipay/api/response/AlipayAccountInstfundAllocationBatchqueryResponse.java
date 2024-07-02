package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InstFundFlowRecordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.instfund.allocation.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-25 09:45:27
 */
public class AlipayAccountInstfundAllocationBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4172676695316315168L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 返回结果
	 */
	@ApiField("result_object")
	private InstFundFlowRecordDTO resultObject;

	/** 
	 * 总记录条数
	 */
	@ApiField("total_count")
	private Long totalCount;

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

	public void setResultObject(InstFundFlowRecordDTO resultObject) {
		this.resultObject = resultObject;
	}
	public InstFundFlowRecordDTO getResultObject( ) {
		return this.resultObject;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
