package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款计划返回
 *
 * @author auto create
 * @since 1.0, 2023-10-11 15:05:01
 */
public class DeductionPlanResponse extends AlipayObject {

	private static final long serialVersionUID = 8657656693742946868L;

	/**
	 * 卡ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 扣款金额
	 */
	@ApiField("deduction_amount")
	private String deductionAmount;

	/**
	 * 扣款计划状态
	 */
	@ApiField("deduction_plan_status")
	private String deductionPlanStatus;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 原金额
	 */
	@ApiField("original_amount")
	private String originalAmount;

	/**
	 * 期数
	 */
	@ApiField("period")
	private String period;

	/**
	 * 计划扣款时间
	 */
	@ApiField("plan_deduction_time")
	private Date planDeductionTime;

	/**
	 * 扣款计划ID
	 */
	@ApiField("plan_id")
	private String planId;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getDeductionAmount() {
		return this.deductionAmount;
	}
	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public String getDeductionPlanStatus() {
		return this.deductionPlanStatus;
	}
	public void setDeductionPlanStatus(String deductionPlanStatus) {
		this.deductionPlanStatus = deductionPlanStatus;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public Date getPlanDeductionTime() {
		return this.planDeductionTime;
	}
	public void setPlanDeductionTime(Date planDeductionTime) {
		this.planDeductionTime = planDeductionTime;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
