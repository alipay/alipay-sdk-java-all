package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MongoRollbackTaskDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.rollbacktaskdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:27:38
 */
public class AlipayCloudCloudbaseDatabaseRollbacktaskdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8748915611596572816L;

	/** 
	 * 回档任务执行明细列表
	 */
	@ApiListField("details")
	@ApiField("mongo_rollback_task_detail")
	private List<MongoRollbackTaskDetail> details;

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

	public void setDetails(List<MongoRollbackTaskDetail> details) {
		this.details = details;
	}
	public List<MongoRollbackTaskDetail> getDetails( ) {
		return this.details;
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
