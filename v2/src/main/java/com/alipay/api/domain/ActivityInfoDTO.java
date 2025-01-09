package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动信息模型，用于创单时，支持付费活动类型订单传入活动特有属性
 *
 * @author auto create
 * @since 1.0, 2024-03-11 10:48:49
 */
public class ActivityInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4621911539629239895L;

	/**
	 * 活动编码ID，活动的唯一标识
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动所在的城市名
	 */
	@ApiField("city")
	private String city;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 活动票链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 活动地点
	 */
	@ApiField("location_name")
	private String locationName;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

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

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
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

	public String getLocationName() {
		return this.locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
