package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务详情信息
 *
 * @author auto create
 * @since 1.0, 2021-10-09 11:17:53
 */
public class TaskDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 3548851895574793987L;

	/**
	 * 已领取积分
	 */
	@ApiField("applied_point")
	private Long appliedPoint;

	/**
	 * 任务进度和可领取积分对应关系
	 */
	@ApiField("indicator_point_map")
	private String indicatorPointMap;

	/**
	 * 积分状态；
unFinished：不可领积分；
canFetch：积分待领取；
applied：积分已领取
	 */
	@ApiField("point_status")
	private String pointStatus;

	/**
	 * 任务code，唯一标识
	 */
	@ApiField("task_code")
	private String taskCode;

	/**
	 * 任务当前进度
	 */
	@ApiField("task_current_indicator")
	private Long taskCurrentIndicator;

	/**
	 * 任务描述
	 */
	@ApiField("task_desc")
	private String taskDesc;

	/**
	 * 任务结束时间：格式"yyyy.MM.dd"
	 */
	@ApiField("task_end_time")
	private String taskEndTime;

	/**
	 * 任务图标链接
	 */
	@ApiField("task_icon_url")
	private String taskIconUrl;

	/**
	 * 赚钱攻略
	 */
	@ApiField("task_introduction_url")
	private String taskIntroductionUrl;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务开始时间；格式"yyyy.MM.dd"
	 */
	@ApiField("task_start_time")
	private String taskStartTime;

	/**
	 * 任务状态；
UN_STARTED：未开始；
INIT：未领任务；
RUNNING：进行中；
FINISH：已完成
	 */
	@ApiField("task_status")
	private String taskStatus;

	/**
	 * 任务目标进度
	 */
	@ApiField("task_target_indicator")
	private Long taskTargetIndicator;

	public Long getAppliedPoint() {
		return this.appliedPoint;
	}
	public void setAppliedPoint(Long appliedPoint) {
		this.appliedPoint = appliedPoint;
	}

	public String getIndicatorPointMap() {
		return this.indicatorPointMap;
	}
	public void setIndicatorPointMap(String indicatorPointMap) {
		this.indicatorPointMap = indicatorPointMap;
	}

	public String getPointStatus() {
		return this.pointStatus;
	}
	public void setPointStatus(String pointStatus) {
		this.pointStatus = pointStatus;
	}

	public String getTaskCode() {
		return this.taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public Long getTaskCurrentIndicator() {
		return this.taskCurrentIndicator;
	}
	public void setTaskCurrentIndicator(Long taskCurrentIndicator) {
		this.taskCurrentIndicator = taskCurrentIndicator;
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getTaskEndTime() {
		return this.taskEndTime;
	}
	public void setTaskEndTime(String taskEndTime) {
		this.taskEndTime = taskEndTime;
	}

	public String getTaskIconUrl() {
		return this.taskIconUrl;
	}
	public void setTaskIconUrl(String taskIconUrl) {
		this.taskIconUrl = taskIconUrl;
	}

	public String getTaskIntroductionUrl() {
		return this.taskIntroductionUrl;
	}
	public void setTaskIntroductionUrl(String taskIntroductionUrl) {
		this.taskIntroductionUrl = taskIntroductionUrl;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskStartTime() {
		return this.taskStartTime;
	}
	public void setTaskStartTime(String taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Long getTaskTargetIndicator() {
		return this.taskTargetIndicator;
	}
	public void setTaskTargetIndicator(Long taskTargetIndicator) {
		this.taskTargetIndicator = taskTargetIndicator;
	}

}
