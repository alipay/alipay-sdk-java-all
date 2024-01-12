package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动记录信息
 *
 * @author auto create
 * @since 1.0, 2023-12-07 19:32:41
 */
public class SportsRecordInfo extends AlipayObject {

	private static final long serialVersionUID = 2722392179349529571L;

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
	 * 最高海拔，单位米
	 */
	@ApiField("max_altitude")
	private String maxAltitude;

	/**
	 * 最低海拔，单位米
	 */
	@ApiField("min_altitude")
	private String minAltitude;

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

	/**
	 * 步数
	 */
	@ApiField("step_count")
	private String stepCount;

	/**
	 * 步频，一分钟多少步
	 */
	@ApiField("step_frequency")
	private String stepFrequency;

	/**
	 * 步幅，一步多少米
	 */
	@ApiField("step_stride")
	private String stepStride;

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

	public String getMaxAltitude() {
		return this.maxAltitude;
	}
	public void setMaxAltitude(String maxAltitude) {
		this.maxAltitude = maxAltitude;
	}

	public String getMinAltitude() {
		return this.minAltitude;
	}
	public void setMinAltitude(String minAltitude) {
		this.minAltitude = minAltitude;
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

	public String getStepCount() {
		return this.stepCount;
	}
	public void setStepCount(String stepCount) {
		this.stepCount = stepCount;
	}

	public String getStepFrequency() {
		return this.stepFrequency;
	}
	public void setStepFrequency(String stepFrequency) {
		this.stepFrequency = stepFrequency;
	}

	public String getStepStride() {
		return this.stepStride;
	}
	public void setStepStride(String stepStride) {
		this.stepStride = stepStride;
	}

}
