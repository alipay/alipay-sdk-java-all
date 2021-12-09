package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaskInfo;
import com.alipay.api.domain.TaskTitleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.task.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-09 11:20:34
 */
public class AlipayCommerceOperationTaskListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6821545544937425976L;

	/** 
	 * 是否存在下一页
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 分页数
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/** 
	 * 任务列表
	 */
	@ApiListField("task_list")
	@ApiField("task_info")
	private List<TaskInfo> taskList;

	/** 
	 * 顶部卡片信息
	 */
	@ApiField("task_title")
	private TaskTitleInfo taskTitle;

	/** 
	 * 总分页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Long getPageNumber( ) {
		return this.pageNumber;
	}

	public void setTaskList(List<TaskInfo> taskList) {
		this.taskList = taskList;
	}
	public List<TaskInfo> getTaskList( ) {
		return this.taskList;
	}

	public void setTaskTitle(TaskTitleInfo taskTitle) {
		this.taskTitle = taskTitle;
	}
	public TaskTitleInfo getTaskTitle( ) {
		return this.taskTitle;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
