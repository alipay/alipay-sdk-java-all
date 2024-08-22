package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云子风险项
 *
 * @author auto create
 * @since 1.0, 2024-03-29 16:25:19
 */
public class SubRentRiskResult extends AlipayObject {

	private static final long serialVersionUID = 2733634628656446211L;

	/**
	 * 基础履约风险
	 */
	@ApiField("base_performance_risk")
	private SubRentRiskItem basePerformanceRisk;

	/**
	 * 共租风险
	 */
	@ApiField("multi_rent_risk")
	private SubRentRiskItem multiRentRisk;

	/**
	 * 逾期风险
	 */
	@ApiField("overdue_risk")
	private SubRentRiskItem overdueRisk;

	public SubRentRiskItem getBasePerformanceRisk() {
		return this.basePerformanceRisk;
	}
	public void setBasePerformanceRisk(SubRentRiskItem basePerformanceRisk) {
		this.basePerformanceRisk = basePerformanceRisk;
	}

	public SubRentRiskItem getMultiRentRisk() {
		return this.multiRentRisk;
	}
	public void setMultiRentRisk(SubRentRiskItem multiRentRisk) {
		this.multiRentRisk = multiRentRisk;
	}

	public SubRentRiskItem getOverdueRisk() {
		return this.overdueRisk;
	}
	public void setOverdueRisk(SubRentRiskItem overdueRisk) {
		this.overdueRisk = overdueRisk;
	}

}
