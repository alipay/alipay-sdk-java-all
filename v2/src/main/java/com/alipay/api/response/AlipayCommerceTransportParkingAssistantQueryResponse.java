package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.parking.assistant.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-03 13:57:37
 */
public class AlipayCommerceTransportParkingAssistantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2493621695464536791L;

	/** 
	 * 停车助手服务状态；开通服务：
	 */
	@ApiField("assistant_service_status")
	private String assistantServiceStatus;

	public void setAssistantServiceStatus(String assistantServiceStatus) {
		this.assistantServiceStatus = assistantServiceStatus;
	}
	public String getAssistantServiceStatus( ) {
		return this.assistantServiceStatus;
	}

}
