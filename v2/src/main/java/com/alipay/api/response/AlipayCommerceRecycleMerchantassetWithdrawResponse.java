package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.merchantasset.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-22 16:32:35
 */
public class AlipayCommerceRecycleMerchantassetWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 5633666696994513777L;

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
