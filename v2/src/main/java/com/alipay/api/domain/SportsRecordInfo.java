package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动记录信息
 *
 * @author auto create
 * @since 1.0, 2023-09-01 11:18:49
 */
public class SportsRecordInfo extends AlipayObject {

	private static final long serialVersionUID = 2887137474146852564L;

	/**
	 * 消耗卡路里，实际为 decimal类型，有小数
	 */
	@ApiField("calorie")
	private String calorie;

	/**
	 * 单位米，实际为 decimal类型，有小数
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 运动时长，单位秒，整数
	 */
	@ApiField("duration")
	private String duration;

	/**
	 * 运动结束时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/**
	 * 运动流水的发生日期
	 */
	@ApiField("record_date")
	private Date recordDate;

	/**
	 * 运动流水ID，标识一次运动
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 运动速度，单位 km/h，实际为 decimal类型，有小数
	 */
	@ApiField("speed")
	private String speed;

	/**
	 * 运动状态
	 */
	@ApiField("sport_status")
	private String sportStatus;

	/**
	 * 运动类型
	 */
	@ApiField("sport_type")
	private String sportType;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getCalorie() {
		return this.calorie;
	}
	public void setCalorie(String calorie) {
		this.calorie = calorie;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getDuration() {
		return this.duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public Date getRecordDate() {
		return this.recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getSpeed() {
		return this.speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getSportStatus() {
		return this.sportStatus;
	}
	public void setSportStatus(String sportStatus) {
		this.sportStatus = sportStatus;
	}

	public String getSportType() {
		return this.sportType;
	}
	public void setSportType(String sportType) {
		this.sportType = sportType;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
