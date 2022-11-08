package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 积分流水信息
 *
 * @author auto create
 * @since 1.0, 2022-10-11 17:40:22
 */
public class PointInstruction extends AlipayObject {

	private static final long serialVersionUID = 1539663531323278328L;

	/**
	 * 流水动作
RECEIVE	积分发放
EXCHANGE	积分兑换
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 积分数量
	 */
	@ApiField("point_amount")
	private String pointAmount;

	/**
	 * 原因，成功状态为补充说明，失败状态为失败原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 状态
SUCCESS	成功
PROCCESSING	处理中
FAIL	失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 时间
	 */
	@ApiField("time")
	private Date time;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getPointAmount() {
		return this.pointAmount;
	}
	public void setPointAmount(String pointAmount) {
		this.pointAmount = pointAmount;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getTime() {
		return this.time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

}
