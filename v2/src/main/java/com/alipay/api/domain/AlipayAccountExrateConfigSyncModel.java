package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国际同步主站配置通用接口
 *
 * @author auto create
 * @since 1.0, 2022-05-18 16:19:45
 */
public class AlipayAccountExrateConfigSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3816598243379655937L;

	/**
	 * 自定义规则，字符串的形式。国际要同步到主站的拓展信息
	 */
	@ApiField("task_context")
	private String taskContext;

	/**
	 * 调度任务状态
	 */
	@ApiField("task_status")
	private String taskStatus;

	/**
	 * 配置信息的调度类型
	 */
	@ApiField("task_type")
	private String taskType;

	public String getTaskContext() {
		return this.taskContext;
	}
	public void setTaskContext(String taskContext) {
		this.taskContext = taskContext;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

}
