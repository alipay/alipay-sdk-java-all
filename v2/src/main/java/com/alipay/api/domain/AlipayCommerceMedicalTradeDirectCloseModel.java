package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗移动支付场景关单
 *
 * @author auto create
 * @since 1.0, 2026-09-15 16:38:10
 */
public class AlipayCommerceMedicalTradeDirectCloseModel extends AlipayObject {

	private static final long serialVersionUID = 1696191423111165217L;

	/**
	 * 创单接口传入的外部订单号，trade_no和out_trade_no至少有一个要非空，优先会取trade_no
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 创单接口返回的逸康交易单号，trade_no和out_trade_no至少有一个要非空，优先会取trade_no
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
