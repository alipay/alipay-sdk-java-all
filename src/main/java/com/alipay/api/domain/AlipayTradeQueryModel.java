package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一收单线下交易查询
修改路由策略到R
 *
 * @author auto create
 * @since 1.0, 2018-05-11 18:28:47
 */
public class AlipayTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8418391168213187944L;

	/**
	 * 订单支付时传入的商户订单号,和支付宝交易号不能同时为空。
trade_no,out_trade_no如果同时存在优先取trade_no
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝交易号，和商户订单号不能同时为空
	 */
	@ApiField("trade_no")
	private String tradeNo;

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
