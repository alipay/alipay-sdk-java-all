package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约活动对象
 *
 * @author auto create
 * @since 1.0, 2021-01-19 17:00:24
 */
public class SignActivityDTO extends AlipayObject {

	private static final long serialVersionUID = 7686882636338886569L;

	/**
	 * 活动结束时间
	 */
	@ApiField("activity_end_time")
	private String activityEndTime;

	/**
	 * 活动报名时间
	 */
	@ApiField("activity_entry_time")
	private String activityEntryTime;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动开始时间
	 */
	@ApiField("activity_start_time")
	private String activityStartTime;

	/**
	 * 活动打标名称
	 */
	@ApiField("activity_tag_name")
	private String activityTagName;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	public String getActivityEndTime() {
		return this.activityEndTime;
	}
	public void setActivityEndTime(String activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public String getActivityEntryTime() {
		return this.activityEntryTime;
	}
	public void setActivityEntryTime(String activityEntryTime) {
		this.activityEntryTime = activityEntryTime;
	}

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

	public String getActivityStartTime() {
		return this.activityStartTime;
	}
	public void setActivityStartTime(String activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	public String getActivityTagName() {
		return this.activityTagName;
	}
	public void setActivityTagName(String activityTagName) {
		this.activityTagName = activityTagName;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

}
