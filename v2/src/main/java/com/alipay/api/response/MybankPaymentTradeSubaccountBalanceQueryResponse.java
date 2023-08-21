package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.subaccount.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:21:10
 */
public class MybankPaymentTradeSubaccountBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4776853888686151691L;

	/** 
	 * 可用余额，单位元
	 */
	@ApiField("available_balance")
	private String availableBalance;

	/** 
	 * 币种，默认CNY
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/** 
	 * 子户外标
	 */
	@ApiField("sub_card_no")
	private String subCardNo;

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getAvailableBalance( ) {
		return this.availableBalance;
	}

	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}
	public String getCurrencyValue( ) {
		return this.currencyValue;
	}

	public void setSubCardNo(String subCardNo) {
		this.subCardNo = subCardNo;
	}
	public String getSubCardNo( ) {
		return this.subCardNo;
	}

}
