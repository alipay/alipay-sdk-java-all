package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MongoTaskHistory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 15:26:43
 */
public class AlipayCloudCloudbaseDatabaseTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7116773567357252674L;

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
	 * 任务执行历史列表
	 */
	@ApiListField("tasks")
	@ApiField("mongo_task_history")
	private List<MongoTaskHistory> tasks;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

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

	public void setTasks(List<MongoTaskHistory> tasks) {
		this.tasks = tasks;
	}
	public List<MongoTaskHistory> getTasks( ) {
		return this.tasks;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
