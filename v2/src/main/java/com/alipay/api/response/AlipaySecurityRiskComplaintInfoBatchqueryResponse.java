package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ComplaintInfoQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.complaint.info.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-11 15:05:34
 */
public class AlipaySecurityRiskComplaintInfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8391783611125514718L;

	/** 
	 * 投诉详情信息列表
	 */
	@ApiListField("complaint_list")
	@ApiField("complaint_info_query_response")
	private List<ComplaintInfoQueryResponse> complaintList;

	/** 
	 * 分页查询时的当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 分页查询时每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 满足条件的数据总条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setComplaintList(List<ComplaintInfoQueryResponse> complaintList) {
		this.complaintList = complaintList;
	}
	public List<ComplaintInfoQueryResponse> getComplaintList( ) {
		return this.complaintList;
	}

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

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
