package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanstatus.admit.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-03 15:17:44
 */
public class MybankCreditLoantradeLoanstatusAdmitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4437614368541911989L;

	/** 
	 * true：授权
false：未授权
	 */
	@ApiField("authority")
	private Boolean authority;

	/** 
	 * true：授信准入；
false：授信不准入
	 */
	@ApiField("credit_admit")
	private Boolean creditAdmit;

	/** 
	 * true：有在途或者逾期
false：没有在途和逾期
	 */
	@ApiField("has_balance")
	private Boolean hasBalance;

	public void setAuthority(Boolean authority) {
		this.authority = authority;
	}
	public Boolean getAuthority( ) {
		return this.authority;
	}

	public void setCreditAdmit(Boolean creditAdmit) {
		this.creditAdmit = creditAdmit;
	}
	public Boolean getCreditAdmit( ) {
		return this.creditAdmit;
	}

	public void setHasBalance(Boolean hasBalance) {
		this.hasBalance = hasBalance;
	}
	public Boolean getHasBalance( ) {
		return this.hasBalance;
	}

}
