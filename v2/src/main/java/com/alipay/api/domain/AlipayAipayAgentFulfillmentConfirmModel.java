package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * A2A商家履约回执确认
 *
 * @author auto create
 * @since 1.0, 2026-04-09 19:12:45
 */
public class AlipayAipayAgentFulfillmentConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7796952839757281183L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
