package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StreamResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.serviceai.streamchat.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-04 13:53:14
 */
public class AlipayCommerceMedicalServiceaiStreamchatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7635834742957688354L;

	/** 
	 * 结构
	 */
	@ApiField("data")
	private StreamResponse data;

	public void setData(StreamResponse data) {
		this.data = data;
	}
	public StreamResponse getData( ) {
		return this.data;
	}

}
