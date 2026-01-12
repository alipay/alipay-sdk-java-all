package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业代扣计划
 *
 * @author auto create
 * @since 1.0, 2024-09-26 18:30:34
 */
public class IndustryWithholdPlanDTO extends AlipayObject {

	private static final long serialVersionUID = 4384519171411573758L;

	/**
	 * 某一笔交易中的已扣款金额，单位为分
	 */
	@ApiField("deducted_amount")
	private Long deductedAmount;

	/**
	 * 代扣计划期号
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 当前期号下的已还款金额，单位为分
	 */
	@ApiField("repayed_amount")
	private Long repayedAmount;

	/**
	 * 当前期号的代扣计划状态。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 待扣款金额，单位为分
	 */
	@ApiField("to_deduct_amount")
	private Long toDeductAmount;

	/**
	 * 当前期号下的总代还金额，单位为分
	 */
	@ApiField("total_to_repay_amount")
	private Long totalToRepayAmount;

	/**
	 * 当前期号代扣执行日期
	 */
	@ApiField("withhold_date")
	private Date withholdDate;

	public Long getDeductedAmount() {
		return this.deductedAmount;
	}
	public void setDeductedAmount(Long deductedAmount) {
		this.deductedAmount = deductedAmount;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public Long getRepayedAmount() {
		return this.repayedAmount;
	}
	public void setRepayedAmount(Long repayedAmount) {
		this.repayedAmount = repayedAmount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getToDeductAmount() {
		return this.toDeductAmount;
	}
	public void setToDeductAmount(Long toDeductAmount) {
		this.toDeductAmount = toDeductAmount;
	}

	public Long getTotalToRepayAmount() {
		return this.totalToRepayAmount;
	}
	public void setTotalToRepayAmount(Long totalToRepayAmount) {
		this.totalToRepayAmount = totalToRepayAmount;
	}

	public Date getWithholdDate() {
		return this.withholdDate;
	}
	public void setWithholdDate(Date withholdDate) {
		this.withholdDate = withholdDate;
	}

}
