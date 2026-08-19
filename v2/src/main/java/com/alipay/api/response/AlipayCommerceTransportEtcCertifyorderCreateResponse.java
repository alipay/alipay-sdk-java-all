package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.certifyorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-03 17:17:50
 */
public class AlipayCommerceTransportEtcCertifyorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2643383696946637315L;

	/** 
	 * 支付宝ETC申请单号,使用相同out_biz_no重复创建订单,返回相同订单号
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/** 
	 * ETC平台扣款协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}
	public String getAlipayOrderId( ) {
		return this.alipayOrderId;
	}

	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}
	public String getBizAgreementNo( ) {
		return this.bizAgreementNo;
	}

}
