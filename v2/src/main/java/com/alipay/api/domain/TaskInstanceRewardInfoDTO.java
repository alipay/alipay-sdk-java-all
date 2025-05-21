package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务激励信息
 *
 * @author auto create
 * @since 1.0, 2023-07-13 14:49:24
 */
public class TaskInstanceRewardInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5882129917163223177L;

	/**
	 * 当前进度
	 */
	@ApiField("current_num")
	private Long currentNum;

	/**
	 * 任务推广达成时间
	 */
	@ApiField("guided_finish_time")
	private Date guidedFinishTime;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 导购员openId
	 */
	@ApiField("hunter_open_id")
	private String hunterOpenId;

	/**
	 * 任务已发放激励金额，单位元
	 */
	@ApiField("published_amount")
	private String publishedAmount;

	/**
	 * 任务领取时间
	 */
	@ApiField("receive_time")
	private Date receiveTime;

	/**
	 * 任务总进度
	 */
	@ApiField("target_num")
	private String targetNum;

	/**
	 * 任务实例id
	 */
	@ApiField("task_instance_id")
	private String taskInstanceId;

	/**
	 * 任务最大激励金额，单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public Long getCurrentNum() {
		return this.currentNum;
	}
	public void setCurrentNum(Long currentNum) {
		this.currentNum = currentNum;
	}

	public Date getGuidedFinishTime() {
		return this.guidedFinishTime;
	}
	public void setGuidedFinishTime(Date guidedFinishTime) {
		this.guidedFinishTime = guidedFinishTime;
	}

	public String getHunterId() {
		return this.hunterId;
	}
	public void setHunterId(String hunterId) {
		this.hunterId = hunterId;
	}

	public String getHunterOpenId() {
		return this.hunterOpenId;
	}
	public void setHunterOpenId(String hunterOpenId) {
		this.hunterOpenId = hunterOpenId;
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

	public String getTargetNum() {
		return this.targetNum;
	}
	public void setTargetNum(String targetNum) {
		this.targetNum = targetNum;
	}

	public String getTaskInstanceId() {
		return this.taskInstanceId;
	}
	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
