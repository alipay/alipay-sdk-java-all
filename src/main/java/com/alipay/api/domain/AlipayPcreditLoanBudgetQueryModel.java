package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询借款预算
 *
 * @author auto create
 * @since 1.0, 2018-11-14 14:26:32
 */
public class AlipayPcreditLoanBudgetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1499935484589613998L;

	/**
	 * 风险日利率
	 */
	@ApiField("daily_risk_int_rate")
	private String dailyRiskIntRate;

	/**
	 * 贷款金额
	 */
	@ApiField("loan_amt")
	private String loanAmt;

	/**
	 * 贷款期限
	 */
	@ApiField("loan_term")
	private LoanTerm loanTerm;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 还款日
	 */
	@ApiField("repay_day")
	private Long repayDay;

	/**
	 * 还款方式，取值{1, 3, 6}：1-等额本息; 3-按期付息到期还本;  6-到期一次性还本付息;
	 */
	@ApiField("repay_mode")
	private String repayMode;

	public String getDailyRiskIntRate() {
		return this.dailyRiskIntRate;
	}
	public void setDailyRiskIntRate(String dailyRiskIntRate) {
		this.dailyRiskIntRate = dailyRiskIntRate;
	}

	public String getLoanAmt() {
		return this.loanAmt;
	}
	public void setLoanAmt(String loanAmt) {
		this.loanAmt = loanAmt;
	}

	public LoanTerm getLoanTerm() {
		return this.loanTerm;
	}
	public void setLoanTerm(LoanTerm loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public Long getRepayDay() {
		return this.repayDay;
	}
	public void setRepayDay(Long repayDay) {
		this.repayDay = repayDay;
	}

	public String getRepayMode() {
		return this.repayMode;
	}
	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}

}
