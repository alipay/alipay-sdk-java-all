package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据用户任务id查看用户任务详情
 *
 * @author auto create
 * @since 1.0, 2023-08-23 12:44:27
 */
public class AlipayCommerceWaterUsertaskdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4315726253433715645L;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 用户任务id
	 */
	@ApiField("user_task_id")
	private String userTaskId;

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getUserTaskId() {
		return this.userTaskId;
	}
	public void setUserTaskId(String userTaskId) {
		this.userTaskId = userTaskId;
	}

}
