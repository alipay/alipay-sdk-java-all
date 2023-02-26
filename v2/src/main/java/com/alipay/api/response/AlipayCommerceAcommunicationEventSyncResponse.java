package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.event.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:06:44
 */
public class AlipayCommerceAcommunicationEventSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5368373416568394237L;

	/** 
	 * 接收成功或失败
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
