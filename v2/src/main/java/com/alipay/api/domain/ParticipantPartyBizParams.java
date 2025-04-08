package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展数据,兼容代发子户业务参数
 *
 * @author auto create
 * @since 1.0, 2023-11-15 15:58:50
 */
public class ParticipantPartyBizParams extends AlipayObject {

	private static final long serialVersionUID = 2293552456126478483L;

	/**
	 * 当identity_type为ACCOUNT_BOOK_ID时，扩展参数里代扣协议号必填
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 当identity_type为ACCONT_BOOK_ID时此字段为记账本归属UID,且必选
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
