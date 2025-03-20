package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.activedorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-10 11:12:03
 */
public class AlipayCommerceTransportEtcenterpriseActivedorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6394652152339612658L;

	/** 
	 * ETC平台协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/** 
	 * 支付宝ETC申请单号
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
