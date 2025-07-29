package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约计划详情，用来操作履约计划详情变更
 *
 * @author auto create
 * @since 1.0, 2024-05-22 14:04:08
 */
public class CreditPerformancePlanDetailOpen extends AlipayObject {

	private static final long serialVersionUID = 8843414872797732487L;

	/**
	 * 金额，单位为：元（人民币），精确到小数点后两位。
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 扣款时间
如需要修改时间则必传
	 */
	@ApiField("expected_pay_time")
	private Date expectedPayTime;

	/**
	 * 期数/扣款顺序
	 */
	@ApiField("plan_detail_number")
	private String planDetailNumber;

	public String getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public Date getExpectedPayTime() {
		return this.expectedPayTime;
	}
	public void setExpectedPayTime(Date expectedPayTime) {
		this.expectedPayTime = expectedPayTime;
	}

	public String getPlanDetailNumber() {
		return this.planDetailNumber;
	}
	public void setPlanDetailNumber(String planDetailNumber) {
		this.planDetailNumber = planDetailNumber;
	}

}
