package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.fundscheme.budget.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-22 10:42:39
 */
public class AlipayMarketingFundschemeBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8256154247238288268L;

	/** 
	 * 剩余预算，余额单位元
	 */
	@ApiField("balance")
	private String balance;

	/** 
	 * 请求入参的资金池id，资金池的唯一索引
	 */
	@ApiField("fund_scheme_id")
	private String fundSchemeId;

	/** 
	 * 配置总预算金额，单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBalance( ) {
		return this.balance;
	}

	public void setFundSchemeId(String fundSchemeId) {
		this.fundSchemeId = fundSchemeId;
	}
	public String getFundSchemeId( ) {
		return this.fundSchemeId;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
