package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务关闭/解除授权
 *
 * @author auto create
 * @since 1.0, 2023-12-07 12:06:18
 */
public class ZhimaCreditPayafteruseCreditagreementUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 7884421315665176164L;

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
