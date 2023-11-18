package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客账户代扣授权
 *
 * @author auto create
 * @since 1.0, 2023-06-20 14:31:53
 */
public class AlipayCommerceCommonTaskagreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 5478914964873474993L;

	/**
	 * 商户签约号，代扣协议中标示用户的唯一签约号，同一
external_agreement_no只会发起一次授权。
格式规则：支持大写小写字母和数字，最长32位。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 签约账户id
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/**
	 * 签约账户openid
	 */
	@ApiField("sign_user_open_id")
	private String signUserOpenId;

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

	public String getSignUserOpenId() {
		return this.signUserOpenId;
	}
	public void setSignUserOpenId(String signUserOpenId) {
		this.signUserOpenId = signUserOpenId;
	}

}
