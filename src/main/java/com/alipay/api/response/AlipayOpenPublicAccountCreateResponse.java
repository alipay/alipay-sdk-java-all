package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5373676977975331666L;

	/** 
	 * 协议号，商户会员在支付宝服务窗账号中的唯一标识
	 */
	@ApiField("agreement_id")
	private String agreementId;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

}
