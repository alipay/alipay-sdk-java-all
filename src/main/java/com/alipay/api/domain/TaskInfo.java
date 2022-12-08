package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务列表
 *
 * @author auto create
 * @since 1.0, 2021-12-29 16:31:11
 */
public class TaskInfo extends AlipayObject {

	private static final long serialVersionUID = 3664794595818378282L;

	/**
	 * 已获得积分数
	 */
	@ApiField("earned_point")
	private Long earnedPoint;

	/**
	 * 任务归属类型
PLATFORM：平台
THIRD_PARTY：三方
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 任务code，唯一标识
	 */
	@ApiField("task_code")
	private String taskCode;

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
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务剩余积分数
	 */
	@ApiField("task_remain_point")
	private Long taskRemainPoint;

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
	 * 总积分数
	 */
	@ApiField("total_point")
	private Long totalPoint;

	public Long getEarnedPoint() {
		return this.earnedPoint;
	}
	public void setEarnedPoint(Long earnedPoint) {
		this.earnedPoint = earnedPoint;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getTaskCode() {
		return this.taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
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

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Long getTaskRemainPoint() {
		return this.taskRemainPoint;
	}
	public void setTaskRemainPoint(Long taskRemainPoint) {
		this.taskRemainPoint = taskRemainPoint;
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

	public Long getTotalPoint() {
		return this.totalPoint;
	}
	public void setTotalPoint(Long totalPoint) {
		this.totalPoint = totalPoint;
	}

}
