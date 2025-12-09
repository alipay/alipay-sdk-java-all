package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StreamResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.serviceai.streamchat.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-20 10:12:41
 */
public class AlipayCommerceMedicalServiceaiStreamchatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8253459813881238759L;

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
