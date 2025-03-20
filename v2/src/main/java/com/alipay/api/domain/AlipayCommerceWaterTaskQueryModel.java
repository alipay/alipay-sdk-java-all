package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务详情
 *
 * @author auto create
 * @since 1.0, 2024-02-27 09:51:48
 */
public class AlipayCommerceWaterTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6534779752284547945L;

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
