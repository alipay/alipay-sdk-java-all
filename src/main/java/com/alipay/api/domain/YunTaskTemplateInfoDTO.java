package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务模版信息
 *
 * @author auto create
 * @since 1.0, 2022-03-17 15:18:28
 */
public class YunTaskTemplateInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4266911774375999438L;

	/**
	 * 小程序id
	 */
	@ApiField("applet_id")
	private String appletId;

	/**
	 * 创建者uid
	 */
	@ApiField("creator_uid")
	private String creatorUid;

	/**
	 * 出资方id
	 */
	@ApiField("funder_id")
	private String funderId;

	/**
	 * 出资方类型
	 */
	@ApiField("funder_type")
	private String funderType;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 激励对象：
SHOP 门店
MERCHANT 商户
HUNTER 导购员
	 */
	@ApiField("incentive")
	private String incentive;

	/**
	 * 激励方式：
PRESTROKE 逐笔
FIXEDLADDER 固定阶梯
ALGOLADDER 算法阶梯
	 */
	@ApiField("incentive_mode")
	private String incentiveMode;

	/**
	 * 激励规则
	 */
	@ApiField("incentive_rule")
	private String incentiveRule;

	/**
	 * 活动方id
	 */
	@ApiField("organizer_id")
	private String organizerId;

	/**
	 * 活动方名称
	 */
	@ApiField("organizer_name")
	private String organizerName;

	/**
	 * 活动方类型
	 */
	@ApiField("organizer_type")
	private String organizerType;

	/**
	 * 归属方服务商id
	 */
	@ApiField("owner_pid")
	private String ownerPid;

	/**
	 * 招商活动信息
	 */
	@ApiField("plan_info")
	private PlanInfo planInfo;

	/**
	 * 任务状态
未发布(UNPUBLISHED)
可发布(PUBLISHABLE)
未开始(NOTSTARTED)
进行中(STARTED)
暂停中(SUSPENDED)
已结束(FINISH)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 任务描述
	 */
	@ApiField("task_desc")
	private String taskDesc;

	/**
	 * 结束时间
	 */
	@ApiField("task_end_time")
	private Date taskEndTime;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 开始时间
	 */
	@ApiField("task_start_time")
	private Date taskStartTime;

	/**
	 * 任务模版id
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

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
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

	public String getIncentiveRule() {
		return this.incentiveRule;
	}
	public void setIncentiveRule(String incentiveRule) {
		this.incentiveRule = incentiveRule;
	}

	public String getOrganizerId() {
		return this.organizerId;
	}
	public void setOrganizerId(String organizerId) {
		this.organizerId = organizerId;
	}

	public String getOrganizerName() {
		return this.organizerName;
	}
	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
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

	public PlanInfo getPlanInfo() {
		return this.planInfo;
	}
	public void setPlanInfo(PlanInfo planInfo) {
		this.planInfo = planInfo;
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
