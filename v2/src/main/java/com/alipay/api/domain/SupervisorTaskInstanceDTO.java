package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 超导任务实例信息
 *
 * @author auto create
 * @since 1.0, 2024-09-13 15:20:20
 */
public class SupervisorTaskInstanceDTO extends AlipayObject {

	private static final long serialVersionUID = 7897997568456428242L;

	/**
	 * 激励信息
	 */
	@ApiField("incentive_mode")
	private IncentiveMode incentiveMode;

	/**
	 * 获取金币数
	 */
	@ApiField("receive_point")
	private Long receivePoint;

	/**
	 * 任务描述
	 */
	@ApiField("task_desc")
	private String taskDesc;

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
	 * 赚钱攻略
	 */
	@ApiField("task_rule_pic")
	private String taskRulePic;

	/**
	 * 任务开始时间
	 */
	@ApiField("task_start_time")
	private Date taskStartTime;

	/**
	 * 任务模板状态
	 */
	@ApiField("template_status")
	private String templateStatus;

	/**
	 * 测试积分
	 */
	@ApiField("test_point_amount")
	private Long testPointAmount;

	public IncentiveMode getIncentiveMode() {
		return this.incentiveMode;
	}
	public void setIncentiveMode(IncentiveMode incentiveMode) {
		this.incentiveMode = incentiveMode;
	}

	public Long getReceivePoint() {
		return this.receivePoint;
	}
	public void setReceivePoint(Long receivePoint) {
		this.receivePoint = receivePoint;
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
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

	public String getTaskRulePic() {
		return this.taskRulePic;
	}
	public void setTaskRulePic(String taskRulePic) {
		this.taskRulePic = taskRulePic;
	}

	public Date getTaskStartTime() {
		return this.taskStartTime;
	}
	public void setTaskStartTime(Date taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	public String getTemplateStatus() {
		return this.templateStatus;
	}
	public void setTemplateStatus(String templateStatus) {
		this.templateStatus = templateStatus;
	}

	public Long getTestPointAmount() {
		return this.testPointAmount;
	}
	public void setTestPointAmount(Long testPointAmount) {
		this.testPointAmount = testPointAmount;
	}

}
