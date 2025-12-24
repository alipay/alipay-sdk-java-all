package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.industry.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-14 14:29:12
 */
public class AlipayCommerceIndustryOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3267872331669768388L;

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
