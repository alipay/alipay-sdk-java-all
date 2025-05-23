package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.user.task.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-07 15:56:59
 */
public class AlipayCommerceAcommunicationUserTaskSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5675855618655651433L;

	/** 
	 * true表示同步成功
	 */
	@ApiField("sync_success")
	private Boolean syncSuccess;

	public void setSyncSuccess(Boolean syncSuccess) {
		this.syncSuccess = syncSuccess;
	}
	public Boolean getSyncSuccess( ) {
		return this.syncSuccess;
	}

}
