package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一收单交易撤销接口
 *
 * @author auto create
 * @since 1.0, 2024-07-09 14:48:17
 */
public class AlipayTradeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 7598178623734239226L;

	/**
	 * 原支付请求的商户订单号,和支付宝交易号不能同时为空
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
