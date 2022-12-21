package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.merchant.record.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:22:28
 */
public class AlipayIserviceItaskMerchantRecordSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4311127863916348353L;

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
