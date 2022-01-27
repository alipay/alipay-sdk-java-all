package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.paysign.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-07 09:35:22
 */
public class ZhimaCreditPeZmgoPaysignConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 6371551229549744837L;

	/** 
	 * 协议单号
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
