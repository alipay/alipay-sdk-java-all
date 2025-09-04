package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 任务列表
 *
 * @author auto create
 * @since 1.0, 2023-08-16 17:14:32
 */
public class TaskDetailListResponse extends AlipayObject {

	private static final long serialVersionUID = 5756894629437352858L;

	/**
	 * 任务列表
	 */
	@ApiListField("task_detail_list_response")
	@ApiField("task_detail_response")
	private List<TaskDetailResponse> taskDetailListResponse;

	public List<TaskDetailResponse> getTaskDetailListResponse() {
		return this.taskDetailListResponse;
	}
	public void setTaskDetailListResponse(List<TaskDetailResponse> taskDetailListResponse) {
		this.taskDetailListResponse = taskDetailListResponse;
	}

}
