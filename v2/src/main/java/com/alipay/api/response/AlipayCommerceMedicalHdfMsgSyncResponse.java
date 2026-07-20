package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.msg.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-30 16:42:55
 */
public class AlipayCommerceMedicalHdfMsgSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1443342557344137567L;

	/** 
	 * true/false
	 */
	@ApiField("send_status")
	private Boolean sendStatus;

	public void setSendStatus(Boolean sendStatus) {
		this.sendStatus = sendStatus;
	}
	public Boolean getSendStatus( ) {
		return this.sendStatus;
	}

}
