package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗移动支付场景支付查询
 *
 * @author auto create
 * @since 1.0, 2026-09-15 16:38:13
 */
public class AlipayCommerceMedicalDirectTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6219962139378483597L;

	/**
	 * trade_no和out_trade_no至少有一个要非空，优先会取trade_no
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * trade_no和out_trade_no至少有一个要非空，优先会取trade_no
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
