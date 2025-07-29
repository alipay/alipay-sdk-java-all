package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体运动记录
 *
 * @author auto create
 * @since 1.0, 2025-06-04 11:40:33
 */
public class SportsToolRecord extends AlipayObject {

	private static final long serialVersionUID = 3732534994291421821L;

	/**
	 * 加速度传感器步频(步/min)
	 */
	@ApiField("accel_step_frequency")
	private String accelStepFrequency;

	/**
	 * 消耗卡路里（可能为小数）
	 */
	@ApiField("calorie")
	private String calorie;

	/**
	 * 运动距离，单位米（可能为小数）
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 运动时长（单位秒），整数
	 */
	@ApiField("duration")
	private String duration;

	/**
	 * 结束时人脸核验通过
	 */
	@ApiField("finish_face_verify_pass")
	private Boolean finishFaceVerifyPass;

	/**
	 * 运动结束时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/**
	 * 来源appid
	 */
	@ApiField("from_app_id")
	private String fromAppId;

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
	 * 外部业务号
	 */
	@ApiField("out_biz_code")
	private String outBizCode;

	/**
	 * 运动计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 运动记录时间，用户运动开始时间筛选
	 */
	@ApiField("record_date")
	private Date recordDate;

	/**
	 * 运动记录id
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 中途人脸核验通过
	 */
	@ApiField("run_face_verify_pass")
	private Boolean runFaceVerifyPass;

	/**
	 * 速度，统一单位都是(km/h)，（可能为小数）
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
	 * 开始时人脸校验通过
	 */
	@ApiField("start_face_verify_pass")
	private Boolean startFaceVerifyPass;

	/**
	 * 运动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 本次运动过程中产生的步数数量
	 */
	@ApiField("step_count")
	private String stepCount;

	/**
	 * 平均步频(步/min)
	 */
	@ApiField("step_frequency")
	private String stepFrequency;

	/**
	 * 步数信息是否合法
	 */
	@ApiField("step_info_valid")
	private Boolean stepInfoValid;

	/**
	 * 平均步幅(米/步)
	 */
	@ApiField("step_stride")
	private String stepStride;

	public String getAccelStepFrequency() {
		return this.accelStepFrequency;
	}
	public void setAccelStepFrequency(String accelStepFrequency) {
		this.accelStepFrequency = accelStepFrequency;
	}

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

	public Boolean getFinishFaceVerifyPass() {
		return this.finishFaceVerifyPass;
	}
	public void setFinishFaceVerifyPass(Boolean finishFaceVerifyPass) {
		this.finishFaceVerifyPass = finishFaceVerifyPass;
	}

	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public String getFromAppId() {
		return this.fromAppId;
	}
	public void setFromAppId(String fromAppId) {
		this.fromAppId = fromAppId;
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

	public String getOutBizCode() {
		return this.outBizCode;
	}
	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
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

	public Boolean getRunFaceVerifyPass() {
		return this.runFaceVerifyPass;
	}
	public void setRunFaceVerifyPass(Boolean runFaceVerifyPass) {
		this.runFaceVerifyPass = runFaceVerifyPass;
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

	public Boolean getStartFaceVerifyPass() {
		return this.startFaceVerifyPass;
	}
	public void setStartFaceVerifyPass(Boolean startFaceVerifyPass) {
		this.startFaceVerifyPass = startFaceVerifyPass;
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

	public Boolean getStepInfoValid() {
		return this.stepInfoValid;
	}
	public void setStepInfoValid(Boolean stepInfoValid) {
		this.stepInfoValid = stepInfoValid;
	}

	public String getStepStride() {
		return this.stepStride;
	}
	public void setStepStride(String stepStride) {
		this.stepStride = stepStride;
	}

}
