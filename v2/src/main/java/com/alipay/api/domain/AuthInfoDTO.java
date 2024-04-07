package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权信息
 *
 * @author auto create
 * @since 1.0, 2023-03-15 11:36:45
 */
public class AuthInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4181283284911665374L;

	/**
	 * 授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 授权的支付宝账号，脱敏。
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

}
