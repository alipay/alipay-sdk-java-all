package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗金反活动信息
 *
 * @author auto create
 * @since 1.0, 2026-10-09 17:06:12
 */
public class HbmtActivityInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2766718841135156585L;

	/**
	 * 活动通用描述
	 */
	@ApiField("activity_description")
	private String activityDescription;

	/**
	 * 花呗商户合作活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * FLAT：统一比例模式，这种模式下所有亲密度等级下反花呗金比例一致；INTIMACY：亲密度模式这种模式下不同亲密度等级设置的反花呗金比例不同
	 */
	@ApiField("calc_mode")
	private String calcMode;

	/**
	 * 默认返金比例（百分比），两种反花呗金模式下的兜底比例
	 */
	@ApiField("default_percentage")
	private String defaultPercentage;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 统一返金比例（百分比），如 "0.5" 表示 0.5%；仅 FLAT 模式返回
	 */
	@ApiField("flat_ratio")
	private String flatRatio;

	/**
	 * 单笔封顶值（花呗金币数）；0 表示不封顶
	 */
	@ApiField("flat_ratio_cap")
	private Long flatRatioCap;

	/**
	 * 各等级返金比例，JSON 字符串，如 {"G1":"0.5","G2":"0.8"}；FLAT 模式下所有亲密度下的比例都是一样的
	 */
	@ApiField("level_pricing")
	private PreConsultMap levelPricing;

	/**
	 * 活动开始时间，格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getActivityDescription() {
		return this.activityDescription;
	}
	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getCalcMode() {
		return this.calcMode;
	}
	public void setCalcMode(String calcMode) {
		this.calcMode = calcMode;
	}

	public String getDefaultPercentage() {
		return this.defaultPercentage;
	}
	public void setDefaultPercentage(String defaultPercentage) {
		this.defaultPercentage = defaultPercentage;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFlatRatio() {
		return this.flatRatio;
	}
	public void setFlatRatio(String flatRatio) {
		this.flatRatio = flatRatio;
	}

	public Long getFlatRatioCap() {
		return this.flatRatioCap;
	}
	public void setFlatRatioCap(Long flatRatioCap) {
		this.flatRatioCap = flatRatioCap;
	}

	public PreConsultMap getLevelPricing() {
		return this.levelPricing;
	}
	public void setLevelPricing(PreConsultMap levelPricing) {
		this.levelPricing = levelPricing;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
