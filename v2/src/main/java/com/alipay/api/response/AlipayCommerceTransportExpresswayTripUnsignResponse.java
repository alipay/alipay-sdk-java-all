package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.expressway.trip.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-21 14:32:47
 */
public class AlipayCommerceTransportExpresswayTripUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8624812697511644447L;

	/** 
	 * 支付宝车牌付代扣协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/** 
	 * 解约申请受理状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}
	public String getBizAgreementNo( ) {
		return this.bizAgreementNo;
	}

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}
	public String getBizStatus( ) {
		return this.bizStatus;
	}

}
