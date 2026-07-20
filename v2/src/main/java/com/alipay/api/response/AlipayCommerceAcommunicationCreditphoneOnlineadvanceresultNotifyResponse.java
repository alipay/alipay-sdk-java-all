package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.creditphone.onlineadvanceresult.notify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-15 20:57:45
 */
public class AlipayCommerceAcommunicationCreditphoneOnlineadvanceresultNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2131968755553767226L;

	/** 
	 * 支付宝在线提前结清测算单号
	 */
	@ApiField("alipay_online_advance_pay_order_no")
	private String alipayOnlineAdvancePayOrderNo;

	public void setAlipayOnlineAdvancePayOrderNo(String alipayOnlineAdvancePayOrderNo) {
		this.alipayOnlineAdvancePayOrderNo = alipayOnlineAdvancePayOrderNo;
	}
	public String getAlipayOnlineAdvancePayOrderNo( ) {
		return this.alipayOnlineAdvancePayOrderNo;
	}

}
