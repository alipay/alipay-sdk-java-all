package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 异步提交灵思任务返回结果
 *
 * @author auto create
 * @since 1.0, 2024-09-03 09:55:19
 */
public class AsyncSubmitTaskResponse extends AlipayObject {

	private static final long serialVersionUID = 2593823772677218223L;

	/**
	 * 本次任务的id，后续使用查询接口以该 id 作为参数查询任务的执行结果
	 */
	@ApiField("task_id")
	private String taskId;

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
