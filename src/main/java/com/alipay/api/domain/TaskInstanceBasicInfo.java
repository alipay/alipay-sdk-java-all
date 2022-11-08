package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 导购员查询任务列表信息
 *
 * @author auto create
 * @since 1.0, 2022-10-11 17:39:54
 */
public class TaskInstanceBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 3736979822774989879L;

	/**
	 * 任务图标
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 标的物完成数
	 */
	@ApiField("marker_amount")
	private Long markerAmount;

	/**
	 * 已经发放积分数量
	 */
	@ApiField("published_point_amount")
	private Long publishedPointAmount;

	/**
	 * 任务实例状态
UNRECEIVED 未领取， 前端展示领取任务按钮
RECEIVED 已领取， 展示排名信息
FINISHED  任务完成
EXPIRED  任务到期
	 */
	@ApiField("status")
	private String status;

	/**
	 * 任务结束时间
	 */
	@ApiField("task_end_time")
	private Date taskEndTime;

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
	 * 任务开始时间
	 */
	@ApiField("task_start_time")
	private Date taskStartTime;

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
	 * 任务总积分数(单个导购员最大激励金额)
	 */
	@ApiField("total_point_amount")
	private Long totalPointAmount;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Long getMarkerAmount() {
		return this.markerAmount;
	}
	public void setMarkerAmount(Long markerAmount) {
		this.markerAmount = markerAmount;
	}

	public Long getPublishedPointAmount() {
		return this.publishedPointAmount;
	}
	public void setPublishedPointAmount(Long publishedPointAmount) {
		this.publishedPointAmount = publishedPointAmount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTaskEndTime() {
		return this.taskEndTime;
	}
	public void setTaskEndTime(Date taskEndTime) {
		this.taskEndTime = taskEndTime;
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

	public Date getTaskStartTime() {
		return this.taskStartTime;
	}
	public void setTaskStartTime(Date taskStartTime) {
		this.taskStartTime = taskStartTime;
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

	public Long getTotalPointAmount() {
		return this.totalPointAmount;
	}
	public void setTotalPointAmount(Long totalPointAmount) {
		this.totalPointAmount = totalPointAmount;
	}

}
