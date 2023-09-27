package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 贷款申请预算信息
 *
 * @author auto create
 * @since 1.0, 2018-11-13 19:45:45
 */
public class LoanApplyBudgetVO extends AlipayObject {

	private static final long serialVersionUID = 4657739198522652271L;

	/**
	 * 贷款申请金额
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 申请时间，即用户提交贷款申请的时间
	 */
	@ApiField("apply_date")
	private Date applyDate;

	/**
	 * 贷款申请受理单号
	 */
	@ApiField("apply_receipt_no")
	private String applyReceiptNo;

	/**
	 * 还款预算
	 */
	@ApiField("budget")
	private BudgetVO budget;

	/**
	 * 当前期次
	 */
	@ApiField("current_term")
	private Long currentTerm;

	/**
	 * 当前期次的还款日
	 */
	@ApiField("current_term_repay_date")
	private Date currentTermRepayDate;

	/**
	 * 贷款期限，包含贷款期数和期数单位
	 */
	@ApiField("loan_term")
	private LoanTerm loanTerm;

	/**
	 * 贷后还款分期计划
	 */
	@ApiListField("repay_plan_term_list")
	@ApiField("repay_plan_term_v_o")
	private List<RepayPlanTermVO> repayPlanTermList;

	public String getApplyAmt() {
		return this.applyAmt;
	}
	public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}

	public Date getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyReceiptNo() {
		return this.applyReceiptNo;
	}
	public void setApplyReceiptNo(String applyReceiptNo) {
		this.applyReceiptNo = applyReceiptNo;
	}

	public BudgetVO getBudget() {
		return this.budget;
	}
	public void setBudget(BudgetVO budget) {
		this.budget = budget;
	}

	public Long getCurrentTerm() {
		return this.currentTerm;
	}
	public void setCurrentTerm(Long currentTerm) {
		this.currentTerm = currentTerm;
	}

	public Date getCurrentTermRepayDate() {
		return this.currentTermRepayDate;
	}
	public void setCurrentTermRepayDate(Date currentTermRepayDate) {
		this.currentTermRepayDate = currentTermRepayDate;
	}

	public LoanTerm getLoanTerm() {
		return this.loanTerm;
	}
	public void setLoanTerm(LoanTerm loanTerm) {
		this.loanTerm = loanTerm;
	}

	public List<RepayPlanTermVO> getRepayPlanTermList() {
		return this.repayPlanTermList;
	}
	public void setRepayPlanTermList(List<RepayPlanTermVO> repayPlanTermList) {
		this.repayPlanTermList = repayPlanTermList;
	}

}
