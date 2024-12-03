package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款借据还款计划ITEM
 *
 * @author auto create
 * @since 1.0, 2024-08-06 11:23:56
 */
public class ConsumerLoanLoanRepayPlanInfoItem extends AlipayObject {

	private static final long serialVersionUID = 1252557626598816615L;

	/**
	 * 担保费或保险费，单位为分，1000代表10.00元，若无该项费用可填0
	 */
	@ApiField("insurance_amount")
	private Long insuranceAmount;

	/**
	 * 利息，单位为分，1000代表10.00元
	 */
	@ApiField("interest_amount")
	private Long interestAmount;

	/**
	 * 罚息，单位为分，1000代表10.00元，若无该项费用可填0
	 */
	@ApiField("penalty_interest_amount")
	private Long penaltyInterestAmount;

	/**
	 * 还款计划周期数
	 */
	@ApiField("period_number")
	private Long periodNumber;

	/**
	 * 本金，单位为分，1000代表10.00元
	 */
	@ApiField("principal_amount")
	private Long principalAmount;

	/**
	 * 还款金额，单位为分，1000代表10.00元
	 */
	@ApiField("repay_amount")
	private Long repayAmount;

	/**
	 * 还款日期（YYYY-MM-DD hh:mm:ss）
	 */
	@ApiField("repay_date")
	private String repayDate;

	/**
	 * 还款计划状态，包含逾期（OVER_DUE）或正常（NORMAL）
	 */
	@ApiField("status")
	private String status;

	public Long getInsuranceAmount() {
		return this.insuranceAmount;
	}
	public void setInsuranceAmount(Long insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public Long getInterestAmount() {
		return this.interestAmount;
	}
	public void setInterestAmount(Long interestAmount) {
		this.interestAmount = interestAmount;
	}

	public Long getPenaltyInterestAmount() {
		return this.penaltyInterestAmount;
	}
	public void setPenaltyInterestAmount(Long penaltyInterestAmount) {
		this.penaltyInterestAmount = penaltyInterestAmount;
	}

	public Long getPeriodNumber() {
		return this.periodNumber;
	}
	public void setPeriodNumber(Long periodNumber) {
		this.periodNumber = periodNumber;
	}

	public Long getPrincipalAmount() {
		return this.principalAmount;
	}
	public void setPrincipalAmount(Long principalAmount) {
		this.principalAmount = principalAmount;
	}

	public Long getRepayAmount() {
		return this.repayAmount;
	}
	public void setRepayAmount(Long repayAmount) {
		this.repayAmount = repayAmount;
	}

	public String getRepayDate() {
		return this.repayDate;
	}
	public void setRepayDate(String repayDate) {
		this.repayDate = repayDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
