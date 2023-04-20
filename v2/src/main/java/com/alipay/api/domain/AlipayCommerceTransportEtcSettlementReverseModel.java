package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主ETC服务行程撤销
 *
 * @author auto create
 * @since 1.0, 2023-02-27 11:14:45
 */
public class AlipayCommerceTransportEtcSettlementReverseModel extends AlipayObject {

	private static final long serialVersionUID = 5665278443288694719L;

	/**
	 * ETC平台协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 商户行程单id（需要在商户侧唯一）
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 行程支付撤销原因
	 */
	@ApiField("reverse_reason")
	private String reverseReason;

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

	public String getReverseReason() {
		return this.reverseReason;
	}
	public void setReverseReason(String reverseReason) {
		this.reverseReason = reverseReason;
	}

}
