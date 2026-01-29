package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StreamResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.serviceai.streamchat.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-26 15:22:42
 */
public class AlipayCommerceMedicalServiceaiStreamchatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8641662282569846277L;

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
