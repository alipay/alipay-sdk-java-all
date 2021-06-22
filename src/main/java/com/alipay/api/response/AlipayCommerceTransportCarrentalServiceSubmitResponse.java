package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.carrental.service.submit response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-28 19:10:21
 */
public class AlipayCommerceTransportCarrentalServiceSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3815671197275884331L;

	/** 
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
