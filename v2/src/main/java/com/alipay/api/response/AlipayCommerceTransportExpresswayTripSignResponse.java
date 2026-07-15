package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.expressway.trip.sign response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-28 20:52:48
 */
public class AlipayCommerceTransportExpresswayTripSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3117756929287153961L;

	/** 
	 * 支付宝车牌付代扣协议号，该协议号是经过车牌付业务域包装过的，只有该业务域能解析。
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/** 
	 * 支付宝侧车牌付代扣签约申请订单号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}
	public String getBizAgreementNo( ) {
		return this.bizAgreementNo;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
