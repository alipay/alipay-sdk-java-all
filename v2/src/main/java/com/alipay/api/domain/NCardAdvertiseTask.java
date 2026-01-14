package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * n线圈广告作业任务单据
 *
 * @author auto create
 * @since 1.0, 2025-05-21 17:16:31
 */
public class NCardAdvertiseTask extends AlipayObject {

	private static final long serialVersionUID = 1896998368626583713L;

	/**
	 * 广告媒体类型
	 */
	@ApiField("advertise_type")
	private String advertiseType;

	/**
	 * 线圈在这个点位安装的具体位置
	 */
	@ApiField("card_install_location")
	private String cardInstallLocation;

	/**
	 * 作业人员脱敏名称
	 */
	@ApiField("desens_staff_name")
	private String desensStaffName;

	/**
	 * 某个海报点位的唯一id
	 */
	@ApiField("position_id")
	private String positionId;

	/**
	 * 对应一个作业单、线圈的所在位置
	 */
	@ApiField("position_name")
	private String positionName;

	/**
	 * 说明当前点位作业状态，完成绑定、验证、审核通过则算作业完成
	 */
	@ApiField("status")
	private String status;

	/**
	 * 线圈唯一业务标识
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 作业单唯一id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 作业完成时间，只有完成作业单才有，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("work_end_time")
	private String workEndTime;

	/**
	 * 进入作业状态后，开始作业的时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("work_start_time")
	private String workStartTime;

	public String getAdvertiseType() {
		return this.advertiseType;
	}
	public void setAdvertiseType(String advertiseType) {
		this.advertiseType = advertiseType;
	}

	public String getCardInstallLocation() {
		return this.cardInstallLocation;
	}
	public void setCardInstallLocation(String cardInstallLocation) {
		this.cardInstallLocation = cardInstallLocation;
	}

	public String getDesensStaffName() {
		return this.desensStaffName;
	}
	public void setDesensStaffName(String desensStaffName) {
		this.desensStaffName = desensStaffName;
	}

	public String getPositionId() {
		return this.positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return this.positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getWorkEndTime() {
		return this.workEndTime;
	}
	public void setWorkEndTime(String workEndTime) {
		this.workEndTime = workEndTime;
	}

	public String getWorkStartTime() {
		return this.workStartTime;
	}
	public void setWorkStartTime(String workStartTime) {
		this.workStartTime = workStartTime;
	}

}
