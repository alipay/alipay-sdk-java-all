package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InstFundFlowRecordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.instfund.allocation.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-30 16:47:05
 */
public class AlipayAccountInstfundAllocationBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2647391982172557591L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小，单位条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 返回结果
	 */
	@ApiListField("result_object")
	@ApiField("inst_fund_flow_record_d_t_o")
	private List<InstFundFlowRecordDTO> resultObject;

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

	public void setResultObject(List<InstFundFlowRecordDTO> resultObject) {
		this.resultObject = resultObject;
	}
	public List<InstFundFlowRecordDTO> getResultObject( ) {
		return this.resultObject;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
