package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 超级导购任务门店维度统计数据
 *
 * @author auto create
 * @since 1.0, 2022-10-11 17:39:19
 */
public class YunTaskShopStatisticInfo extends AlipayObject {

	private static final long serialVersionUID = 6681515467375751614L;

	/**
	 * 任务总领取数
	 */
	@ApiField("received_number")
	private Long receivedNumber;

	/**
	 * 任务模板状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 任务结束时间
	 */
	@ApiField("task_end_time")
	private Date taskEndTime;

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
	 * 标的物总完成数
	 */
	@ApiField("total_marker_amount")
	private Long totalMarkerAmount;

	/**
	 * 总发放积分数量
	 */
	@ApiField("total_point_amount")
	private Long totalPointAmount;

	/**
	 * 总目标数
	 */
	@ApiField("total_target_point")
	private Long totalTargetPoint;

	public Long getReceivedNumber() {
		return this.receivedNumber;
	}
	public void setReceivedNumber(Long receivedNumber) {
		this.receivedNumber = receivedNumber;
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

	public Long getTotalMarkerAmount() {
		return this.totalMarkerAmount;
	}
	public void setTotalMarkerAmount(Long totalMarkerAmount) {
		this.totalMarkerAmount = totalMarkerAmount;
	}

	public Long getTotalPointAmount() {
		return this.totalPointAmount;
	}
	public void setTotalPointAmount(Long totalPointAmount) {
		this.totalPointAmount = totalPointAmount;
	}

	public Long getTotalTargetPoint() {
		return this.totalTargetPoint;
	}
	public void setTotalTargetPoint(Long totalTargetPoint) {
		this.totalTargetPoint = totalTargetPoint;
	}

}
