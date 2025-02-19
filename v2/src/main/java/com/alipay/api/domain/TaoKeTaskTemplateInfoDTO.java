package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客任务模板信息
 *
 * @author auto create
 * @since 1.0, 2023-12-15 10:18:55
 */
public class TaoKeTaskTemplateInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1721683227921124453L;

	/**
	 * 跳转链接
	 */
	@ApiField("applet_id")
	private String appletId;

	/**
	 * 创建者的uid
	 */
	@ApiField("creator_uid")
	private String creatorUid;

	/**
	 * 出资方id
	 */
	@ApiField("funder_id")
	private String funderId;

	/**
	 * 赞助者类型
	 */
	@ApiField("funder_type")
	private String funderType;

	/**
	 * 激励对象：
HUNTER 导购员
	 */
	@ApiField("incentive")
	private String incentive;

	/**
	 * 激励方式：
REALAMOUNT_RATIO购买金额比例
	 */
	@ApiField("incentive_mode")
	private String incentiveMode;

	/**
	 * 激励规则
	 */
	@ApiField("incentive_rule")
	private RealAmountRatioIncentiveRule incentiveRule;

	/**
	 * 任务可以被领取的最大次数
	 */
	@ApiField("max_receive_num")
	private String maxReceiveNum;

	/**
	 * 活动方id
	 */
	@ApiField("organizer_id")
	private String organizerId;

	/**
	 * 活动方类型
	 */
	@ApiField("organizer_type")
	private String organizerType;

	/**
	 * 归属方的id
	 */
	@ApiField("owner_pid")
	private String ownerPid;

	/**
	 * 任务状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 任务描述
	 */
	@ApiField("task_desc")
	private String taskDesc;

	/**
	 * 任务失效时间
	 */
	@ApiField("task_end_time")
	private Date taskEndTime;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务模板生效时间
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

	public String getAppletId() {
		return this.appletId;
	}
	public void setAppletId(String appletId) {
		this.appletId = appletId;
	}

	public String getCreatorUid() {
		return this.creatorUid;
	}
	public void setCreatorUid(String creatorUid) {
		this.creatorUid = creatorUid;
	}

	public String getFunderId() {
		return this.funderId;
	}
	public void setFunderId(String funderId) {
		this.funderId = funderId;
	}

	public String getFunderType() {
		return this.funderType;
	}
	public void setFunderType(String funderType) {
		this.funderType = funderType;
	}

	public String getIncentive() {
		return this.incentive;
	}
	public void setIncentive(String incentive) {
		this.incentive = incentive;
	}

	public String getIncentiveMode() {
		return this.incentiveMode;
	}
	public void setIncentiveMode(String incentiveMode) {
		this.incentiveMode = incentiveMode;
	}

	public RealAmountRatioIncentiveRule getIncentiveRule() {
		return this.incentiveRule;
	}
	public void setIncentiveRule(RealAmountRatioIncentiveRule incentiveRule) {
		this.incentiveRule = incentiveRule;
	}

	public String getMaxReceiveNum() {
		return this.maxReceiveNum;
	}
	public void setMaxReceiveNum(String maxReceiveNum) {
		this.maxReceiveNum = maxReceiveNum;
	}

	public String getOrganizerId() {
		return this.organizerId;
	}
	public void setOrganizerId(String organizerId) {
		this.organizerId = organizerId;
	}

	public String getOrganizerType() {
		return this.organizerType;
	}
	public void setOrganizerType(String organizerType) {
		this.organizerType = organizerType;
	}

	public String getOwnerPid() {
		return this.ownerPid;
	}
	public void setOwnerPid(String ownerPid) {
		this.ownerPid = ownerPid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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

}
