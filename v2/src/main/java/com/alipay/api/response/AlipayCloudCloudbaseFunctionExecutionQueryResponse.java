package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Execution;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.execution.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 20:51:41
 */
public class AlipayCloudCloudbaseFunctionExecutionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7122546957515614942L;

	/** 
	 * 云函数执行记录列表
	 */
	@ApiListField("executions")
	@ApiField("execution")
	private List<Execution> executions;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setExecutions(List<Execution> executions) {
		this.executions = executions;
	}
	public List<Execution> getExecutions( ) {
		return this.executions;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
