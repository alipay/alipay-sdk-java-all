package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saas关单
 *
 * @author auto create
 * @since 1.0, 2026-08-03 11:52:51
 */
public class AlipayTradeSaasOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 5814566895238786187L;

	/**
	 * SaaS交易订单号。与out_trade_no、trade_no至少传入一个，多个字段同时传入时必须指向同一笔交易。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 商户订单号。与order_no、trade_no至少传入一个，多个字段同时传入时必须指向同一笔交易。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 下游支付渠道交易号。与order_no、out_trade_no至少传入一个，多个字段同时传入时必须指向同一笔交易。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
