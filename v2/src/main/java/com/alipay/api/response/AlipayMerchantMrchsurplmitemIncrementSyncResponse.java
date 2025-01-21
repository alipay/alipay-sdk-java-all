package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.mrchsurplmitem.increment.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 23:06:09
 */
public class AlipayMerchantMrchsurplmitemIncrementSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4446115676621288622L;

	/** 
	 * 建议调用方打印日志
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
