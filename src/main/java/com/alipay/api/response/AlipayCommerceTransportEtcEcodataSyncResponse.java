package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.ecodata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-04 10:01:59
 */
public class AlipayCommerceTransportEtcEcodataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2145756122967649819L;

	/** 
	 * 同步结果，true/false
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
