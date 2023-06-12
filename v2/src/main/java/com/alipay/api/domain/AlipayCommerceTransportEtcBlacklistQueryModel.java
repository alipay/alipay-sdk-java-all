package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC3.0黑名单查询
 *
 * @author auto create
 * @since 1.0, 2022-12-21 14:27:15
 */
public class AlipayCommerceTransportEtcBlacklistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5676821817449279937L;

	/**
	 * ETC平台协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

}
