package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EtcAuthResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.certified.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-27 22:42:30
 */
public class AlipayCommerceTransportEtcCertifiedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8266355818876921447L;

	/** 
	 * 认证信息结果
	 */
	@ApiField("etc_certified_result")
	private EtcAuthResult etcCertifiedResult;

	public void setEtcCertifiedResult(EtcAuthResult etcCertifiedResult) {
		this.etcCertifiedResult = etcCertifiedResult;
	}
	public EtcAuthResult getEtcCertifiedResult( ) {
		return this.etcCertifiedResult;
	}

}
