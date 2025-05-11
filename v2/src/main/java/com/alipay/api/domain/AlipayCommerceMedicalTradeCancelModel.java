package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付撤销接口
 *
 * @author auto create
 * @since 1.0, 2024-09-11 16:57:58
 */
public class AlipayCommerceMedicalTradeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1647953734182485119L;

	/**
	 * 支付时传入的商户交易号，和trade_no不能同时为空，如果都传则以trade_no优先
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 逸康交易号和out_trade_no不能同时为空
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
