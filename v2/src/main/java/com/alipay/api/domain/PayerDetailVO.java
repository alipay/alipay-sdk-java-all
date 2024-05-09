package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款金额明细
 *
 * @author auto create
 * @since 1.0, 2023-11-22 14:55:24
 */
public class PayerDetailVO extends AlipayObject {

	private static final long serialVersionUID = 8481738796384687295L;

	/**
	 * 付款账户，pay_mode为OFFLINE时可选
	 */
	@ApiField("account")
	private AccountDTO account;

	/**
	 * 支付模式，包括网银推单，线下转账，票据支付等；根据平台协议约定平台支持的支付模式
	 */
	@ApiField("pay_mode")
	private String payMode;

	/**
	 * 付款金额
	 */
	@ApiField("payer_amount")
	private String payerAmount;

	/**
	 * 付款币种
	 */
	@ApiField("payer_currency")
	private String payerCurrency;

	public AccountDTO getAccount() {
		return this.account;
	}
	public void setAccount(AccountDTO account) {
		this.account = account;
	}

	public String getPayMode() {
		return this.payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getPayerAmount() {
		return this.payerAmount;
	}
	public void setPayerAmount(String payerAmount) {
		this.payerAmount = payerAmount;
	}

	public String getPayerCurrency() {
		return this.payerCurrency;
	}
	public void setPayerCurrency(String payerCurrency) {
		this.payerCurrency = payerCurrency;
	}

}
