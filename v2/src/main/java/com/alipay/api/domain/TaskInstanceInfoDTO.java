package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客任务实例详情信息
 *
 * @author auto create
 * @since 1.0, 2023-06-16 15:24:20
 */
public class TaskInstanceInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4547163438325271633L;

	/**
	 * 任务完成时间
	 */
	@ApiField("complete_time")
	private Date completeTime;

	/**
	 * 当前进度
	 */
	@ApiField("current_num")
	private Long currentNum;

	/**
	 * 任务最大激励笔数
	 */
	@ApiField("max_incentive_count")
	private Long maxIncentiveCount;

	/**
	 * 已发放金额，元
	 */
	@ApiField("published_amount")
	private String publishedAmount;

	/**
	 * 任务领取时间
	 */
	@ApiField("receive_time")
	private Date receiveTime;

	/**
	 * 任务激励类型
	 */
	@ApiField("reward_type")
	private String rewardType;

	/**
	 * 任务实例状态
UNRECEIVED 未领取
RECEIVED 已领取
FINISHED  任务完成
	 */
	@ApiField("status")
	private String status;

	/**
	 * 激励任务目标数量
	 */
	@ApiField("target_num")
	private Long targetNum;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	/**
	 * 最大激励金额，单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public Date getCompleteTime() {
		return this.completeTime;
	}
	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}

	public Long getCurrentNum() {
		return this.currentNum;
	}
	public void setCurrentNum(Long currentNum) {
		this.currentNum = currentNum;
	}

	public Long getMaxIncentiveCount() {
		return this.maxIncentiveCount;
	}
	public void setMaxIncentiveCount(Long maxIncentiveCount) {
		this.maxIncentiveCount = maxIncentiveCount;
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

	public String getRewardType() {
		return this.rewardType;
	}
	public void setRewardType(String rewardType) {
		this.rewardType = rewardType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTargetNum() {
		return this.targetNum;
	}
	public void setTargetNum(Long targetNum) {
		this.targetNum = targetNum;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
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
