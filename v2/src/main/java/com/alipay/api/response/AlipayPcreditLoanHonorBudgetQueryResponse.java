package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.budget.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 16:17:40
 */
public class AlipayPcreditLoanHonorBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4676887771573796155L;

	/** 
	 * 总还款金额，单位：分。result_code=0时必填
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 还款利息金额，单位：分。result_code=0时必填
	 */
	@ApiField("total_interest")
	private String totalInterest;

	/** 
	 * 总罚息，单位：分，result_code=0&有罚息时必填
	 */
	@ApiField("total_penalty")
	private String totalPenalty;

	/** 
	 * 还款本金金额，单位：分。result_code=0时必填
	 */
	@ApiField("total_principal")
	private String totalPrincipal;

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTotalInterest(String totalInterest) {
		this.totalInterest = totalInterest;
	}
	public String getTotalInterest( ) {
		return this.totalInterest;
	}

	public void setTotalPenalty(String totalPenalty) {
		this.totalPenalty = totalPenalty;
	}
	public String getTotalPenalty( ) {
		return this.totalPenalty;
	}

	public void setTotalPrincipal(String totalPrincipal) {
		this.totalPrincipal = totalPrincipal;
	}
	public String getTotalPrincipal( ) {
		return this.totalPrincipal;
	}

}
