package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.mrchsurplmitem.deletion.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:28:23
 */
public class AlipayMerchantMrchsurplmitemDeletionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8633872929979539551L;

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
