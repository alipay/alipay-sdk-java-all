package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.mrchsurplmorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 20:30:40
 */
public class AlipayMerchantMrchsurplmorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5765914571948437662L;

	/** 
	 * 将请求参数中的request_id返回
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
