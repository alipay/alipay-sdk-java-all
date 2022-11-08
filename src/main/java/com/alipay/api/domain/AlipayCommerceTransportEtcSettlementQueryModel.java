package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主ETC服务行程上送查询
 *
 * @author auto create
 * @since 1.0, 2022-06-17 15:41:38
 */
public class AlipayCommerceTransportEtcSettlementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8565683613479198749L;

	/**
	 * ETC平台协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 行程单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

}
