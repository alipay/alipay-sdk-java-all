package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定损宝定损结果查询接口
 *
 * @author auto create
 * @since 1.0, 2020-05-09 11:22:56
 */
public class AnttechAiCvDsbGetModel extends AlipayObject {

	private static final long serialVersionUID = 3444168221189122237L;

	/**
	 * 定损任务接口返回的task_id
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
