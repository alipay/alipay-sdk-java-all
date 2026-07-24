package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-21 19:27:52
 */
public class ConsultantGrowthRecordVO extends AlipayObject {

	private static final long serialVersionUID = 4632856247484391631L;

	/**
	 * 月龄（由出生日期与recordDate计算）
	 */
	@ApiField("age_in_months")
	private Long ageInMonths;

	/**
	 * BMI指数，保留两位小数
	 */
	@ApiField("bmi")
	private String bmi;

	/**
	 * 身高，单位：厘米（cm），保留两位小数
	 */
	@ApiField("growth_height")
	private String growthHeight;

	/**
	 * 体重，单位：千克（kg），保留两位小数
	 */
	@ApiField("growth_weight")
	private String growthWeight;

	/**
	 * 头围，单位：厘米（cm），3岁以下，保留两位小数
	 */
	@ApiField("head_circumference")
	private String headCircumference;

	/**
	 * 记录业务键（同时作为该记录对应 AI 解读的 interpBizId）
	 */
	@ApiField("record_biz_id")
	private String recordBizId;

	/**
	 * 记录日期，格式：yyyy-MM-dd
	 */
	@ApiField("record_date")
	private String recordDate;

	public Long getAgeInMonths() {
		return this.ageInMonths;
	}
	public void setAgeInMonths(Long ageInMonths) {
		this.ageInMonths = ageInMonths;
	}

	public String getBmi() {
		return this.bmi;
	}
	public void setBmi(String bmi) {
		this.bmi = bmi;
	}

	public String getGrowthHeight() {
		return this.growthHeight;
	}
	public void setGrowthHeight(String growthHeight) {
		this.growthHeight = growthHeight;
	}

	public String getGrowthWeight() {
		return this.growthWeight;
	}
	public void setGrowthWeight(String growthWeight) {
		this.growthWeight = growthWeight;
	}

	public String getHeadCircumference() {
		return this.headCircumference;
	}
	public void setHeadCircumference(String headCircumference) {
		this.headCircumference = headCircumference;
	}

	public String getRecordBizId() {
		return this.recordBizId;
	}
	public void setRecordBizId(String recordBizId) {
		this.recordBizId = recordBizId;
	}

	public String getRecordDate() {
		return this.recordDate;
	}
	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}

}
