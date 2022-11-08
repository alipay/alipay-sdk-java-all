package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.mrchsurplmitem.modification.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-19 18:46:41
 */
public class AlipayMerchantMrchsurplmitemModificationSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5818791954385523815L;

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
