package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 灵活租期交易信息
 *
 * @author auto create
 * @since 1.0, 2026-08-07 15:35:43
 */
public class FlexibleRentInfo extends AlipayObject {

	private static final long serialVersionUID = 6821462947272645269L;

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
	 * 期数，按照最小维度来传
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

}
