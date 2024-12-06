package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CollaborateTask;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.task.pull response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-29 16:32:23
 */
public class AlipayOfflineProviderCollaborateTaskPullResponse extends AlipayResponse {

	private static final long serialVersionUID = 8257264523381816597L;

	/** 
	 * 拉取到的任务数量
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 分配给当前isv的协同任务明细。
	 */
	@ApiListField("tasks")
	@ApiField("collaborate_task")
	private List<CollaborateTask> tasks;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setTasks(List<CollaborateTask> tasks) {
		this.tasks = tasks;
	}
	public List<CollaborateTask> getTasks( ) {
		return this.tasks;
	}

}
