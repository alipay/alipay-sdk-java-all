package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.store.virtualstore.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-08 19:52:56
 */
public class AlipayCommerceMedicalStoreVirtualstoreCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5227972986397645726L;

	/** 
	 * 门店ID
	 */
	@ApiField("store_id")
	private Long storeId;

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	public Long getStoreId( ) {
		return this.storeId;
	}

}
