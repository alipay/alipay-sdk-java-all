package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.trip.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:06:44
 */
public class AlipayCommerceTransportEtcTripSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6238385653438876193L;

	/** 
	 * 是否同步成功，true/false
	 */
	@ApiField("sync_result")
	private Boolean syncResult;

	public void setSyncResult(Boolean syncResult) {
		this.syncResult = syncResult;
	}
	public Boolean getSyncResult( ) {
		return this.syncResult;
	}

}
