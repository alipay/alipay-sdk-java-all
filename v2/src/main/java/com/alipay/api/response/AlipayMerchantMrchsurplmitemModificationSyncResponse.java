package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.mrchsurplmitem.modification.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 10:17:30
 */
public class AlipayMerchantMrchsurplmitemModificationSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1863943777929594164L;

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
