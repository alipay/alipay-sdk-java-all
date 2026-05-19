package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.sms.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-05 16:22:43
 */
public class AlipayCommerceMedicalHdfSmsSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7281299792198218783L;

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
