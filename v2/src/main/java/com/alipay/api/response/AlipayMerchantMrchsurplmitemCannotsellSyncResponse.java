package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.mrchsurplmitem.cannotsell.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 15:07:35
 */
public class AlipayMerchantMrchsurplmitemCannotsellSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3253818216416842575L;

	/** 
	 * 将请求中的ID直接返回
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
