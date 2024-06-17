package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结束任务
 *
 * @author auto create
 * @since 1.0, 2024-02-27 09:52:36
 */
public class AlipayCommerceWaterTaskFinishModel extends AlipayObject {

	private static final long serialVersionUID = 1893777268445336221L;

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
