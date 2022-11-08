package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaskTemplateOperationLogDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.operation.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-13 14:11:47
 */
public class AlipayCommerceYuntaskOperationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8595593287481788145L;

	/** 
	 * 当前页数
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 操作记录列表
	 */
	@ApiListField("task_operation_logs")
	@ApiField("task_template_operation_log_d_t_o")
	private List<TaskTemplateOperationLogDTO> taskOperationLogs;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTaskOperationLogs(List<TaskTemplateOperationLogDTO> taskOperationLogs) {
		this.taskOperationLogs = taskOperationLogs;
	}
	public List<TaskTemplateOperationLogDTO> getTaskOperationLogs( ) {
		return this.taskOperationLogs;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
