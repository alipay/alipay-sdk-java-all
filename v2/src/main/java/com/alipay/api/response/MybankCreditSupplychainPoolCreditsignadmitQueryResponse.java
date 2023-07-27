package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.pool.creditsignadmit.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 19:29:44
 */
public class MybankCreditSupplychainPoolCreditsignadmitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5421414442923239247L;

	/** 
	 * 当前授信是否准入，准入时返回true会有授信额度和可贷额度
	 */
	@ApiField("admit")
	private String admit;

	/** 
	 * 金额币种
	 */
	@ApiField("amt_ccy")
	private String amtCcy;

	/** 
	 * 授信额度，单位: 元
	 */
	@ApiField("credit_lmt_amt")
	private String creditLmtAmt;

	/** 
	 * 保理签约状态: 
NOT_SIGNED: 未签约
SIGNED_NOT_VALID: 已签约待生效
SIGNED_VALID: 已签约已生效
SIGNED_INVALID: 已签约已失效
	 */
	@ApiField("factoring_sign_status")
	private String factoringSignStatus;

	/** 
	 * 贷款余额，单位: 元
	 */
	@ApiField("loan_balance_amt")
	private String loanBalanceAmt;

	/** 
	 * 可贷额度，单位: 元
	 */
	@ApiField("loanable_amt")
	private String loanableAmt;

	public void setAdmit(String admit) {
		this.admit = admit;
	}
	public String getAdmit( ) {
		return this.admit;
	}

	public void setAmtCcy(String amtCcy) {
		this.amtCcy = amtCcy;
	}
	public String getAmtCcy( ) {
		return this.amtCcy;
	}

	public void setCreditLmtAmt(String creditLmtAmt) {
		this.creditLmtAmt = creditLmtAmt;
	}
	public String getCreditLmtAmt( ) {
		return this.creditLmtAmt;
	}

	public void setFactoringSignStatus(String factoringSignStatus) {
		this.factoringSignStatus = factoringSignStatus;
	}
	public String getFactoringSignStatus( ) {
		return this.factoringSignStatus;
	}

	public void setLoanBalanceAmt(String loanBalanceAmt) {
		this.loanBalanceAmt = loanBalanceAmt;
	}
	public String getLoanBalanceAmt( ) {
		return this.loanBalanceAmt;
	}

	public void setLoanableAmt(String loanableAmt) {
		this.loanableAmt = loanableAmt;
	}
	public String getLoanableAmt( ) {
		return this.loanableAmt;
	}

}
