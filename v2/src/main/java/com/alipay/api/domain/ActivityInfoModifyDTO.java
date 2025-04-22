package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动信息修改模型，用于商家同步修改履约信息
 *
 * @author auto create
 * @since 1.0, 2024-03-11 10:50:14
 */
public class ActivityInfoModifyDTO extends AlipayObject {

	private static final long serialVersionUID = 1679734753367225648L;

	/**
	 * 活动编码ID，活动的唯一标识
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 需要更新的活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 需要更新的活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 需要更新的活动票据链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 需要更新的活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 需要更新的活动状态
	 */
	@ApiField("status")
	private String status;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
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

}
