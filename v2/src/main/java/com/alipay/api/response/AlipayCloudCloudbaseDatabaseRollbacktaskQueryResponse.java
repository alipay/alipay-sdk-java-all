package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MongoRollbackTaskHistory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.rollbacktask.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:27:42
 */
public class AlipayCloudCloudbaseDatabaseRollbacktaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3282994521986322133L;

	/** 
	 * 回档任务执行历史列表
	 */
	@ApiListField("histories")
	@ApiField("mongo_rollback_task_history")
	private List<MongoRollbackTaskHistory> histories;

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

	public void setHistories(List<MongoRollbackTaskHistory> histories) {
		this.histories = histories;
	}
	public List<MongoRollbackTaskHistory> getHistories( ) {
		return this.histories;
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
