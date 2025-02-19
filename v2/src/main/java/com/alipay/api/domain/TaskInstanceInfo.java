package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 导购员查询任务实例详情
 *
 * @author auto create
 * @since 1.0, 2024-08-09 16:47:52
 */
public class TaskInstanceInfo extends AlipayObject {

	private static final long serialVersionUID = 7362769147137119511L;

	/**
	 * 当前进度，单位为笔，例如12为12笔
	 */
	@ApiField("current_indicator")
	private Long currentIndicator;

	/**
	 * 激励方式
	 */
	@ApiField("incentive_mode")
	private String incentiveMode;

	/**
	 * 激励规则
	 */
	@ApiField("incentive_rule")
	private String incentiveRule;

	/**
	 * 任务标的物推广数，单位为个
	 */
	@ApiField("marker_promoted_count")
	private Long markerPromotedCount;

	/**
	 * 任务最大激励笔数，单位个
	 */
	@ApiField("max_incentive_count")
	private Long maxIncentiveCount;

	/**
	 * 任务获取总积分数，单位为个
	 */
	@ApiField("published_point_amount")
	private Long publishedPointAmount;

	/**
	 * 任务实例状态
UNRECEIVED 未领取
RECEIVED 已领取
FINISHED  任务完成
	 */
	@ApiField("status")
	private String status;

	/**
	 * 目标进度，单位为笔，112代表112笔
	 */
	@ApiField("target_indicator")
	private Long targetIndicator;

	/**
	 * 新人任务
	 */
	@ApiField("task_desc")
	private String taskDesc;

	/**
	 * 任务结束时间
	 */
	@ApiField("task_end_time")
	private Date taskEndTime;

	/**
	 * 任务推广背景图
	 */
	@ApiField("task_img")
	private String taskImg;

	/**
	 * 任务实例id
	 */
	@ApiField("task_instance_id")
	private String taskInstanceId;

	/**
	 * 任务logo
	 */
	@ApiField("task_logo")
	private String taskLogo;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务规则图片
	 */
	@ApiField("task_rule_pic")
	private String taskRulePic;

	/**
	 * 任务开始时间
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

	/**
	 * 验证积分数量，单位个
	 */
	@ApiField("test_point_amount")
	private String testPointAmount;

	/**
	 * 任务最多可获取积分数，单位为个
	 */
	@ApiField("total_point_amount")
	private Long totalPointAmount;

	/**
	 * 未兑换积分数，单位为个
	 */
	@ApiField("unexchange_point_amount")
	private Long unexchangePointAmount;

	public Long getCurrentIndicator() {
		return this.currentIndicator;
	}
	public void setCurrentIndicator(Long currentIndicator) {
		this.currentIndicator = currentIndicator;
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

	public Long getMarkerPromotedCount() {
		return this.markerPromotedCount;
	}
	public void setMarkerPromotedCount(Long markerPromotedCount) {
		this.markerPromotedCount = markerPromotedCount;
	}

	public Long getMaxIncentiveCount() {
		return this.maxIncentiveCount;
	}
	public void setMaxIncentiveCount(Long maxIncentiveCount) {
		this.maxIncentiveCount = maxIncentiveCount;
	}

	public Long getPublishedPointAmount() {
		return this.publishedPointAmount;
	}
	public void setPublishedPointAmount(Long publishedPointAmount) {
		this.publishedPointAmount = publishedPointAmount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTargetIndicator() {
		return this.targetIndicator;
	}
	public void setTargetIndicator(Long targetIndicator) {
		this.targetIndicator = targetIndicator;
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

	public String getTaskImg() {
		return this.taskImg;
	}
	public void setTaskImg(String taskImg) {
		this.taskImg = taskImg;
	}

	public String getTaskInstanceId() {
		return this.taskInstanceId;
	}
	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	public String getTaskLogo() {
		return this.taskLogo;
	}
	public void setTaskLogo(String taskLogo) {
		this.taskLogo = taskLogo;
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

	public String getTestPointAmount() {
		return this.testPointAmount;
	}
	public void setTestPointAmount(String testPointAmount) {
		this.testPointAmount = testPointAmount;
	}

	public Long getTotalPointAmount() {
		return this.totalPointAmount;
	}
	public void setTotalPointAmount(Long totalPointAmount) {
		this.totalPointAmount = totalPointAmount;
	}

	public Long getUnexchangePointAmount() {
		return this.unexchangePointAmount;
	}
	public void setUnexchangePointAmount(Long unexchangePointAmount) {
		this.unexchangePointAmount = unexchangePointAmount;
	}

}
