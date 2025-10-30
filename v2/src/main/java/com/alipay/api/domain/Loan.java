package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 借据详情信息，单借据维度信息
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:15
 */
public class Loan extends AlipayObject {

	private static final long serialVersionUID = 2658223338638149646L;

	/**
	 * 支用受理单号，蚂蚁侧生成
	 */
	@ApiField("institution_loan_apply_no")
	private String institutionLoanApplyNo;

	/**
	 * 蚂蚁侧借据号
	 */
	@ApiField("institution_loan_no")
	private String institutionLoanNo;

	/**
	 * 利率，年利率，360，保留6位小数
	 */
	@ApiField("interest_rate")
	private String interestRate;

	/**
	 * 支用放款金额，元，保留2位小数
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/**
	 * 外部渠道支用申请单号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/**
	 * 借款结束时间（格式yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("loan_end_date")
	private Date loanEndDate;

	/**
	 * 支用日(放款日)，（格式yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("loan_start_date")
	private Date loanStartDate;

	/**
	 * 贷款期限 6/11/12
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位
MONTH - 月
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 每期固定还款日
1到28
	 */
	@ApiField("repayment_day")
	private Long repaymentDay;

	/**
	 * 还款方式
	 */
	@ApiField("repayment_method")
	private String repaymentMethod;

	/**
	 * 借据状态
NEW - 正常
OVERDUE - 逾期
SETTLED - 结清
	 */
	@ApiField("status")
	private String status;

	/**
	 * 未还款分期数
	 */
	@ApiField("unpaid_installment_count")
	private Long unpaidInstallmentCount;

	/**
	 * 未还款利息
	 */
	@ApiField("unpaid_interest")
	private String unpaidInterest;

	/**
	 * 未还罚息（逾期本金罚息+逾期利息罚息）
	 */
	@ApiField("unpaid_penalty")
	private String unpaidPenalty;

	/**
	 * 未还本金（正常本金+逾期本金），元，保留2位小数
	 */
	@ApiField("unpaid_principal")
	private String unpaidPrincipal;

	public String getInstitutionLoanApplyNo() {
		return this.institutionLoanApplyNo;
	}
	public void setInstitutionLoanApplyNo(String institutionLoanApplyNo) {
		this.institutionLoanApplyNo = institutionLoanApplyNo;
	}

	public String getInstitutionLoanNo() {
		return this.institutionLoanNo;
	}
	public void setInstitutionLoanNo(String institutionLoanNo) {
		this.institutionLoanNo = institutionLoanNo;
	}

	public String getInterestRate() {
		return this.interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}

	public String getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanApplyNo() {
		return this.loanApplyNo;
	}
	public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
	}

	public Date getLoanEndDate() {
		return this.loanEndDate;
	}
	public void setLoanEndDate(Date loanEndDate) {
		this.loanEndDate = loanEndDate;
	}

	public Date getLoanStartDate() {
		return this.loanStartDate;
	}
	public void setLoanStartDate(Date loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	public Long getLoanTerm() {
		return this.loanTerm;
	}
	public void setLoanTerm(Long loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getLoanTermUnit() {
		return this.loanTermUnit;
	}
	public void setLoanTermUnit(String loanTermUnit) {
		this.loanTermUnit = loanTermUnit;
	}

	public Long getRepaymentDay() {
		return this.repaymentDay;
	}
	public void setRepaymentDay(Long repaymentDay) {
		this.repaymentDay = repaymentDay;
	}

	public String getRepaymentMethod() {
		return this.repaymentMethod;
	}
	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getUnpaidInstallmentCount() {
		return this.unpaidInstallmentCount;
	}
	public void setUnpaidInstallmentCount(Long unpaidInstallmentCount) {
		this.unpaidInstallmentCount = unpaidInstallmentCount;
	}

	public String getUnpaidInterest() {
		return this.unpaidInterest;
	}
	public void setUnpaidInterest(String unpaidInterest) {
		this.unpaidInterest = unpaidInterest;
	}

	public String getUnpaidPenalty() {
		return this.unpaidPenalty;
	}
	public void setUnpaidPenalty(String unpaidPenalty) {
		this.unpaidPenalty = unpaidPenalty;
	}

	public String getUnpaidPrincipal() {
		return this.unpaidPrincipal;
	}
	public void setUnpaidPrincipal(String unpaidPrincipal) {
		this.unpaidPrincipal = unpaidPrincipal;
	}

}
