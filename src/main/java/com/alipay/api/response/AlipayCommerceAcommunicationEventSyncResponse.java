package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.event.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-24 16:08:13
 */
public class AlipayCommerceAcommunicationEventSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3774971277554615959L;

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
