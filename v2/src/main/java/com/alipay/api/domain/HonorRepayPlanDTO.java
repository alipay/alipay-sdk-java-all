package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 还款计划
 *
 * @author auto create
 * @since 1.0, 2025-09-01 17:10:11
 */
public class HonorRepayPlanDTO extends AlipayObject {

	private static final long serialVersionUID = 8143299926353177319L;

	/**
	 * 荣耀侧借款申请订单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 预算类型
ADVANCE_REPAY-结清预算
OVD_AND_CURRENT_REPAY-到期逾期预算
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 当前期次
	 */
	@ApiField("current_term")
	private Long currentTerm;

	/**
	 * 剩余应还总额，单位：分
	 */
	@ApiField("duerepay")
	private String duerepay;

	/**
	 * 借款金额，单位：分
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/**
	 * 不可还款的toast
	 */
	@ApiField("non_repayable_desc")
	private String nonRepayableDesc;

	/**
	 * 蚂蚁侧借款订单单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 借据逾期未还金额，单位分，有逾期时必传
	 */
	@ApiField("overdue_amount")
	private String overdueAmount;

	/**
	 * 借据逾期天数，有逾期时必传。
	 */
	@ApiField("overdue_days")
	private Long overdueDays;

	/**
	 * 放款日期,yyyyMMdd
	 */
	@ApiField("paydate")
	private String paydate;

	/**
	 * 还款计划期次列表 (不含已还期次)
	 */
	@ApiListField("repay_plan_terms")
	@ApiField("honor_repay_plan_term_d_t_o")
	private List<HonorRepayPlanTermDTO> repayPlanTerms;

	/**
	 * 可还款状态，2-正常还款中，7-禁还期
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 支持的还款类型列表，不支持还款时返回空列表，6-去还款
	 */
	@ApiListField("support_repay_type")
	@ApiField("number")
	private List<Long> supportRepayType;

	/**
	 * 借款期数
	 */
	@ApiField("total_term")
	private Long totalTerm;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	public Long getCurrentTerm() {
		return this.currentTerm;
	}
	public void setCurrentTerm(Long currentTerm) {
		this.currentTerm = currentTerm;
	}

	public String getDuerepay() {
		return this.duerepay;
	}
	public void setDuerepay(String duerepay) {
		this.duerepay = duerepay;
	}

	public String getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getNonRepayableDesc() {
		return this.nonRepayableDesc;
	}
	public void setNonRepayableDesc(String nonRepayableDesc) {
		this.nonRepayableDesc = nonRepayableDesc;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOverdueAmount() {
		return this.overdueAmount;
	}
	public void setOverdueAmount(String overdueAmount) {
		this.overdueAmount = overdueAmount;
	}

	public Long getOverdueDays() {
		return this.overdueDays;
	}
	public void setOverdueDays(Long overdueDays) {
		this.overdueDays = overdueDays;
	}

	public String getPaydate() {
		return this.paydate;
	}
	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}

	public List<HonorRepayPlanTermDTO> getRepayPlanTerms() {
		return this.repayPlanTerms;
	}
	public void setRepayPlanTerms(List<HonorRepayPlanTermDTO> repayPlanTerms) {
		this.repayPlanTerms = repayPlanTerms;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public List<Long> getSupportRepayType() {
		return this.supportRepayType;
	}
	public void setSupportRepayType(List<Long> supportRepayType) {
		this.supportRepayType = supportRepayType;
	}

	public Long getTotalTerm() {
		return this.totalTerm;
	}
	public void setTotalTerm(Long totalTerm) {
		this.totalTerm = totalTerm;
	}

}
