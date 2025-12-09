package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处置当面付处罚结果消息体
 *
 * @author auto create
 * @since 1.0, 2022-12-21 10:10:43
 */
public class DisposalResult extends AlipayObject {

	private static final long serialVersionUID = 6255616544328617562L;

	/**
	 * 流程结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 主体ID
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 流程开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 处置状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 策略code
	 */
	@ApiField("strategy_code")
	private String strategyCode;

	/**
	 * 处置系统唯一标识
	 */
	@ApiField("task_code")
	private String taskCode;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStrategyCode() {
		return this.strategyCode;
	}
	public void setStrategyCode(String strategyCode) {
		this.strategyCode = strategyCode;
	}

	public String getTaskCode() {
		return this.taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

}
