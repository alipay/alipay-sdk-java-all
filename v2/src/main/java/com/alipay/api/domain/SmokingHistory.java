package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 吸烟史
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class SmokingHistory extends AlipayObject {

	private static final long serialVersionUID = 5419569974541681641L;

	/**
	 * 日吸烟量（支）
	 */
	@ApiField("daily_smoking")
	private String dailySmoking;

	/**
	 * 单位（支）、包
	 */
	@ApiField("daily_smoking_unit")
	private String dailySmokingUnit;

	/**
	 * 最后吸烟时间
	 */
	@ApiField("last_smoking")
	private String lastSmoking;

	/**
	 * 是否戒烟
	 */
	@ApiField("smoking_cessation")
	private String smokingCessation;

	/**
	 * 吸烟时间（年）
	 */
	@ApiField("smoking_time")
	private String smokingTime;

	/**
	 * 吸烟时间，单位 年、月、日
	 */
	@ApiField("smoking_time_unit")
	private String smokingTimeUnit;

	public String getDailySmoking() {
		return this.dailySmoking;
	}
	public void setDailySmoking(String dailySmoking) {
		this.dailySmoking = dailySmoking;
	}

	public String getDailySmokingUnit() {
		return this.dailySmokingUnit;
	}
	public void setDailySmokingUnit(String dailySmokingUnit) {
		this.dailySmokingUnit = dailySmokingUnit;
	}

	public String getLastSmoking() {
		return this.lastSmoking;
	}
	public void setLastSmoking(String lastSmoking) {
		this.lastSmoking = lastSmoking;
	}

	public String getSmokingCessation() {
		return this.smokingCessation;
	}
	public void setSmokingCessation(String smokingCessation) {
		this.smokingCessation = smokingCessation;
	}

	public String getSmokingTime() {
		return this.smokingTime;
	}
	public void setSmokingTime(String smokingTime) {
		this.smokingTime = smokingTime;
	}

	public String getSmokingTimeUnit() {
		return this.smokingTimeUnit;
	}
	public void setSmokingTimeUnit(String smokingTimeUnit) {
		this.smokingTimeUnit = smokingTimeUnit;
	}

}
