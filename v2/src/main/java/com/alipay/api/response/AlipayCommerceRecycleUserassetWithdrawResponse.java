package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.userasset.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-22 16:27:35
 */
public class AlipayCommerceRecycleUserassetWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 3852641117174736831L;

	/** 
	 * 流水id，保证是唯一的
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
