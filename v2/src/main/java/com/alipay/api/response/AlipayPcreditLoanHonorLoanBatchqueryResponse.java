package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HonorLoanRecordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.loan.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 16:17:40
 */
public class AlipayPcreditLoanHonorLoanBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5813594313836118834L;

	/** 
	 * 入参传了currentPage才返回
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页条数, 入参传了currentPage才返回
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 记录列表。result_code=0则必填
	 */
	@ApiListField("records")
	@ApiField("honor_loan_record_d_t_o")
	private List<HonorLoanRecordDTO> records;

	/** 
	 * 记录总数, 入参传了currentPage才返回
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 记录总条数，result_code=0则必填
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总页数, 入参传了currentPage才返回
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setRecords(List<HonorLoanRecordDTO> records) {
		this.records = records;
	}
	public List<HonorLoanRecordDTO> getRecords( ) {
		return this.records;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
