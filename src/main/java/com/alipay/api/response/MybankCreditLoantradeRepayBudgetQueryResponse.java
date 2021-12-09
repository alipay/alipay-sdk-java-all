package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.repay.budget.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-30 17:00:48
 */
public class MybankCreditLoantradeRepayBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2242661277367226151L;

	/** 
	 * 申请还款本金
	 */
	@ApiField("apply_repay_prin")
	private String applyRepayPrin;

	/** 
	 * 贷款合约编号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/** 
	 * 当前应还费用（提前还款费除外）
	 */
	@ApiField("should_repay_fee")
	private String shouldRepayFee;

	/** 
	 * 当前应还利息
	 */
	@ApiField("should_repay_int")
	private String shouldRepayInt;

	/** 
	 * 当前应还罚息
	 */
	@ApiField("should_repay_penalty")
	private String shouldRepayPenalty;

	/** 
	 * 提前还款费
	 */
	@ApiField("should_repay_pre_fee")
	private String shouldRepayPreFee;

	/** 
	 * 当前应还本金
	 */
	@ApiField("should_repay_prin")
	private String shouldRepayPrin;

	public void setApplyRepayPrin(String applyRepayPrin) {
		this.applyRepayPrin = applyRepayPrin;
	}
	public String getApplyRepayPrin( ) {
		return this.applyRepayPrin;
	}

	public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}
	public String getLoanArNo( ) {
		return this.loanArNo;
	}

	public void setShouldRepayFee(String shouldRepayFee) {
		this.shouldRepayFee = shouldRepayFee;
	}
	public String getShouldRepayFee( ) {
		return this.shouldRepayFee;
	}

	public void setShouldRepayInt(String shouldRepayInt) {
		this.shouldRepayInt = shouldRepayInt;
	}
	public String getShouldRepayInt( ) {
		return this.shouldRepayInt;
	}

	public void setShouldRepayPenalty(String shouldRepayPenalty) {
		this.shouldRepayPenalty = shouldRepayPenalty;
	}
	public String getShouldRepayPenalty( ) {
		return this.shouldRepayPenalty;
	}

	public void setShouldRepayPreFee(String shouldRepayPreFee) {
		this.shouldRepayPreFee = shouldRepayPreFee;
	}
	public String getShouldRepayPreFee( ) {
		return this.shouldRepayPreFee;
	}

	public void setShouldRepayPrin(String shouldRepayPrin) {
		this.shouldRepayPrin = shouldRepayPrin;
	}
	public String getShouldRepayPrin( ) {
		return this.shouldRepayPrin;
	}

}
