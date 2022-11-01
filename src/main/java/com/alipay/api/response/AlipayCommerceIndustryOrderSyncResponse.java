package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.industry.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-23 16:16:49
 */
public class AlipayCommerceIndustryOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2847865422947923549L;

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
