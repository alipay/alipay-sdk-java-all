package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 点位洞察任务结果获取
 *
 * @author auto create
 * @since 1.0, 2024-06-03 11:00:04
 */
public class AnttechMorseDataserviceInsightreportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6735327966954932347L;

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
