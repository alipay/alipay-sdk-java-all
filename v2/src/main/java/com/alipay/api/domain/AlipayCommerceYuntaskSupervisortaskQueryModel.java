package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查看督导任务
 *
 * @author auto create
 * @since 1.0, 2024-09-13 15:20:20
 */
public class AlipayCommerceYuntaskSupervisortaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8634388945231497521L;

	/**
	 * 导购员id
	 */
	@ApiField("supervisor_id")
	private String supervisorId;

	/**
	 * 任务实例id
	 */
	@ApiField("task_instance_id")
	private String taskInstanceId;

	/**
	 * 任务模版ID
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	public String getSupervisorId() {
		return this.supervisorId;
	}
	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getTaskInstanceId() {
		return this.taskInstanceId;
	}
	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

}
