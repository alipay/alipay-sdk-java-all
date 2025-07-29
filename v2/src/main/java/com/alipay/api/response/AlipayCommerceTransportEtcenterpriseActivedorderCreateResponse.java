package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.activedorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 14:52:27
 */
public class AlipayCommerceTransportEtcenterpriseActivedorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8271947377398476154L;

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
