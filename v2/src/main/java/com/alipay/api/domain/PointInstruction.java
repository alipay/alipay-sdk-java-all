package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 积分流水信息
 *
 * @author auto create
 * @since 1.0, 2024-08-09 16:48:17
 */
public class PointInstruction extends AlipayObject {

	private static final long serialVersionUID = 2422439495934945262L;

	/**
	 * 流水动作
RECEIVE	积分发放
EXCHANGE	积分兑换
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 积分数量，单位个
	 */
	@ApiField("point_amount")
	private String pointAmount;

	/**
	 * 积分类型
	 */
	@ApiField("point_type")
	private String pointType;

	/**
	 * 失败的原因文案描述，例如失败原因为账号异常问题，转账失败等。
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

	public String getPointType() {
		return this.pointType;
	}
	public void setPointType(String pointType) {
		this.pointType = pointType;
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
