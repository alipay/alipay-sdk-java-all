package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LoanMoneyTypeAmt;
import com.alipay.api.domain.LoanRepayPlanTerm;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.repayplan.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditLoanRepayplanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4715599572782619577L;

	/** 
	 * 贷款合约编号，每笔用户贷款申请时，放款签约时生成的唯一合约编号，作为用户贷款账单的唯一标识
	 */
	@ApiField("ar_no")
	private String arNo;

	/** 
	 * 当前期次，与term_unit期次单位配合使用，表示当前所在期次；如果合约最后一期计划都已经逾期,就不存在当期计划
	 */
	@ApiField("current_term")
	private Long currentTerm;

	/** 
	 * 贷款到期日，格式：yyyy-MM-dd
	 */
	@ApiField("due_date")
	private String dueDate;

	/** 
	 * 贷款申请单号，借呗客户申请贷款时系统生成的全局唯一业务流水号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/** 
	 * 贷款生效时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("loan_date")
	private String loanDate;

	/** 
	 * 逾期发生时间，格式：yyyy-MM-dd
	 */
	@ApiField("ovd_date")
	private String ovdDate;

	/** 
	 * 剩余还款金额
	 */
	@ApiField("remain_repay_amt")
	private LoanMoneyTypeAmt remainRepayAmt;

	/** 
	 * 还款方式，由借呗约定，目前支持的还款方式有：
1-等额本息
2-等额本金
3-先息后本
6-到期一次还本付息
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/** 
	 * 还款计划分期信息
	 */
	@ApiListField("repay_plan_term_list")
	@ApiField("loan_repay_plan_term")
	private List<LoanRepayPlanTerm> repayPlanTermList;

	/** 
	 * 该还款计划所在的会计日期，格式：yyyy-MM-dd
	 */
	@ApiField("settle_date")
	private String settleDate;

	/** 
	 * 合约状态，状态枚举如下：
NORMAL-正常
OVD-逾期
CLEAR-结清
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 期限单位，和term配合使用，目前支持的期限单位有：
D-天
M-月
Y-年
	 */
	@ApiField("term_unit")
	private String termUnit;

	/** 
	 * 贷款期限，配合term_unit期限单位，或表示贷款天数或期数
	 */
	@ApiField("terms")
	private Long terms;

	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	public String getArNo( ) {
		return this.arNo;
	}

	public void setCurrentTerm(Long currentTerm) {
		this.currentTerm = currentTerm;
	}
	public Long getCurrentTerm( ) {
		return this.currentTerm;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getDueDate( ) {
		return this.dueDate;
	}

	public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
	}
	public String getLoanApplyNo( ) {
		return this.loanApplyNo;
	}

	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}
	public String getLoanDate( ) {
		return this.loanDate;
	}

	public void setOvdDate(String ovdDate) {
		this.ovdDate = ovdDate;
	}
	public String getOvdDate( ) {
		return this.ovdDate;
	}

	public void setRemainRepayAmt(LoanMoneyTypeAmt remainRepayAmt) {
		this.remainRepayAmt = remainRepayAmt;
	}
	public LoanMoneyTypeAmt getRemainRepayAmt( ) {
		return this.remainRepayAmt;
	}

	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}
	public String getRepayMode( ) {
		return this.repayMode;
	}

	public void setRepayPlanTermList(List<LoanRepayPlanTerm> repayPlanTermList) {
		this.repayPlanTermList = repayPlanTermList;
	}
	public List<LoanRepayPlanTerm> getRepayPlanTermList( ) {
		return this.repayPlanTermList;
	}

	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}
	public String getSettleDate( ) {
		return this.settleDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTermUnit(String termUnit) {
		this.termUnit = termUnit;
	}
	public String getTermUnit( ) {
		return this.termUnit;
	}

	public void setTerms(Long terms) {
		this.terms = terms;
	}
	public Long getTerms( ) {
		return this.terms;
	}

}
