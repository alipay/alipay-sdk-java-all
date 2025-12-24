package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 认证信息查询
 *
 * @author auto create
 * @since 1.0, 2025-06-27 22:40:41
 */
public class AlipayCommerceTransportEtcCertifiedQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3346277465594386424L;

	/**
	 * 授权协议号
	 */
	@ApiField("auth_agreement_no")
	private String authAgreementNo;

	public String getAuthAgreementNo() {
		return this.authAgreementNo;
	}
	public void setAuthAgreementNo(String authAgreementNo) {
		this.authAgreementNo = authAgreementNo;
	}

}
