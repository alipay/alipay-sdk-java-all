package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字人民币交易撤消
 *
 * @author auto create
 * @since 1.0, 2021-12-03 16:43:19
 */
public class MybankEcnyTradeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4849485833238473928L;

	/**
	 * 调用方订单号，调用方订单号和运营机构交易号不能同时为空
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 运营机构交易号，调用方订单号和运营机构交易号不能同时为空
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
