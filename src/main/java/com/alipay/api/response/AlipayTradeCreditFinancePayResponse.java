package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.finance.pay response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-11 16:00:38
 */
public class AlipayTradeCreditFinancePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6248749869553592485L;

	/** 
	 * 本次支付的金额，单位为元；精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 币种，CNY
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 本次支付的处理状态
SUCCESS
FAIL
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 本次金融付款对应的交易的交易买家
	 */
	@ApiField("trade_buyer_id")
	private String tradeBuyerId;

	/** 
	 * 本次金融付款对应的交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeBuyerId(String tradeBuyerId) {
		this.tradeBuyerId = tradeBuyerId;
	}
	public String getTradeBuyerId( ) {
		return this.tradeBuyerId;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
