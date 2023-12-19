package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务详情
 *
 * @author auto create
 * @since 1.0, 2023-12-12 14:37:18
 */
public class AlipayCommerceWaterTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3139738819318919761L;

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
