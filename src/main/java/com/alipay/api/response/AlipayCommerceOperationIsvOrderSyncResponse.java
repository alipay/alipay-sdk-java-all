package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.isv.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-10 10:00:34
 */
public class AlipayCommerceOperationIsvOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8331481472932839871L;

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
