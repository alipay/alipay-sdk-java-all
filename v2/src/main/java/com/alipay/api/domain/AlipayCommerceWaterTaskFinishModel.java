package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结束任务
 *
 * @author auto create
 * @since 1.0, 2023-08-23 12:44:46
 */
public class AlipayCommerceWaterTaskFinishModel extends AlipayObject {

	private static final long serialVersionUID = 1887639476549789949L;

	/**
	 * 任务id
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
