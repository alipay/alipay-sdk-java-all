package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hzreferralform.intention.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-27 10:44:22
 */
public class AlipayCommerceMedicalHzreferralformIntentionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1388198493447945641L;

	/** 
	 * 转诊单状态的同步
	 */
	@ApiField("sync_result")
	private String syncResult;

	public void setSyncResult(String syncResult) {
		this.syncResult = syncResult;
	}
	public String getSyncResult( ) {
		return this.syncResult;
	}

}
