package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云店资金代扣授权
 *
 * @author auto create
 * @since 1.0, 2022-10-31 19:50:37
 */
public class AlipayCommerceYuntaskAgreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 5251465382597867417L;

	/**
	 * 商户签约号，代扣协议中标示用户的唯一签约号，同一
external_agreement_no只会发起一次授权。
格式规则：支持大写小写字母和数字，最长32位。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 资金代扣签约时的出资方uid
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

}
