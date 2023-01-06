package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.merchant.record.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:18:01
 */
public class AlipayIserviceItaskMerchantRecordSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8412913911648133733L;

	/** 
	 * 业务入参的biz_id
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
