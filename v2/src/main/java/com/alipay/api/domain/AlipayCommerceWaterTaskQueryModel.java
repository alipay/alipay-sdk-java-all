package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务详情
 *
 * @author auto create
 * @since 1.0, 2023-08-28 14:38:52
 */
public class AlipayCommerceWaterTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7161773325457898743L;

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
