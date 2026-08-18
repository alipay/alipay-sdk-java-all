package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 灵活租期交易信息
 *
 * @author auto create
 * @since 1.0, 2026-08-17 15:12:49
 */
public class FlexibleRentInfo extends AlipayObject {

	private static final long serialVersionUID = 3815163586957452975L;

	/**
	 * 双周租金,单位:元
	 */
	@ApiField("biweekly_rent")
	private String biweeklyRent;

	/**
	 * 月度租金,单位:元
	 */
	@ApiField("monthly_rent")
	private String monthlyRent;

	/**
	 * null
	 */
	@ApiListField("pay_plan")
	@ApiField("rent_pay_info")
	private List<RentPayInfo> payPlan;

	/**
	 * 期数，按照最小维度来传（如果传了周租金，最小维度为周，以此类推）
	 */
	@ApiField("period_count")
	private Long periodCount;

	/**
	 * 季度租金，单位:元
	 */
	@ApiField("quarterly_rent")
	private String quarterlyRent;

	/**
	 * 灵活租期类型
	 */
	@ApiField("rent_type")
	private String rentType;

	/**
	 * 10天租金,单位:元
	 */
	@ApiField("ten_days_rent")
	private String tenDaysRent;

	/**
	 * 周租金,单位:元
	 */
	@ApiField("weekly_rent")
	private String weeklyRent;

	public String getBiweeklyRent() {
		return this.biweeklyRent;
	}
	public void setBiweeklyRent(String biweeklyRent) {
		this.biweeklyRent = biweeklyRent;
	}

	public String getMonthlyRent() {
		return this.monthlyRent;
	}
	public void setMonthlyRent(String monthlyRent) {
		this.monthlyRent = monthlyRent;
	}

	public List<RentPayInfo> getPayPlan() {
		return this.payPlan;
	}
	public void setPayPlan(List<RentPayInfo> payPlan) {
		this.payPlan = payPlan;
	}

	public Long getPeriodCount() {
		return this.periodCount;
	}
	public void setPeriodCount(Long periodCount) {
		this.periodCount = periodCount;
	}

	public String getQuarterlyRent() {
		return this.quarterlyRent;
	}
	public void setQuarterlyRent(String quarterlyRent) {
		this.quarterlyRent = quarterlyRent;
	}

	public String getRentType() {
		return this.rentType;
	}
	public void setRentType(String rentType) {
		this.rentType = rentType;
	}

	public String getTenDaysRent() {
		return this.tenDaysRent;
	}
	public void setTenDaysRent(String tenDaysRent) {
		this.tenDaysRent = tenDaysRent;
	}

	public String getWeeklyRent() {
		return this.weeklyRent;
	}
	public void setWeeklyRent(String weeklyRent) {
		this.weeklyRent = weeklyRent;
	}

}
