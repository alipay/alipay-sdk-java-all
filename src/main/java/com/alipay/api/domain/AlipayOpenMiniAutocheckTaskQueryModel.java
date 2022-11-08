package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务结果查询
 *
 * @author auto create
 * @since 1.0, 2022-10-27 09:16:57
 */
public class AlipayOpenMiniAutocheckTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4793884363841937821L;

	/**
	 * 任务ID
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
