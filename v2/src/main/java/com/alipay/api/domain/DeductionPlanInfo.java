package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款计划信息
 *
 * @author auto create
 * @since 1.0, 2024-09-02 16:16:50
 */
public class DeductionPlanInfo extends AlipayObject {

	private static final long serialVersionUID = 1313556461953634213L;

	/**
	 * 扣款金额，单位分
	 */
	@ApiField("deduction_amount")
	private Long deductionAmount;

	/**
	 * 扣款计划状态
	 */
	@ApiField("deduction_plan_status")
	private String deductionPlanStatus;

	/**
	 * 原价金额，单位分
	 */
	@ApiField("original_amount")
	private Long originalAmount;

	/**
	 * 期数
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 计划扣款时间
	 */
	@ApiField("plan_deduction_time")
	private Date planDeductionTime;

	public Long getDeductionAmount() {
		return this.deductionAmount;
	}
	public void setDeductionAmount(Long deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public String getDeductionPlanStatus() {
		return this.deductionPlanStatus;
	}
	public void setDeductionPlanStatus(String deductionPlanStatus) {
		this.deductionPlanStatus = deductionPlanStatus;
	}

	public Long getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(Long originalAmount) {
		this.originalAmount = originalAmount;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public Date getPlanDeductionTime() {
		return this.planDeductionTime;
	}
	public void setPlanDeductionTime(Date planDeductionTime) {
		this.planDeductionTime = planDeductionTime;
	}

}
