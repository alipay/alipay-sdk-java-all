package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务关闭/解除授权
 *
 * @author auto create
 * @since 1.0, 2025-01-06 11:15:18
 */
public class ZhimaCreditPayafteruseCreditagreementUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 4622547219938287766L;

	/**
	 * 芝麻开通/授权协议号
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	public String getCreditAgreementId() {
		return this.creditAgreementId;
	}
	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
	}

}
