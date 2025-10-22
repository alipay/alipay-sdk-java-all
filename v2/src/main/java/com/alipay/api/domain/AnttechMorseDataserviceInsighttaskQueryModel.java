package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 点位洞察任务状态查询
 *
 * @author auto create
 * @since 1.0, 2024-06-03 11:01:26
 */
public class AnttechMorseDataserviceInsighttaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3796749655146183249L;

	/**
	 * 给客户发放的调用ID
	 */
	@ApiField("consult_id")
	private String consultId;

	/**
	 * 洞察任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public String getConsultId() {
		return this.consultId;
	}
	public void setConsultId(String consultId) {
		this.consultId = consultId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
