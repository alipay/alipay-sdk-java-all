package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.info.participant.certify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:10
 */
public class AlipayCommerceEducateInfoParticipantCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5682854936231426179L;

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
