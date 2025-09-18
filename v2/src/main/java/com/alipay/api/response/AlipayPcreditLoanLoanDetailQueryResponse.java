package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LoanTerm;
import com.alipay.api.domain.RepayPlanTermVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.loan.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:04:34
 */
public class AlipayPcreditLoanLoanDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3648988919288591539L;

	/** 
	 * 贷款申请金额
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/** 
	 * 申请时间，即用户提交贷款申请时间
	 */
	@ApiField("apply_date")
	private Date applyDate;

	/** 
	 * 贷款结清时间
	 */
	@ApiField("clear_date")
	private Date clearDate;

	/** 
	 * 签署合同类型列表，取值{LOAN}：LOAN-贷款合同;
	 */
	@ApiListField("contract_type_list")
	@ApiField("string")
	private List<String> contractTypeList;

	/** 
	 * 扩展变量
	 */
	@ApiField("ext_variable")
	private String extVariable;

	/** 
	 * 贷款期限，包含贷款期数和期数单位
	 */
	@ApiField("loan_term")
	private LoanTerm loanTerm;

	/** 
	 * 贷款连续逾期天数=max{本金连续逾期天数，利息连续逾期天数}
	 */
	@ApiField("ovd_day_num")
	private Long ovdDayNum;

	/** 
	 * 累计已还利息
	 */
	@ApiField("paid_int")
	private String paidInt;

	/** 
	 * 累计已还逾期利息罚息
	 */
	@ApiField("paid_ovd_int_penalty")
	private String paidOvdIntPenalty;

	/** 
	 * 累计已还逾期本金罚息
	 */
	@ApiField("paid_ovd_prin_penalty")
	private String paidOvdPrinPenalty;

	/** 
	 * 累计已还本金
	 */
	@ApiField("paid_prin")
	private String paidPrin;

	/** 
	 * 剩余应还总额
	 */
	@ApiField("remain_repay_amt")
	private String remainRepayAmt;

	/** 
	 * 剩余应还利息
	 */
	@ApiField("remain_repay_int_amt")
	private String remainRepayIntAmt;

	/** 
	 * 剩余应还本金
	 */
	@ApiField("remain_repay_prin_amt")
	private String remainRepayPrinAmt;

	/** 
	 * 还款方式，取值{1, 3, 6}：1-等额本息; 3-按期付息到期还本;  6-到期一次性还本付息;
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/** 
	 * 贷后还款分期计划
	 */
	@ApiListField("repay_plan_term_list")
	@ApiField("repay_plan_term_v_o")
	private List<RepayPlanTermVO> repayPlanTermList;

	/** 
	 * 贷款开始时间，即贷款生效时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/** 
	 * 贷款申请状态，取值{SUBMITTED, LENDING, USING, OVD, CLEAR, FAILED}：SUBMITTED-已提交; LENDING-放款中; USING-使用中; OVD-已逾期; CLEAR-已结清; FAILED-已失败
	 */
	@ApiField("status")
	private String status;

	public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}
	public String getApplyAmt( ) {
		return this.applyAmt;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	public Date getApplyDate( ) {
		return this.applyDate;
	}

	public void setClearDate(Date clearDate) {
		this.clearDate = clearDate;
	}
	public Date getClearDate( ) {
		return this.clearDate;
	}

	public void setContractTypeList(List<String> contractTypeList) {
		this.contractTypeList = contractTypeList;
	}
	public List<String> getContractTypeList( ) {
		return this.contractTypeList;
	}

	public void setExtVariable(String extVariable) {
		this.extVariable = extVariable;
	}
	public String getExtVariable( ) {
		return this.extVariable;
	}

	public void setLoanTerm(LoanTerm loanTerm) {
		this.loanTerm = loanTerm;
	}
	public LoanTerm getLoanTerm( ) {
		return this.loanTerm;
	}

	public void setOvdDayNum(Long ovdDayNum) {
		this.ovdDayNum = ovdDayNum;
	}
	public Long getOvdDayNum( ) {
		return this.ovdDayNum;
	}

	public void setPaidInt(String paidInt) {
		this.paidInt = paidInt;
	}
	public String getPaidInt( ) {
		return this.paidInt;
	}

	public void setPaidOvdIntPenalty(String paidOvdIntPenalty) {
		this.paidOvdIntPenalty = paidOvdIntPenalty;
	}
	public String getPaidOvdIntPenalty( ) {
		return this.paidOvdIntPenalty;
	}

	public void setPaidOvdPrinPenalty(String paidOvdPrinPenalty) {
		this.paidOvdPrinPenalty = paidOvdPrinPenalty;
	}
	public String getPaidOvdPrinPenalty( ) {
		return this.paidOvdPrinPenalty;
	}

	public void setPaidPrin(String paidPrin) {
		this.paidPrin = paidPrin;
	}
	public String getPaidPrin( ) {
		return this.paidPrin;
	}

	public void setRemainRepayAmt(String remainRepayAmt) {
		this.remainRepayAmt = remainRepayAmt;
	}
	public String getRemainRepayAmt( ) {
		return this.remainRepayAmt;
	}

	public void setRemainRepayIntAmt(String remainRepayIntAmt) {
		this.remainRepayIntAmt = remainRepayIntAmt;
	}
	public String getRemainRepayIntAmt( ) {
		return this.remainRepayIntAmt;
	}

	public void setRemainRepayPrinAmt(String remainRepayPrinAmt) {
		this.remainRepayPrinAmt = remainRepayPrinAmt;
	}
	public String getRemainRepayPrinAmt( ) {
		return this.remainRepayPrinAmt;
	}

	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}
	public String getRepayMode( ) {
		return this.repayMode;
	}

	public void setRepayPlanTermList(List<RepayPlanTermVO> repayPlanTermList) {
		this.repayPlanTermList = repayPlanTermList;
	}
	public List<RepayPlanTermVO> getRepayPlanTermList( ) {
		return this.repayPlanTermList;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate( ) {
		return this.startDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
