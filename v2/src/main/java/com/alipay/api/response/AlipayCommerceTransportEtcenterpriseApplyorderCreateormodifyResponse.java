package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.applyorder.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:30
 */
public class AlipayCommerceTransportEtcenterpriseApplyorderCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3767766482821195285L;

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
