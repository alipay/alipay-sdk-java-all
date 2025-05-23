package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaskOperateResult;
import com.alipay.api.domain.AntTask;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.anttask.tasks.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-18 22:06:43
 */
public class AlipayBossBaseAnttaskTasksQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4815339992619857334L;

	/** 
	 * 返回是否正确
	 */
	@ApiField("boolean_result")
	private TaskOperateResult booleanResult;

	/** 
	 * 任务列表
	 */
	@ApiListField("entities")
	@ApiField("ant_task")
	private List<AntTask> entities;

	/** 
	 * 任务的总数量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setBooleanResult(TaskOperateResult booleanResult) {
		this.booleanResult = booleanResult;
	}
	public TaskOperateResult getBooleanResult( ) {
		return this.booleanResult;
	}

	public void setEntities(List<AntTask> entities) {
		this.entities = entities;
	}
	public List<AntTask> getEntities( ) {
		return this.entities;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
