package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.anzhener.message.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-14 11:07:42
 */
public class AlipayCommerceMedicalAnzhenerMessageSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5833834299537776358L;

	/** 
	 * true:成功
false:失败
	 */
	@ApiField("send_sync_message")
	private Boolean sendSyncMessage;

	public void setSendSyncMessage(Boolean sendSyncMessage) {
		this.sendSyncMessage = sendSyncMessage;
	}
	public Boolean getSendSyncMessage( ) {
		return this.sendSyncMessage;
	}

}
