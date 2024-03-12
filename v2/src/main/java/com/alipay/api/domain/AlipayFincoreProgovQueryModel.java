package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询蚂蚁资产接入工单状态
 *
 * @author auto create
 * @since 1.0, 2023-04-07 15:04:05
 */
public class AlipayFincoreProgovQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4738822959377882931L;

	/**
	 * 蚂蚁资产接入工单任务id
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
