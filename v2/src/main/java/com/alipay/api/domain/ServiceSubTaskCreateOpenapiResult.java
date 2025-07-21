package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务任务子类创建结果
 *
 * @author auto create
 * @since 1.0, 2023-08-21 17:55:33
 */
public class ServiceSubTaskCreateOpenapiResult extends AlipayObject {

	private static final long serialVersionUID = 8389823368393393967L;

	/**
	 * 子任务ID
	 */
	@ApiField("sub_task_id")
	private String subTaskId;

	/**
	 * 子任务类型
	 */
	@ApiField("sub_task_type")
	private String subTaskType;

	/**
	 * 子任务序号
	 */
	@ApiField("task_index")
	private String taskIndex;

	public String getSubTaskId() {
		return this.subTaskId;
	}
	public void setSubTaskId(String subTaskId) {
		this.subTaskId = subTaskId;
	}

	public String getSubTaskType() {
		return this.subTaskType;
	}
	public void setSubTaskType(String subTaskType) {
		this.subTaskType = subTaskType;
	}

	public String getTaskIndex() {
		return this.taskIndex;
	}
	public void setTaskIndex(String taskIndex) {
		this.taskIndex = taskIndex;
	}

}
