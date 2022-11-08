package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.memberwallet.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-20 15:16:43
 */
public class AntMerchantMemberwalletBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5672974495377514486L;

	/** 
	 * 钱包账户余额（单位：元）
	 */
	@ApiField("balance")
	private String balance;

	/** 
	 * 钱包账户膨胀金余额（单位：元）
	 */
	@ApiField("benefit_balance")
	private String benefitBalance;

	/** 
	 * 钱包账户本金余额（单位：元）
	 */
	@ApiField("principal_balance")
	private String principalBalance;

	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBalance( ) {
		return this.balance;
	}

	public void setBenefitBalance(String benefitBalance) {
		this.benefitBalance = benefitBalance;
	}
	public String getBenefitBalance( ) {
		return this.benefitBalance;
	}

	public void setPrincipalBalance(String principalBalance) {
		this.principalBalance = principalBalance;
	}
	public String getPrincipalBalance( ) {
		return this.principalBalance;
	}

}
