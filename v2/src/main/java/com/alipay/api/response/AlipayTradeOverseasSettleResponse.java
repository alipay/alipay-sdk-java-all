package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.overseas.settle response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-25 10:27:27
 */
public class AlipayTradeOverseasSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 7569846262235953376L;

	/** 
	 * 本笔跨境结算使用的汇率，精度 8 位小数
	 */
	@ApiField("exchange_rate")
	private String exchangeRate;

	/** 
	 * 本次跨境结算的实际结算外币金额
	 */
	@ApiField("foreign_settle_amount")
	private String foreignSettleAmount;

	/** 
	 * 本笔跨境结算实际结算的外币币种
	 */
	@ApiField("foreign_settle_currency")
	private String foreignSettleCurrency;

	/** 
	 * 请求流水号，开发者自行生成并保证唯一性，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 本次跨境结算的实际结算人民币金额
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getExchangeRate( ) {
		return this.exchangeRate;
	}

	public void setForeignSettleAmount(String foreignSettleAmount) {
		this.foreignSettleAmount = foreignSettleAmount;
	}
	public String getForeignSettleAmount( ) {
		return this.foreignSettleAmount;
	}

	public void setForeignSettleCurrency(String foreignSettleCurrency) {
		this.foreignSettleCurrency = foreignSettleCurrency;
	}
	public String getForeignSettleCurrency( ) {
		return this.foreignSettleCurrency;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}
	public String getSettleAmount( ) {
		return this.settleAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
