package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.carrental.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-28 00:20:02
 */
public class AlipayCommerceTransportCarrentalOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1845844321235638152L;

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
