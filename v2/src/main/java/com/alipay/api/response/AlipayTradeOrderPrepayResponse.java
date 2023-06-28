package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.order.prepay response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:21:50
 */
public class AlipayTradeOrderPrepayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6193876393187764519L;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 账户机构唤端需要的订单唯一标识
	 */
	@ApiField("tn")
	private String tn;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setTn(String tn) {
		this.tn = tn;
	}
	public String getTn( ) {
		return this.tn;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
