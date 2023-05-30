package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.isv.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:52:02
 */
public class AlipayCommerceOperationIsvOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8456983683284234345L;

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
