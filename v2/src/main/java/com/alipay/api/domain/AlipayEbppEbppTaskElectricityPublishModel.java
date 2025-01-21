package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟电厂任务发布
 *
 * @author auto create
 * @since 1.0, 2024-08-30 10:21:37
 */
public class AlipayEbppEbppTaskElectricityPublishModel extends AlipayObject {

	private static final long serialVersionUID = 5694137282724388414L;

	/**
	 * 任务结束响应时间，精确到秒
	 */
	@ApiField("active_end_time")
	private Date activeEndTime;

	/**
	 * 任务开始响应时间
	 */
	@ApiField("active_start_time")
	private Date activeStartTime;

	/**
	 * 是否有奖励
	 */
	@ApiField("have_reward")
	private String haveReward;

	/**
	 * 演练
	 */
	@ApiField("is_test")
	private String isTest;

	/**
	 * 电科院任务id
	 */
	@ApiField("out_task_id")
	private String outTaskId;

	/**
	 * 任务规则描述
	 */
	@ApiField("rule_info")
	private String ruleInfo;

	/**
	 * 户号或供电单位编号
	 */
	@ApiField("task_active_data")
	private String taskActiveData;

	/**
	 * 执行范围-01 供电单位代码、02 户号
	 */
	@ApiField("task_active_range")
	private String taskActiveRange;

	/**
	 * 削峰填谷，单位为Kw
	 */
	@ApiField("task_active_target")
	private String taskActiveTarget;

	/**
	 * 任务编号，电科院下发任务编号
	 */
	@ApiField("task_event_no")
	private String taskEventNo;

	/**
	 * 任务截止报名时间
	 */
	@ApiField("task_join_limit_time")
	private Date taskJoinLimitTime;

	/**
	 * 省码
	 */
	@ApiField("task_province_code")
	private String taskProvinceCode;

	/**
	 * 任务响应级别：0：分钟级 1：小时级 2：日前级
	 */
	@ApiField("task_response_level")
	private String taskResponseLevel;

	/**
	 * 任务类型：01-削峰 02-填谷 03-温控
	 */
	@ApiField("task_type")
	private String taskType;

	/**
	 * 温控任务指标，当任务类型是03时，必填，精确到千瓦时
	 */
	@ApiField("tempreture_active_data")
	private String tempretureActiveData;

	public Date getActiveEndTime() {
		return this.activeEndTime;
	}
	public void setActiveEndTime(Date activeEndTime) {
		this.activeEndTime = activeEndTime;
	}

	public Date getActiveStartTime() {
		return this.activeStartTime;
	}
	public void setActiveStartTime(Date activeStartTime) {
		this.activeStartTime = activeStartTime;
	}

	public String getHaveReward() {
		return this.haveReward;
	}
	public void setHaveReward(String haveReward) {
		this.haveReward = haveReward;
	}

	public String getIsTest() {
		return this.isTest;
	}
	public void setIsTest(String isTest) {
		this.isTest = isTest;
	}

	public String getOutTaskId() {
		return this.outTaskId;
	}
	public void setOutTaskId(String outTaskId) {
		this.outTaskId = outTaskId;
	}

	public String getRuleInfo() {
		return this.ruleInfo;
	}
	public void setRuleInfo(String ruleInfo) {
		this.ruleInfo = ruleInfo;
	}

	public String getTaskActiveData() {
		return this.taskActiveData;
	}
	public void setTaskActiveData(String taskActiveData) {
		this.taskActiveData = taskActiveData;
	}

	public String getTaskActiveRange() {
		return this.taskActiveRange;
	}
	public void setTaskActiveRange(String taskActiveRange) {
		this.taskActiveRange = taskActiveRange;
	}

	public String getTaskActiveTarget() {
		return this.taskActiveTarget;
	}
	public void setTaskActiveTarget(String taskActiveTarget) {
		this.taskActiveTarget = taskActiveTarget;
	}

	public String getTaskEventNo() {
		return this.taskEventNo;
	}
	public void setTaskEventNo(String taskEventNo) {
		this.taskEventNo = taskEventNo;
	}

	public Date getTaskJoinLimitTime() {
		return this.taskJoinLimitTime;
	}
	public void setTaskJoinLimitTime(Date taskJoinLimitTime) {
		this.taskJoinLimitTime = taskJoinLimitTime;
	}

	public String getTaskProvinceCode() {
		return this.taskProvinceCode;
	}
	public void setTaskProvinceCode(String taskProvinceCode) {
		this.taskProvinceCode = taskProvinceCode;
	}

	public String getTaskResponseLevel() {
		return this.taskResponseLevel;
	}
	public void setTaskResponseLevel(String taskResponseLevel) {
		this.taskResponseLevel = taskResponseLevel;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTempretureActiveData() {
		return this.tempretureActiveData;
	}
	public void setTempretureActiveData(String tempretureActiveData) {
		this.tempretureActiveData = tempretureActiveData;
	}

}
