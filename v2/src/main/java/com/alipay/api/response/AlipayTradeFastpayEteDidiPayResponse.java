package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.fastpay.ete.didi.pay response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 19:48:08
 */
public class AlipayTradeFastpayEteDidiPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4535549555685186852L;

	/** 
	 * 商户网站唯一订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 收款支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数字
	 */
	@ApiField("seller_id")
	private String sellerId;

	/** 
	 * 该笔订单的资金总额，单位为RMB-Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。
	 */
	@ApiField("total_fee")
	private String totalFee;

	/** 
	 * 该交易在支付宝系统中的交易流水号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerId( ) {
		return this.sellerId;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}
	public String getTotalFee( ) {
		return this.totalFee;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
