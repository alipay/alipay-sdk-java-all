package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ape实验 查询任务状态接口
 *
 * @author auto create
 * @since 1.0, 2022-09-06 20:01:44
 */
public class AlipayDigitalopUcdpApeexperimentTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6341238596488252151L;

	/**
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 操作任务id，用于查询本次操作当前的状态
	 */
	@ApiField("task_id")
	private String taskId;

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
