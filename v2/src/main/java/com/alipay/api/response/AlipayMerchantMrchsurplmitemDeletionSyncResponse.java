package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.mrchsurplmitem.deletion.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:55:24
 */
public class AlipayMerchantMrchsurplmitemDeletionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4761232941534962193L;

	/** 
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
