package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 异步提交一次灵思模型请求
 *
 * @author auto create
 * @since 1.0, 2024-09-03 09:55:30
 */
public class TechriskRiskaiOpsgptTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3497815433726522792L;

	/**
	 * 提交任务成功后返回的任务id，用户需要使用该 id 调用任务查询接口轮询任务结果
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
