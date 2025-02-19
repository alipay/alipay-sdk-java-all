package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客任务实例基础信息
 *
 * @author auto create
 * @since 1.0, 2023-06-16 15:26:37
 */
public class TaskInstanceBasicInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3768933113264484682L;

	/**
	 * 任务完成时间
	 */
	@ApiField("complete_time")
	private Date completeTime;

	/**
	 * 已发放激励数量，单位分
	 */
	@ApiField("published_amount")
	private String publishedAmount;

	/**
	 * 任务领取时间
	 */
	@ApiField("receive_time")
	private Date receiveTime;

	/**
	 * 任务实例状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 任务实例id
	 */
	@ApiField("task_instance_id")
	private String taskInstanceId;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务模板id
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	/**
	 * 任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	/**
	 * 任务最大激励现金，单位分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public Date getCompleteTime() {
		return this.completeTime;
	}
	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}

	public String getPublishedAmount() {
		return this.publishedAmount;
	}
	public void setPublishedAmount(String publishedAmount) {
		this.publishedAmount = publishedAmount;
	}

	public Date getReceiveTime() {
		return this.receiveTime;
	}
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskInstanceId() {
		return this.taskInstanceId;
	}
	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
