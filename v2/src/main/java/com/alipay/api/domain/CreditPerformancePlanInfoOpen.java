package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 计划详情
 *
 * @author auto create
 * @since 1.0, 2024-05-22 14:04:08
 */
public class CreditPerformancePlanInfoOpen extends AlipayObject {

	private static final long serialVersionUID = 7425846565526179681L;

	/**
	 * 计划详情列表
	 */
	@ApiListField("plan_details")
	@ApiField("credit_performance_plan_detail_open")
	private List<CreditPerformancePlanDetailOpen> planDetails;

	/**
	 * 分期总数
	 */
	@ApiField("times")
	private String times;

	/**
	 * 总金额
	 */
	@ApiField("total_actual_amount")
	private String totalActualAmount;

	public List<CreditPerformancePlanDetailOpen> getPlanDetails() {
		return this.planDetails;
	}
	public void setPlanDetails(List<CreditPerformancePlanDetailOpen> planDetails) {
		this.planDetails = planDetails;
	}

	public String getTimes() {
		return this.times;
	}
	public void setTimes(String times) {
		this.times = times;
	}

	public String getTotalActualAmount() {
		return this.totalActualAmount;
	}
	public void setTotalActualAmount(String totalActualAmount) {
		this.totalActualAmount = totalActualAmount;
	}

}
