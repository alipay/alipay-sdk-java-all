package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务状态信息
 *
 * @author auto create
 * @since 1.0, 2023-10-12 11:02:44
 */
public class TaskStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 7561551243914991283L;

	/**
	 * 渠道
	 */
	@ApiField("channel_info")
	private String channelInfo;

	/**
	 * 报名后完成发奖次数(需报名任务)
	 */
	@ApiField("complete_count")
	private Long completeCount;

	/**
	 * 完成发奖时间
	 */
	@ApiField("complete_time")
	private Date completeTime;

	/**
	 * 任务进度
	 */
	@ApiField("periodic_acc_count")
	private Long periodicAccCount;

	/**
	 * 领奖过期时间(需用户主动领奖任务)
	 */
	@ApiField("receive_expire_time")
	private Date receiveExpireTime;

	/**
	 * 报名过期时间
	 */
	@ApiField("signup_expire_time")
	private Date signupExpireTime;

	/**
	 * 报名时间
	 */
	@ApiField("signup_time")
	private Date signupTime;

	/**
	 * 任务状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子状态（由业务自定义）
	 */
	@ApiField("sub_status")
	private String subStatus;

	/**
	 * 任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public String getChannelInfo() {
		return this.channelInfo;
	}
	public void setChannelInfo(String channelInfo) {
		this.channelInfo = channelInfo;
	}

	public Long getCompleteCount() {
		return this.completeCount;
	}
	public void setCompleteCount(Long completeCount) {
		this.completeCount = completeCount;
	}

	public Date getCompleteTime() {
		return this.completeTime;
	}
	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}

	public Long getPeriodicAccCount() {
		return this.periodicAccCount;
	}
	public void setPeriodicAccCount(Long periodicAccCount) {
		this.periodicAccCount = periodicAccCount;
	}

	public Date getReceiveExpireTime() {
		return this.receiveExpireTime;
	}
	public void setReceiveExpireTime(Date receiveExpireTime) {
		this.receiveExpireTime = receiveExpireTime;
	}

	public Date getSignupExpireTime() {
		return this.signupExpireTime;
	}
	public void setSignupExpireTime(Date signupExpireTime) {
		this.signupExpireTime = signupExpireTime;
	}

	public Date getSignupTime() {
		return this.signupTime;
	}
	public void setSignupTime(Date signupTime) {
		this.signupTime = signupTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubStatus() {
		return this.subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
