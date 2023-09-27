package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.info.participant.certify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:39:05
 */
public class AlipayCommerceEducateInfoParticipantCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6233662977463334321L;

	/** 
	 * 外部支付流水号
	 */
	@ApiField("out_payid")
	private String outPayid;

	public void setOutPayid(String outPayid) {
		this.outPayid = outPayid;
	}
	public String getOutPayid( ) {
		return this.outPayid;
	}

}
