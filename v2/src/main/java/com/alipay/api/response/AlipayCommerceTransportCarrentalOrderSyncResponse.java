package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.carrental.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 00:21:44
 */
public class AlipayCommerceTransportCarrentalOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3213365967872148584L;

	/** 
	 * 同步订单记录id
	 */
	@ApiField("record_id")
	private String recordId;

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

}
