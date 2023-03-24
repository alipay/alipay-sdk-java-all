package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.isv.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 22:31:47
 */
public class AlipayCommerceOperationIsvOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1363957177651594171L;

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
