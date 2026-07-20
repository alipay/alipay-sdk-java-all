package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.store.virtualstore.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-24 18:02:46
 */
public class AlipayCommerceMedicalStoreVirtualstoreCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2211822912378851581L;

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
