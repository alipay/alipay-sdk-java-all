package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-28 19:07:34
 */
public class PrescriptionInfo extends AlipayObject {

	private static final long serialVersionUID = 1682729333628272478L;

	/**
	 * 活动 ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 渠道，枚举: HM_WEIGHT_LOSS/HM_SLEEP
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 饮食方案，以markdown格式输出
	 */
	@ApiField("diet_plan")
	private String dietPlan;

	/**
	 * 运动方案，以markdown格式输出
	 */
	@ApiField("exercise_plan")
	private String exercisePlan;

	/**
	 * 处方生成时间
	 */
	@ApiField("prescription_generate_time")
	private Date prescriptionGenerateTime;

	/**
	 * 处方 ID
	 */
	@ApiField("prescription_id")
	private String prescriptionId;

	/**
	 * 方案名称
	 */
	@ApiField("prescription_name")
	private String prescriptionName;

	/**
	 * 心理方案，以markdown格式输出
	 */
	@ApiField("psychology_plan")
	private String psychologyPlan;

	/**
	 * 睡眠方案，以markdown格式输出
	 */
	@ApiField("sleep_plan")
	private String sleepPlan;

	/**
	 * 处方状态
	 */
	@ApiField("status")
	private String status;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDietPlan() {
		return this.dietPlan;
	}
	public void setDietPlan(String dietPlan) {
		this.dietPlan = dietPlan;
	}

	public String getExercisePlan() {
		return this.exercisePlan;
	}
	public void setExercisePlan(String exercisePlan) {
		this.exercisePlan = exercisePlan;
	}

	public Date getPrescriptionGenerateTime() {
		return this.prescriptionGenerateTime;
	}
	public void setPrescriptionGenerateTime(Date prescriptionGenerateTime) {
		this.prescriptionGenerateTime = prescriptionGenerateTime;
	}

	public String getPrescriptionId() {
		return this.prescriptionId;
	}
	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getPrescriptionName() {
		return this.prescriptionName;
	}
	public void setPrescriptionName(String prescriptionName) {
		this.prescriptionName = prescriptionName;
	}

	public String getPsychologyPlan() {
		return this.psychologyPlan;
	}
	public void setPsychologyPlan(String psychologyPlan) {
		this.psychologyPlan = psychologyPlan;
	}

	public String getSleepPlan() {
		return this.sleepPlan;
	}
	public void setSleepPlan(String sleepPlan) {
		this.sleepPlan = sleepPlan;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
