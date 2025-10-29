package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 履约计划详情信息
 *
 * @author auto create
 * @since 1.0, 2025-10-27 09:58:58
 */
public class CreditPerformancePlanInfoOpen extends AlipayObject {

	private static final long serialVersionUID = 1736394876757931582L;

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
	 * 履约计划总金额，中文币种CNY，比如10.00元
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
