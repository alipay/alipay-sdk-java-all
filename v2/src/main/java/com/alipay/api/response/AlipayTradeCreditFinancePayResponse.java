package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.finance.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:07
 */
public class AlipayTradeCreditFinancePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7237919251967143351L;

	/** 
	 * 本次支付的金额，非特殊情况下和请求金额保持一致。单位为元；精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 币种单位，目前只支持人民币CNY
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 支付宝系统资金处理成功时间，格式为"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("gmt_payment")
	private String gmtPayment;

	/** 
	 * 外部请求号，和入参请求一致
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 本次支付的处理状态，SUCCESS：处理成功；FAIL：处理失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 本次金融付款对应交易的买家ID
	 */
	@ApiField("trade_buyer_id")
	private String tradeBuyerId;

	/** 
	 * 本次金融付款对应的交易号，和入参请求一致
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

	public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public String getGmtPayment( ) {
		return this.gmtPayment;
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
