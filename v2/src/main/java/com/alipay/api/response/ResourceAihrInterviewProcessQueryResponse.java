package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenapiInterviewProcessItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: resource.aihr.interview.process.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 13:42:49
 */
public class ResourceAihrInterviewProcessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4516989665554944241L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * null
	 */
	@ApiListField("process_list")
	@ApiField("openapi_interview_process_item")
	private List<OpenapiInterviewProcessItem> processList;

	/** 
	 * 总条数
	 */
	@ApiField("total")
	private Long total;

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

	public void setProcessList(List<OpenapiInterviewProcessItem> processList) {
		this.processList = processList;
	}
	public List<OpenapiInterviewProcessItem> getProcessList( ) {
		return this.processList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
