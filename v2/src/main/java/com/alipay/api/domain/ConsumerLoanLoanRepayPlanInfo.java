package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消费贷还款借据还款计划信息
 *
 * @author auto create
 * @since 1.0, 2024-08-06 11:23:56
 */
public class ConsumerLoanLoanRepayPlanInfo extends AlipayObject {

	private static final long serialVersionUID = 2889843315936559157L;

	/**
	 * 剩余还款期数
	 */
	@ApiField("last_period_count")
	private Long lastPeriodCount;

	/**
	 * 剩余待还本金，单位为分，1000代表10.00元
	 */
	@ApiField("last_principal_amount")
	private Long lastPrincipalAmount;

	/**
	 * 借据金额，单位为分，1000代表10.00元
	 */
	@ApiField("loan_amount")
	private Long loanAmount;

	/**
	 * 贷款日期
	 */
	@ApiField("loan_date")
	private String loanDate;

	/**
	 * 所属借据ID
	 */
	@ApiField("loan_id")
	private String loanId;

	/**
	 * 还款方式，包含等额本息（EQUAL），先息后本（NOT_EQUAL）
	 */
	@ApiField("repay_method")
	private String repayMethod;

	/**
	 * 借据还款计划详情列表
	 */
	@ApiListField("repay_plan_record")
	@ApiField("consumer_loan_loan_repay_plan_info_item")
	private List<ConsumerLoanLoanRepayPlanInfoItem> repayPlanRecord;

	/**
	 * 总还款期数
	 */
	@ApiField("total_period_count")
	private Long totalPeriodCount;

	public Long getLastPeriodCount() {
		return this.lastPeriodCount;
	}
	public void setLastPeriodCount(Long lastPeriodCount) {
		this.lastPeriodCount = lastPeriodCount;
	}

	public Long getLastPrincipalAmount() {
		return this.lastPrincipalAmount;
	}
	public void setLastPrincipalAmount(Long lastPrincipalAmount) {
		this.lastPrincipalAmount = lastPrincipalAmount;
	}

	public Long getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanDate() {
		return this.loanDate;
	}
	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}

	public String getLoanId() {
		return this.loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public String getRepayMethod() {
		return this.repayMethod;
	}
	public void setRepayMethod(String repayMethod) {
		this.repayMethod = repayMethod;
	}

	public List<ConsumerLoanLoanRepayPlanInfoItem> getRepayPlanRecord() {
		return this.repayPlanRecord;
	}
	public void setRepayPlanRecord(List<ConsumerLoanLoanRepayPlanInfoItem> repayPlanRecord) {
		this.repayPlanRecord = repayPlanRecord;
	}

	public Long getTotalPeriodCount() {
		return this.totalPeriodCount;
	}
	public void setTotalPeriodCount(Long totalPeriodCount) {
		this.totalPeriodCount = totalPeriodCount;
	}

}
