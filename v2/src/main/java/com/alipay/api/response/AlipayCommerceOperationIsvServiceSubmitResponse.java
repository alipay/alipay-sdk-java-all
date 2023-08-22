package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.isv.service.submit response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-05 14:44:43
 */
public class AlipayCommerceOperationIsvServiceSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3868761797957521272L;

	/** 
	 * id （后续消息标识对应服务）
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
