package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.merchantasset.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-10 10:14:53
 */
public class AlipayCommerceRecycleMerchantassetWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 7621594823767244363L;

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
